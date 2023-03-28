package demoConcesionarioCarroUq.model;

public class Camioneta extends Carro{

	private boolean es4x4;

	public Camioneta(String codigo, String marca, CondicionVehiculo condicionVehiculo, String modelo, int cambios,
			int velocidadMax, String cilindraje, int numPasajeros, int numPuertas, boolean tieneAireAcondicionado,
			boolean tieneCamReversa, int numBolsasAire, boolean tieneABS, TransmisionVehiculo transmisionVehiculo,
			TipoVehiculo tipoVehiculo, int minAutinomia, int minCarga, boolean esEnchufable, boolean esHibridoLigero,
			boolean es4x4) {
		super(codigo, marca, condicionVehiculo, modelo, cambios, velocidadMax, cilindraje, numPasajeros, numPuertas,
				tieneAireAcondicionado, tieneCamReversa, numBolsasAire, tieneABS, transmisionVehiculo, tipoVehiculo,
				minAutinomia, minCarga, esEnchufable, esHibridoLigero);
		this.es4x4 = es4x4;
	}

	public Camioneta() {

	}

	public boolean isEs4x4() {
		return es4x4;
	}

	public void setEs4x4(boolean es4x4) {
		this.es4x4 = es4x4;
	}

//------------------------------------------------------------------------------------------------------------------------


}
