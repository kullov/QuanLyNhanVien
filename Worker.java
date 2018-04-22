package nga.oop4.updated;

public class Worker extends Employee {

	public Worker() {
		super();
	}

	public Worker(String name, int yOB, String gender, Address address, String rank) {
		super(name, yOB, gender, address, null, null, null, rank);
	}


	@Override
	public String toString() {
		return "Worker [Name: " + getName() + ", YOB: " + getYOB() + ", Gender: "
				+ getGender() + ", Address: " + getAddress() +", Rank: " + getRank() +"]";
	}
	
	
	
}
