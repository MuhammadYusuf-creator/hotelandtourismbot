package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class Tourismservice {
    public static SendMessage intro(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Assalomu alaykum Iltimos tanlang");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Registon maydoni");
        b1.setCallbackData("b1");
        row1.add(b1);
        rowlist.add(row1);

        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("Shohi Zinda majmuasi");
        b2.setCallbackData("b2");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Go‘ri Amir maqbarasi");
        b3.setCallbackData("b3");
        row3.add(b3);
        rowlist.add(row3);

        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("Bibi Xonim masjidi");
        b4.setCallbackData("b4");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Ulug‘bek rasadxonasi");
        b5.setCallbackData("b5");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Afrosiyob muzeyi");
        b6.setCallbackData("b6");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Hazrati Xizr masjidi");
        b7.setCallbackData("b7");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Siyob bozori");
        b8.setCallbackData("b8");
        row8.add(b8);
        rowlist.add(row8);


        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }


}
