package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class myBot extends TelegramLongPollingBot {

    Hotelservice hotel = new Hotelservice();
    Tourismservice tourism = new Tourismservice();

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String text = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();


            if (text.equals("/start")) {
                try {
                    execute(hotel.intro(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


        } else if (update.hasCallbackQuery()) {
          CallbackQuery callbackQuery = update.getCallbackQuery();
          String data = callbackQuery.getData();
          Long chatId = callbackQuery.getMessage().getChatId();

            System.out.println(data);

            if (data.equals("ozbekId")) {
                try {
                    execute(hotel.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }


    @Override
    public String getBotUsername() {
        return "hotelandtourismbot";
    }

    @Override
    public String getBotToken() {
        return "7294142846:AAGWROnhLyv0YkluNsJZvv7cvPkeE4Y565Y";
    }

}
