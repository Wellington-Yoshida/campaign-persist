package br.com.brad.campaignpersist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "br.com.brad.campaignpersist")
public class CampaignPersistApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampaignPersistApplication.class, args);
    }

}
