
package pkg11851021_felipelin;

/**
 *
 * @author felipelinzhao
 */
public class Mensajes {
    
    private Persona receptor;
    private Persona emisor;
    private String mensaje;

    public Mensajes() {
    }

    public Mensajes(Persona receptor, Persona emisor, String mensaje) {
        this.receptor = receptor;
        this.emisor = emisor;
        this.mensaje = mensaje;
    }

    public Persona getReceptor() {
        return receptor;
    }

    public void setReceptor(Persona receptor) {
        this.receptor = receptor;
    }

    public Persona getEmisor() {
        return emisor;
    }

    public void setEmisor(Persona emisor) {
        this.emisor = emisor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Mensaje de " + emisor + " a " + receptor;
    }
    
    
    
    
}
