 package paquetePoo;

public abstract class Descuento {
    private double monto; //atributo solo de la clase
    
    
	public double dameMontoDesc() {
	return monto;
	
}
public void asignaMontorDesc(double monto) {
	this.monto = monto;
}
public abstract double MontoFinal(
		double montoInicial);
}