/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Inscripcion;

import Model.Asistentes.Asistentes;
import Model.Eventos.Eventos;
import java.time.LocalDate;


/**
 *
 * @author Student
 */
public class Inscripcion {
    private int id;
   private  Eventos evento;
   private Asistentes asistente;
   private LocalDate fecha;
   private  Asistentes asistencia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Eventos getEvento() {
        return evento;
    }

    public void setEvento(Eventos evento) {
        this.evento = evento;
    }

    public Asistentes getAsistente() {
        return asistente;
    }

    public void setAsistente(Asistentes asistente) {
        this.asistente = asistente;
    }

  

    public Asistentes getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Asistentes asistencia) {
        this.asistencia = asistencia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Inscripcion(int id, Eventos evento, Asistentes asistente, LocalDate fecha, Asistentes asistencia) {
        this.id = id;
        this.evento = evento;
        this.asistente = asistente;
        this.fecha = fecha;
        this.asistencia = asistencia;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "id=" + id + ", evento=" + evento + ", asistente=" + asistente + ", fecha=" + fecha + ", asistencia=" + asistencia + '}';
    }

    
   

    
}
