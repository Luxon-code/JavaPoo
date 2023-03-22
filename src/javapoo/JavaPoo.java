/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapoo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author alex0
 */
public class JavaPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ingrese la indentificacion de la persona: ");
        String identifica = teclado.nextLine();
        System.out.println("Ingrese el nombre de la persona: ");
        String nombres = teclado.nextLine();
        System.out.println("Ingrese el apellido de la persona: ");
        String apellidos = teclado.nextLine();
        System.out.println("Ingrese el correo de la persona: ");
        String correo = teclado.nextLine();
        System.out.println("Ingrese genero (Masculino/Femenino): ");
        String genero = teclado.nextLine();
        System.out.println("Ingrese la fecha de nacimiento de la persona: ");
        String fecha = teclado.nextLine();
        try {
            Date fechaNacimiento = formato.parse(fecha);
            Persona p = new Persona(identifica, nombres, apellidos, correo, genero, fechaNacimiento);
            System.out.println("DATOS DE LA PERSONA");
            System.out.println("Indentificacion: " + p.getIdentificacion());
            System.out.println("Nombre: " + p.getNombres());
            System.out.println("Apellido: " + p.getApellidos());
            System.out.println("Correo: " + p.getCorreo());
            System.out.println("Genero: " + p.getGenero());
            System.out.println("Fecha de nacimiento: " + p.getFechaNacimineto());
            System.out.println("su edad es de: " + p.calcularEdad() + " años");
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
