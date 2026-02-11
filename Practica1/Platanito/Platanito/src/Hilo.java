
public class Hilo extends Thread {
	long T;
	int id;

	Hilo(long T, int id) {
		this.T = T;
		this.id = id;
	}

	public void run() {
		System.out.println("Soy el hilo " + id + " empezando");
		try {
			Thread.sleep(T);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Soy el hilo " + id + " terminando");
	}
}
