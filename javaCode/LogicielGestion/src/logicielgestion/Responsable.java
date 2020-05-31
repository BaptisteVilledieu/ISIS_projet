/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicielgestion;

import java.util.HashSet;

/**
 *
 * @author cecil
 */
public class Responsable extends Employes {

    //Nouvel attribut
    private final HashSet<Employes> lesSubordonnes;

    //CONSTRUCTEUR 
    public Responsable(String n, String p, int mat, int indice) {
        super(n, p, mat, indice);
        this.lesSubordonnes = new HashSet<>();
    }

    //Afficher le responsable 
    @Override
    public String toString() {
        return super.toString() + "\n";
    }

    //Ajouter des subordonnés (void)
    public void ajouterSubordonne(Employes e) {
        lesSubordonnes.add(e);
    }
    
    //Supprimer des subordonnés 
    public void supprimerSubordonne(Employes e){
        lesSubordonnes.remove(e);
    }

    //Afficher la hiérarchie inférieure directe d'un responsable (void)
    public void afficherHierarchieDirecte() {
        System.out.println("Hierarchie inférieure directe de " + this.getNom() + ", matricule : " + this.getMatricule());
        for (Employes e : this.lesSubordonnes) {
            System.out.println(e);
        }
    }

    //Afficher la hiérarchie inférieure d'un responsable  (void)
    public void afficherHierarchie() {
        System.out.println("Hierarchie inférieure de " + this.getNom() + ", matricule : " + this.getMatricule());
        for (Employes e : this.lesSubordonnes) {
            System.out.println(e);
            if (e instanceof Responsable) {
                System.out.println("est responsable de : " + ((Responsable) e).lesSubordonnes);
            }

        }
    }
//    
//    //Afficher le salaire de la hiérarchie (double)
//    public double afficherSalaireHierarchie() {
//        return 1;
//    }
//    
    //Afficher le salaire d'une branche de la hiérarchie (donc de la hiérarchie inférieure directe d'un responsable)
    //(Le salaire du responsable de la hiérarchie est compris dedans) 
    public void afficherSalaireHierarchieDirecte() {
        double salaire = 0 ;
        for (Employes e : this.lesSubordonnes) {
            salaire = salaire + e.calculSalaire();
        }
        salaire = salaire + this.calculSalaire();
        System.out.println("Salaire d'une branche de la hiérarchie : " + salaire + "€");
    }

    //Getter
    public HashSet<Employes> getLesSubordonnes() {
        return lesSubordonnes;
    }
    
    //Texte à sauvegarder (string)
    public String getTexteASauver() {
        return super.getTexteASauver() + "|" + lesSubordonnes ;
    }
    
}
