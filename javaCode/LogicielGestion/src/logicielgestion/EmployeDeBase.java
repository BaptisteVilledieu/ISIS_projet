package logicielgestion;

/**
 *
 * @author cecil
 */
public class EmployeDeBase extends Employe {

    //CONSTRUCTEUR 
    public EmployeDeBase(String n, String p, int mat, int indice) {
        super(n, p, mat, indice);
    }

    //Afficher l'employe
    @Override
    public String toString() {
        return super.toString() + "\n";
    }

    //Calculer le salaire de l'employe
    public double calculSalaire() {
        return super.calculSalaire();
    }

    //Texte à sauvegarder
    @Override
    public String getTexteASauver() {
        return super.getTexteASauver() + "\n" ;
   }
}
