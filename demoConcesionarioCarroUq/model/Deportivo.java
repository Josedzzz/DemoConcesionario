package demoConcesionarioCarroUq.model;

public class Deportivo extends Carro{

	private int numCaballosFuerza;
	private double tiempoPara100km;

	public Deportivo(String codigo, String marca, CondicionVehiculo condicionVehiculo, String modelo, int cambios,
			int velocidadMax, String cilindraje, int numPasajeros, int numPuertas, boolean tieneAireAcondicionado,
			boolean tieneCamReversa, int numBolsasAire, boolean tieneABS, TransmisionVehiculo transmisionVehiculo,
			TipoVehiculo tipoVehiculo, int minAutinomia, int minCarga, boolean esEnchufable, boolean esHibridoLigero,
			int numCaballosFuerza, double tiempoPara100km) {
		super(codigo, marca, condicionVehiculo, modelo, cambios, velocidadMax, cilindraje, numPasajeros, numPuertas,
				tieneAireAcondicionado, tieneCamReversa, numBolsasAire, tieneABS, transmisionVehiculo, tipoVehiculo,
				minAutinomia, minCarga, esEnchufable, esHibridoLigero);
		this.numCaballosFuerza = numCaballosFuerza;
		this.tiempoPara100km = tiempoPara100km;
	}

	public Deportivo() {

	}

	public int getNumCaballosFuerza() {
		return numCaballosFuerza;
	}

	public void setNumCaballosFuerza(int numCaballosFuerza) {
		this.numCaballosFuerza = numCaballosFuerza;
	}

	public double getTiempoPara100km() {
		return tiempoPara100km;
	}

	public void setTiempoPara100km(double tiempoPara100km) {
		this.tiempoPara100km = tiempoPara100km;
	}

//-----------------------------------------------------------------------------------------------------------------------

}
