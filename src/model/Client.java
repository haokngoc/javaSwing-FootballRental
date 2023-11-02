/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */

import java.io.Serializable;

import java.io.Serializable;

public class Client implements Serializable{
	private String name;
	private String address;
	private String tel;
	private String email;
	private String note;
	
	public Client() {
		super();
	}
	
	public Client(String name, String address, String tel, String email, String note) {
		super();
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.email = email;
		this.note = note;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
}
