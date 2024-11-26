/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model.Dao;

import Model.Eventos.Eventos;
import com.sun.jdi.connect.spi.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Student
 */
public abstract class DAO <DTO>{
    protected Connection connection;
    protected PreparedStatement stmt;
    protected ResultSet rs;
    List<DTO>dtos;
    protected Eventos id;
    
    public DAO(Connection connection){
       this.connection= connection;
    }
    protected abstract boolean create(DTO dto)throws SQLException;
     protected abstract DTO read(Eventos id)throws SQLException;
      protected abstract List<DTO> readAll()throws SQLException;
       protected abstract boolean update(DTO dto)throws SQLException;
     
        
    
}
