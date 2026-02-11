
public class Main {
	private static int N = 10;

	public static void main(String[] args) {
		HiloMat[] matriz = new HiloMat[N];
		Matrices entero = new Matrices(N);
		for(int i = 0; i < N; i++) {
			//Creamos los procesos
		}
		for(int j = 0; j < N; j++) {
			try {
				matriz[j].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
