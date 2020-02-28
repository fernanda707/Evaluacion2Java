package cl.awakelab.ejecutable;


import cl.awakelab.clases.Electrodomestico;
import cl.awakelab.clases.Lavadora;
import cl.awakelab.clases.Television;
/**
 * Clase para ejecutar el proyecto
 * @author Fernanda Quijada
 * @version 27/02/2020
 *
 */
public class Ejecutable {
	
	public static void main(String[] args) {
		try {
			Electrodomestico[] listaElectrodomesticos=new Electrodomestico[10];
			
			Electrodomestico lavadora1	= new Lavadora();
			Electrodomestico lavadora2	= new Lavadora(100, 10);
			Electrodomestico lavadora3	= new Lavadora(120, "negro", 'C', 35, 10);
			Electrodomestico lavadora4	= new Lavadora(100, "blanco", 'F', 50, 15);
			
			Electrodomestico tv1		= new Television();
			Electrodomestico tv2		= new Television(50, 5);
			Electrodomestico tv3		= new Television(150, "gris", 'B', 10, 55, true);
			Electrodomestico tv4		= new Television(100, "negro", 'D', 7, 40, false);
			
			Electrodomestico electrodomestico1= new Electrodomestico(300, 50);
			Electrodomestico electrodomestico2= new Electrodomestico(300, "Azul", 'E', 30);
			
			listaElectrodomesticos[0]=lavadora1;
			listaElectrodomesticos[1]=lavadora2;
			listaElectrodomesticos[2]=lavadora3;
			listaElectrodomesticos[3]=lavadora4;
			listaElectrodomesticos[4]=tv1;
			listaElectrodomesticos[5]=tv2;
			listaElectrodomesticos[6]=tv3;
			listaElectrodomesticos[7]=tv4;
			listaElectrodomesticos[8]=electrodomestico1;
			listaElectrodomesticos[9]=electrodomestico2;
			
			double total=0;
			for (Electrodomestico e : listaElectrodomesticos) {
				if(e instanceof Television) {
					System.out.println("Precio Television: "+e.precioFinal());
					total+=e.precioFinal();
				}else {
					if(e instanceof Lavadora) {
						System.out.println("Precio Lavadora: "+e.precioFinal());
						total+=e.precioFinal();
					}else {
						System.out.println("Precio Electrodomestico: "+e.precioFinal());
						total+=e.precioFinal();
					}
				}
			
				
			}
			System.out.println("SUMA PRECIO TOTAL: "+ total);
		} catch (Exception e) {
			System.out.println("Se produjo une error... Vuelva a intentarlo. "+e.getMessage());
		}
		
		
	}

}
