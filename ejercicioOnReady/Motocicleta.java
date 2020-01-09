package ejercicioOnReady;

public class Motocicleta extends Vehiculo {
	private String cilindrada;

	public Motocicleta(String marca,String modelo,double precio, String cilindrada) {
		super(marca,modelo,precio);
		this.cilindrada = cilindrada;
	}


	public String getCilindrada() {
		return cilindrada;
	}


	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}


	@Override
	public String toString() {
		return super.toString();
	}


	
	

}
