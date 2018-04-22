package nga.oop4.updated;
public class Address {
	private int numberOfHouse;
	private int alley;
	private int lane;
	private String street;
	private String subDistrict;
	private String district;
	private String city;
	public Address() {
		super();
	}
	public Address(int numberOfHouse, int alley, int lane, String street, String subDistrict, String district,
			String city) {
		super();
		this.numberOfHouse = numberOfHouse;
		this.alley = alley;
		this.lane = lane;
		this.street = street;
		this.subDistrict = subDistrict;
		this.district = district;
		this.city = city;
	}
	
	public int getNumberOfHouse() {
		return numberOfHouse;
	}
	public void setNumberOfHouse(int numberOfHouse) {
		this.numberOfHouse = numberOfHouse;
	}
	public int getAlley() {
		return alley;
	}
	public void setAlley(int alley) {
		this.alley = alley;
	}
	public int getLane() {
		return lane;
	}
	public void setLane(int lane) {
		this.lane = lane;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getSubDistrict() {
		return subDistrict;
	}
	public void setSubDistrict(String subDistrict) {
		this.subDistrict = subDistrict;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "[NumberOfHouse: " + numberOfHouse + ", alley: " + alley + ", lane: " + lane + ", street: " + street
				+ ", subDistrict: " + subDistrict + ", district: " + district + ", city: " + city + "]";
	}
	
}
