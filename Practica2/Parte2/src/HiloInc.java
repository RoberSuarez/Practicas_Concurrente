
public class HiloInc extends Thread{
	private Entero entero;
	private int N;
	private int id;
	private Locks algoritmo;
	
	HiloInc(Entero entero, int N, int id, Locks algoritmo) {
		this.entero = entero;
		this.N = N;
		this.id = id;
		this.algoritmo = algoritmo;
	}

	public void run() {
		for(int i = 0; i<N; ++i) {
			algoritmo.lock(id);
			entero.incrementar();
			algoritmo.unlock(id);
		}
	}
}
