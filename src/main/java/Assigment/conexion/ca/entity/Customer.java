package Assigment.conexion.ca.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;




@Entity
//@Table(name="customer")
@Table(schema = "hotel_reservation", name = "customer")
public class Customer {
	
	

	
public Customer() {
		super();
	}


@Override
public String toString() {
	return "Customer [Id=" + Id + ", email=" + email + ", password=" + password + ", firstname=" + firstname
			+ ", lastname=" + lastname + ", phonenumber=" + phonenumber + ", address=" + address + ", city=" + city
			+ ", postcode=" + postcode + ", country=" + country + "]";
}



public String getId() {
	return Id;
}

public void setId(String id) {
	Id = id;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getPhonenumber() {
	return phonenumber;
}

public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getPostcode() {
	return postcode;
}

public void setPostcode(String postcode) {
	this.postcode = postcode;
}

public String getContry() {
	return country;
}

public void setContry(String country) {
	this.country = country;
}



@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="custId")
private String Id;

@Column(name="email")
private String email;

@Column(name="password")
private String password;

@Column(name="firstname")
private String firstname;

@Column(name="lastname")
private String lastname;

@Column(name="phonenumber")
private String phonenumber;

@Column(name="address")
private String address;

@Column(name="city")
private String city;

@Column(name="postcode")
private String postcode;

@Column(name="country")
private String country;

}
