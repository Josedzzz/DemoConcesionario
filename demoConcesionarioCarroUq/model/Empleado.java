package demoConcesionarioCarroUq.model;

import java.util.ArrayList;
import java.util.List;

import demoConcesionarioCarroUq.exceptions.ClienteNoRegistradoException;
import demoConcesionarioCarroUq.exceptions.ClienteYaExistenteException;
import demoConcesionarioCarroUq.exceptions.EmpleadoNoActivoException;
import demoConcesionarioCarroUq.exceptions.VehiculoNoPasoPruebaException;
import demoConcesionarioCarroUq.exceptions.VehiculoNoRegistradoException;
import demoConcesionarioCarroUq.exceptions.VehiculoYaExistenteException;

public class Empleado extends Persona {

	protected String usuario;
	protected String contrasenia;
	protected String correo;
	protected String codigoSeguridad;
	protected boolean cuentaActiva;
	protected List<Cliente> listaClientes;

	public Empleado(String nombres, String apellidos, String identificacion, String usuario, String contrasenia,
			String correo, String codigoSeguridad, boolean cuentaActiva) {
		super(nombres, apellidos, identificacion);
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.correo = correo;
		this.codigoSeguridad = codigoSeguridad;
		this.cuentaActiva = cuentaActiva;
		this.listaClientes = new ArrayList<Cliente>();
	}

	public Empleado() {

	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCodigoSeguridad() {
		return codigoSeguridad;
	}

	public void setCodigoSeguridad(String codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public boolean isCuentaActiva() {
		return cuentaActiva;
	}

	public void setCuentaActiva(boolean cuentaActiva) {
		this.cuentaActiva = cuentaActiva;
	}

//-----------------------------------------------------------------------------------------------------------------------

	//FUNCIONES PARA REGISTRAR CADA TIPO DE VEHÍCULO:

	/**
	 * Dado el codigo de un vehículo, me retorna este mismo
	 * @param concesionario
	 * @param codigo
	 * @return
	 */
	public Vehiculo obtenerVehiculo(Concesionario concesionario, String codigo) {
		List<Vehiculo> vehiculos = concesionario.getListaVehiculos();
		Vehiculo vehiculoEncontrado = null;
		for(Vehiculo vehiculo : vehiculos) {
			if(vehiculo.getCodigo().equals(codigo)) {
				vehiculoEncontrado = vehiculo;
			}
		}
		return vehiculoEncontrado;

	}

	/**
	 * Registra una moto y la guarda en la lista de vehiculos
	 * @param concesionario
	 * @param codigo
	 * @param marca
	 * @param condicionVehiculo
	 * @param modelo
	 * @param cambios
	 * @param velocidadMax
	 * @param cilindraje
	 * @param tipoVehiculo
	 * @param minAutinomia
	 * @param minCarga
	 * @param esEnchufable
	 * @param esHibridoLigero
	 * @throws Exception
	 */
	public void registrarMoto(Concesionario concesionario, String codigo, String marca,
			CondicionVehiculo condicionVehiculo, String modelo, int cambios, int velocidadMax,
			TipoVehiculo tipoVehiculo, int minAutinomia, int minCarga, boolean esEnchufable,
			boolean esHibridoLigero, String cilindraje) throws VehiculoYaExistenteException {

		Vehiculo vehiculoEncontrado = obtenerVehiculo(concesionario, codigo);
		if(vehiculoEncontrado != null) {
			throw new VehiculoYaExistenteException("El vehículo ya existe");
		} else {
			Vehiculo nuevaMoto = new Moto(codigo, marca, condicionVehiculo, modelo, cambios, velocidadMax,
					tipoVehiculo, minAutinomia, minCarga, esEnchufable, esHibridoLigero, cilindraje);
			concesionario.getListaVehiculos().add(nuevaMoto);
		}
	}

	/**
	 * Registra un sedan y lo guarda en la lista de vehículos
	 * @param concesionario
	 * @param codigo
	 * @param marca
	 * @param condicionVehiculo
	 * @param modelo
	 * @param cambios
	 * @param velocidadMax
	 * @param cilindraje
	 * @param numPasajeros
	 * @param numPuertas
	 * @param tieneAireAcondicionado
	 * @param tieneCamReversa
	 * @param numBolsasAire
	 * @param tieneABS
	 * @param transmisionVehiculo
	 * @param tipoVehiculo
	 * @param minAutinomia
	 * @param minCarga
	 * @param esEnchufable
	 * @param esHibridoLigero
	 * @param capacidadMaletero
	 * @param tieneVelocidadCrucero
	 * @param tieneSensorColision
	 * @param tieneSensorCruzado
	 * @param tieneAsistenteCarril
	 * @throws Exception
	 */
	public void registrarSedan(Concesionario concesionario, String codigo, String marca,
			CondicionVehiculo condicionVehiculo, String modelo, int cambios, int velocidadMax,
			TipoVehiculo tipoVehiculo, int minAutinomia, int minCarga, boolean esEnchufable,
			boolean esHibridoLigero, String cilindraje, int numPasajeros, int numPuertas,
			boolean tieneAireAcondicionado, boolean tieneCamReversa, int numBolsasAire, boolean tieneABS,
			TransmisionVehiculo transmisionVehiculo, double capacidadMaletero, boolean tieneVelocidadCrucero,
			boolean tieneSensorColision, boolean tieneSensorCruzado, boolean tieneAsistenteCarril)
			throws VehiculoYaExistenteException {

		Vehiculo vehiculoEncontrado = obtenerVehiculo(concesionario, codigo);
		if(vehiculoEncontrado != null) {
			throw new VehiculoYaExistenteException("El vehículo ya existe");
		} else {
			Vehiculo nuevoSedan = new Sedan(codigo, marca, condicionVehiculo, modelo, cambios,
					velocidadMax, tipoVehiculo, minAutinomia, minCarga, esEnchufable, esHibridoLigero,
					cilindraje, numPasajeros, numPuertas, tieneAireAcondicionado, tieneCamReversa,
					numBolsasAire, tieneABS, transmisionVehiculo, capacidadMaletero, tieneVelocidadCrucero,
					tieneSensorColision, tieneSensorCruzado, tieneAsistenteCarril);
			concesionario.getListaVehiculos().add(nuevoSedan);
		}
	}

	/**
	 * Registra un deportivo y lo guarda en la lista de vehículos
	 * @param concesionario
	 * @param codigo
	 * @param marca
	 * @param condicionVehiculo
	 * @param modelo
	 * @param cambios
	 * @param velocidadMax
	 * @param cilindraje
	 * @param numPasajeros
	 * @param numPuertas
	 * @param tieneAireAcondicionado
	 * @param tieneCamReversa
	 * @param numBolsasAire
	 * @param tieneABS
	 * @param transmisionVehiculo
	 * @param tipoVehiculo
	 * @param minAutinomia
	 * @param minCarga
	 * @param esEnchufable
	 * @param esHibridoLigero
	 * @param numCaballosFuerza
	 * @param tiempoPara100km
	 * @throws Exception
	 */
	public void registrarDeportivo(Concesionario concesionario, String codigo, String marca,
			CondicionVehiculo condicionVehiculo, String modelo, int cambios, int velocidadMax,
			TipoVehiculo tipoVehiculo, int minAutinomia, int minCarga, boolean esEnchufable,
			boolean esHibridoLigero, String cilindraje, int numPasajeros, int numPuertas,
			boolean tieneAireAcondicionado, boolean tieneCamReversa, int numBolsasAire, boolean tieneABS,
			TransmisionVehiculo transmisionVehiculo, int numCaballosFuerza, double tiempoPara100km)
			throws VehiculoYaExistenteException {

		Vehiculo vehiculoEncontrado = obtenerVehiculo(concesionario, codigo);
		if(vehiculoEncontrado != null) {
			throw new VehiculoYaExistenteException("El vehículo ya existe");
		} else {
			Vehiculo nuevoDeportivo = new Deportivo(codigo, marca, condicionVehiculo, modelo, cambios,
					velocidadMax, tipoVehiculo, minAutinomia, minCarga, esEnchufable, esHibridoLigero,
					cilindraje, numPasajeros, numPuertas, tieneAireAcondicionado, tieneCamReversa,
					numBolsasAire, tieneABS, transmisionVehiculo, numCaballosFuerza, tiempoPara100km);
			concesionario.getListaVehiculos().add(nuevoDeportivo);
		}
	}

	/**
	 * Registra una camioneta y la guarda en la lista de vehiculos
	 * @param concesionario
	 * @param codigo
	 * @param marca
	 * @param condicionVehiculo
	 * @param modelo
	 * @param cambios
	 * @param velocidadMax
	 * @param cilindraje
	 * @param numPasajeros
	 * @param numPuertas
	 * @param tieneAireAcondicionado
	 * @param tieneCamReversa
	 * @param numBolsasAire
	 * @param tieneABS
	 * @param transmisionVehiculo
	 * @param tipoVehiculo
	 * @param minAutinomia
	 * @param minCarga
	 * @param esEnchufable
	 * @param esHibridoLigero
	 * @param es4x4
	 * @throws Exception
	 */
	public void registrarCamioneta(Concesionario concesionario, String codigo, String marca,
			CondicionVehiculo condicionVehiculo, String modelo, int cambios, int velocidadMax,
			TipoVehiculo tipoVehiculo, int minAutinomia, int minCarga, boolean esEnchufable,
			boolean esHibridoLigero, String cilindraje, int numPasajeros, int numPuertas,
			boolean tieneAireAcondicionado, boolean tieneCamReversa, int numBolsasAire, boolean tieneABS,
			TransmisionVehiculo transmisionVehiculo, boolean es4x4) throws VehiculoYaExistenteException {

		Vehiculo vehiculoEncontrado = obtenerVehiculo(concesionario, codigo);
		if(vehiculoEncontrado != null) {
			throw new VehiculoYaExistenteException("El vehículo ya existe");
		} else {
			Vehiculo nuevaCamioneta = new Camioneta(codigo, marca, condicionVehiculo, modelo, cambios,
					velocidadMax, tipoVehiculo, minAutinomia, minCarga, esEnchufable, esHibridoLigero,
					cilindraje, numPasajeros, numPuertas, tieneAireAcondicionado, tieneCamReversa,
					numBolsasAire, tieneABS, transmisionVehiculo, es4x4);
			concesionario.getListaVehiculos().add(nuevaCamioneta);
		}
	}

	/**
	 * Registra un PickUp y lo guarda en la lista ade vehiculos
	 * @param concesionario
	 * @param codigo
	 * @param marca
	 * @param condicionVehiculo
	 * @param modelo
	 * @param cambios
	 * @param velocidadMax
	 * @param cilindraje
	 * @param numPasajeros
	 * @param numPuertas
	 * @param tieneAireAcondicionado
	 * @param tieneCamReversa
	 * @param numBolsasAire
	 * @param tieneABS
	 * @param transmisionVehiculo
	 * @param tipoVehiculo
	 * @param minAutinomia
	 * @param minCarga
	 * @param esEnchufable
	 * @param esHibridoLigero
	 * @param capacidadCajaCarga
	 * @param es4x4
	 * @throws Exception
	 */
	public void registrarPickUp(Concesionario concesionario, String codigo, String marca,
			CondicionVehiculo condicionVehiculo, String modelo, int cambios, int velocidadMax,
			TipoVehiculo tipoVehiculo, int minAutinomia, int minCarga, boolean esEnchufable,
			boolean esHibridoLigero, String cilindraje, int numPasajeros, int numPuertas,
			boolean tieneAireAcondicionado, boolean tieneCamReversa, int numBolsasAire, boolean tieneABS,
			TransmisionVehiculo transmisionVehiculo, double capacidadCajaCarga, boolean es4x4)
			throws VehiculoYaExistenteException {

		Vehiculo vehiculoEncontrado = obtenerVehiculo(concesionario, codigo);
		if(vehiculoEncontrado != null) {
			throw new VehiculoYaExistenteException("El vehículo ya existe");
		} else {
			Vehiculo nuevoPickUp = new PickUp(codigo, marca, condicionVehiculo, modelo, cambios,
					velocidadMax, tipoVehiculo, minAutinomia, minCarga, esEnchufable, esHibridoLigero,
					cilindraje, numPasajeros, numPuertas, tieneAireAcondicionado, tieneCamReversa,
					numBolsasAire, tieneABS, transmisionVehiculo, capacidadCajaCarga, es4x4);
			concesionario.getListaVehiculos().add(nuevoPickUp);
		}
	}

	/**
	 * Registro una van y la agrego a la lista de vehiculos
	 * @param concesionario
	 * @param codigo
	 * @param marca
	 * @param condicionVehiculo
	 * @param modelo
	 * @param cambios
	 * @param velocidadMax
	 * @param cilindraje
	 * @param numPasajeros
	 * @param numPuertas
	 * @param tieneAireAcondicionado
	 * @param tieneCamReversa
	 * @param numBolsasAire
	 * @param tieneABS
	 * @param transmisionVehiculo
	 * @param tipoVehiculo
	 * @param minAutinomia
	 * @param minCarga
	 * @param esEnchufable
	 * @param esHibridoLigero
	 * @param capacidadMaletero
	 * @throws Exception
	 */
	public void registrarVan(Concesionario concesionario,String codigo, String marca, CondicionVehiculo condicionVehiculo, String modelo, int cambios,
			int velocidadMax, TipoVehiculo tipoVehiculo, int minAutinomia, int minCarga, boolean esEnchufable,
			boolean esHibridoLigero, String cilindraje, int numPasajeros, int numPuertas,
			boolean tieneAireAcondicionado, boolean tieneCamReversa, int numBolsasAire, boolean tieneABS,
			TransmisionVehiculo transmisionVehiculo, double capacidadMaletero)
			throws VehiculoYaExistenteException {

		Vehiculo vehiculoEncontrado = obtenerVehiculo(concesionario,codigo);
		if(vehiculoEncontrado != null) {
			throw new VehiculoYaExistenteException("El vehículo ya existe");
		} else {
			Vehiculo nuevaVan = new Van(codigo, marca, condicionVehiculo, modelo, cambios, velocidadMax,
					tipoVehiculo, minAutinomia, minCarga, esEnchufable, esHibridoLigero, cilindraje,
					numPasajeros, numPuertas, tieneAireAcondicionado, tieneCamReversa, numBolsasAire,
					tieneABS, transmisionVehiculo, capacidadMaletero);
			concesionario.getListaVehiculos().add(nuevaVan);
		}
	}

	/**
	 * Registro un bus y lo agrego a la lista de vehiculos
	 * @param concesionario
	 * @param codigo
	 * @param marca
	 * @param condicionVehiculo
	 * @param modelo
	 * @param cambios
	 * @param velocidadMax
	 * @param cilindraje
	 * @param numPasajeros
	 * @param numPuertas
	 * @param tieneAireAcondicionado
	 * @param tieneCamReversa
	 * @param numBolsasAire
	 * @param tieneABS
	 * @param transmisionVehiculo
	 * @param tipoVehiculo
	 * @param minAutinomia
	 * @param minCarga
	 * @param esEnchufable
	 * @param esHibridoLigero
	 * @param numEjes
	 * @param numSalidasEmergencia
	 * @throws Exception
	 */
	public void registrarBus(Concesionario concesionario, String codigo, String marca,
			CondicionVehiculo condicionVehiculo, String modelo, int cambios, int velocidadMax,
			TipoVehiculo tipoVehiculo, int minAutinomia, int minCarga, boolean esEnchufable,
			boolean esHibridoLigero, String cilindraje, int numPasajeros, int numPuertas,
			boolean tieneAireAcondicionado, boolean tieneCamReversa, int numBolsasAire, boolean tieneABS,
			TransmisionVehiculo transmisionVehiculo, int numEjes, int numSalidasEmergencia)
			throws VehiculoYaExistenteException {

		Vehiculo vehiculoEncontrado = obtenerVehiculo(concesionario,codigo);
		if(vehiculoEncontrado != null) {
			throw new VehiculoYaExistenteException("El vehículo ya existe");
		} else {
			Vehiculo nuevoBus = new Bus(codigo, marca, condicionVehiculo, modelo, cambios, velocidadMax,
					tipoVehiculo, minAutinomia, minCarga, esEnchufable, esHibridoLigero, cilindraje,
					numPasajeros, numPuertas, tieneAireAcondicionado, tieneCamReversa, numBolsasAire,
					tieneABS, transmisionVehiculo, numEjes, numSalidasEmergencia);
			concesionario.getListaVehiculos().add(nuevoBus);
		}
	}

	/**
	 * Registra un camion y lo agrega a la lista de vehiculos
	 * @param concesionario
	 * @param codigo
	 * @param marca
	 * @param condicionVehiculo
	 * @param modelo
	 * @param cambios
	 * @param velocidadMax
	 * @param cilindraje
	 * @param numPasajeros
	 * @param numPuertas
	 * @param tieneAireAcondicionado
	 * @param tieneCamReversa
	 * @param numBolsasAire
	 * @param tieneABS
	 * @param transmisionVehiculo
	 * @param tipoVehiculo
	 * @param minAutinomia
	 * @param minCarga
	 * @param esEnchufable
	 * @param esHibridoLigero
	 * @param capacidadCarga
	 * @param tieneFrenosAire
	 * @param tipoCamion
	 * @throws Exception
	 */
	public void registrarCamion(Concesionario concesionario, String codigo, String marca,
			CondicionVehiculo condicionVehiculo, String modelo, int cambios, int velocidadMax,
			TipoVehiculo tipoVehiculo, int minAutinomia, int minCarga, boolean esEnchufable,
			boolean esHibridoLigero, String cilindraje, int numPasajeros, int numPuertas,
			boolean tieneAireAcondicionado, boolean tieneCamReversa, int numBolsasAire, boolean tieneABS,
			TransmisionVehiculo transmisionVehiculo, double capacidadCarga, boolean tieneFrenosAire,
			String tipoCamion) throws Exception {

		Vehiculo vehiculoEncontrado = obtenerVehiculo(concesionario, codigo);
		if(vehiculoEncontrado != null) {
			throw new Exception("El camion ya existe");
		} else {
			Vehiculo nuevoCamion = new Camion(codigo, marca, condicionVehiculo, modelo, cambios,
					velocidadMax, tipoVehiculo, minAutinomia, minCarga, esEnchufable, esHibridoLigero,
					cilindraje, numPasajeros, numPuertas, tieneAireAcondicionado, tieneCamReversa,
					numBolsasAire, tieneABS, transmisionVehiculo, capacidadCarga, tieneFrenosAire,
					tipoCamion);
			concesionario.getListaVehiculos().add(nuevoCamion);
		}
	}



	//FUNCIONES PARA REGISTRAR UN CLIENTE

	/**
	 * Dado el codigo de un cliente, retorna el cliente correspondiente
	 * @param concesionario
	 * @param codigoCliente
	 * @return
	 */
	public Cliente obtenerCliente(Concesionario concesionario, String codigoCliente) {
		List<Persona> personas = concesionario.getListaPersonas();
		Cliente clienteEncontrado = null;
		for(Persona persona : personas) {
			if(persona instanceof Cliente) {
				if(((Cliente) persona).getCodigoCliente().equals(codigoCliente)) {
					clienteEncontrado = (Cliente) persona;
				}
			}
		}
		return clienteEncontrado;
	}

	/**
	 * Registra un nuevo cliente y lo guarda en la lista de personas
	 * @param concesionario
	 * @param nombres
	 * @param apellidos
	 * @param identificacion
	 * @param codigoCliente
	 * @param empleadoCliente
	 * @throws Exception
	 */
	public void crearCliente(Concesionario concesionario, String nombres, String apellidos, String identificacion,
			String codigoCliente, Empleado empleadoCliente)
			throws ClienteYaExistenteException, EmpleadoNoActivoException {

		if(empleadoCliente.isCuentaActiva()) {
			Cliente clienteEncontrado = obtenerCliente(concesionario, codigoCliente);
			if(clienteEncontrado != null) {
				throw new ClienteYaExistenteException("El cliente ya existe");
			} else {
				Persona nuevoCliente = new Cliente(nombres, apellidos, identificacion, codigoCliente, empleadoCliente);
				concesionario.getListaPersonas().add(nuevoCliente);
			}
		} else {
			throw new EmpleadoNoActivoException("La cuenta del empleado está bloqueada");
		}
	}



	//FUNCIONES PARA ALQUILAR UN VEHÍCULO

	/**
	 * Crea una nueva alquilada reciviendo los atributos necesarios, esa alquilada la guarda en listaTransacciones
	 * @param concesionario
	 * @param total
	 * @param vehiculoTransaccion
	 * @param empleadoTransaccion
	 * @param clienteTransaccion
	 * @param tipoTransaccion
	 * @param pasoRevision
	 * @param diasAlquiler
	 * @throws Exception
	 */
	public void crearAlquiladaTransaccion(Concesionario concesionario, double total, Vehiculo vehiculoTransaccion,
			Empleado empleadoTransaccion, Cliente clienteTransaccion, int diasAlquiler) {

		Transaccion nuevaAlquiladaTransaccion = new Alquiler(total, vehiculoTransaccion, empleadoTransaccion,
				clienteTransaccion, diasAlquiler);
		concesionario.getListaTransacciones().add(nuevaAlquiladaTransaccion);
	}

	public void crearAlquiladaTransaccion2(Concesionario concesionario, double total, String codigoVehiculo,
			Empleado empleadoTransaccion, String codigoCliente, int diasAlquiler)
			throws ClienteNoRegistradoException, VehiculoNoRegistradoException, EmpleadoNoActivoException {

		if(empleadoTransaccion.isCuentaActiva()) {
			Vehiculo vehiculoAlquiler = obtenerVehiculo(concesionario, codigoVehiculo);
			Cliente clienteAlquiler = obtenerCliente(concesionario, codigoCliente);
			if(vehiculoAlquiler != null && clienteAlquiler != null) {
				Transaccion nuevaAlquiladaTransaccion = new Alquiler(total, vehiculoAlquiler, empleadoTransaccion,
						clienteAlquiler, diasAlquiler);
				concesionario.getListaTransacciones().add(nuevaAlquiladaTransaccion);
			} else {
				if(vehiculoAlquiler == null) {
					throw new VehiculoNoRegistradoException("No se ha encontrado el vehículo");
				} else if(clienteAlquiler == null) {
					throw new ClienteNoRegistradoException("No se ha encontrado el cliente");
				}
			}
		} else {
			throw new EmpleadoNoActivoException("La cuenta del empleado está bloqueada");
		}
	}

	//FUNCIONES PARA VENDER VEHICULO

	/**
	 * Creo una venta, en donde elimino el vehículo de la listaVehiculos
	 * @param concesionario
	 * @param total
	 * @param vehiculoTransaccion
	 * @param empleadoTransaccion
	 * @param clienteTransaccion
	 * @param tipoTransaccion
	 * @param pasoRevision
	 * @param diasAlquiler
	 */
	public void venderVehículoTransaccion(Concesionario concesionario, double total, Vehiculo vehiculoTransaccion,
			Empleado empleadoTransaccion, Cliente clienteTransaccion, String fecha) {


		Transaccion nuevaVentaTransaccion = new Venta(total, vehiculoTransaccion, empleadoTransaccion,
				clienteTransaccion, fecha);
		concesionario.getListaTransacciones().add(nuevaVentaTransaccion);
		concesionario.getListaVehiculos().remove(vehiculoTransaccion); //Tengo que eliminar el vehículo que se vendio
	}

	public void venderVehículoTransaccion2(Concesionario concesionario, double total, String codigoVehiculo,
			Empleado empleadoTransaccion, String codigoCliente, String fecha)
			throws ClienteNoRegistradoException, VehiculoNoRegistradoException, EmpleadoNoActivoException {

		if(empleadoTransaccion.isCuentaActiva()) {
			Vehiculo vehiculoVenta = obtenerVehiculo(concesionario, codigoVehiculo);
			Cliente clienteVenta = obtenerCliente(concesionario, codigoCliente);
			if(vehiculoVenta != null && clienteVenta != null) {
				Transaccion nuevaVentaTransaccion = new Venta(total, vehiculoVenta, empleadoTransaccion,
						clienteVenta, fecha);
				concesionario.getListaTransacciones().add(nuevaVentaTransaccion);
				concesionario.getListaVehiculos().remove(vehiculoVenta); //Tengo que eliminar el vehículo que se vendio
			} else {
				if(vehiculoVenta == null) {
					throw new VehiculoNoRegistradoException("No se ha encontrado el vehiculo");
				} else if(clienteVenta == null) {
					throw new ClienteNoRegistradoException("No se ha encontrado el cliente");
				}
			}
		} else {
			throw new EmpleadoNoActivoException("La cuenta del empleado está bloqueada");
		}
	}

	//FUNCIONES PARA COMPRAR VEHICULO

	/**
	 * Creo una compra, y el vehículo que se adquiere lo guardo en la lista de vehiculos
	 * @param concesionario
	 * @param total
	 * @param vehiculoTransaccion
	 * @param empleadoTransaccion
	 * @param clienteTransaccion
	 * @param tipoTransaccion
	 * @param pasoRevision
	 * @param diasAlquiler
	 * @throws Exception
	 */
	public void comprarVehiculoTransaccion(Concesionario concesionario, double total, Vehiculo vehiculoTransaccion,
			Empleado empleadoTransaccion, Cliente clienteTransaccion, boolean pasoRevision) throws Exception {

		if(pasoRevision == false) {
			throw new Exception("No se puede comprar el vehículo, no cumple con la revisión");
		} else {
			Transaccion nuevaCompraTransaccion = new Compra(total, vehiculoTransaccion, empleadoTransaccion,
					clienteTransaccion, pasoRevision);
			concesionario.getListaTransacciones().add(nuevaCompraTransaccion);
			concesionario.getListaVehiculos().add(vehiculoTransaccion); //Tengo que añadir el vehiuclo que se compro
		}
	}

	public void comprarVehiculoTransaccion2(Concesionario concesionario, double total, Vehiculo vehiculoTransaccion,
			Empleado empleadoTransaccion, String codigoCliente, boolean pasoRevision)
			throws VehiculoNoPasoPruebaException, ClienteNoRegistradoException, EmpleadoNoActivoException {

		if(pasoRevision == false) {
			throw new VehiculoNoPasoPruebaException("No se puede comprar el vehículo, no cumple con la revisión");
		} else {
			if(empleadoTransaccion.isCuentaActiva()) {
				Cliente clienteCompra = obtenerCliente(concesionario, codigoCliente);
				if(clienteCompra != null) {
					Transaccion nuevaCompraTransaccion = new Compra(total, vehiculoTransaccion, empleadoTransaccion,
							clienteCompra, pasoRevision);
					concesionario.getListaTransacciones().add(nuevaCompraTransaccion);
					concesionario.getListaVehiculos().add(vehiculoTransaccion); //Tengo que añadir el vehiuclo que se compro
				} else {
					throw new ClienteNoRegistradoException("El cliente no pudo ser encontrado");
				}
			} else {
				throw new EmpleadoNoActivoException("La cuenta del empleado está bloqueada");
			}
		}
	}





}
