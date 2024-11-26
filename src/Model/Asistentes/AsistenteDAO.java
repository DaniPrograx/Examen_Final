/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Asistentes;

import Model.Dao.DAO;
import Model.Eventos.Eventos;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class AsistenteDAO extends DAO<AsistenteDTO> {

    public AsistenteDAO(Connection connection) {
        super(connection);
    }

    @Override
    protected boolean create(AsistenteDTO dto) throws SQLException {
        if (dto == null) {
            return false;
        }
        String query = "call AsistenteCreate(?,?,?,?)";
        try ( PreparedStatement stmt = connection.prepareStatement(query)){
            stmt.setInt(1, dto.getCedula());
            stmt.setString(2, dto.getNombre());
            stmt.setInt(3, dto.getTelefono());
            stmt.setString(4, dto.getCorreo());
            return stmt.executeUpdate() > 0;

        }
    }

    @Override
    protected AsistenteDTO read(Eventos cedula) throws SQLException {

        if (cedula == null || String.valueOf(cedula).trim().isEmpty()) {
            return null;
        }
        String query = "call AsistenteRead(?)";
        try ( PreparedStatement stmt = connection.prepareStatement(query)){
            stmt.setString(1, String.valueOf(cedula));
            try ( ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new AsistenteDTO(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getInt(3),
                            rs.getString(4)
                    );
                    }
                }
            }
     return null;
    }

        @Override
        protected List<AsistenteDTO> readAll() throws SQLException {
          String query = "call AsistenteReadAll()";
          List<AsistenteDTO> list = new ArrayList<>();
          try(PreparedStatement stmt = connection.prepareStatement(query)){
              try(ResultSet rs = stmt.executeQuery()) {
                  while (rs.next()) {
                      list.add(new AsistenteDTO(
                      rs.getInt(1),
                            rs.getString(2),
                            rs.getInt(3),
                            rs.getString(4)
                      ));
                      return list;
                  }
                 
              
              }
          }
            
      return null;
        
         
    }

        @Override
        protected boolean update
        (AsistenteDTO dto) throws SQLException {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    }
