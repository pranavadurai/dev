package com.aws.dev.web.frontend;

public class feedback {

	private String email;
    private String firstName;
    private String lastName;
    private String feedback;
    
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	@Override
	public String toString() {
		return "feedback [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", feedback="
				+ feedback + "]";
	}
	
	

    
}
