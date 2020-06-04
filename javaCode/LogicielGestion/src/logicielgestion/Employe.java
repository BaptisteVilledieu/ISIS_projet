/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicielgestion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Logger;

/**
 *
 * @author cecil
 */
public abstract class Employe implements Payable, Serializable {

    //ATTRIBUTS
    private String nom;
    private String prenom;
    private int matricule;
    protected final int indiceSalarial;

    //CONSTRUCTEUR 
    public Employe(String n, String p, int mat, int indice) /*throws EmployeException*/ {
        this.nom = n;
        this.prenom = p;
        this.matricule = mat;
        this.indiceSalarial = indice;
    }

    //affichage de l'employé  
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + nom + ", " + prenom + ", matricule : " + matricule + ", indice salarial : " + indiceSalarial ;
        //Ajouter le salaire

    }
    
    @Override
    public double calculSalaire(){
        return this.indiceSalarial*12;
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

    /**
     * Méthode de sauvegarde de l'instance dans le fichier dont le chemin est
     * passé en paramètre.
     *
     * @param filePath Le chemin du fichier de sauvegarde
     * @throws IOException
     */
   
    public String getTexteASauver(){
        return nom + "|" + prenom + "|" + matricule + "|" + indiceSalarial ;
    }
    
    public void sauverTexte(String EMPLOYES) throws IOException {
        /* Un flux textuel en écriture vers le fichier passé en paramètre
         * Le booléen en second paramètre indique que les données sont ajoutées
         * à la fin du fichier
         */
        FileWriter fw = new FileWriter(EMPLOYES, true);
        // Pour chaque attribut de mon instance je l'écris dans le fichier
        fw.write(this.getTexteASauver());
        fw.write(System.lineSeparator());
        fw.close();
    }
    
    /**
     * Méthode de classe permettant de lire et retourner un objet Personne dans
     * la String passée en paramètre.
     *
     * @param content La String à parcourir
     * @return L'objet Personne lu dans la String content.
     */
    public static Employe lireTexte(String content) {
        Scanner sc = new Scanner(content);
        String ligne = sc.next();
        StringTokenizer token = new StringTokenizer(ligne, "|");
        String nom = token.nextToken();
        String prenom = token.nextToken();
        String sMatricule = token.nextToken();
        String sIndiceSalarial = token.nextToken();
        int matricule = Integer.parseInt(sMatricule);
        int indiceSalarial = Integer.parseInt(sIndiceSalarial);
        return new Employe(nom, prenom, matricule, indiceSalarial) {};
    }

}
