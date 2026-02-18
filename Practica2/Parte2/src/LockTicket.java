import java.util.concurrent.atomic.AtomicInteger;

public class LockTicket extends Locks{
	
	private volatile int next;
	private AtomicInteger number;
	//El turno se puede declarar como una variable local ya que cada uno usa el suyo
	
	public LockTicket() {
		next = 1;
		number = new AtomicInteger(1);
		
	}

	@Override
	public void lock(int id) {
		int turno = number.getAndIncrement();
		while(turno != next) {Thread.yield();}		
	}

	@Override
	public void unlock(int id) {
		next = next + 1;
	}

}
