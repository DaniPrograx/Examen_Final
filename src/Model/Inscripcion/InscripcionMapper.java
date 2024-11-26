/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Inscripcion;

import Model.Eventos.Eventos;
import Model.Eventos.EventosDTO;
import Model.Mapper.Mapper;

/**
 *
 * @author Student
 */
public class InscripcionMapper  implements Mapper<Inscripcion,InscripcionDto>{


    @Override
    public InscripcionDto toDTo(Inscripcion ent) {
       return new InscripcionDto(
       ent.getId(),
       ent.getEvento(),
       ent.getAsistente(),
       ent.getFecha(),
       ent.getAsistencia()
       );
    }

    @Override
    public Inscripcion toEnt(InscripcionDto dto) {
       return new Inscripcion(
       dto.getId(),
       dto.getEvento(),
       dto.getAsistente(),
       dto.getFecha(),
       dto.getAsistencia()
       );
    }
    }
    

