
public abstract class Machinee {

	private int ID;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	public abstract void start();
	public abstract void continuee();
	public abstract void stop();
	
	public void runn() {
		start();
		continuee();
		stop();
	}
	
}
