
package boletin18;

public class Boletin18 {

    public static void main(String[] args) {
        String nombre, cont;
        Buzon mail1 = new Buzon();
        mail1.numeroDeCorreos();
        //mail1.añadir(new Correo(nombre,cont));
        mail1.leidoNoLeido();
        mail1.numeroDeCorreos();
        mail1.visualizaNoLeido();
    }
    
}
