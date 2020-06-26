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
public class Objetos {

    protected String color;
    protected String descripcion;
    protected String marca;
    protected String size;
    protected String calidad;
    protected Persona personas;

    public Objetos() {
    }

    public Objetos(String color, String descripcion, String marca, String size, String calidad, Persona personas) {
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.size = size;
        this.calidad = calidad;
        this.personas = personas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Persona getPersonas() {
        return personas;
    }

    public void setPersonas(Persona personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "Objetos{" + "color=" + color + ", descripcion=" + descripcion + ", marca=" + marca + ", size=" + size + ", calidad=" + calidad + ", personas=" + personas + '}';
    }

}
