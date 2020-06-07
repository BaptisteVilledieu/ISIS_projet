/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicielgestion;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cecil
 */
public class LogicielGestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, EmployeException {

        //Sauvegarde 
        String binaryFilePath = "SAUVEGARDES/Test1.dat";

        //Création de tous les employés de l'entreprise 
        Responsable r1 = new Responsable("Biffi", "Emmma", 2, 750);
        Responsable r2 = new Responsable("Lacoste", "Thomas", 2, 750);
        Responsable r3 = new Responsable("Palo", "Lucile", 11, 730);
        Responsable r4 = new Responsable("Vuire", "Melanie", 14, 700);
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
        
        if (r1.equals(r2)){
            System.out.println("True");
        }

        //Création de l'entreprise 
        Entreprise entreprise = new Entreprise();
        
        entreprise.add(r1);
        entreprise.add(r2);
        entreprise.add(r3);
        entreprise.add(r4);
        entreprise.add(c1);
        entreprise.add(c2);
        entreprise.add(e1);
        entreprise.add(e2);
        entreprise.add(e3);
        entreprise.add(e4);
        entreprise.add(e5);
        entreprise.add(e6);
        entreprise.add(e7);
        entreprise.add(e8);
        entreprise.add(e9);

        //Afficher tous les employés de l'entreprise 
        System.out.println("Entreprise à sauvegarder : " + "\n" + entreprise);

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
        System.out.println("Salaire de l'employé matricule" + e9.getMatricule() + " : " + e9.calculSalaire() + "€" + "\n");

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
        r4.ajouterSubordonne(r3);

        //Afficher hiérarchie directement inférieure d'un responsable 
        //r1.afficherHierarchieDirecte();
        //r4.afficherHierarchieDirecte();
        
        //Afficher hiérarchie inférieure d'un responsble 
        //r1.afficherHierarchie();
        //r4.afficherHierarchie();
        
        //Afficher hiérarchie complète de l'entreprise
        //entreprise.afficherHierarchieComplete();
        
        //Afficher le salaire d'une branche de la hiérarchie 
        //Il faut mettre (0) pour initialiser la méthode avec un salaire = 0
        //r1.afficherSalaireHierarchieDirecte(0);
        //r4.afficherSalaireHierarchieDirecte(0);
        
        //Afficher le salaire d'une branche de la hiérarchie inférieure
        //Il faut mettre (0) pour initialiser la méthode avec un salaire = 0
        //r4.afficherSalaireHierarchie(0);
        
        //Afficher le salaire de toute l'entreprise
        //entreprise.afficherSalaireEntreprise();
        
        //Sauvegarde en binaire 
        try {
            entreprise.sauver(binaryFilePath);
            System.out.println("Entreprise sauvegardée en binaire dans le fichier " + binaryFilePath);
        } catch (IOException ex) {
            Logger.getLogger(LogicielGestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Lecture en binaire 
        try {
            Entreprise lue = Entreprise.lire(binaryFilePath);
            System.out.println("Entreprise lue en binaire = " + "\n" + lue);
        } catch (IOException | ClassNotFoundException ex){
            Logger.getLogger(LogicielGestion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
