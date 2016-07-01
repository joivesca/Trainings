package mx.com.chilitech.validation.model;

public class User {
	
	//@NotEmpty
	private String firstName;
	
	//@NotEmpty
	private String lastName;
	
	//@NotNull
	private Integer age;
	
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
