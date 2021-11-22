package com.takim4.bagisProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "grantor_types")

public class GrantorTypes  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "grantor_types_id")
	@PrimaryKeyJoinColumn	private int grantorTypesId;
	
	 @Column(name = "grantor_types_name")
		private String grantorTypesName;
	 
	 @OneToOne
	 private SpecialDay specialDay;
	 
	 @OneToOne
	 private CreateCampaign createCampaign;
	 
}


