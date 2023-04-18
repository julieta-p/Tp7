package paquetePoo;
  
	public class Persona_ {
	 
		public Persona_(int dni, String nombre, String direccion, String celu, String mail) {
			this.dni= dni;
			this.nombre= nombre; 
			this.direccion= direccion;
			this.celu= celu;
			this.mail= mail;
		} 
		public Persona_(int dni, String nombre){
			this(dni,nombre,"Por defecto","34872109","mailpordefecto@gmail.com");
			
		}
		  

	    //metodos getters valor de atributos
		public int dameDni() {
			return dni;
	       }
		public String dameNombre() {
			return nombre;
			}
			public String direccion() {
				return direccion;
			}
			public String dameCeluMail() {
				return celu+"--"+ mail; 
			}
			
			
			//metodo setter no devuelve nada
		public void mostrarPersona() {
			System.out.println("Persona:  ");
			System.out.println("DNI:--"+dni+"--"+ "Nombre:  "+nombre);
			System.out.println("Direccion:--"+direccion);
			System.out.println("Celu:--"+celu+"--" +"Mail:  "+mail);
	    
		}
			
		private int dni;
		private String nombre; 
		private String direccion;
		private String celu;
		private String mail;
	}
		
 
