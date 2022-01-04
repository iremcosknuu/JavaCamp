package Entities;

import java.time.LocalDate;

public class Player {
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate birthOfDate;
	private String nationaltyId;

	public Player() {
		
	}

	public Player(int id, String firstName, String lastName, LocalDate birthOfDate, String nationaltyId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
		this.nationaltyId = nationaltyId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public LocalDate getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(LocalDate birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public String getNationaltyId() {
		return nationaltyId;
	}

	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}
	
	
	
}
