
public class Main {
	private static int M = 100;
	private static int N = 100;
	
	public static void main(String[] args) {
		Entero entero = new Entero();
		int totalHilos = 2*M;
		Locks algoritmo = new LockRompeEmpate(totalHilos) ; //Esto es lo unico que necesitaremos cambiar para nuestros algoritmos
		HiloInc[] incrementales = new HiloInc[M];
		HiloDec[] decrementales = new HiloDec[M];
		for(int i = 0; i < M; i++) {
			incrementales[i] = new HiloInc(entero, M, i, algoritmo);
			decrementales[i] = new HiloDec(entero, M, M+ i, algoritmo);
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

	//METODOS PARA 2 PROCESOS
/*
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
*/
}
