package demoConcesionarioCarroUq.model;

public abstract class Carro extends Vehiculo{

	protected String cilindraje;
	protected int numPasajeros;
	protected int numPuertas;
	protected boolean tieneAireAcondicionado;
	protected boolean tieneCamReversa;
	protected int numBolsasAire;
	protected boolean tieneABS;
	protected TransmisionVehiculo transmisionVehiculo;

	public Carro(String codigo, String marca, CondicionVehiculo condicionVehiculo, String modelo, 
			int cambios, int velocidadMax, TipoVehiculo tipoVehiculo, int minAutinomia, int minCarga, 
			boolean esEnchufable, boolean esHibridoLigero, String cilindraje, int numPasajeros,
			int numPuertas, boolean tieneAireAcondicionado, boolean tieneCamReversa, int numBolsasAire,
			boolean tieneABS, TransmisionVehiculo transmisionVehiculo) {
		super(codigo, marca, condicionVehiculo, modelo, cambios, velocidadMax, tipoVehiculo, minAutinomia,
				minCarga, esEnchufable, esHibridoLigero);
		this.cilindraje = cilindraje;
		this.numPasajeros = numPasajeros;
		this.numPuertas = numPuertas;
		this.tieneAireAcondicionado = tieneAireAcondicionado;
		this.tieneCamReversa = tieneCamReversa;
		this.numBolsasAire = numBolsasAire;
		this.tieneABS = tieneABS;
		this.transmisionVehiculo = transmisionVehiculo;
	}

	public Carro() {

	}

	public String getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public boolean isTieneAireAcondicionado() {
		return tieneAireAcondicionado;
	}

	public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
		this.tieneAireAcondicionado = tieneAireAcondicionado;
	}

	public boolean isTieneCamReversa() {
		return tieneCamReversa;
	}

	public void setTieneCamReversa(boolean tieneCamReversa) {
		this.tieneCamReversa = tieneCamReversa;
	}

	public int getNumBolsasAire() {
		return numBolsasAire;
	}

	public void setNumBolsasAire(int numBolsasAire) {
		this.numBolsasAire = numBolsasAire;
	}

	public boolean isTieneABS() {
		return tieneABS;
	}

	public void setTieneABS(boolean tieneABS) {
		this.tieneABS = tieneABS;
	}

	public TransmisionVehiculo getTransmisionVehiculo() {
		return transmisionVehiculo;
	}

	public void setTransmisionVehiculo(TransmisionVehiculo transmisionVehiculo) {
		this.transmisionVehiculo = transmisionVehiculo;
	}



//----------------------------------------------------------------------------------------------------------------------

}
