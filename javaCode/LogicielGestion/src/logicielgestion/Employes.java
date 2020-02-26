/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicielgestion;

/**
 *
 * @author cecil
 */
public class Employes {
    //ATTRIBUTS
    private String nom;
    private String prenom;
    private int /* ou créer une classe matricule?? */ matricule;
    private final float indiceSalarial; 
    
    //CONSTRUCTEUR 
    public Employes(String n, String p, int mat, float indice) {
        this.nom = n;
        this.prenom = p;
        this.matricule = mat; 
        this.indiceSalarial=indice;
    }
    
    //TOSTRING 
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + nom + ", " + prenom + ", " + matricule+", "+indiceSalarial ;
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

    public int getIndiceSalarial() {
        return indiceSalarial;
    }
    
    
}
