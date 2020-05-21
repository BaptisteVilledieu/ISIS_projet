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
    private ArrayList<Employes> lesEmployes;
//     private ArrayList<Employes> lesEmployes;
//
//    //CONSTRUCTEUR 

    public EmployesEntreprise() {
        
        lesEmployes = new ArrayList<>();
        Scanner sc;

        try {
            //nomFic est le nom du fichier avec son chemin 
            sc = new Scanner(new File("D:\\COURS_ISIS\\S2\\PROJET_JAVA\\EMPLOYES.txt"));
            sc.useDelimiter("\r\n");
            // On lit la première ligne d'entête que l'on ne traite pas 
            String ligne = sc.nextLine();
            while (sc.hasNext()) {
                // On lit une nouvelle ligne 
                ligne = sc.nextLine();
                String[] res = ligne.split(",");
                String nom = res[0];
                String prenom = res[1];
                int matricule = Integer.valueOf(res[2]);
                int indiceSalarial = Integer.valueOf(res[3]);
                String fonction = res[4];
                if (fonction.equals("Responsable")) {
                    lesEmployes.add(new Responsable(res[0], res[1], Integer.parseInt(res[2]), Integer.parseInt(res[3])));
                }
                if (fonction.equals("Commercial")) {
                    int volume = Integer.parseInt(res[5]);
                    lesEmployes.add(new Commercial(res[0], res[1], Integer.parseInt(res[2]), Integer.parseInt(res[3]), Integer.parseInt(res[5])));
                }
                if (fonction.equals("EmployeDeBase")) {
                    lesEmployes.add(new EmployeDeBase(res[0], res[1], Integer.parseInt(res[2]), Integer.parseInt(res[3])));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

//        }
//                String[] tabChamp = ligne.split("\t");
//                String nom = tabChamp[0];
//                String prenom = tabChamp[1];
//                int matricule = Integer.valueOf(tabChamp[2]);
//                int indiceSalarial = Integer.valueOf(tabChamp[3]);
//                String fonction = tabChamp[4];
//                int volume = Integer.valueOf(tabChamp[5]);
//                
//                if (tabChamp[5].equals("Responsable")){
//                    lesEmployes.add(new Responsable(tabChamp[0], tabChamp[1], Integer.parseInt(tabChamp[2]), Integer.parseInt(tabChamp[3])));
//                }
//                if (tabChamp[5].equals("Commercial")){
//                    lesEmployes.add(new Commercial(tabChamp[0], tabChamp[1], Integer.parseInt(tabChamp[2]), Integer.parseInt(tabChamp[3]), Integer.parseInt(tabChamp[6])));
//                }
//                if (tabChamp[5].equals("EmployeDeBase")){
//                    lesEmployes.add(new EmployeDeBase(tabChamp[0], tabChamp[1], Integer.parseInt(tabChamp[2]), Integer.parseInt(tabChamp[3])));
//                }
//            }
//
//         catch (FileNotFoundException e) {
//            System.out.println(e);
//        }
    }

    @Override
    public String toString() {
        return "Employés de l'entreprise : " + lesEmployes;
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
