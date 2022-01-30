package APIAutomation.POJOClassExample;

public class BasicInformation {
	
	private String firstName;
	private String lastName;
	private String company;
	private String id;
	private AddressInformation address;
	
	public AddressInformation getAddress() {
		return address;
	}
	public void setAddress(AddressInformation address) {
		this.address = address;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}


}
