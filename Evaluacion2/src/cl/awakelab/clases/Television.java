package cl.awakelab.clases;
/**
 * Clase hija que hereda de Electrodomestico
 * @author Fernanda Quijada
 * @version 27/02/2020
 *
 */
public class Television extends Electrodomestico implements ICalcular{
	/**
	 * Atributos de Television
	 */
	private int resolucion;
	private boolean sintonizadorTDT;
	/**
	 * Constructor por defecto
	 */
	public Television() {
		super();
		resolucion=20;
		sintonizadorTDT=false;
	}
	
	/**
	 * Constructor donde solo se le ingresa precio base y el peso del electrodomestico.
	 * @param precioBase Precio con el cual partira el electrodomistico.
	 * @param peso Peso del electrodomestico en Kg.
	 */
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		resolucion=20;
		sintonizadorTDT=false;

	}
	
	/**
	 * Constructor con todos los parametros de entrada
	 * @param precioBase Precio con el cual partira el electrodomistico.
	 * @param color Color del electrodomestico
	 * @param consumoEnergetico Consumo de energia del electrodomestico
	 * @param peso Peso del electrodomestico en Kg.
	 * @param resolucion Resolucion de la TV en pulgadas
	 * @param sintonizador Es true si Tiene Sintonizador TDT y false cuando no tiene
	 */
	public Television(double precioBase, String color, char consumoEnergetico, double peso,
			int resolucion, boolean sintonizador) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion=resolucion;
		this.sintonizadorTDT=sintonizador;
		
		
	}
	/**
	 * 
	 * @return retorna la resolucion de la tv
	 */
	public int getResolucion() {
		return resolucion;
	}
	/**
	 * 
	 * @return retorna si contiene o no Sintonizador TDT
	 */
	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	/**
	 * Metodo que retorna el precio base mas otras cantidades dependiendo de algunos parametros y ademas se le suma el metodo preciofinal de la clase padre
	 * @return retorna el total del precio final
	 */
	public double precioFinal() {
		double precioFinalTV=super.precioFinal();
		
		if(this.resolucion>40) {
			precioFinalTV+=precioFinalTV*0.30;
		}
		if(this.sintonizadorTDT==true) {
			precioFinalTV+=50;
		}
		
		return precioFinalTV;
	}
	
	
}
