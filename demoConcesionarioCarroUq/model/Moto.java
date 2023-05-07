package demoConcesionarioCarroUq.model;

public class Moto extends Vehiculo{

	protected String cilindraje;

	public Moto(String codigo, String precio, String marca, CondicionVehiculo condicionVehiculo, String modelo,
			int cambios, int velocidadMax, TipoVehiculo tipoVehiculo, int minAutinomia, int minCarga,
			boolean esEnchufable, boolean esHibridoLigero, String cilindraje) {
		super(codigo, precio, marca, condicionVehiculo, modelo, cambios, velocidadMax, tipoVehiculo, minAutinomia,
				minCarga, esEnchufable, esHibridoLigero);
		this.cilindraje = cilindraje;
	}

	public Moto() {

	}

	public String getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}


//----------------------------------------------------------------------------------------------------------------------


}
