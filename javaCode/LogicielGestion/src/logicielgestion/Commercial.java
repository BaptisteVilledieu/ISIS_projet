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
public class Commercial extends Employes {
    //volume mensuel
    private final int volume;
    //CONSTRUCTEUR 
    public Commercial(String n, String p, int mat,int indice, int v) {
        super(n, p, mat,indice);
        this.volume=v;
    }
    
    @Override
    public String toString(){
        return super.toString()+" , "+ volume;
    }
    public float calculSalaire(){
        return this.indiceSalarial*12+volume/10; 
    }
}
