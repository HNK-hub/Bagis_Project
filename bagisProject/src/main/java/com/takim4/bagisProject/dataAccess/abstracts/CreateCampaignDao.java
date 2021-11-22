package com.takim4.bagisProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.takim4.bagisProject.entities.concretes.CreateCampaign;

public interface CreateCampaignDao extends JpaRepository<CreateCampaign, Integer> {

}
