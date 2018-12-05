package member;

public class Member {
	private int id;
	private String name;
	private String surname;
	private Address address;
	
	public Member(String name, String surname) {
		this.setName(name);
		this.setSurname(surname);
	}
	
	public Member(String name, String surname, Address address) {
		this(name, surname);
		this.setAddress(address);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
}
