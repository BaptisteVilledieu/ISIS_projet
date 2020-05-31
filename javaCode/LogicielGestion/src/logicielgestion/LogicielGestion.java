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
        Responsable r1 = new Responsable("Biffi", "Emma", 1, 750);
        Responsable r2 = new Responsable("Lacoste", "Thomas", 2, 750);
        Responsable r3 = new Responsable("Palo", "Lucile", 11, 730);
        Responsable r4 = new Responsable("Palo", "Lucile", 14, 700);
        Commercial c1 = new Commercial("Cazenave", "Sara", 3, 480, 80);
        Commercial c2 = new Commercial("Freecs", "Gon", 4, 480, 80);
        EmployeDeBase e1 = new EmployeDeBase("Uchiha", "Sasuke", 5, 420);
        EmployeDeBase e2 = new EmployeDeBase("Elric", "Alphonse", 6, 420);
        EmployeDeBase e3 = new EmployeDeBase("Hyuga", "Hinata", 8, 420);
        EmployeDeBase e4 = new EmployeDeBase("Ackerman", "Levi", 7, 420);
        EmployeDeBase e5 = new EmployeDeBase("Organa", "Leia", 9, 420);
        EmployeDeBase e6 = new EmployeDeBase("Croft", "Lara", 10, 420);
        EmployeDeBase e7 = new EmployeDeBase("Turet", "Laura", 12, 420);
        EmployeDeBase e8 = new EmployeDeBase("Salmo", "Hugo", 13, 420);
        EmployeDeBase e9 = new EmployeDeBase("Zert", "Florian", 15, 420);

        //Création de l'entreprise 
        EmployesEntreprise entreprise = new EmployesEntreprise();

        entreprise.ajouterEmploye(r1);
        entreprise.ajouterEmploye(r2);
        entreprise.ajouterEmploye(r3);
        entreprise.ajouterEmploye(r4);
        entreprise.ajouterEmploye(c1);
        entreprise.ajouterEmploye(c2);
        entreprise.ajouterEmploye(e1);
        entreprise.ajouterEmploye(e2);
        entreprise.ajouterEmploye(e3);
        entreprise.ajouterEmploye(e4);
        entreprise.ajouterEmploye(e5);
        entreprise.ajouterEmploye(e6);
        entreprise.ajouterEmploye(e7);
        entreprise.ajouterEmploye(e8);
        entreprise.ajouterEmploye(e9);

        //Afficher tous les employés de l'entreprise 
        System.out.println(entreprise);

        //Afficher les salaires de chaque employé
        System.out.println("Salaire de l'employé matricule " + r1.getMatricule() + " : " + r1.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + r2.getMatricule() + " : " + r2.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + r3.getMatricule() + " : " + r3.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + r4.getMatricule() + " : " + r4.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + c1.getMatricule() + " : " + c1.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + c2.getMatricule() + " : " + c2.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + e1.getMatricule() + " : " + e1.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + e2.getMatricule() + " : " + e2.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + e3.getMatricule() + " : " + e3.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + e4.getMatricule() + " : " + e4.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + e5.getMatricule() + " : " + e5.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + e6.getMatricule() + " : " + e6.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + e7.getMatricule() + " : " + e7.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + e8.getMatricule() + " : " + e8.calculSalaire() + "€");
        System.out.println("Salaire de l'employé matricule" + e9.getMatricule() + " : " + e9.calculSalaire() + "€");

        //Ajouter des subordonnés aux responsables 
        r1.ajouterSubordonne(e6);
        r1.ajouterSubordonne(e5);
        r1.ajouterSubordonne(e4);
        r1.ajouterSubordonne(c2);
        r2.ajouterSubordonne(e3);
        r2.ajouterSubordonne(e2);
        r2.ajouterSubordonne(e1);
        r2.ajouterSubordonne(c1);
        r1.ajouterSubordonne(r3);
        r3.ajouterSubordonne(e8);
        r3.ajouterSubordonne(e7);
        r1.ajouterSubordonne(r4);
        r4.ajouterSubordonne(e9);

//        //Afficher hiérarchie directement inférieure d'un responsable 
//        r1.afficherHierarchieDirecte();
//        r2.afficherHierarchieDirecte();
//        r3.afficherHierarchieDirecte();
//
//        //Afficher hiérarchie inférieure d'un responsble 
//        r1.afficherHierarchie();
//
//        //Afficher le salaire d'une branche de la hiérarchie 
//        r1.afficherSalaireHierarchieDirecte();

        //Salaire de toute l'entreprise
        entreprise.afficherSalaireEntreprise();
        
        //Salaire par branche de hiérarchie
        r1.afficherSalaireHierarchieDirecte();

    }

}
