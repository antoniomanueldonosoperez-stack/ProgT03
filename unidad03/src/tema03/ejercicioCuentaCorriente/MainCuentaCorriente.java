package tema03.ejercicioCuentaCorriente;

public class MainCuentaCorriente {

	public static void main(String[] args) {

		CuentaCorriente cuenta = new CuentaCorriente("48122269J","Antonio" );
		cuenta.ingresarDinero(1000);
		System.out.println("\nDespués de ingresar 1000 €:");
		cuenta.mostrarInformacion();
		
		cuenta.retirar(200);
		System.out.println("\nDespués de retirar 200 €:");
		cuenta.mostrarInformacion();
		
		cuenta.retirar(900);
		System.out.println("\nDespués de retirar 900 €:");
		cuenta.mostrarInformacion();
	}

}
