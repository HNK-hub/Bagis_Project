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
@Table(name = "createCampaign")
public class CreateCampaign {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name= "createCampaign_id")
	@PrimaryKeyJoinColumn	private int createCampaignId;

    @Column(name = "identity")
	private String identity;
    
    @Column(name = "create_campaign_name")
	private String createCampaignName;
    
    @Column(name = "Cpayment_total")
	private String CpaymentTotal;
}
