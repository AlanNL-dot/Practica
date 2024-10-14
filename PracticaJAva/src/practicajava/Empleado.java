/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajava;


    public class Empleado extends Persona {
    private String puesto;

    public Empleado(String nombre, String apellido, String dni, String puesto) {
        super(nombre, apellido, dni);
        this.puesto = puesto;
    }

    public String solicitudPermiso() {
        return "Solicitud de permiso enviada por " + getNombre() + " " + getApellido();
    }

    public String reporteHorasExtra() {
        return "Reporte de horas extra enviado por " + getNombre() + " " + getApellido();
    }
}

