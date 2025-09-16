package br.com.brad.campaignpersist.model.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
public class Campaign {

    @MongoId
    private String id;
    @Indexed(unique = true)
    private String email;
    private String name;
    @Field("date_simulation")
    private LocalDateTime dateSimulation;
    private BigDecimal amount;
}
