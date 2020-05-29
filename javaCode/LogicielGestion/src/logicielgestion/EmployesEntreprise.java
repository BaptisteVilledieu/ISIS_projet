/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicielgestion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author cecil
 */
public class EmployesEntreprise extends HashSet<Employes> implements Serializable {

    //ATTRIBUT
    private HashSet<Employes> lesEmployes;

//  //CONSTRUCTEUR 
    public EmployesEntreprise() {
        lesEmployes = new HashSet<>();
    }

    //Afficher tous les employés de l'entreprise
    @Override
    public String toString() {
        return "Employés de l'entreprise : {" + lesEmployes + "}";
    }
 
    //Ajouter les employés 
    public void ajouterEmploye(Employes e){
        lesEmployes.add(e);
    }
    
    //Supprimer les employés 
    public void supprimerEmploye(Employes e){
        lesEmployes.remove(e);
    }
    
    //Getter
    public HashSet<Employes> getLesEmployes() {
        return lesEmployes;
    }
    
    //Setter 
    public void setLesEmployes(HashSet<Employes> lesEmployes) {
        this.lesEmployes = lesEmployes;
    }
    
    //Calculer les salaires de l'entreprise (méthode récursive) (double)
    
    
    //Sauvegarde de l'entreprise 
    
    
    //Lire la sauvegarde de l'entreprise 
    
    
    //on va utiliser "if( Employes instance of 'Responsable'){}..."pour savoir si c'est un responsable 
    
    

    /*
    Méthodes d'instance
     */
    /**
     * Méthode de sauvegarde de l'instance dans le fichier dont le chemin est
     * passé en paramètre.
     *
     * @param filePath Le chemin du fichier de sauvegarde
     * @throws java.io.FileNotFoundException
     */
    public void sauver(String EMPLOYES)
            throws FileNotFoundException, IOException {
        // Un flux binaire en écriture vers le fichier passé en paramètre
        FileOutputStream fos = new FileOutputStream(EMPLOYES);
        // Un flux de traitement des objets construit sur le flux binaire
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // Ecriture de l'objet courant (this) dans le flux de traitement,
        // donc dans le fichier
        oos.writeObject(this);
        // Fermeture du flux (obligatoire)
        oos.close();
    }

    /**
     * Méthode de classe permettant de lire et retourner un objet Voiture dans
     * le fichier dont le chemin est passé en paramètre.
     *
     * @param filePath Le chemin du fichier lu
     * @return L'objet Voiture lu dans le fichier, ou null s'il n'y en a pas.
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public static EmployesEntreprise lire(String EMPLOYES)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        // Un flux binaire en lecture sur le fichier passé en paramètre
        FileInputStream fis = new FileInputStream(EMPLOYES);
        // Un flux de traitement des objets construit sur le flux binaire
        ObjectInputStream ois = new ObjectInputStream(fis);
        // Lecture d'un objet dans le flux de traitement. La méthode readObject()
        // retourne un Object, il convient donc de le transtyper (cast) en Personne.
        EmployesEntreprise obj = (EmployesEntreprise) ois.readObject();
        ois.close();
        return obj;
    }

//    /**
//     * Méthode de sauvegarde de l'instance dans le fichier dont le chemin est
//     * passé en paramètre.
//     *
//     * @param filePath Le chemin du fichier de sauvegarde
//     * @throws IOException
//     */
//    public void sauverTexte(String filePath) throws IOException {
//        /* Un flux textuel en écriture vers le fichier passé en paramètre
//         * Le booléen en second paramètre indique que les données sont ajoutées
//         * à la fin du fichier
//         */
//        FileWriter fw = new FileWriter(filePath, true);
//        // Pour chaque attribut de mon instance je l'écris dans le fichier
//        fw.write(puissance + "#" + modele + "#");
//        for (Personne p : conducteurs) {
//            fw.write(p.getTexteASauver() + "#");
//        }
//        // On insère un retour à la ligne
//        fw.write(System.lineSeparator());
//        fw.close();
//    }
//
//    /**
//     * Méthode de classe permettant de lire et retourner un objet Voiture dans
//     * le fichier texte dont le chemin est passé en paramètre.
//     *
//     * @param filePath Le chemin du fichier lu
//     * @return L'objet Voiture lu dans le fichier.
//     */
//    public static Voiture lireTexte(String filePath) throws IOException {
//        Scanner sc = new Scanner(Paths.get(filePath));
//        String ligne = sc.next();
//        StringTokenizer token = new StringTokenizer(ligne, "#");
//        String sPuissance = token.nextToken();
//        int puissance = Integer.parseInt(sPuissance);
//        String modele = token.nextToken();
//        HashSet<Personne> conducteurs = new HashSet<>();
//        while (token.hasMoreElements()) {
//            conducteurs.add(Personne.lireTexte(token.nextToken()));
//        }
//        return new Voiture(puissance, modele, conducteurs);
//    }
//   
}
