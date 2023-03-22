/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapoo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author alex0
 */
public class Persona {
    //Atributos
    private String identificacion;
    private String nombres;
    private String apellidos;
    private String correo;
    private String genero;
    private Date fechaNacimineto;
    

    public Persona() {

    }

    public Persona(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Persona(String identificacion, String nombres, String apellidos, String correo, String genero, Date fechaNacimineto) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.genero = genero;
        this.fechaNacimineto = fechaNacimineto;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setFechaNacimineto(Date fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }

    public int calcularEdad() {
       //crear un objeto de tipo calendar
        Calendar calendar = Calendar.getInstance();
        //asignar al objeto calendar la fecha de nacimiento
        calendar.setTime(this.fechaNacimineto);
        //obtener el año de la fecha de nacimiento usando objeto calendar
        int yearFechaNacimiento = calendar.get(Calendar.YEAR);
        //obtener el mes de la fecha de nacimiento usando objeto calendar
        int mesNacimiento = calendar.get(calendar.MONTH)+1;
        //obtener el dia de la fecha de nacimiento usando objeto calendar
        int diaNacimiento = calendar.get(calendar.DAY_OF_MONTH);
        
        /*crear un objeto de tipo Period con las fecha de nacimiento
        y la fecha actual*/
        Period edad = Period.between(LocalDate.of(yearFechaNacimiento, 
                mesNacimiento, diaNacimiento), 
                LocalDate.now());
        /*retorna los años a partir del objeto edad utilizando
        el método getYears()*/
        return edad.getYears();
    }
}
