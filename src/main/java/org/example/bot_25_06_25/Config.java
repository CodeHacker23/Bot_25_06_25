package org.example.bot_25_06_25;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Configuration
public class Config {
    @Bean
    TelegramBotsApi telegramBotsApi(Bot bot){
        TelegramBotsApi telegramBotsApi;
        try {
            telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(bot);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return telegramBotsApi;
    }
}
