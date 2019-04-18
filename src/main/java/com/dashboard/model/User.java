package com.dashboard.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="user")
public class User 
{
@Id
@GeneratedValue
private int userid;
private String name;
private String password;
@Column(unique = true)
private String email;
private String organisation;
private int active;
@Transient
private String token;



//public User(String name, String password, String email, String organisation) {
//	super();
//	this.name = name;
//	this.password = password;
//	this.email = email;
//	this.organisation = organisation;
//}

public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getName() {
	return name;
}
public int getActive() {
	return active;
}
public void setActive(int active) {
	this.active = active;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getOrganisation() {
	return organisation;
}
public void setOrganisation(String organisation) {
	this.organisation = organisation;
}



	
}
