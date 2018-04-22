package nga.oop4.updated;

public class Employee {
	private String name;
	private int YOB;
	private String gender;
	private Address address;
	private String trainingSector;
	private String diploma;
	private String work;
	private String rank;

	public Employee() {
		super();
	}

	public Employee(String name, int yOB, String gender, Address address, String trainingSector, String diploma,
			String work, String rank) {
		super();
		this.name = name;
		YOB = yOB;
		this.gender = gender;
		this.address = address;
		this.trainingSector = trainingSector;
		this.diploma = diploma;
		this.work = work;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYOB() {
		return YOB;
	}

	public void setYOB(int yOB) {
		YOB = yOB;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getTrainingSector() {
		return trainingSector;
	}

	public void setTrainingSector(String trainingSector) {
		this.trainingSector = trainingSector;
	}

	public String getDiploma() {
		return diploma;
	}

	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Employee [name: " + name + ", YOB: " + YOB + ", gender: " + gender + ", address: " + address
				+ ", trainingSector: " + trainingSector + ", diploma: " + diploma + ", work: " + work + ", rank: "
				+ rank + "]";
	}

}
