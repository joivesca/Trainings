package mx.com.chilitech.uaiContacts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "system_user")
public class User {

	@Id
	@GeneratedValue
	private int id;

	private String email;
	private String name;
	private String enabled;
	private String password;

	@Enumerated(EnumType.STRING)
	@Column(name = "user_role")
	private Role role;
	// get and set
}
