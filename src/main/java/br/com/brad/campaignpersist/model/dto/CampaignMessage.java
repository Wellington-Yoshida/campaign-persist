package br.com.brad.campaignpersist.model.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class CampaignMessage {
    private String email;
    private String name;
    private LocalDateTime dateSimulation;
    private BigDecimal amount;
}
