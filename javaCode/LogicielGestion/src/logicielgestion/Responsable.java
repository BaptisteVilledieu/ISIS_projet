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
    public Responsable(String n, String p, int mat,int indice) {
        super(n, p, mat,indice);
        this.lesSubordonnes = new HashSet<>();
    }
    
    //Afficher le responsable 
    @Override
    public String toString(){
        return super.toString() + "\n"; 
    }
    
    //Ajouter des subordonnés (void)
    public void ajouterSubordonne() {
        
    }
    
    
    //Afficher la hiérarchie du responsable (void)
    public void afficherHierarchie() {
        
    }
    
    //Afficher la hiérarchie directe du responsable (void)
    public void affichierHierarchieDirecte(){
        
    }
    
    //Afficher le salaire de la hiérarchie (double)
    public double afficherSalaireHierarchie() {
        return 1;
    }
    
    //Afficher le salaire de la hiérarchie directe (double)
   public double afficherSalaireHierarchieDirecte() {
       return 1; 
   }
    
    //Calcul salaire hiérarchie 
    @Override
    public double calculSalaire(){
        return super.calculSalaire();
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
