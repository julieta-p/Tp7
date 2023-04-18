package paquetePoo;

public class Producto {
	private int codigo;
	private String nombre; 
	private double precio;
	private String descripcion;
	private int stock;
	
public Producto (int cod, String nom, double prec, String desc, int stk) {//método constructor
	//inicializamos los objetos
	codigo=cod;
	nombre= nom;
	precio= prec;
	descripcion=desc;
	stock=stk; 
	}
//metodos getters
public int un_codigo() {
	return codigo;
}
public String un_nombre() {
	return nombre;
}
public double un_precio() {
	return precio;
}
public String un_descripcion() {
	return descripcion;
}
public int un_stock() {
	return stock;
}
 public void mostrarProducto() {
	 System.out.println("Producto: ");
	 System.out.println("Codigo: " +codigo+ "--" +"Nombre: "+ nombre);
	 System.out.println("Precio: " +precio+ "--" +"Descripcion: "+ descripcion);
	 
 
 }
 
 
}

