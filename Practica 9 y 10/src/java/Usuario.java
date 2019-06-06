/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Usuario {
   
    private String nombre;
    private String email;
    private String fechaNac;
    private String contraseña;
    
    public Usuario(String nombre, String email, String fechaNac, String contraseña){
        this.nombre = nombre;
        this.email = email;
        this.fechaNac= fechaNac;
        this.contraseña = contraseña;
    }
    public Usuario(){
    
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
    
        return nombre;
    }
   
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
    
        return email;
    }
    public void setFechaNac(String fechaNac){
        this.fechaNac = fechaNac;
    }
    
    public String getFechaNac(){
    
        return fechaNac;
    }
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
    
    public String getContraseña(){
    
        return contraseña;
    }
}
