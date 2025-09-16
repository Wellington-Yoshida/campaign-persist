package br.com.brad.campaignpersist.service;

import br.com.brad.campaignpersist.model.dto.CampaignMessage;

public interface CampaignService {

    void saveCampaign(CampaignMessage campaignMessage);
}
