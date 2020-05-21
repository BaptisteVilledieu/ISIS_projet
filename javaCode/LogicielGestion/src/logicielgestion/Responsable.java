/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicielgestion;

import java.util.TreeSet;

/**
 *
 * @author cecil
 */
public class Responsable extends Employes {
    
    //Nouvel attribut
    private final TreeSet<Employes> lesEmployesHierarchie;
    
    //CONSTRUCTEUR 
    public Responsable(String n, String p, int mat,float indice) {
        super(n, p, mat,indice);
        this.lesEmployesHierarchie = new TreeSet<>();
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n"; //+ lesEmployesHierarchie;
    }
    @Override
    public double calculSalaire(){
        return super.calculSalaire();
    }
    public String sommeSalaireBranche(){
        
    }
    
    public TreeSet<Employes> ajouterHierarchie(){
        return lesEmployesHierarchie;
    }

}
