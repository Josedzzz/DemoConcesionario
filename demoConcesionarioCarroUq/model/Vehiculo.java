package demoConcesionarioCarroUq.model;

public abstract class Vehiculo {

	protected String codigo;
	protected String precio;
	protected String marca;
	protected CondicionVehiculo condicionVehiculo;
	protected String modelo;
	protected int cambios;
	protected int velocidadMax;
	protected TipoVehiculo tipoVehiculo;
	//En el caso de los electricos:
	protected int minAutinomia;
	protected int minCarga;
	//En el caso de los hibridos:
	protected boolean esEnchufable;
	protected boolean esHibridoLigero; //Esto solo lo debo indicar si el vehículo es un hibrido no enchufable



	public Vehiculo(String codigo,String precio, String marca, CondicionVehiculo condicionVehiculo, String modelo, int cambios,
			int velocidadMax, TipoVehiculo tipoVehiculo, int minAutinomia, int minCarga, boolean esEnchufable,
			boolean esHibridoLigero) {
		super();
		this.codigo = codigo;
		this.precio = precio;
		this.marca = marca;
		this.condicionVehiculo = condicionVehiculo;
		this.modelo = modelo;
		this.cambios = cambios;
		this.velocidadMax = velocidadMax;
		this.tipoVehiculo = tipoVehiculo;
		this.minAutinomia = minAutinomia;
		this.minCarga = minCarga;
		this.esEnchufable = esEnchufable;
		this.esHibridoLigero = esHibridoLigero;
	}

	public Vehiculo() {

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}





//----------------------------------------------------------------------------------------------------------------------




}
