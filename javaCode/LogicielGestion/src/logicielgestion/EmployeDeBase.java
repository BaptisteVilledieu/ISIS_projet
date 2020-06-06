package logicielgestion;

/**
 *
 * @author cecil
 */
public class EmployeDeBase extends Employe {

    //CONSTRUCTEUR 
    public EmployeDeBase(String n, String p, int mat, int indice) throws EmployeException {
        super(n, p, mat, indice);
    }

    //Afficher l'employe
    @Override
    public String toString() {
        return super.toString() + "\n";
    }

    //Pas besoin de rédéfinir la méthode pour calculer le salaire, elle est
    //directement héritée de la classe Employe
    
}
