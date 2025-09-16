package br.com.brad.campaignpersist.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.brad.campaignpersist.model.entity.Campaign;

public interface CampaignRepository extends MongoRepository<Campaign, String> {
}
