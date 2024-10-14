/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajava;

public class Cliente extends Persona {
    private String empresa;

    public Cliente(String nombre, String apellido, String dni, String empresa) {
        super(nombre, apellido, dni);
        this.empresa = empresa;
    }

    public String contactarRepresentante() {
        return "Representante contactado por " + getNombre() + " " + getApellido();
    }

    public String solicitarInformacion() {
        return "Información solicitada por " + getNombre() + " " + getApellido();
    }
}
    

