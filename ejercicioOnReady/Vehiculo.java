package ejercicioOnReady;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public abstract class Vehiculo implements OrdernarVehiculos{
	
	private String marca;
	private String modelo;
	private double precio;
	
	
	public Vehiculo() {
		
	}
	public Vehiculo(String marca, String modelo, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return  marca + " " + modelo;
	}
	
	@Override
	public void ordenar(ArrayList <Vehiculo> lista) {
		
		double masCaro = lista.get(0).precio;
		String vehiculoMasCaro = lista.get(0).getMarca() +" "+ lista.get(0).getModelo();
		double masBarato = lista.get(0).precio;
		String vehiculoMasBarato = lista.get(0).getMarca() +" "+ lista.get(0).getModelo();;
		String contieneLetra="";
		

		
		for(int i=0;i<=lista.size()-1;i++) {
			
			double precioVehiculo = lista.get(i).getPrecio();
			
			
			if(precioVehiculo>masCaro) {
				masCaro = precioVehiculo;
				
				vehiculoMasCaro = lista.get(i).getMarca() +" "+ lista.get(i).getModelo();
			}

			if(precioVehiculo<masBarato) {
				JOptionPane.showMessageDialog(null,lista.get(i).getMarca());
				masCaro = precioVehiculo;
				vehiculoMasBarato = lista.get(i).getMarca() +" "+ lista.get(i).getModelo();
			}
			
			if(lista.get(i).getModelo().contains("Y")) {
				contieneLetra = lista.get(i).getMarca() +" "+ lista.get(i).getModelo() + " " + lista.get(i).getPrecio();
			
		}	
	}
		
		JOptionPane.showMessageDialog(null,"El vehiculo mas caro es: " + vehiculoMasCaro + "\n" + "El vehiculo mas barato es: " + vehiculoMasBarato + "\n" + "Vehiculo con el modelo que contiene una Y es :" + contieneLetra);
	}
	
	
	
		

}
