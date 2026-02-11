
public class HiloDec extends Thread{
	private Entero entero;
	private int N;
	HiloDec(Entero entero, int N) {
		this.entero = entero;
		this.N = N;
	}

	public void run() {
		for(int i = 0; i<N; ++i) {
			entero.decrementar();
		}
	}
}