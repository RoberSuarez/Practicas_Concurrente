
public class Main {
	private static int M = 100;
	private static int N = 100;

	public static void main(String[] args) {
		HiloInc[] incrementales = new HiloInc[M];
		HiloDec[] decrementales = new HiloDec[M];
		Entero entero = new Entero();
		for(int i = 0; i < M; i++) {
			incrementales[i] = new HiloInc(entero, N);
			decrementales[i] = new HiloDec(entero, N);
			incrementales[i].start();
			decrementales[i].start();
		}
		for(int j = 0; j < M; j++) {
			try {
				incrementales[j].join();
				decrementales[j].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("El resultado final es: " + entero.getNum());
	}

}
