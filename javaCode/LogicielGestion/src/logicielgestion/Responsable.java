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
    private final TreeSet<Employes> lesEmployes;
    
    //CONSTRUCTEUR 
    public Responsable(String n, String p, int mat,float indice) {
        super(n, p, mat,indice);
        this.lesEmployes = new TreeSet<>();
    }
    
    @Override
    public String toString(){
        return super.toString()+ lesEmployes;
    }
    public float calculSalaire(){
        return this.indiceSalarial*12;
    }
    public void ajouterHierarchie(){
        lesEmployes
    }
}
