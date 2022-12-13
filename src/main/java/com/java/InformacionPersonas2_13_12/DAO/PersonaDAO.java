package com.java.InformacionPersonas2_13_12.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.java.InformacionPersonas2_13_12.conexion.Conexion;
import com.java.InformacionPersonas2_13_12.modelo.Persona;

public class PersonaDAO {
private static Connection conexion;
	
	public static ArrayList<Persona> listarPersonas() throws SQLException{
		conexion= Conexion.getConexion();
		ArrayList<Persona> listado= new ArrayList<Persona>();
		String query= "SELECT * FROM persona";
		PreparedStatement ps=conexion.prepareStatement(query);
		ResultSet rs= ps.executeQuery(query);
		
		while(rs.next()) {
			listado.add(new Persona(rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5)));
		}
		
		
		return listado;
		
	}


}
