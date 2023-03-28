package demoConcesionarioCarroUq.model;

import java.util.ArrayList;
import java.util.List;

public class Concesionario {

	private String nombre;
	private List<Persona> listaPersonas;
	private List<Transaccion> listaTransacciones;
	private List<Vehiculo> listaVehiculos;

	public Concesionario(String nombre) {
		super();
		this.nombre = nombre;
		this.listaPersonas = new ArrayList<Persona>();
		this.listaTransacciones = new ArrayList<Transaccion>();
		this.listaVehiculos = new ArrayList<Vehiculo>();
	}

	public Concesionario() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(List<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

	public List<Transaccion> getListaTransacciones() {
		return listaTransacciones;
	}

	public void setListaTransacciones(List<Transaccion> listaTransacciones) {
		this.listaTransacciones = listaTransacciones;
	}

	public List<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

//-----------------------------------------------------------------------------------------------------------------------



}
