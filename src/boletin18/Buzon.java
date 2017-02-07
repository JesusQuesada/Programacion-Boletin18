package boletin18;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Buzon {

    private ArrayList<Correo> mail = new ArrayList<Correo>();

    public int numeroDeCorreos() {

        return mail.size();
    }

    public void añadir(Correo c) {

        mail.add(c);
    }

    public boolean leidoNoLeido() {
        int aux = 0;
        boolean leido = false;
        for (Correo correo1 : mail) {
            if (correo1.isLeido()) {
                aux++;
            }
        }
        if (aux != 0) {
            leido = true;
        }
        return leido;

    }
    
    public String visualizaNoLeido(){
        int i;
        for(i=0; i<mail.size();i++){
            if(mail.get(i).isLeido()){
                break;
            }
            break;
        }    
    
        return "E-mail --- " + mail.get(i).getEmail() + "\n Contenido  \n" + mail.get(i).getContenido();
}
    
    public String visualiza(int k){
        
        
        return mail.get(k).toString();
    }
    
    public  void eliminar(int k){
        
        mail.remove(k);
    }

}


