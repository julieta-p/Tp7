package paquetePoo;

import java.time.LocalDate;

public class CarritoCompras {

	public static void main(String[] args) {
		
		
		//instanciacion de clase producto 
         Producto prod1 = new Producto(100,"Leche", 230.50, "Leche Larga Vida caja 1L", 100);
         Producto prod2 = new Producto(101,"Pan", 180.50,"Pan por Kg", 100);
         Producto prod3 = new Producto(102,"Aceite", 900, "Aceite Girasol 1.5L", 200);
         
       
         
         
         //instanciacion de clase persona
         Persona_ per1= new Persona_ (34872109, "Jacinto Villa", "Rio salado 304", "234123456", "jacv@gmail.com"); 
	   	 Persona_ per2= new Persona_(348709109, "Marcelo Villa", "Rio Diamante 765", "2387623456", "marvill@gmail.com"); 
         per1.mostrarPersona();
         per2.mostrarPersona();
         
         Carrito carro =new Carrito(40, per1);
         itemCarrito cargaItem[] = new itemCarrito[3]; 
 		cargaItem[0] = new itemCarrito(carro, prod1, 3);
 		cargaItem[1] = new itemCarrito(carro, prod2, 1);
 		cargaItem[2] = new itemCarrito(carro, prod3, 5);
 		cargaItem[0].dameTitulo();
 		double monto = mostrarCompras(cargaItem,carro,per1);
 		carro.mostrarMontoCarrito(monto);
 	    descuentos(monto);
	}
 		
 	public static void descuentos (double monto) {
 		LocalDate fecha = LocalDate.now();
 		int dia = fecha.getDayOfMonth();
 		if (dia%2==0) {
 		
 		Descuento descF = new DescuentoFijo();
 		descF.asignaMontorDesc(250);
 		System.out.println("Monto total con descuento es:"+ descF.MontoFinal(monto));
 	    }	
 		else {
 		Descuento descP = new DescuentoPor();
 		descP.asignaMontorDesc(0.05);
 		 System.out.println("Monto total con descuento: "+descP.MontoFinal(monto));
 		      }
 		}
 	
 		
 		
 		public static double mostrarCompras(itemCarrito cargarItem[], Carrito carro, Persona_ per1) {
 			double suma = 0;
 			for (itemCarrito item : cargarItem) {
 			
 				item.mostrarItem();	
 				suma = suma + item.dameMontoitem();
 			}
 			return suma;
	    }
	
	   }