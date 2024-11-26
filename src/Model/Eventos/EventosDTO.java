/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Eventos;

import DatabaseConnection.ConnectionBD;

/**
 *
 * @author Student
 */
public class EventosDTO {
    private ConnectionBD connection;
private int id;
    private String nombre ;
    private String lugar;
    private String capacidad;
    public EventosDTO(ConnectionBD connection) {
        this.connection = connection;
    }

    public ConnectionBD getConnection() {
        return connection;
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
