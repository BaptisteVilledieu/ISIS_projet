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
public abstract class Employes {
    //ATTRIBUTS
    private String nom;
    private String prenom;
    private int /* ou créer une classe matricule?? */ matricule;
    protected final float indiceSalarial; 
    
    //CONSTRUCTEUR 
    public Employes(String n, String p, int mat, int indice) {
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
    public abstract float calculSalaire();
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
    
}
