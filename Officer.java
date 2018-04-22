package nga.oop4.updated;

public class Officer extends Employee {

	public Officer() {
		super();
	}

	public Officer(String name, int yOB, String gender, Address address, String work) {
		super(name, yOB, gender, address, null, null, work, null);
	}

	@Override
	public String toString() {
		return "Officer [Name: " + getName() + ", YOB: " + getYOB() + ", Gender: " + getGender() + ", Address: "
				+ getAddress() + ", Work: " + getWork() + "]";
	}

}
