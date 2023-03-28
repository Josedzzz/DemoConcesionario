package demoConcesionarioCarroUq.model;

public class Bus extends Carro{

	private int numEjes;
	private int numSalidasEmergencia;

	public Bus(String codigo, String marca, CondicionVehiculo condicionVehiculo, String modelo, int cambios,
			int velocidadMax, String cilindraje, int numPasajeros, int numPuertas, boolean tieneAireAcondicionado,
			boolean tieneCamReversa, int numBolsasAire, boolean tieneABS, TransmisionVehiculo transmisionVehiculo,
			TipoVehiculo tipoVehiculo, int minAutinomia, int minCarga, boolean esEnchufable, boolean esHibridoLigero,
			int numEjes, int numSalidasEmergencia) {
		super(codigo, marca, condicionVehiculo, modelo, cambios, velocidadMax, cilindraje, numPasajeros, numPuertas,
				tieneAireAcondicionado, tieneCamReversa, numBolsasAire, tieneABS, transmisionVehiculo, tipoVehiculo,
				minAutinomia, minCarga, esEnchufable, esHibridoLigero);
		this.numEjes = numEjes;
		this.numSalidasEmergencia = numSalidasEmergencia;
	}

	public Bus() {

	}

	public int getNumEjes() {
		return numEjes;
	}

	public void setNumEjes(int numEjes) {
		this.numEjes = numEjes;
	}

	public int getNumSalidasEmergencia() {
		return numSalidasEmergencia;
	}

	public void setNumSalidasEmergencia(int numSalidasEmergencia) {
		this.numSalidasEmergencia = numSalidasEmergencia;
	}



}