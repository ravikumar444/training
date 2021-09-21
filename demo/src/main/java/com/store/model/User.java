package com.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name = "users") 

public class User {
	
 private long id;
 private String username;
 private String password;
 private String cardtype;
 private float balance;
 
 
public User() {
}

public User(String username, String password, String cardtype, float balance) {

	this.username = username;
	this.password = password;
	this.cardtype = cardtype;
	this.balance = balance;
}

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

@Column(name = "username", nullable = false)
public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

@Column(name = "password", nullable = false)
public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Column(name = "cardtype", nullable = false)
public String getCardtype() {
	return cardtype;
}

public void setCardtype(String cardtype) {
	this.cardtype = cardtype;
}

@Column(name = "balance", nullable = false)
public float getBalance() {
	return balance;
}

public void setBalance(float balance) {
	this.balance = balance;
}

@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", password=" + password + ", cardtype=" + cardtype
			+ ", balance=" + balance + "]";
}
}

