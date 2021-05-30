package edu.unlam.progava.ordenamiento;

import edu.unlam.progava.ordenamiento.elementales.PorSeleccion;

public class Ordenadora<T extends Comparable<T>> {

	private Estrategia<T> estrategia = new PorSeleccion<T>();

	public T[] ordenar(T[] arreglo) {
		return this.estrategia.ordenar(arreglo);
	}
	
	public void setEstrategia(Estrategia<T> estrategia) {
		this.estrategia = estrategia;
	}
	
}
