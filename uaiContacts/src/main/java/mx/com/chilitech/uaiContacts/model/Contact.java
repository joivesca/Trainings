package mx.com.chilitech.uaiContacts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contact {
 
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String phoneNumber;
    private String email;
        // get and set
}