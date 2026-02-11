
public class Main {
	private static int M = 100;
	private static int N = 100;

	public static void main(String[] args) {
		Entero entero = new Entero();
		Locks algoritmo = new Bakery2();
		HiloInc incremental = new HiloInc(entero, N, 1, algoritmo);
		HiloDec decremental = new HiloDec(entero, N, 2, algoritmo);
		incremental.start();
		decremental.start();
		try {
			incremental.join();
			decremental.join();
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		System.out.println("El resultado final es: " + entero.getNum());
	}

}
