package br.com.brad.campaignpersist.service.impl;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import br.com.brad.campaignpersist.mapper.CampaignMessageMapper;
import br.com.brad.campaignpersist.model.dto.CampaignMessage;
import br.com.brad.campaignpersist.repository.CampaignRepository;
import br.com.brad.campaignpersist.service.CampaignService;

@Log4j2
@Service
@RequiredArgsConstructor
public class CampaignServiceImpl implements CampaignService {

    private final CampaignRepository campaignRepository;

    @Override
    public void saveCampaign(CampaignMessage campaignMessage) {
        try {
            campaignRepository.save(CampaignMessageMapper.INSTANCE.toCampaign(campaignMessage));
        } catch (Exception ex) {
            log.error("Erro ao salvar campanha: {}", ex.getMessage());
            throw new RuntimeException("Erro ao salvar campanha: " + ex.getMessage());
        }
    }
}
