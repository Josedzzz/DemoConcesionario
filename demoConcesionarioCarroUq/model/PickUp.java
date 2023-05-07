package demoConcesionarioCarroUq.model;

public class PickUp extends Carro{

	private double capacidadCajaCarga;
	private boolean es4x4;

	public PickUp(String codigo, String precio, String marca, CondicionVehiculo condicionVehiculo, String modelo, int cambios,
			int velocidadMax, TipoVehiculo tipoVehiculo, int minAutinomia, int minCarga, boolean esEnchufable,
			boolean esHibridoLigero, String cilindraje, int numPasajeros, int numPuertas,
			boolean tieneAireAcondicionado, boolean tieneCamReversa, int numBolsasAire, boolean tieneABS,
			TransmisionVehiculo transmisionVehiculo, double capacidadCajaCarga, boolean es4x4) {
		super(codigo, precio, marca, condicionVehiculo, modelo, cambios, velocidadMax, tipoVehiculo, minAutinomia, minCarga,
				esEnchufable, esHibridoLigero, cilindraje, numPasajeros, numPuertas, tieneAireAcondicionado,
				tieneCamReversa, numBolsasAire, tieneABS, transmisionVehiculo);
		this.capacidadCajaCarga = capacidadCajaCarga;
		this.es4x4 = es4x4;
	}

	public PickUp() {

	}

	public double getCapacidadCajaCarga() {
		return capacidadCajaCarga;
	}

	public void setCapacidadCajaCarga(double capacidadCajaCarga) {
		this.capacidadCajaCarga = capacidadCajaCarga;
	}

	public boolean isEs4x4() {
		return es4x4;
	}

	public void setEs4x4(boolean es4x4) {
		this.es4x4 = es4x4;
	}

//-----------------------------------------------------------------------------------------------------------------------

}
