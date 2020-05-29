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
        Responsable r1 = new Responsable("Biffi", "Emma", 1, 50000);
        Responsable r2 = new Responsable("Lacoste", "Thomas", 2, 50000);
        Commercial c1 = new Commercial("Cazenave", "Sara", 3, 100, 40000);
        Commercial c2 = new Commercial("Freecs", "Gon", 4, 100, 40000);
        EmployeDeBase e1 = new EmployeDeBase("Uchiha", "Sasuke", 5, 20000);
        EmployeDeBase e2 = new EmployeDeBase("Elric", "Alphonse", 6, 20000);
        EmployeDeBase e3 = new EmployeDeBase("Hyuga", "Hinata", 8, 20000);
        EmployeDeBase e4 = new EmployeDeBase("Ackerman", "Levi", 7, 20000);
        EmployeDeBase e5 = new EmployeDeBase("Organa", "Leia", 9, 20000);
        EmployeDeBase e6 = new EmployeDeBase("Croft", "Lara", 10, 20000);
            
        //Création de l'entreprise 
        EmployesEntreprise entreprise = new EmployesEntreprise(); 
        
        entreprise.ajouterEmploye(r1);
        entreprise.ajouterEmploye(r2);
        entreprise.ajouterEmploye(c1);
        entreprise.ajouterEmploye(c2);
        entreprise.ajouterEmploye(e1);
        entreprise.ajouterEmploye(e2);
        entreprise.ajouterEmploye(e3);
        entreprise.ajouterEmploye(e4);
        entreprise.ajouterEmploye(e5);
        entreprise.ajouterEmploye(e6);
        
        //Afficher tous les employés de l'entreprise 
        System.out.println(entreprise);
        
        //Afficher les salaires de chaque employé
        System.out.println("Salaire de l'employé matricule " + r1.getMatricule() + " : " + r1.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + r2.getMatricule() + " : " + r2.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + c1.getMatricule() + " : " + c1.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + c2.getMatricule() + " : " + c2.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + e1.getMatricule() + " : " + e1.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + e2.getMatricule() + " : " + e2.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + e3.getMatricule() + " : " + e3.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + e4.getMatricule() + " : " + e4.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + e5.getMatricule() + " : " + e5.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + e6.getMatricule() + " : " + e6.calculSalaire() + "€");
        
        
//        
//        
//        EmployesEntreprise entreprise = new EmployesEntreprise();
//        
//        entreprise.ajouterEmploye(new Responsable("Biffi", "Emma", 1, 150));
//        entreprise.ajouterEmploye(new Responsable("Lacoste", "Thomas", 2, 150));
//        entreprise.ajouterEmploye(new Commercial("Cazenave", "Sara", 3, 100, 10));
//        entreprise.ajouterEmploye(new Commercial("Freecs", "Gon", 4, 100, 10));
//        entreprise.ajouterEmploye(new EmployeDeBase("Uchiha", "Sasuke", 5, 56));
//        entreprise.ajouterEmploye(new EmployeDeBase("Elric", "Alphonse", 6, 56));
//        entreprise.ajouterEmploye(new EmployeDeBase("Ackerman", "Levi", 7, 56));
//        entreprise.ajouterEmploye(new EmployeDeBase("Hyuga", "Hinata", 8, 56));
//        entreprise.ajouterEmploye(new EmployeDeBase("Organa", "Leia", 9, 56));
//        entreprise.ajouterEmploye(new EmployeDeBase("Croft", "Lara", 10, 56));
//        
//        System.out.println(entreprise);
        
        //Ajouter les employés sous les ordres 
    }
    
}
