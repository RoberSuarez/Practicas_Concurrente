import java.util.*;

public class Main {
	public static int N = 10;	
	
	public static void main(String[] args) {
		Hilo[] hilos = new Hilo[N];
		for(int i = 0; i < N; ++i) {
			Random random = new Random();
			long T = random.longs(1000, 3000).findFirst().getAsLong();
			hilos[i] = new Hilo(T, i);
			hilos[i].start();
		}
		
		for(int j = 0; j < N; ++j) {
			try {
				hilos[j].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Todos los hilos han terminado.");
	}

}
