/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Asistentes;

/**
 *
 * @author Student
 */
public class AsistenteDTO {
    private int cedula;
    private String nombre;
    private int telefono;
    private String correo;

    

    public int getCedula() {
        return cedula;
    }

    

    public String getNombre() {
        return nombre;
    }

 

    public int getTelefono() {
        return telefono;
    }

 

    public String getCorreo() {
        return correo;
    }

    public AsistenteDTO(int cedula, String nombre, int telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

     
}
