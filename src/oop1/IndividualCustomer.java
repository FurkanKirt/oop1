package oop1;

public class IndividualCustomer extends Customer {
	private String FirsName;
	private String LastName;

	public String getFirsName() {
		return FirsName;
	}

	public void setFirsName(String firsName) {
		FirsName = firsName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

}
