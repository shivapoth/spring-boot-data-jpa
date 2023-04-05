package com.ojas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cadd=" + cadd + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int cid;
	@Column(name = "NAME")
	private String cname;
	@Column(name = "ADDRESS")
	private String cadd;

	public Customer(int cid, String cname, String cadd) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cadd = cadd;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCadd() {
		return cadd;
	}

	public void setCadd(String cadd) {
		this.cadd = cadd;
	}

}
