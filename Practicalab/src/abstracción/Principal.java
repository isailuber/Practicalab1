package abstracción;

public class Principal {

	public static void main(String[] args) {

		// Esta variable solo puede invocar metodos de la clase SumaRestaEntreNumeros.
		// No puede invocar metodos de la clase OperacionesEntreNumeros.
		SumaRestaEntreNumeros variable = new OperacionesEntreNumeros();

		// esta variable si puede invocar metodos de la clase OperacionesEntreNumeros
		// que sean publicos. Caso contrario, no puede.
		OperacionesEntreNumeros variable2 = new OperacionesEntreNumeros();

		System.out.println("invocando restar: " + variable.restar(5, 2));

		System.out.println("invocado sumar: " + variable2.sumar(5, 2));

	}

}
