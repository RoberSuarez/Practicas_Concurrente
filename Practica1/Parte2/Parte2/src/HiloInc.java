
public class HiloInc extends Thread{
	private Entero entero;
	private int N;
	HiloInc(Entero entero, int N) {
		this.entero = entero;
		this.N = N;
	}

	public void run() {
		for(int i = 0; i<N; ++i) {
			entero.incrementar();
		}
	}
}
