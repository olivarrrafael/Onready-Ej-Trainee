package ejercicioOnReady;

import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.JOptionPane;

public class MainOnReady {

	public static void main(String[] args) {
  
	
		Vehiculo peugeot = new Automovil("Peugeot","206",200000,4);
		
		Vehiculo peugeot2 = new Automovil("Peugeot","208",250000,5);
		
		Vehiculo honda = new Motocicleta("Honda","Titan",60000.00, "125c");
		
		Vehiculo yamaha = new Motocicleta("Yamaha","YBR",80500, "160c");
		
		ArrayList <Vehiculo> lista = new ArrayList <Vehiculo>();
		
		lista.add(honda);
		lista.add(yamaha);
		lista.add(peugeot);
		lista.add(peugeot2);
		
		
		peugeot.ordenar(lista);
		
		
		lista.sort(Comparator.comparing(Vehiculo::getPrecio).reversed());
	
		for(Vehiculo p:lista) {
			System.out.print("Los vehiculos de mayor a menor precio son : " + p +"\n"); 
			
		}
	
	}
	}


