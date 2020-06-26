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
public class Zapatos extends Objetos {

    private double talla;
    private String suela;
    private int comodidad;

    public Zapatos() {
    }

    public Zapatos(double talla, String suela, int comodidad, String color, String descripcion, String marca, String size, String calidad, Persona personas) {
        super(color, descripcion, marca, size, calidad, personas);
        this.talla = talla;
        this.suela = suela;
        this.comodidad = comodidad;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getSuela() {
        return suela;
    }

    public void setSuela(String suela) {
        this.suela = suela;
    }

    public int getComodidad() {
        return comodidad;
    }

    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
    }

    @Override
    public String toString() {
        return "Zapatos " + super.getMarca() + " " + talla;
    }

}
