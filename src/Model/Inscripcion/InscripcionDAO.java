/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Inscripcion;

import Model.Dao.DAO;
import Model.Eventos.Eventos;
import Model.Eventos.EventosDTO;
import java.sql.SQLException;
import java.util.List;
import Model.Eventos.Eventos;
import com.sun.jdi.connect.spi.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class InscripcionDAO extends DAO<EventosDTO>{
    
    
    @Override
    protected boolean create(EventosDTO dto) throws SQLException  {
      if(dto ==null){
        return false;
    }
      String query="Call Inscripciones(?,?,?)";
      try(PreparedStatement stmt=connection.preparedStatement(query)){
          stmt.setString(1, dto.getNombre());
          stmt.setInt(2, dto.getId());
          stmt.setString(3, dto.getCapacidad());
          
           return stmt.executeUpdate()>0;
      }
    
    }

    @Override
    protected EventosDTO read(Eventos id) throws SQLException {
        if(id ==null || String.valueOf(id).trim().isEmpty()) {
        return null;
    }
      String query="Call Inscripciones(?,?,?)";
      try(PreparedStatement stmt=connection.preparedStatement(query)){
          stmt.setString(1,String.valueOf(id));
          try(ResultSet rs=stmt.executeQuery()){
              if(rs.next()){
                  return new EventosDTO(
                  rs.getString(1),
                  rs.getString(2));
              }
              }
          }
      
        return null;
           
    }

    @Override
    public List<EventosDTO> readAll() throws SQLException {
        String query="Call Inscripciones()";
        List<EventosDTO> list=new ArrayList<>();
      try(PreparedStatement stmt=connection.preparedStatement(query)){
          stmt.setString(1,String.valueOf(id));
          try(ResultSet rs=stmt.executeQuery()){
             while(rs.next()){
                 list.add(new EventosDTO (
                 rs.getString(1),
                  rs.getString(2)));
                 
             }
              }
          }
      
        return list;
           
    }

    @Override
    protected boolean update(EventosDTO dto) throws SQLException {
       if (dto==null){
           return false;
       }
       String query="Call Inscripciones(?,?,?) ";
       try(PreparedStatement stmt=connection.preparedStatement(query)){
          stmt.setString(1, dto.getNombre());
          stmt.setInt(2, dto.getId());
          stmt.setString(3, dto.getCapacidad());
          
           return stmt.executeUpdate()>0;
    }
    }
}

