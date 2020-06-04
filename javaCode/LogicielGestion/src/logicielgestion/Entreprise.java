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
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author cecil
 */
public class Entreprise extends HashSet<Employe> implements Serializable {

    //ATTRIBUT
    private HashSet<Employe> lesEmployes;

    //CONSTRUCTEUR 
    public Entreprise() {
        lesEmployes = new HashSet<>();
    }

    //Afficher tous les employés de l'entreprise
    @Override
    public String toString() {
        return "Employés de l'entreprise : {" + lesEmployes + "}";
    }

    //Ajouter les employés 
    public void ajouterEmploye(Employe e) {
        lesEmployes.add(e);
    }

    //Supprimer les employés 
    public void supprimerEmploye(Employe e) {
        lesEmployes.remove(e);
    }

    //Calculer les salaires de l'entreprise (méthode récursive)
    public void afficherSalaireEntreprise() {
        double salaire = 0;
        for (Employe e : this.lesEmployes) {
            salaire = salaire + e.calculSalaire();
        }
        System.out.println("Salaire de l'entreprise : " + salaire + "€");
    }

    //Affichage de la hiérarchie complète de l'entreprise 
    public void afficherHierarchieComplete() {
        for (Employe e : this.lesEmployes) {
            if (e instanceof Responsable) {
                ((Responsable) e).afficherHierarchieDirecte();
            }
        }
    }

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
    public void sauver(String filePath)
            throws FileNotFoundException, IOException {
        // Un flux binaire en écriture vers le fichier passé en paramètre
        FileOutputStream fos = new FileOutputStream(filePath);
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
    public static Entreprise lire(String filePath)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        // Un flux binaire en lecture sur le fichier passé en paramètre
        FileInputStream fis = new FileInputStream(filePath);
        // Un flux de traitement des objets construit sur le flux binaire
        ObjectInputStream ois = new ObjectInputStream(fis);
        // Lecture d'un objet dans le flux de traitement. La méthode readObject()
        // retourne un Object, il convient donc de le transtyper (cast) en Personne.
        Entreprise obj = (Entreprise) ois.readObject();
        ois.close();
        return obj;
    }

    /**
     * Méthode de sauvegarde de l'instance dans le fichier dont le chemin est
     * passé en paramètre.
     *
     * @param filePath Le chemin du fichier de sauvegarde
     * @throws IOException
     */
    public void sauverTexte(String filePath) throws IOException {
        FileWriter fw = new FileWriter(filePath, true);
        //fw.write(System.lineSeparator());
        // Pour chaque attribut de mon instance je l'écris dans le fichier
        for (Employe e : lesEmployes) {
            fw.write(e.getTexteASauver());
        }
        // On insère un retour à la ligne
        fw.write(System.lineSeparator());
        fw.close();
    }

    /**
     * Méthode de classe permettant de lire et retourner un objet Voiture dans
     * le fichier texte dont le chemin est passé en paramètre.
     *
     * @param filePath Le chemin du fichier lu
     * @return L'objet Voiture lu dans le fichier.
     */
    public static Entreprise lireTexte(String filePath) throws IOException {
        Scanner sc = new Scanner(Paths.get(filePath));
        String ligne = sc.next();
        StringTokenizer token = new StringTokenizer(ligne);
        HashSet<Employe> lesEmployes = new HashSet<>();
        while (token.hasMoreElements()) {
            lesEmployes.add(Employe.lireTexte(token.nextToken()));
        }
        return new Entreprise();
    }
}
