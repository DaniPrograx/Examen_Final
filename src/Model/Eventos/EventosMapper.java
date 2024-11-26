/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Eventos;

import Model.Inscripcion.Inscripcion;
import Model.Mapper.Mapper;

 
public class EventosMapper implements Mapper<Eventos,EventosDTO>{

    @Override
    public EventosDTO toDTo(Eventos ent) {
     return new EventosDTO(
       ent.getId(),
       ent.getNombre(),
       ent.getFecha(),
       ent.getLugar(),
       ent.getCapacidad()
       );
   
    
    
    }

    @Override
    public Eventos toEnt(EventosDTO dto) {
       return new Eventos(
       dto.getId(),
       dto.getNombre(),
       dto.getLugar(),
       dto.getCapacidad()
       );
        
      
    }
    
}
