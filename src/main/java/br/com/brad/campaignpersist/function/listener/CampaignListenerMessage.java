package br.com.brad.campaignpersist.function.listener;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Configuration
@RequiredArgsConstructor
public class CampaignListenerMessage {

    @Bean
    public Consumer<String> campaignListener() {
        return message -> {
            log.info("Recebido: " + message);
        };
    }
}
