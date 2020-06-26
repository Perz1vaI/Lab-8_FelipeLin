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
public class Ropa extends Objetos {

    private double talla;
    private String tipo;
    private String pais;

    public Ropa() {
    }

    public Ropa(double talla, String tipo, String pais, String color, String descripcion, String marca, String size, String calidad, Persona personas) {
        super(color, descripcion, marca, size, calidad, personas);
        this.talla = talla;
        this.tipo = tipo;
        this.pais = pais;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Ropa " + super.getMarca() + " " + talla;
    }

}
