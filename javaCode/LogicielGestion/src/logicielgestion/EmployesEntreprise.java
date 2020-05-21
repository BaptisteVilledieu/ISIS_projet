/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicielgestion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author cecil
 */
public class EmployesEntreprise {

    //ATTRIBUT
    private HashSet<Employes> lesEmployes;
//     private ArrayList<Employes> lesEmployes;
//
//    //CONSTRUCTEUR 
    public EmployesEntreprise() {
        lesEmployes = new HashSet<>();
        Scanner sc;  
        
        try {
            //nomFic est le nom du fichier avec son chemin 
            sc = new Scanner(new File("D:\\COURS_ISIS\\S2\\PROJET_JAVA\\LISTE_EMPLOYES.csv"));
            // On lit la première ligne d'entête que l'on ne traite pas 
            String ligne = sc.nextLine();
            while (sc.hasNext()) {
                // On lit une nouvelle ligne 
                ligne = sc.nextLine();
                String[] res = ligne.split(";");
                lesEmployes.add(new Employes(res[0], res[1], Integer.parseInt(res[2]), Integer.parseInt(res[3])));
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    
    @Override
    public String toString(){
        return "Les employes sont : " + lesEmployes + "\n" ;
    }
    
//    public EmployesEntreprise() {
//        this.lesEmployes = new ArrayList<>();
//    }
//    
//    //Ajouter les employés 
//    public void ajouter(Employes e){
//        lesEmployes.add(e);
//    }
    
//    //Afficher employés entreprise 
//    @Override 
//    public String toString() {
//        return "Employés : " + lesEmployes ;
//    }
        
//        lesEmployes = new TreeSet<>();
//        Scanner sc;
//
//       
    }

