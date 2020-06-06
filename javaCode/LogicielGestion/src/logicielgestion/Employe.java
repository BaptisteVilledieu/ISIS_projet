/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicielgestion;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author cecil
 */
public abstract class Employe implements Payable, Serializable {
    //La classe est abstraite pour forcer l'utilisateur à instancier la classe EmployeDeBase
    //et non la classe Employe (qui correspond exactement à un EmployeDeBase)

    //ATTRIBUTS
    private String nom;
    private String prenom;
    private int matricule;
    protected final int indiceSalarial;

    //CONSTRUCTEUR 
    public Employe(String n, String p, int mat, int indice) throws EmployeException {
        this.nom = n;
        this.prenom = p;
        this.matricule = mat;
        this.indiceSalarial = indice;
        
        //EXCEPTION 
        if (n.substring(0, 1).equals(n.substring(0, 1).toLowerCase())) 
            throw new EmployeException ("Le nom d'un employé doit commencé par une majuscule, modfiez : " + n);
        
        if (p.substring(0, 1).equals(p.substring(0, 1).toLowerCase())) 
            throw new EmployeException ("Le prénom d'un employé doit commencé par une majuscule, modfiez : " + p);
        
        if (!(n.substring(1).equals(n.substring(1).toLowerCase())))
            throw new EmployeException ("Les lettres suivant la première lettre du nom doivent être en minuscules, modifiez : " + n);
        
         if (!(p.substring(1).equals(p.substring(1).toLowerCase())))
            throw new EmployeException ("Les lettres suivant la première lettre du prénom doivent être en minuscules, modifiez : " + p);
         
         if (n.length() < 3)
             throw new EmployeException("Le nom de l'employé doit contenir au moins 3 lettres, modifiez : " + n);
    }

    //affichage de l'employé  
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + nom + ", " + prenom + ", matricule : " + matricule + ", indice salarial : " + indiceSalarial;
        //Ajouter le salaire
    }
    
    //Methode de calcul du salaire 
    @Override
    public double calculSalaire() {
        return this.indiceSalarial * 12;
    }

    //GENERATION DE HASH CODE ET EQUALS
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.nom);
        hash = 23 * hash + Objects.hashCode(this.prenom);
        hash = 23 * hash + this.matricule;
        hash = 23 * hash + this.indiceSalarial;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        final Employe other = (Employe) obj;
        if (this.matricule != other.matricule) {
            return false;
        }
        return true;
    }

    //GETTERS 
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getMatricule() {
        return matricule;
    }

    public int getIndiceSalarial() {
        return indiceSalarial;
    }

    //SETTERS
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }
    
}
    

