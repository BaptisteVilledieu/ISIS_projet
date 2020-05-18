package logicielgestion;

/**
 *
 * @author cecil
 */
public class EmployeDeBase extends Employes {
    
    //CONSTRUCTEUR 
    public EmployeDeBase(String n, String p, int mat,float indice) {
        super(n, p, mat, indice);
    }
    @Override
    public String toString(){
        return super.toString()  + "\n";
    }  
    public double calculSalaire(){
        return this.indiceSalarial*12;
    }
}
