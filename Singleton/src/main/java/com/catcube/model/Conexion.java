package com.catcube.model;

public class Conexion {

	// Declaraci�n de un atributo de tipo Conexion, de �mbito privado y usando la palabra reservada static.
	// La palabra reservada static se usa para poder invocar los atributos o m�todos de la clase sin generar una instancia de la misma. 
	private static Conexion instancia;
	
	// El constructor de la clase debe ser de �mbito privado, para evitar generar instancias mediante el operador new
	private Conexion() {
		
	}
	
	// M�todo para obtener la instancia de la clase Conexion
	// La palabra reservada static hace posible el acceso al m�todo mediante Conexion.getInstancia().
	public static Conexion getInstancia() {
		if (instancia == null) {
			instancia = new Conexion();
		}
		
		return instancia;
	}
	
	// M�todo de prueba
	public void conectar() {
		System.out.println("Conexi�n a la base de datos");
	}
	

	// Metodo de prueba
	public void desconectar() {
		System.out.println("Desconexi�n a la base de datos");
	}

}
