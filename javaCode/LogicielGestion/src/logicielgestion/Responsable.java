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
    private final TreeSet<EmployeDeBase> lesEmployesDeBase;
    //CONSTRUCTEUR 
    public Responsable(String n, String p, int mat,int indice) {
        super(n, p, mat,indice);
        this.lesEmployesDeBase = new TreeSet<>();
    }
    
    @Override
    public String toString(){
        return super.toString()+ lesEmployesDeBase;
    }
    public String SalaireResponsable(){
        
    }
}
