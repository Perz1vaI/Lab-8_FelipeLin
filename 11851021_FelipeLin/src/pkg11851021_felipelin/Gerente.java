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
public class Gerente extends Persona {

    private String user;
    private String pass;
    private String cargo;

    public Gerente() {

    }

    public Gerente(String user, String pass, String cargo, String id, String nombre, String edad, String sexo, String estadoc, double altura, double peso) {
        super(id, nombre, edad, sexo, estadoc, altura, peso);
        this.user = user;
        this.pass = pass;
        this.cargo = cargo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
