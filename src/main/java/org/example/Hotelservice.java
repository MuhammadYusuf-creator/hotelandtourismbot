package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class Hotelservice {

    public static SendMessage intro(Long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Assalomu alaykum Iltimos tilni tanlang");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton btn = new InlineKeyboardButton();
        btn.setText("🇺🇿O'zbekcha");
        btn.setCallbackData("ozbekId");
        row.add(btn);
        rowlist.add(row);

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("🇷🇺Russian");
        button.setCallbackData("rusId");
        row.add(button);

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("🇺🇸English");
        button1.setCallbackData("englishId");
        row.add(button1);


        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return SM;
    }

    public SendMessage menu(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Bittasini tanlang ");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton btn = new InlineKeyboardButton();
        btn.setText("Hotel");
        btn.setCallbackData("menuhotelId");
        row.add(btn);
        rowlist.add(row);

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Tourism");
        button.setCallbackData("menutourismId");
        row.add(button);


        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return SM;
    }
}
