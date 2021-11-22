package com.takim4.bagisProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "grantor")

public class Grantor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //o ‘id’ üretmeyi ve Veritabanımızda sequence oluşturmayı sağlar.
	@Column(name= "grantor_id")
	@PrimaryKeyJoinColumn	private int grantorId;

    @Column(name = "identity")
	private String identity;
    
    @Column(name = "grantor_name")
	private String grantorName;
    

  

}