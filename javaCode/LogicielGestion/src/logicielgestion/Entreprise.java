/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicielgestion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;

/**
 *
 * @author cecil
 */
public class Entreprise extends HashSet<Employe> implements Serializable {
    //Cette classe hérite d'une HashSet<Employe>, nous n'avons donc pas besoin de 
    //redéfinir les méthodes d'ajout (add()) ou de suppression (remove()) d'employés

    //Afficher tous les employés de l'entreprise
    @Override
    public String toString() {
        return "Employés de l'entreprise : {" + super.toString() + "}";
    }

    //Calculer les salaires de l'entreprise (méthode récursive)
    public void afficherSalaireEntreprise() {
        double salaire = 0;
        for (Employe e : this) {
            salaire = salaire + e.calculSalaire();
        }
        System.out.println("Salaire de l'entreprise : " + salaire + "€");
    }

    //Affichage de la hiérarchie complète de l'entreprise 
    public void afficherHierarchieComplete() {
        for (Employe e : this) {
            if (e instanceof Responsable) {
                ((Responsable) e).afficherHierarchieDirecte();
            }
        }
    }

    //Sauvegarde de l'instance dans le fichier
    public void sauver(String filePath)
            throws FileNotFoundException, IOException, EmployeException {
        //EXCEPTION : le fichier filePath doit etre un .dat
        if (!filePath.endsWith(".dat"))
            throw new EmployeException("Le fichier doit être un fichier binaire de format monFichier.dat, modifiez : " + filePath);
        
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

    //Lire et retourner l'objet Entreprise 
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
    
}
