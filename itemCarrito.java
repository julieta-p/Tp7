package paquetePoo;

public class itemCarrito {
	
	private Carrito num;
	private Producto p;
	private int Can;
	private double montoItem; 
	
	public itemCarrito(Carrito numero, Producto Prod, int can) { 
	       
		num= numero;
		p = Prod;
		Can= can;
		montoItem= p.un_precio()*can;   
	}
	public double dameMontoitem() {
		return montoItem; 
	}
	public int dameCantidad() {
		return Can;	
	}
	public void mostrarItem() {
		System.out.println(Can+ "\t" +p.un_precio()+ "\t   "+montoItem +"\t " + p.un_nombre());
		
	}
	public void dameTitulo() { 
		System.out.println("cant\tprecio\t SubTotal\tProduc");
		 
	}
	
	
}



