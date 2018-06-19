package com.cgi.uswest.chimpls.person.objects;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Person {

	@Id
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@GeneratedValue(generator = "uuid2")
	@Column(columnDefinition = "BINARY(16)")
	private UUID id;
	
	private String idprsn;
	private String nmfrst;
	private String nmlst;
	private Timestamp dtbrth;
	private BigDecimal qtage;
	private String tximagelink;
	
	Person() {}
	
	public Person(String idprsn, String nmfrst, String nmlst, Timestamp dtbrth, BigDecimal qtage,
			String tximagelink) {
		super();

		this.idprsn = idprsn;
		this.nmfrst = nmfrst;
		this.nmlst = nmlst;
		this.dtbrth = dtbrth;
		this.qtage = qtage;
		this.tximagelink = tximagelink;

	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getIdprsn() {
		return idprsn;
	}

	public void setIdprsn(String idprsn) {
		this.idprsn = idprsn;
	}

	public String getNmfrst() {
		return nmfrst;
	}

	public void setNmfrst(String nmfrst) {
		this.nmfrst = nmfrst;
	}

	public String getNmlst() {
		return nmlst;
	}

	public void setNmlst(String nmlst) {
		this.nmlst = nmlst;
	}

	public Timestamp getDtbrth() {
		return dtbrth;
	}

	public void setDtbrth(Timestamp dtbrth) {
		this.dtbrth = dtbrth;
	}

	public BigDecimal getQtage() {
		return qtage;
	}

	public void setQtage(BigDecimal qtage) {
		this.qtage = qtage;
	}

	public String getTximagelink() {
		return tximagelink;
	}

	public void setTximagelink(String tximagelink) {
		this.tximagelink = tximagelink;
	}
	
}
