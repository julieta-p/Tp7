package paquetePoo;

public class DescuentoFijo extends Descuento{

	  public double MontoFinal(double montoInicial) {
		  return montoInicial - this.dameMontoDesc();
		  
		  
	  }
}
