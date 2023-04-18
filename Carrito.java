package paquetePoo;

public class Carrito {
    private int numero;
    private Persona_ clien;
    private double montoCarrito;
    
  
	public Carrito(int num, Persona_ clien) {
		this.numero =  num;
	    clien= clien;
	       
	}
	public int dameNum() {  
		return numero;
	} 
	public double dameMontoCarrito() {
		return montoCarrito;
	}
	public void mostrarMontoCarrito(double monto) {
		montoCarrito = monto;
		System.out.println("Total de la compra: "+montoCarrito);
		
		
    }
}
