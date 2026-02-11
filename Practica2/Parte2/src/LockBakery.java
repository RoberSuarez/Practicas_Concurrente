
public class LockBakery extends Locks {

	private Entero[] turnos;

	public LockBakery(int M) {
		turnos = new Entero[M];

		for (int i = 0; i < M; i++) {
			turnos[i] = new Entero();
		}

	}
	
	
	
	
	public boolean decide(int a, int b, int c, int d) {
		return (a > c || (a==c && b>d));
	}

	@Override
	public void lock(int id) {
	
		
		
		
	}

	@Override
	public void unlock(int id) {
		// TODO Auto-generated method stub

	}

}
