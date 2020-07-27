package com.catcube;

import com.catcube.model.Conexion;

public class App {

	public static void main(String[] args) {
		// No es posible generar la instancia con el constructor de la clase, debido a que el ámbito de dicho constructor es privado.
		//Conexion c = new Conexion();
		
		Conexion c = Conexion.getInstancia();
		c.conectar();
		c.desconectar();
		
		boolean res = c instanceof Conexion;
		System.out.println(res);
		
		// Tip: Spring Framework gestiona sus beans como Singleton por defecto.
	}
}
