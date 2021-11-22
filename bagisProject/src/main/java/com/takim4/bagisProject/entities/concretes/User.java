package com.takim4.bagisProject.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@JsonIgnoreProperties (value = { "hibernateLazyInitializer", "handler"})
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="declaration", nullable=false)
	private String declaration;
	
	@Column(name="insert_date",columnDefinition = "Date default CURRENT_DATE")
	private Date insertDate;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;

	@Column(name="phone", nullable=false)
	private String phone; 
	
	@Column(name="payment_total", nullable=false)
	private String paymentTotal;
	
	@Column(name="grantor_type", nullable=false)
	private String grantortype;
	
	@OneToOne
	 private Grantor grantor;
	
	 @OneToOne
	 private Institutions institutions;
	
}
