package ejercicioCuentaCorriente;

public class CuentaCorriente {

	private String dni;
	private String nombre;
	private Double saldo;

	public CuentaCorriente() {

	}

	public CuentaCorriente(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = 0.00;
	}

	public void ingresarDinero(int dinero) {
		this.saldo += dinero;
	}

	public void retirar(int dinero) {
		this.saldo -= dinero;
	}

	public void mostrarInformacion() {
		System.out.printf("Tu DNI es %s, tu nombre es %s y tu saldo actual es de %.2f €\n", this.dni, this.nombre,
				this.saldo);
	}
}
