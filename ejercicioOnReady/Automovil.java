package ejercicioOnReady;

public class Automovil extends Vehiculo {
private int cantidadDePuertas;

public Automovil(String marca,String modelo,double precio, int cantidadDePuertas) {
	super(marca,modelo,precio);
	this.cantidadDePuertas = cantidadDePuertas;
}


public int getCantidadDePuertas() {
	return cantidadDePuertas;
}

public void setCantidadDePuertas(int cantidadDePuertas) {
	this.cantidadDePuertas = cantidadDePuertas;
}


@Override
public String toString() {
	return super.toString();
}



}
