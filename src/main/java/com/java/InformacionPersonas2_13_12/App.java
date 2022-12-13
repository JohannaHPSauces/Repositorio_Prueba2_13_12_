package com.java.InformacionPersonas2_13_12;

import java.sql.SQLException;
import java.util.ArrayList;

import com.java.InformacionPersonas2_13_12.DAO.PersonaDAO;
import com.java.InformacionPersonas2_13_12.modelo.Persona;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<Persona> listaPersonas;
		
		try {
			listaPersonas =PersonaDAO.listarPersonas();
			
			for(Persona p: listaPersonas) {
				String nombre =p.getNombre();
				String apellido1=p.getApellido1();
				String apellido2= p.getApellido2();
				int edad= p.getEdad();
		
				System.out.println("Tu nombre es"+nombre+" te apellidas "+apellido1+" "+apellido2+" y tienes "+edad+" años");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        		
    }
}
