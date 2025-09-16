package br.com.brad.campaignpersist.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import br.com.brad.campaignpersist.model.dto.CampaignMessage;
import br.com.brad.campaignpersist.model.entity.Campaign;

@Mapper
public interface CampaignMessageMapper {

    CampaignMessageMapper INSTANCE = Mappers.getMapper(CampaignMessageMapper.class);

    @Mapping(target = "name", source = "name")
    @Mapping(target = "dateSimulation", source = "dateSimulation")
    @Mapping(target = "amount", source = "amount")
    Campaign toCampaign(CampaignMessage campaignMessage);
}
