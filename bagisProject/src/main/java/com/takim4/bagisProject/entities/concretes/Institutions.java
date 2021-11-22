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

@Entity
@Table(name = "institutions")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Institutions  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "institutions_id")
	@PrimaryKeyJoinColumn
	private int institutionsId;

    @Column(name = "institutions_name")
	private String institutionsname;
	
    @Column(name = "duty_no")
	private String dutyNo;

}
