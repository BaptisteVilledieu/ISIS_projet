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
    private final HashSet<Employes> lesEmployesHierarchie;
    
    //CONSTRUCTEUR 
    public Responsable(String n, String p, int mat,int indice) {
        super(n, p, mat,indice);
        this.lesEmployesHierarchie = new HashSet<>();
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n"; //+ lesEmployesHierarchie;
    }
    @Override
    public double calculSalaire(){
        return super.calculSalaire();
    }
//    public String sommeSalaireBranche(){
//        
//    }
//    
    public HashSet<Employes> ajouterHierarchie(){
        return lesEmployesHierarchie;
    }

}
