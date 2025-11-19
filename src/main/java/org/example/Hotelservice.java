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

    public SendMessage shaharlar(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Qayerga bormoqchisiz");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton btn = new InlineKeyboardButton();
        btn.setText("Toshkent");
        btn.setCallbackData("toshkentId");
        row.add(btn);

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Andijon");
        button.setCallbackData("andijonId");
        row.add(button);
        rowlist.add(row);


        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("Buxoro");
        btn1.setCallbackData("buxoroId");
        row1.add(btn1);

        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("Jizzax");
        btn2.setCallbackData("jizzaxId");
        row1.add(btn2);
        rowlist.add(row1);


        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("Qashqadaryo");
        btn3.setCallbackData("qashqadaryoId");
        row3.add(btn3);

        InlineKeyboardButton btn4 = new InlineKeyboardButton();
        btn4.setText("Navoiy");
        btn4.setCallbackData("navoiyId");
        row3.add(btn4);
        rowlist.add(row3);


        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton btn5 = new InlineKeyboardButton();
        btn5.setText("Namangan");
        btn5.setCallbackData("namanganId");
        row4.add(btn5);

        InlineKeyboardButton btn6 = new InlineKeyboardButton();
        btn6.setText("Samarqand");
        btn6.setCallbackData("SamarqandId");
        row4.add(btn6);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton btn7 = new InlineKeyboardButton();
        btn7.setText("Surxondaryo");
        btn7.setCallbackData("surxondaryoId");
        row5.add(btn7);

        InlineKeyboardButton btn8 = new InlineKeyboardButton();
        btn8.setText("Sirdaryo");
        btn8.setCallbackData("sirdaryoId");
        row5.add(btn8);
        rowlist.add(row5);


        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton btn9 = new InlineKeyboardButton();
        btn9.setText("Farg'ona");
        btn9.setCallbackData("fargonaId");
        row6.add(btn9);

        InlineKeyboardButton btn10 = new InlineKeyboardButton();
        btn10.setText("Xorazm");
        btn10.setCallbackData("xorazmId");
        row6.add(btn10);
        rowlist.add(row6);


        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return SM;
    }

    public SendMessage toshkent(long chatId){
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);

        return SM;
    }

    public SendMessage andijon(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);

        return SM;
    }

    public SendMessage buxoro(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);

        return SM;
    }

    public SendMessage jizzax(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);

        return SM;
    }

    public SendMessage qashqadaryo(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);

        return SM;
    }

    public SendMessage navoiy(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);

        return SM;
    }

    public SendMessage namangan (long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);

        return SM;
    }

    public SendMessage samarqand(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);

        return SM;
    }

    public SendMessage surxondaryo(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);

        return SM;
    }

    public SendMessage sirdaryo(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);

        return SM;
    }

    public SendMessage fargona(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);

        return SM;
    }

    public SendMessage xorazm(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);

        return SM;
    }

}
