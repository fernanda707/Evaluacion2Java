package cl.awakelab.clases;
/**
 * Clase padre que define los atributos en comun de un Electrodomestico
 * @author Fernanda Quijada
 * @version 27/02/2020
 *
 */
public class Electrodomestico implements ICalcular {
	/**
	 * Atributos de la clase
	 */
	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	/**
	 * Constructor por defecto
	 */
	public Electrodomestico() {
		color="Blanco";
		consumoEnergetico='F';
		precioBase=100;
		peso=5;
	}
	/**
	 * Constructor donde solo se le ingresa precio base y el peso del electrodomestico.
	 * @param precioBase Precio con el cual partira el electrodomistico.
	 * @param peso Peso del electrodomestico en Kg.
	 */
	public Electrodomestico(double precioBase, double peso) {
		color="Blanco";
		consumoEnergetico='F';
		this.precioBase=precioBase;
		this.peso=peso;
		
	}
	/**
	 * Constructor con todos los parametros de entrada
	 * @param precioBase Precio con el cual partira el electrodomistico.
	 * @param color Color del electrodomestico
	 * @param consumoEnergetico Consumo de energia del electrodomestico
	 * @param peso Peso del electrodomestico en Kg.
	 */
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
	
		this.precioBase = precioBase;
		if(comprobarColor(color)) {
			this.color = color;
		}else {
			this.color="Blanco";
		}
		
		if(comprobarConsumoEnergetico(consumoEnergetico)) {
			this.consumoEnergetico = consumoEnergetico;
		}else {
			this.consumoEnergetico = 'F';
		}
		
		this.peso = peso;
		
	}
	
	/**
	 * 
	 * @return retorna el precio base
	 */
	public double getPrecioBase() {
		return precioBase;
	}
	/**
	 * 
	 * @return retorna el color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * 
	 * @return retorna la categoria del consumo
	 */
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	/**
	 * 
	 * @return retorna el peso
	 */
	public double getPeso() {
		return peso;
	}
	
	/**
	 * Metodo que verifica si el parametro de consumo de energia esta entre las opciones
	 * @param letra parametro del consumo de energia
	 * @return retorna true si esta correcto el valor ingresado o false si no lo esta
	 */
	private boolean comprobarConsumoEnergetico(char letra) {
		if(letra=='A'||letra=='B'||letra=='C'||letra=='D'||letra=='E'||letra=='F') {
			return true;
		}
		return false;
	}
	
	/**
	 * Metodo que verifica si el color ingresado es correcto
	 * @param color atributo que ingresa el color
	 * @return retorna un true si el color ingresado es correcto o false si no lo es
	 */
	private boolean comprobarColor(String color) {
		if (color.equalsIgnoreCase("blanco")||color.equalsIgnoreCase("negro")||color.equalsIgnoreCase("rojo")
				|| color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
			return true;
		}
		return false;
	}
	
	/**
	 * Metodo que retorna el precio base mas otras cantidades dependiendo de algunos parametros
	 * @return retorna el total del precio final
	 */
	public double precioFinal(){
		double precioFinal=this.precioBase;
		if(this.consumoEnergetico=='A') {
			precioFinal+=100;
		}
		if(this.consumoEnergetico=='B') {
			precioFinal+=80;
		}
		if(this.consumoEnergetico=='C') {
			precioFinal+=60;
		}
		if(this.consumoEnergetico=='D') {
			precioFinal+=50;
		}
		if(this.consumoEnergetico=='E') {
			precioFinal+=30;
		}
		if(this.consumoEnergetico=='F') {
			precioFinal+=10;
		}
		
		if(this.peso>=0 && this.peso<=19) {
			precioFinal+=10;
		}
		if(this.peso>=20 && this.peso<=49) {
			precioFinal+=50;
		}
		if(this.peso>=50 && this.peso<=79) {
			precioFinal+=80;
		}
		if(this.peso>80) {
			precioFinal+=100;
		}
		
		return precioFinal;
	}

	
}
