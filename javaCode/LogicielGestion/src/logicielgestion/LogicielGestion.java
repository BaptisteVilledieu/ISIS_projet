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
public class LogicielGestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Création de tous les employés de l'entreprise 
        Employes r1 = new Responsable("Biffi", "Emma", 1, 150);
        Employes r2 = new Responsable("Lacoste", "Thomas", 2, 150);
        Employes c1 = new Commercial("Cazenave", "Sara", 3, 100, 10);
        Employes c2 = new Commercial("Freecs", "Gon", 4, 100, 10);
        Employes b1 = new EmployeDeBase("Uchiha", "Sasuke", 5, 56);
        Employes b2 = new EmployeDeBase("Elric", "Alphonse", 6, 56);
        Employes b3 = new EmployeDeBase("Ackerman", "Levi", 7, 56);
        Employes b4 = new EmployeDeBase("Hyuga", "Hinata", 8, 56);
        Employes b5 = new EmployeDeBase("Organa", "Leia", 9, 56);
        Employes b6 = new EmployeDeBase("Croft", "Lara", 10, 56);
        
        r1.toString();
    }
    
}
