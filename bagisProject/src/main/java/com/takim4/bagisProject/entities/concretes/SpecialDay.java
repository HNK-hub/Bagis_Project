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
@Table(name = "specialDay")
public class SpecialDay {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name= "specialDay_id")
	@PrimaryKeyJoinColumn	private int specialDayId;
    
    @Column(name = "specialDay_name")
	private String specialDayName;
}
