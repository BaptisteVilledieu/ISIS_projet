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
public class Commercial extends Employe {
    //volume mensuel
    private double volume;
    
    //CONSTRUCTEUR 
    public Commercial(String n, String p, int mat,int indice, double v) {
        super(n, p, mat,indice);
        this.volume=v;
    }
    
    @Override
    public String toString(){
        return super.toString()+" , " + volume  + "\n";
    }
    @Override
    public double calculSalaire(){
        return super.calculSalaire()+ volume/10; 
    }

    //Texte à sauvegarder 
    @Override
    public String getTexteASauver(){
        return super.getTexteASauver() + "|" + volume ;
    }
    
    //Getter et Setter de volume 

    public double getVolume() {
        return volume;
    }
    
    public void setVolume(double volume) {
        this.volume = volume;
    }
    
}