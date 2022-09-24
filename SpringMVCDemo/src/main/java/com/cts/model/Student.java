package com.cts.model;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {

	@NotNull(message = "Required")
	@Size(min = 1,message = "Required")
	private String firstName;
	
	private String lastName;
	private String gender;
	
	@NotNull(message = "Required")
	@Min(value = 16, message="age must be greater or equal to 16")
	@Max(value = 23,message="age must be lesser or equal to 23")
	private Integer age;
	
	private String[] langs;
	private String location;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 digits or chars")
	private String pincode;

	private LinkedHashMap<String, String> locOptions;

	public Student() {

		locOptions = new LinkedHashMap<String, String>();
		locOptions.put("ATP", "Anantapur");
		locOptions.put("KRL", "Kurnool");
		locOptions.put("KDP", "Kadapa");
		locOptions.put("CHT", "Chittor");
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String[] getLangs() {
		return langs;
	}

	public void setLangs(String[] langs) {
		this.langs = langs;
	}

	public LinkedHashMap<String, String> getLocOptions() {
		return locOptions;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

//	public void setLocOptions(LinkedHashMap<String, String> locOptions) {
//		this.locOptions = locOptions;
//	}
	
}
