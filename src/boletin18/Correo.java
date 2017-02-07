
package boletin18;

public class Correo {
    private String email;
    private boolean leido;
    private String contenido;

    public Correo() {
    }

    public Correo(String email, boolean leido) {
        this.email = email;
        this.leido = leido;
        this.contenido = contenido;
    }

    public String getEmail() {
        return email;
    }

    public boolean isLeido() {
        return leido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Correo{" + "email=" + email + ", leido=" + leido + '}';
    }
    
}
