/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Asistentes;




import Model.Mapper.Mapper;

/**
 *
 * @author Student
 */
public class AsistentesMapper implements Mapper<Asistentes,AsistenteDTO>{

    @Override
    public AsistenteDTO toDTo(Asistentes ent) {
        return new AsistenteDTO(
       ent.getCedula(),
       ent.getNombre(),
       ent.getTelefono(),
       ent.getCorreo()        
       );
    }

    @Override
    public Asistentes toEnt(AsistenteDTO dto) {
        return new Asistentes(
       dto.getCedula(),
       dto.getNombre(),
       dto.getTelefono(),
       dto.getCorreo()
       );
    }

    

    
}
