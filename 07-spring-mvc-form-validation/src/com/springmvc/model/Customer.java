package com.springmvc.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.springmvc.validation.StartsWith;

public class Customer {

	// : @Min @Max >> Value
	// : @Size     >> Length

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
	
	@StartsWith(prefix = "BKIT", message = "course code must start with BKIT")
	private String courseCode;
	

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
	
	public String getCourseCode() {
		return courseCode;
	}
	
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
