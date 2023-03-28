package demoConcesionarioCarroUq.model;

public class Moto extends Vehiculo{

	protected String marca;
	protected CondicionVehiculo condicionVehiculo;
	protected String modelo;
	protected int cambios;
	protected int velocidadMax;
	protected String cilindraje;
	protected TipoVehiculo tipoVehiculo;
	//En el caso de los electricos:
	protected int minAutinomia;
	protected int minCarga;
	//En el caso de los hibridos:
	protected boolean esEnchufable;
	protected boolean esHibridoLigero; //Esto solo lo debo indicar si el vehículo es un hibrido no enchufable

	public Moto(String codigo, String marca, CondicionVehiculo condicionVehiculo, String modelo, int cambios,
			int velocidadMax, String cilindraje, TipoVehiculo tipoVehiculo, int minAutinomia, int minCarga,
			boolean esEnchufable, boolean esHibridoLigero) {
		super(codigo);
		this.marca = marca;
		this.condicionVehiculo = condicionVehiculo;
		this.modelo = modelo;
		this.cambios = cambios;
		this.velocidadMax = velocidadMax;
		this.cilindraje = cilindraje;
		this.tipoVehiculo = tipoVehiculo;
		this.minAutinomia = minAutinomia;
		this.minCarga = minCarga;
		this.esEnchufable = esEnchufable;
		this.esHibridoLigero = esHibridoLigero;
	}

	public Moto() {

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
