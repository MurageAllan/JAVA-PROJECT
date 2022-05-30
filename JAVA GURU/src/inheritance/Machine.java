package inheritance;

public abstract class Machine {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract void start();

	abstract void stop();

	abstract void run();

	public void Info() {
		 start();
		 stop();
		 run();
	}
}
