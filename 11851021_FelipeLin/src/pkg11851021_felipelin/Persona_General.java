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
public class Persona_General extends Persona {

    private String ocupacion;
    private String horario;
    private String trabajando;
    private double sueldo;

    public Persona_General() {
    }

    public Persona_General(String ocupacion, String horario, String trabajando, double sueldo, String id, String nombre, String edad, String sexo, String estadoc, double altura, double peso) {
        super(id, nombre, edad, sexo, estadoc, altura, peso);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.trabajando = trabajando;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTrabajando() {
        return trabajando;
    }

    public void setTrabajando(String trabajando) {
        this.trabajando = trabajando;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
