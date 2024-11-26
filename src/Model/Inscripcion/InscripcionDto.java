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
public class InscripcionDto {
     private int id;
   private  Eventos evento;
   private Asistentes asistente;
   private LocalDate fecha;
   private  Asistentes asistencia;

    public int getId() {
        return id;
    }

    

    public Eventos getEvento() {
        return evento;
    }

  

    public Asistentes getAsistente() {
        return asistente;
    }

    

  

    public Asistentes getAsistencia() {
        return asistencia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public InscripcionDto(int id, Eventos evento, Asistentes asistente, LocalDate fecha, Asistentes asistencia) {
        this.id = id;
        this.evento = evento;
        this.asistente = asistente;
        this.fecha = fecha;
        this.asistencia = asistencia;
    }

   

  


    
}
