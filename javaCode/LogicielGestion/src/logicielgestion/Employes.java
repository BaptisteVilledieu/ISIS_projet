/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicielgestion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author cecil
 */
public abstract class Employes implements Comparable<Employes> {

    //ATTRIBUTS
    private String nom;
    private String prenom;
    private int matricule;
    protected final float indiceSalarial;
    private TreeSet<Employes> lesEmployes;

    //CONSTRUCTEUR 
    public Employes(String n, String p, int mat, float indice) /*throws EmployesException*/ {
        this.nom = n;
        this.prenom = p;
        this.matricule = mat;
        this.indiceSalarial = indice;
        lesEmployes = new TreeSet<>();
        Scanner sc;

//        try {
//            //nomFic est le nom du fichier avec son chemin 
//            sc = new Scanner(new File("D:\\JAVA\\SEMESTRE 1\\villes_tarn.csv"));
//            // On lit la première ligne d'entête que l'on ne traite pas 
//            String ligne = sc.nextLine();
//            while (sc.hasNext()) {
//                // On lit une nouvelle ligne 
//                ligne = sc.nextLine();
//                String[] res = ligne.split(";");
//                lesEmployes.add(new Employes(res[0], Integer.parseInt(res[1]), Integer.parseInt(res[2]), Integer.parseInt(res[3])));
//            }
//
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        }
    }

    //TOSTRING 
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + nom + ", " + prenom + ", " + matricule + ", " + indiceSalarial;
        //Ajouter le salaire

    }

    public abstract float calculSalaire();

    public String sommeSalaireBranche() {
        if (this instanceof Responsable) {
            //.... gens qui sont sous les ordres du repsonsable directement ou indirectement 
            //
        }
        else {
            
        }
      return "s" ;   
    }
    
    //COMPARE TO POUR LES COMPARER GRACE A LEUR MATRICULE (par ordre croissant)
    
    
    //GENERATION DE HASH CODE ET EQUALS

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nom);
        hash = 37 * hash + Objects.hashCode(this.prenom);
        hash = 37 * hash + this.matricule;
        hash = 37 * hash + Float.floatToIntBits(this.indiceSalarial);
        hash = 37 * hash + Objects.hashCode(this.lesEmployes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employes other = (Employes) obj;
        if (this.matricule != other.matricule) {
            return false;
        }
        if (Float.floatToIntBits(this.indiceSalarial) != Float.floatToIntBits(other.indiceSalarial)) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.lesEmployes, other.lesEmployes)) {
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
