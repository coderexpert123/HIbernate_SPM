package com.tut;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.Generated;

@Entity
@Table(name ="Address_Table")

public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="Address_Id",length = 100)
	private int aadreess_id;
	@Column(name = "Address_Street",length = 100)
	private String street;
	@Column(name = "Adress_City",length = 100)
	private String city;
	@Column(name = "Address_Open")
	private boolean isOpena;
	@Transient
	private double x;
	@Column(name = "Added_Date")
	//@Temporal(TemporalType.DATE)
	private Date addeddateDate;
	@Lob
	private byte[] image;
	
	
	
	
	
	public int getAadreess_id() {
		return aadreess_id;
	}
	public void setAadreess_id(int aadreess_id) {
		this.aadreess_id = aadreess_id;
	}
	public String getStreet() {
		return street;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int aadreess_id, String street, String city, boolean isOpena, double x, Date addeddateDate,
			byte[] image) {
		super();
		this.aadreess_id = aadreess_id;
		this.street = street;
		this.city = city;
		this.isOpena = isOpena;
		this.x = x;
		this.addeddateDate = addeddateDate;
		this.image = image;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpena() {
		return isOpena;
	}
	public void setOpena(boolean isOpena) {
		this.isOpena = isOpena;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddeddateDate() {
		return addeddateDate;
	}
	public void setAddeddateDate(Date addeddateDate) {
		this.addeddateDate = addeddateDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}

	
	
}
