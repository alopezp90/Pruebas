package pruebas;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class FichaIsaac {

    private int superior;

    public FichaIsaac(int superior) {

        if (superior > 6 && superior % 2 == 0) {
            this.superior = 6;
        } else if (superior > 6 && superior % 2 != 0) {
            this.superior = 5;
        } else {
            this.superior = superior;
        }
    }
    
    public static void main(String[] args) {
        
        FichaIsaac prueba1 = new FichaIsaac(10);
        System.out.println("prueba1: " + prueba1.superior);
        FichaIsaac prueba2 = new FichaIsaac(11);
        System.out.println("prueba2: " + prueba2.superior);
        FichaIsaac prueba3 = new FichaIsaac(3);
        System.out.println("prueba3: " + prueba3.superior);
    }

}
