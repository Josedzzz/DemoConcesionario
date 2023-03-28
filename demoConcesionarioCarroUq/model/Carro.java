package demoConcesionarioCarroUq.model;

public class Carro extends Vehiculo{

	protected String marca;
	protected CondicionVehiculo condicionVehiculo;
	protected String modelo;
	protected int cambios;
	protected int velocidadMax;
	protected String cilindraje;
	protected int numPasajeros;
	protected int numPuertas;
	protected boolean tieneAireAcondicionado;
	protected boolean tieneCamReversa;
	protected int numBolsasAire;
	protected boolean tieneABS;
	protected TransmisionVehiculo transmisionVehiculo;
	protected TipoVehiculo tipoVehiculo;
	//En el caso de los electricos:
	protected int minAutinomia;
	protected int minCarga;
	//En el caso de los hibridos:
	protected boolean esEnchufable;
	protected boolean esHibridoLigero; //Esto solo lo debo indicar si el vehículo es un hibrido no enchufable

	public Carro(String codigo, String marca, CondicionVehiculo condicionVehiculo, String modelo, int cambios,
			int velocidadMax, String cilindraje, int numPasajeros, int numPuertas, boolean tieneAireAcondicionado,
			boolean tieneCamReversa, int numBolsasAire, boolean tieneABS, TransmisionVehiculo transmisionVehiculo,
			TipoVehiculo tipoVehiculo, int minAutinomia, int minCarga, boolean esEnchufable, boolean esHibridoLigero) {
		super(codigo);
		this.marca = marca;
		this.condicionVehiculo = condicionVehiculo;
		this.modelo = modelo;
		this.cambios = cambios;
		this.velocidadMax = velocidadMax;
		this.cilindraje = cilindraje;
		this.numPasajeros = numPasajeros;
		this.numPuertas = numPuertas;
		this.tieneAireAcondicionado = tieneAireAcondicionado;
		this.tieneCamReversa = tieneCamReversa;
		this.numBolsasAire = numBolsasAire;
		this.tieneABS = tieneABS;
		this.transmisionVehiculo = transmisionVehiculo;
		this.tipoVehiculo = tipoVehiculo;
		this.minAutinomia = minAutinomia;
		this.minCarga = minCarga;
		this.esEnchufable = esEnchufable;
		this.esHibridoLigero = esHibridoLigero;
	}

	public Carro() {

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public CondicionVehiculo getCondicionVehiculo() {
		return condicionVehiculo;
	}

	public void setCondicionVehiculo(CondicionVehiculo condicionVehiculo) {
		this.condicionVehiculo = condicionVehiculo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCambios() {
		return cambios;
	}

	public void setCambios(int cambios) {
		this.cambios = cambios;
	}

	public int getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
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

	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public int getMinAutinomia() {
		return minAutinomia;
	}

	public void setMinAutinomia(int minAutinomia) {
		this.minAutinomia = minAutinomia;
	}

	public int getMinCarga() {
		return minCarga;
	}

	public void setMinCarga(int minCarga) {
		this.minCarga = minCarga;
	}

	public boolean isEsEnchufable() {
		return esEnchufable;
	}

	public void setEsEnchufable(boolean esEnchufable) {
		this.esEnchufable = esEnchufable;
	}

	public boolean isEsHibridoLigero() {
		return esHibridoLigero;
	}

	public void setEsHibridoLigero(boolean esHibridoLigero) {
		this.esHibridoLigero = esHibridoLigero;
	}

//----------------------------------------------------------------------------------------------------------------------

}
