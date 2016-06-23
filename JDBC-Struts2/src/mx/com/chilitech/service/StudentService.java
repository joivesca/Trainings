package mx.com.chilitech.service;

import mx.com.chilitech.repository.StudentRepository;

public class StudentService {
	
	private StudentRepository studentRepository;
	
	public StudentService() {
		studentRepository = new StudentRepository();
	}
	
	public String save(String userName, String password, String firstName, String lastName, String dateOfBirth, String email){
		if (studentRepository != null) {
			if (studentRepository.findByUserName(userName)) {
				return "signupFailure-userNameExists";
			}
			studentRepository.create(userName, password, firstName, lastName, dateOfBirth, email);
			return "signupSuccess";
		} else {
			return "signupFailure";
		}
	}

	public String findByLogin(String userName, String password) {
		String result = "LoginFailure";
		if (studentRepository != null) {
			boolean status = studentRepository.findByLogin(userName, password);
			if (status) {
				result = "LoginSuccess";
			}
		}
		return result;
	}
	
}
