/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
//import java.util.Date;

import java.util.Date;


/**
 *
 * @author alex
 */
public class Usuario {
    
     java.util.Date utilDate = new java.util.Date(); //fecha actual
  long lnMilisegundos = utilDate.getTime();
  java.sql.Date sqlDate = new java.sql.Date(lnMilisegundos);
  java.sql.Time sqlTime = new java.sql.Time(lnMilisegundos);
  java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(lnMilisegundos);

  //System.out.println("sql.Timestamp: "+sqlTimestamp);
    
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String clave;
    private int tipo;
    private int estado;
    private  String pregunta;
    private String respuesta;
    private  Date fecha_registro;
    
    public Usuario() {        
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
        this.correo = "";
        this.clave = "";
        this.tipo = 0;
        this.estado = 0;
        this.pregunta = "";
        this.respuesta = "";
        // Lo deje en date para reutilzar
        this.fecha_registro = new Date();          
    }

    

    public Usuario(int id, String nombre, String apellido, String correo, String clave, int tipo, int estado, String pregunta, String respuesta, Date fecha_registro) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.clave = clave;
        this.tipo = tipo;
        this.estado = estado;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.fecha_registro = fecha_registro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    
    
    
}
