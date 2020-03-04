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
    private final TreeSet<EmployeDeBase> lesEmployesDeBase;
<<<<<<< HEAD
    //CONSTRUCTEU 
    public Responsable(String n, String p, int mat,float indice) {
=======
    
    //CONSTRUCTEUR 
    public Responsable(String n, String p, int mat,int indice) {
>>>>>>> 4cbe96816a5fb45f5b063e6af2c5ea2ff00fbe5f
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
