
public class Entero {
	private volatile int minum;
	Entero(){
		this.minum = 0;
	}
	
	public void incrementar() {
		minum++;
	}
	
	public void decrementar() {
		minum--;
	}
	
	public int getNum() {
		return minum;
	}
}
