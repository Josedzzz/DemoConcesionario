package demoConcesionarioCarroUq.model;

public abstract class Vehiculo {

	protected String codigo;

	public Vehiculo(String codigo) {
		super();
		this.codigo = codigo;
	}

	public Vehiculo() {

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


//----------------------------------------------------------------------------------------------------------------------




}
