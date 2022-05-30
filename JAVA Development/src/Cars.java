
public enum Cars {
	Benz("young",7), Porshe("old",7), BMW("Middle",5), Audi("old", 9), RollsRoyce("young", 2);
	int id;
	String age;
	Cars(String age, int id){
		this.age = age;
		this.id = id;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(age).append(" ").append(id);
		return sb.toString();
	}
}
