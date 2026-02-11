
public class Bakery2 extends Locks{

	private int[] turnos;
	
	public Bakery2() {
		turnos = new int[2];
		turnos[0] = 0;
		turnos[1] = 0;
	}
	
	public boolean decide(int a, int b, int c, int d) {
		return (a > c || (a==c && b>d));
	}
	
	@Override
	public void lock(int id) {
		turnos[id-1] = 1;
		turnos[id-1] = turnos[id%2] + 1;
		while(turnos[id%2] != 0 && decide(turnos[id-1], id-1, turnos[id%2], id%2));
	}

	@Override
	public void unlock(int id) {
		turnos[id-1]=0;	
	}

	
	
	
}
