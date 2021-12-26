package com.springmvc.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	// TODO: @Min @Max >> Value
	// TODO: @Size     >> Length

	@NotNull(message = "first name is required")
	@Size(min = 5, max = 10, message = "length is from 5 to 10")
	private String firstName;

	@NotNull(message = "last name is required")
	@Size(min = 5, max = 10, message = "length is from 5 to 10")
	private String lastName;

	@NotNull(message = "free passes is required")
	@Min(value = 1, message = "min is 1")
	@Max(value = 10, message = "max is 10")
	private int freePasses;

	@NotNull(message = "postal code is required")
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 letters/digits")
	private String postalCode;

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

	public int getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
