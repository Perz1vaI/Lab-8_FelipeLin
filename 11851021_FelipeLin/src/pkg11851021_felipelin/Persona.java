/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11851021_felipelin;

import java.util.ArrayList;

/**
 *
 * @author felipelinzhao
 */
public class Persona {

    protected String id;
    protected String nombre;
    protected String edad;
    protected String sexo;
    protected String estadoc;
    protected double altura;
    protected double peso;
    protected ArrayList<String> mensajes = new ArrayList();

    public Persona() {
    }

    public Persona(String id, String nombre, String edad, String sexo, String estadoc, double altura, double peso) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estadoc = estadoc;
        this.altura = altura;
        this.peso = peso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoc() {
        return estadoc;
    }

    public void setEstadoc(String estadoc) {
        this.estadoc = estadoc;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList<String> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<String> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", estadoc=" + estadoc + ", altura=" + altura + ", peso=" + peso + ", mensajes=" + mensajes + '}';
    }

}
