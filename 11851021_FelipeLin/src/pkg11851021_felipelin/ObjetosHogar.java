/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11851021_felipelin;

/**
 *
 * @author felipelinzhao
 */
public class ObjetosHogar extends Objetos {

    private String lugar;
    private String funcionamiento;
    private String garantia;

    public ObjetosHogar() {
    }

    public ObjetosHogar(String lugar, String funcionamiento, String garantia, String color, String descripcion, String marca, String size, String calidad, Persona personas) {
        super(color, descripcion, marca, size, calidad, personas);
        this.lugar = lugar;
        this.funcionamiento = funcionamiento;
        this.garantia = garantia;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFuncionamiento() {
        return funcionamiento;
    }

    public void setFuncionamiento(String funcionamiento) {
        this.funcionamiento = funcionamiento;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "Objeto de hogar " + super.getMarca() + " " + funcionamiento;
    }

}
