package com.catcube.model;

public class Conexion {

	// Declaración de un atributo de tipo Conexion, de ámbito privado y usando la palabra reservada static.
	// La palabra reservada static se usa para poder invocar los atributos o métodos de la clase sin generar una instancia de la misma. 
	private static Conexion instancia;
	
	// El constructor de la clase debe ser de ámbito privado, para evitar generar instancias mediante el operador new
	private Conexion() {
		
	}
	
	// Método para obtener la instancia de la clase Conexion
	// La palabra reservada static hace posible el acceso al método mediante Conexion.getInstancia().
	public static Conexion getInstancia() {
		if (instancia == null) {
			instancia = new Conexion();
		}
		
		return instancia;
	}
	
	// Método de prueba
	public void conectar() {
		System.out.println("Conexión a la base de datos");
	}
	

	// Metodo de prueba
	public void desconectar() {
		System.out.println("Desconexión a la base de datos");
	}

}
