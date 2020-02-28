package cl.awakelab.clases;
/**
 * Clase hija que hereda de Electrodomestico
 * @author Fernanda Quijada
 * @version 27/02/2020
 *
 */
public class Lavadora extends Electrodomestico implements ICalcular{
	/**
	 * atributo de Lavadora
	 */
	private double carga;
	/**
	 * Constructor por defecto
	 */
	public Lavadora() {
		super();
		carga=5;

	}
	/**
	 * Constructor donde solo se le ingresa precio base y el peso del electrodomestico.
	 * @param precioBase Precio con el cual partira el electrodomistico.
	 * @param peso Peso del electrodomestico en Kg.
	 */
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		carga=5;
	}
	
	/**
	 * Constructor con todos los parametros de entrada
	 * @param precioBase Precio con el cual partira el electrodomistico.
	 * @param color Color del electrodomestico
	 * @param consumoEnergetico Consumo de energia del electrodomestico
	 * @param peso Peso del electrodomestico en Kg.
	 * @param carga Carga que aguanta la lavadora en Kg.
	 */
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga=carga;
		
	}
	/**
	 * 
	 * @return Retorna la carga de la lavadora
	 */
	public double getCarga() {
		return carga;
	}

	/**
	 * Metodo que retorna el precio base mas otras cantidades dependiendo de algunos parametros y ademas se le suma el metodo preciofinal de la clase padre
	 * @return retorna el total del precio final
	 */
	public double precioFinal() {
		double precioFinalLav=super.precioFinal();
		if(this.carga>30) {
			precioFinalLav+=50;
		}
		
		return precioFinalLav;
	}
	
	
	
}
