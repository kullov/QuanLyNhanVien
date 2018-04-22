package nga.oop4.updated;

public class Engineer extends Employee {
	public Engineer() {
		super();
	}

	public Engineer(String name, int yOB, String gender, Address address, String traningSector, String diploma) {
		super(name, yOB, gender, address, traningSector, diploma, null, null);
	}

	public String toString() {
		return "Engineer [Name: " + getName() + ", YOB: " + getYOB() + ", Gender: " + getGender() + ", Address: "
				+ getAddress() + ", training sector: " + getTrainingSector() + ", diploma: " + getDiploma() + " ]";
	}
}
