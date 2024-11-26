/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Eventos;

import DatabaseConnection.ConnectionBD;
import java.sql.PreparedStatement;
import java.util.Date;

/**
 *
 * @author Student
 */
public class EventosDTO {

    private int id;
    private String nombre;
    private Date Fecha;
    private String lugar;
    private String capacidad;
 

    public EventosDTO(int id, String nombre, Date Fecha, String lugar, String capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.Fecha = Fecha;
        this.lugar = lugar;
        this.capacidad = capacidad;
    }

    public EventosDTO() {
    }

    public EventosDTO(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public String getCapacidad() {
        return capacidad;
    }

}
