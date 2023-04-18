package paquetePoo;

public class DescuentoPor extends Descuento{
     private final double montoMenor=5000;
     
	 public double MontoFinal(double montoInicial) {
		 if (montoInicial < montoMenor) {
			 return montoInicial-(montoInicial*0.05);
		 }
		 else 
		  return montoInicial -(montoInicial* this.dameMontoDesc());
		  
}
	 }
	