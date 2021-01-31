package EmpresaFruticola;

import java.util.ArrayList;

public class Plantacion {

	private String nombre;
	private double hectareas;
	private ArrayList<Cosecha> cosechas;
	
	public Plantacion(String nom, double hec) {
		setNombre(nom);
		setHectareas(hec);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getHectareas() {
		return hectareas;
	}

	private void setHectareas(double hectareas) {
		this.hectareas = hectareas;
	}
	
	public void agregarCosecha(Cosecha c) {
		//TODO
		
		this.cosechas.add(c);
		
	}
	
	public void mostrarDatos() {
		//TODO
		toString();
		
	}
	
	public void mostrarTodos() {
		//TODO
		
		for(Cosecha c: this.cosechas) {
			c.toString();
			c.imprimirResultadoCosecha();
		}
		
	}
	
	public void rendimientoMaximo() {
		//TODO
		
		double rendimientoMax = 0;
		double rendimientoAux = 0;
		
		for(Cosecha c: this.cosechas) {
			rendimientoAux = c.obtenerRendimiento();
			
			if(rendimientoAux > rendimientoMax) {
				rendimientoMax = rendimientoAux;
			}
		}
		
		System.out.println("El rendimiento m�ximo fue de "+ rendimientoMax);
	}
	
	public void rendimientoMinimo() {
		//TODO
		
		double rendimientoMin = 999999999;
		double rendimientoAux = 0;
		
		for(Cosecha c: this.cosechas) {
			rendimientoAux = c.obtenerRendimiento();
			
			if(rendimientoAux < rendimientoMin) {
				rendimientoMin = rendimientoAux;
			}
			
		}
		System.out.println("El rendimiento m�nimo fue: " + rendimientoMin);
	}
	
	public void mostrarMenoresA (int num) {
		//TODO
		double aux = 0;
		
		System.out.println("Los resultados menores a " + num + "fueron: ");
		
		for(Cosecha c: this.cosechas) {
			aux = c.obtenerRendimiento();
			
			if(aux < num) {
				c.imprimirResultadoCosecha();
			}
		}
		
	}

	public void mostrarMayoresA(int num) {
		//TODO
		double aux = 0;
		
			System.out.println("Los resultados mayores a " + num + "fueron: ");
		
		for(Cosecha c: this.cosechas) {
			aux = c.obtenerRendimiento();
			
			if(aux > num) {
				c.imprimirResultadoCosecha();
			}
		}
		
	}
	
	public Cosecha getCosechaPorNumero(int num) {
		//TODO
		
		boolean encontrado = false;
		int aux = 0;
		Cosecha buscado = null;
		
		while(!encontrado && aux < this.cosechas.size()) {
			buscado = this.cosechas.get(aux);
			
			if(buscado.getNro() == num) {
				encontrado = true;
			}
		}
		
		return buscado;
	}
	
	public Cosecha getCosechaPorProducto(Producto prod) {
		//TODO
		
		
	}

	@Override
	public String toString() {
		return "Plantacion [nombre=" + nombre + ", hectareas=" + hectareas + ", cosechas=" + cosechas + "]";
	}
	
	
}
