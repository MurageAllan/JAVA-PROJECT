package enumm;

public enum Animals {
	Dog("kiki", 7),Cat("poppy" , 8),Mouse("mickey", 9);
	String name;
	int id;
	Animals(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(" ").append(id);
		return sb.toString();
	}
	

}
