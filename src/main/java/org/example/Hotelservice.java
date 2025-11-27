package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
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


        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("🇺🇸English");
        button1.setCallbackData("englishId");
        row.add(button1);


        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return SM;
    }


    public InlineKeyboardMarkup intro1(Long chatId) {
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

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("🇺🇸English");
        button1.setCallbackData("englishId");
        row.add(button1);


        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return imk;
    }

    public InlineKeyboardMarkup menu(long chatId) {
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
        return imk;
    }

    public InlineKeyboardMarkup menu1(long chatId) {
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
        return imk;
    }

    public InlineKeyboardMarkup engmenu(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Choose one ");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton btn = new InlineKeyboardButton();
        btn.setText("Hotel");
        btn.setCallbackData("engmenuhotelId");
        row.add(btn);
        rowlist.add(row);

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Tourism");
        button.setCallbackData("engmenutourismId");
        row.add(button);


        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return imk;
    }

    public InlineKeyboardMarkup engmenu1(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("choose one ");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton btn = new InlineKeyboardButton();
        btn.setText("Hotel");
        btn.setCallbackData("engmenuhotelId");
        row.add(btn);
        rowlist.add(row);

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Tourism");
        button.setCallbackData("engmenutourismId");
        row.add(button);


        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return imk;
    }

    public InlineKeyboardMarkup shaharlarhotel(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Qayerdagi mehmonhonalar kerak");

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
        return imk;
    }

    public InlineKeyboardMarkup toshkent(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Toshkentdagi mehmonxonalar. Quyidagi mehmonxonalardan birini tanlang:");


        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();


        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Hilton Tashkent City");
        b1.setCallbackData("tashkent_hilton");
        row1.add(b1);
        rowlist.add(row1);


        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Hyatt Regency Tashkent");
        b2.setCallbackData("tashkent_hyatt");
        row2.add(b2);
        rowlist.add(row2);


        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Wyndham Tashkent");
        b3.setCallbackData("tashkent_wyndham");
        row3.add(b3);
        rowlist.add(row3);


        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("⭐️⭐️⭐️⭐️ Courtyard by Marriott Tashkent");
        b4.setCallbackData("tashkent_marriott");
        row4.add(b4);
        rowlist.add(row4);


        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Level Hotel and BC");
        b5.setCallbackData("tashkent_level");
        row5.add(b5);
        rowlist.add(row5);


        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return imk;
    }

    public SendMessage toshkent1(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Toshkentdagi mehmonxonalar. Quyidagi mehmonxonalardan birini tanlang:");


        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();


        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Hilton Tashkent City");
        b1.setCallbackData("tashkent_hilton");
        row1.add(b1);
        rowlist.add(row1);


        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Hyatt Regency Tashkent");
        b2.setCallbackData("tashkent_hyatt");
        row2.add(b2);
        rowlist.add(row2);


        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Wyndham Tashkent");
        b3.setCallbackData("tashkent_wyndham");
        row3.add(b3);
        rowlist.add(row3);


        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("⭐️⭐️⭐️⭐️ Courtyard by Marriott Tashkent");
        b4.setCallbackData("tashkent_marriott");
        row4.add(b4);
        rowlist.add(row4);


        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Level Hotel and BC");
        b5.setCallbackData("tashkent_level");
        row5.add(b5);
        rowlist.add(row5);


        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return SM;
    }

    public SendMessage andijon(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Andijon viloyati mehmonxonalari:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();


        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ O'zbegim Andijon");
        b1.setCallbackData("andijon_uzbegim");
        row1.add(b1);
        rowlist.add(row1);


        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Andijon Grand Hotel");
        b2.setCallbackData("andijon_grand");
        row2.add(b2);
        rowlist.add(row2);


        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Asia Andijan Hotel");
        b3.setCallbackData("andijon_asia");
        row3.add(b3);
        rowlist.add(row3);


        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Global Star Hotel");
        b4.setCallbackData("andijon_global");
        row4.add(b4);
        rowlist.add(row4);


        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Hamkor Bank Hotel");
        b5.setCallbackData("andijon_hamkor");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return SM;
    }

    public InlineKeyboardMarkup andijon1(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Andijon viloyati mehmonxonalari:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();


        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ O'zbegim Andijon");
        b1.setCallbackData("andijon_uzbegim");
        row1.add(b1);
        rowlist.add(row1);


        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Andijon Grand Hotel");
        b2.setCallbackData("andijon_grand");
        row2.add(b2);
        rowlist.add(row2);


        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Asia Andijan Hotel");
        b3.setCallbackData("andijon_asia");
        row3.add(b3);
        rowlist.add(row3);


        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Global Star Hotel");
        b4.setCallbackData("andijon_global");
        row4.add(b4);
        rowlist.add(row4);


        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Hamkor Bank Hotel");
        b5.setCallbackData("andijon_hamkor");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return imk;
    }

    public SendMessage buxoro(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Buxorodagi mehmonxonalar:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();


        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Wyndham Bukhara");
        b1.setCallbackData("buxoro_wyndham");
        row1.add(b1);
        rowlist.add(row1);


        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Minorai Kalon Hotel");
        b2.setCallbackData("buxoro_minora");
        row2.add(b2);
        rowlist.add(row2);


        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Devon Begi Hotel");
        b3.setCallbackData("buxoro_devonbegi");
        row3.add(b3);
        rowlist.add(row3);


        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Omar Khayyam Hotel");
        b4.setCallbackData("buxoro_omarkhayyam");
        row4.add(b4);
        rowlist.add(row4);


        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Sasha & Son Boutique Hotel");
        b5.setCallbackData("buxoro_sasha");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return SM;
    }

    public InlineKeyboardMarkup buxoro1(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Buxorodagi mehmonxonalar:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();


        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Wyndham Bukhara");
        b1.setCallbackData("buxoro_wyndham");
        row1.add(b1);
        rowlist.add(row1);


        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Minorai Kalon Hotel");
        b2.setCallbackData("buxoro_minora");
        row2.add(b2);
        rowlist.add(row2);


        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Devon Begi Hotel");
        b3.setCallbackData("buxoro_devonbegi");
        row3.add(b3);
        rowlist.add(row3);


        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Omar Khayyam Hotel");
        b4.setCallbackData("buxoro_omarkhayyam");
        row4.add(b4);
        rowlist.add(row4);


        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Sasha & Son Boutique Hotel");
        b5.setCallbackData("buxoro_sasha");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return imk;
    }

    public SendMessage jizzax(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Jizzax viloyati mehmonxonalari:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        // 1-mehmonxona: Grand Hotel Zomin (5*)
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Grand Hotel Zomin");
        b1.setCallbackData("jizzax_zomin");
        row1.add(b1);
        rowlist.add(row1);

        // 2-mehmonxona: Silk Road Jizzax (5*)
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Silk Road Jizzax");
        b2.setCallbackData("jizzax_silkroad");
        row2.add(b2);
        rowlist.add(row2);

        // 3-mehmonxona: Sogdiana Hotel (4*)
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Sogdiana Hotel");
        b3.setCallbackData("jizzax_sogdiana");
        row3.add(b3);
        rowlist.add(row3);

        // 4-mehmonxona: Grand Hotel Jizzakh (4*)
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Grand Hotel Jizzakh");
        b4.setCallbackData("jizzax_grand");
        row4.add(b4);
        rowlist.add(row4);

        // 5-mehmonxona: Mehmonxona Jizzax (3*)
        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Tashkent plaza in jizzax");
        b5.setCallbackData("jizzax_markaziy");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return SM;
    }

    public InlineKeyboardMarkup jizzax1(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Jizzax viloyati mehmonxonalari:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        // 1-mehmonxona: Grand Hotel Zomin (5*)
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Grand Hotel Zomin");
        b1.setCallbackData("jizzax_zomin");
        row1.add(b1);
        rowlist.add(row1);

        // 2-mehmonxona: Silk Road Jizzax (5*)
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Silk Road Jizzax");
        b2.setCallbackData("jizzax_silkroad");
        row2.add(b2);
        rowlist.add(row2);

        // 3-mehmonxona: Sogdiana Hotel (4*)
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Sogdiana Hotel");
        b3.setCallbackData("jizzax_sogdiana");
        row3.add(b3);
        rowlist.add(row3);

        // 4-mehmonxona: Grand Hotel Jizzakh (4*)
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Grand Hotel Jizzakh");
        b4.setCallbackData("jizzax_grand");
        row4.add(b4);
        rowlist.add(row4);

        // 5-mehmonxona: Mehmonxona Jizzax (3*)
        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Tashkent plaza in jizzax");
        b5.setCallbackData("jizzax_markaziy");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return imk;
    }

    public SendMessage qashqadaryo(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Qashqadaryo mehmonxonalari:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        // 1-mehmonxona: Shahrisabz Hotel (5*)
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Shahrisabz Hotel");
        b1.setCallbackData("qashqadaryo_shahrisabz");
        row1.add(b1);
        rowlist.add(row1);

        // 2-mehmonxona: Nasaf Hotel (Qarshi) (5*)
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Nasaf Hotel");
        b2.setCallbackData("qashqadaryo_nasaf");
        row2.add(b2);
        rowlist.add(row2);

        // 3-mehmonxona: Bahrin Qarshi Hotel (4*)
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Sultan hotel");
        b3.setCallbackData("qashqadaryo_bahrin");
        row3.add(b3);
        rowlist.add(row3);

        // 4-mehmonxona: Grand Hotel Shahrisabz (4*)
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Grand Hotel Shahrisabz");
        b4.setCallbackData("qashqadaryo_grand");
        row4.add(b4);
        rowlist.add(row4);

        // 5-mehmonxona: Muborak Hotel (3*)
        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Muborak Hotel");
        b5.setCallbackData("qashqadaryo_muborak");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return SM;
    }

    public InlineKeyboardMarkup qashqadaryo1(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Qashqadaryo mehmonxonalari:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        // 1-mehmonxona: Shahrisabz Hotel (5*)
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Shahrisabz Hotel");
        b1.setCallbackData("qashqadaryo_shahrisabz");
        row1.add(b1);
        rowlist.add(row1);

        // 2-mehmonxona: Nasaf Hotel (Qarshi) (5*)
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Nasaf Hotel");
        b2.setCallbackData("qashqadaryo_nasaf");
        row2.add(b2);
        rowlist.add(row2);

        // 3-mehmonxona: Bahrin Qarshi Hotel (4*)
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Sultan hotel");
        b3.setCallbackData("qashqadaryo_bahrin");
        row3.add(b3);
        rowlist.add(row3);

        // 4-mehmonxona: Grand Hotel Shahrisabz (4*)
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Grand Hotel Shahrisabz");
        b4.setCallbackData("qashqadaryo_grand");
        row4.add(b4);
        rowlist.add(row4);

        // 5-mehmonxona: Muborak Hotel (3*)
        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Muborak Hotel");
        b5.setCallbackData("qashqadaryo_muborak");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return imk;
    }

    public SendMessage navoiy(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Navoiy viloyati mehmonxonalari:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        // 1-mehmonxona: Zarafshon Grand Hotel (5*)
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Zarafshon Grand Hotel");
        b1.setCallbackData("navoiy_zarafshon");
        row1.add(b1);
        rowlist.add(row1);

        // 2-mehmonxona: Hotel Navoiy Palace (5*)
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Hotel Navoiy Palace");
        b2.setCallbackData("navoiy_palace");
        row2.add(b2);
        rowlist.add(row2);

        // 3-mehmonxona: Silk Road by Navoi (4*)
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Silk Road by Navoi");
        b3.setCallbackData("navoiy_silkroad");
        row3.add(b3);
        rowlist.add(row3);

        // 4-mehmonxona: Grand Star Navoi (4*)
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Grand Star Navoi");
        b4.setCallbackData("navoiy_grandstar");
        row4.add(b4);
        rowlist.add(row4);

        // 5-mehmonxona: Navoiy City Hotel (3*)
        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Navoiy City Hotel");
        b5.setCallbackData("navoiy_city");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return SM;
    }

    public InlineKeyboardMarkup navoiy1(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Navoiy viloyati mehmonxonalari:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        // 1-mehmonxona: Zarafshon Grand Hotel (5*)
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Zarafshon Grand Hotel");
        b1.setCallbackData("navoiy_zarafshon");
        row1.add(b1);
        rowlist.add(row1);

        // 2-mehmonxona: Hotel Navoiy Palace (5*)
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Hotel Navoiy Palace");
        b2.setCallbackData("navoiy_palace");
        row2.add(b2);
        rowlist.add(row2);

        // 3-mehmonxona: Silk Road by Navoi (4*)
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Silk Road by Navoi");
        b3.setCallbackData("navoiy_silkroad");
        row3.add(b3);
        rowlist.add(row3);

        // 4-mehmonxona: Grand Star Navoi (4*)
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Grand Star Navoi");
        b4.setCallbackData("navoiy_grandstar");
        row4.add(b4);
        rowlist.add(row4);

        // 5-mehmonxona: Navoiy City Hotel (3*)
        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Navoiy City Hotel");
        b5.setCallbackData("navoiy_city");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return imk;
    }

    public SendMessage namangan(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Namangan viloyati mehmonxonalari:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        // 1-mehmonxona: Wyndham Namangan (5*)
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Wyndham Namangan");
        b1.setCallbackData("namangan_wyndham");
        row1.add(b1);
        rowlist.add(row1);

        // 2-mehmonxona: Namangan Plaza Hotel (5*)
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Namangan Plaza Hotel");
        b2.setCallbackData("namangan_plaza");
        row2.add(b2);
        rowlist.add(row2);

        // 3-mehmonxona: Afsona Hotel Namangan (4*)
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Afsona Hotel Namangan");
        b3.setCallbackData("namangan_afsona");
        row3.add(b3);
        rowlist.add(row3);

        // 4-mehmonxona: Hotel Namangan Sayyoh (4*)
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Hotel Namangan Sayyoh");
        b4.setCallbackData("namangan_sayyoh");
        row4.add(b4);
        rowlist.add(row4);

        // 5-mehmonxona: Fajr Hotel (3*)
        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Fajr Hotel");
        b5.setCallbackData("namangan_fajr");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return SM;
    }

    public InlineKeyboardMarkup namangan1(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Namangan viloyati mehmonxonalari:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        // 1-mehmonxona: Wyndham Namangan (5*)
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Wyndham Namangan");
        b1.setCallbackData("namangan_wyndham");
        row1.add(b1);
        rowlist.add(row1);

        // 2-mehmonxona: Namangan Plaza Hotel (5*)
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Namangan Plaza Hotel");
        b2.setCallbackData("namangan_plaza");
        row2.add(b2);
        rowlist.add(row2);

        // 3-mehmonxona: Afsona Hotel Namangan (4*)
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Afsona Hotel Namangan");
        b3.setCallbackData("namangan_afsona");
        row3.add(b3);
        rowlist.add(row3);

        // 4-mehmonxona: Hotel Namangan Sayyoh (4*)
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Hotel Namangan Sayyoh");
        b4.setCallbackData("namangan_sayyoh");
        row4.add(b4);
        rowlist.add(row4);

        // 5-mehmonxona: Fajr Hotel (3*)
        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Fajr Hotel");
        b5.setCallbackData("namangan_fajr");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return imk;
    }

    public SendMessage samarqand(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Samarqanddagi mehmonxonalar:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        // 1-mehmonxona: Mövenpick Samarkand (5*)
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Mövenpick Samarkand");
        b1.setCallbackData("samarqand_movenpick");
        row1.add(b1);
        rowlist.add(row1);

        // 2-mehmonxona: Silk Road by Minyoun (5*)
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Silk Road by Minyoun");
        b2.setCallbackData("samarqand_minyoun");
        row2.add(b2);
        rowlist.add(row2);

        // 3-mehmonxona: Plaza Hotel Samarkand (4*)
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Plaza Hotel Samarkand");
        b3.setCallbackData("samarqand_plaza");
        row3.add(b3);
        rowlist.add(row3);

        // 4-mehmonxona: Registon Plaza Hotel (4*)
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Registon Plaza Hotel");
        b4.setCallbackData("samarqand_registon");
        row4.add(b4);
        rowlist.add(row4);

        // 5-mehmonxona: Malika Prime Hotel (3*)
        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Malika Prime Hotel");
        b5.setCallbackData("samarqand_malika");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return SM;
    }

    public InlineKeyboardMarkup samarqand1(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Samarqanddagi mehmonxonalar:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        // 1-mehmonxona: Mövenpick Samarkand (5*)
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Mövenpick Samarkand");
        b1.setCallbackData("samarqand_movenpick");
        row1.add(b1);
        rowlist.add(row1);

        // 2-mehmonxona: Silk Road by Minyoun (5*)
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Silk Road by Minyoun");
        b2.setCallbackData("samarqand_minyoun");
        row2.add(b2);
        rowlist.add(row2);

        // 3-mehmonxona: Plaza Hotel Samarkand (4*)
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Plaza Hotel Samarkand");
        b3.setCallbackData("samarqand_plaza");
        row3.add(b3);
        rowlist.add(row3);

        // 4-mehmonxona: Registon Plaza Hotel (4*)
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Registon Plaza Hotel");
        b4.setCallbackData("samarqand_registon");
        row4.add(b4);
        rowlist.add(row4);

        // 5-mehmonxona: Malika Prime Hotel (3*)
        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Malika Prime Hotel");
        b5.setCallbackData("samarqand_malika");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return imk;
    }

    public SendMessage surxondaryo(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Surxondaryo mehmonxonalari:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        // 1-mehmonxona: Grand Termiz Hotel (5*)
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Grand Termiz Hotel");
        b1.setCallbackData("surxondaryo_grandtermiz");
        row1.add(b1);
        rowlist.add(row1);

        // 2-mehmonxona: Silk Road Termiz (5*)
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Silk Road Termiz");
        b2.setCallbackData("surxondaryo_silkroad");
        row2.add(b2);
        rowlist.add(row2);

        // 3-mehmonxona: Termiz Palace Hotel (4*)
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Termiz Palace Hotel");
        b3.setCallbackData("surxondaryo_palace");
        row3.add(b3);
        rowlist.add(row3);

        // 4-mehmonxona: Asson Termiz (4*)
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Asson Termiz");
        b4.setCallbackData("surxondaryo_asson");
        row4.add(b4);
        rowlist.add(row4);

        // 5-mehmonxona: Markaziy Mehmonxona (3*)
        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Markaziy Mehmonxona");
        b5.setCallbackData("surxondaryo_markaziy");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return SM;
    }

    public InlineKeyboardMarkup surxondaryo1(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Surxondaryo mehmonxonalari:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        // 1-mehmonxona: Grand Termiz Hotel (5*)
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Grand Termiz Hotel");
        b1.setCallbackData("surxondaryo_grandtermiz");
        row1.add(b1);
        rowlist.add(row1);

        // 2-mehmonxona: Silk Road Termiz (5*)
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Silk Road Termiz");
        b2.setCallbackData("surxondaryo_silkroad");
        row2.add(b2);
        rowlist.add(row2);

        // 3-mehmonxona: Termiz Palace Hotel (4*)
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Termiz Palace Hotel");
        b3.setCallbackData("surxondaryo_palace");
        row3.add(b3);
        rowlist.add(row3);

        // 4-mehmonxona: Asson Termiz (4*)
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Asson Termiz");
        b4.setCallbackData("surxondaryo_asson");
        row4.add(b4);
        rowlist.add(row4);

        // 5-mehmonxona: Markaziy Mehmonxona (3*)
        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Markaziy Mehmonxona");
        b5.setCallbackData("surxondaryo_markaziy");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return imk;
    }

    public SendMessage sirdaryo(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Sirdaryo viloyati mehmonxonalari:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        // 1-mehmonxona: Grand Hotel Guliston (5*)
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Grand Hotel Guliston");
        b1.setCallbackData("sirdaryo_grand");
        row1.add(b1);
        rowlist.add(row1);

        // 2-mehmonxona: Shodlik Palace Hotel (5*)
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Shodlik Palace Hotel");
        b2.setCallbackData("sirdaryo_shodlik");
        row2.add(b2);
        rowlist.add(row2);

        // 3-mehmonxona: Sirdaryo Hotel (4*)
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Sirdaryo Hotel");
        b3.setCallbackData("sirdaryo_hotel");
        row3.add(b3);
        rowlist.add(row3);

        // 4-mehmonxona: Oasis Hotel Guliston (4*)
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Oasis Hotel Guliston");
        b4.setCallbackData("sirdaryo_oasis");
        row4.add(b4);
        rowlist.add(row4);

        // 5-mehmonxona: Ideal Hotel Guliston (3*)
        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Ideal Hotel Guliston");
        b5.setCallbackData("sirdaryo_ideal");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return SM;
    }

    public InlineKeyboardMarkup sirdaryo1(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Sirdaryo viloyati mehmonxonalari:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        // 1-mehmonxona: Grand Hotel Guliston (5*)
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Grand Hotel Guliston");
        b1.setCallbackData("sirdaryo_grand");
        row1.add(b1);
        rowlist.add(row1);

        // 2-mehmonxona: Shodlik Palace Hotel (5*)
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Shodlik Palace Hotel");
        b2.setCallbackData("sirdaryo_shodlik");
        row2.add(b2);
        rowlist.add(row2);

        // 3-mehmonxona: Sirdaryo Hotel (4*)
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Sirdaryo Hotel");
        b3.setCallbackData("sirdaryo_hotel");
        row3.add(b3);
        rowlist.add(row3);

        // 4-mehmonxona: Oasis Hotel Guliston (4*)
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Oasis Hotel Guliston");
        b4.setCallbackData("sirdaryo_oasis");
        row4.add(b4);
        rowlist.add(row4);

        // 5-mehmonxona: Ideal Hotel Guliston (3*)
        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Ideal Hotel Guliston");
        b5.setCallbackData("sirdaryo_ideal");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return imk;
    }

    public SendMessage fargona(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Farg'ona viloyati mehmonxonalari:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        // 1-mehmonxona: Rixos Kokand (5*)
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Rixos Kokand");
        b1.setCallbackData("fargona_rixos");
        row1.add(b1);
        rowlist.add(row1);

        // 2-mehmonxona: King Premium Hotel Fergana (5*)
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ King Premium Hotel");
        b2.setCallbackData("fargona_king");
        row2.add(b2);
        rowlist.add(row2);

        // 3-mehmonxona: Asia Fergana Hotel (4*)
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Asia Fergana Hotel");
        b3.setCallbackData("fargona_asia");
        row3.add(b3);
        rowlist.add(row3);

        // 4-mehmonxona: Fergana Hotel (4*)
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Fergana Hotel");
        b4.setCallbackData("fargona_hotel");
        row4.add(b4);
        rowlist.add(row4);

        // 5-mehmonxona: Voyage Hotel Fergana (3*)
        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Voyage Hotel Fergana");
        b5.setCallbackData("fargona_voyage");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return SM;
    }

    public InlineKeyboardMarkup fargona1(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Farg'ona viloyati mehmonxonalari:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        // 1-mehmonxona: Rixos Kokand (5*)
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Rixos Kokand");
        b1.setCallbackData("fargona_rixos");
        row1.add(b1);
        rowlist.add(row1);

        // 2-mehmonxona: King Premium Hotel Fergana (5*)
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ King Premium Hotel");
        b2.setCallbackData("fargona_king");
        row2.add(b2);
        rowlist.add(row2);

        // 3-mehmonxona: Asia Fergana Hotel (4*)
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Asia Fergana Hotel");
        b3.setCallbackData("fargona_asia");
        row3.add(b3);
        rowlist.add(row3);

        // 4-mehmonxona: Fergana Hotel (4*)
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Fergana Hotel");
        b4.setCallbackData("fargona_hotel");
        row4.add(b4);
        rowlist.add(row4);

        // 5-mehmonxona: Voyage Hotel Fergana (3*)
        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Voyage Hotel Fergana");
        b5.setCallbackData("fargona_voyage");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return imk;
    }

    public SendMessage xorazm(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Xorazm mehmonxonalari:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        // 1-mehmonxona: Khiva Silk Road Palace (5*)
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Khiva Silk Road Palace");
        b1.setCallbackData("xorazm_silkroad");
        row1.add(b1);
        rowlist.add(row1);

        // 2-mehmonxona: Meros Hotel Khiva (5*)
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Meros Hotel Khiva");
        b2.setCallbackData("xorazm_meros");
        row2.add(b2);
        rowlist.add(row2);

        // 3-mehmonxona: Asia Khiva Hotel (4*)
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Asia Khiva Hotel");
        b3.setCallbackData("xorazm_asia");
        row3.add(b3);
        rowlist.add(row3);

        // 4-mehmonxona: Zarafshon Xiva Hotel (4*)
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Zarafshon Xiva Hotel (Urganch)");
        b4.setCallbackData("xorazm_zarafshon");
        row4.add(b4);
        rowlist.add(row4);

        // 5-mehmonxona: Orient Star Khiva Hotel (3*)
        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Orient Star Khiva");
        b5.setCallbackData("xorazm_orientstar");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return SM;
    }

    public InlineKeyboardMarkup xorazm1(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Xorazm mehmonxonalari:");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        // 1-mehmonxona: Khiva Silk Road Palace (5*)
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⭐️⭐️⭐️⭐️⭐️ Khiva Silk Road Palace");
        b1.setCallbackData("xorazm_silkroad");
        row1.add(b1);
        rowlist.add(row1);

        // 2-mehmonxona: Meros Hotel Khiva (5*)
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("⭐️⭐️⭐️⭐️⭐️ Meros Hotel Khiva");
        b2.setCallbackData("xorazm_meros");
        row2.add(b2);
        rowlist.add(row2);

        // 3-mehmonxona: Asia Khiva Hotel (4*)
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("⭐️⭐️⭐️⭐️ Asia Khiva Hotel");
        b3.setCallbackData("xorazm_asia");
        row3.add(b3);
        rowlist.add(row3);

        // 4-mehmonxona: Zarafshon Xiva Hotel (4*)
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("⭐️⭐️⭐️⭐️ Zarafshon Xiva Hotel (Urganch)");
        b4.setCallbackData("xorazm_zarafshon");
        row4.add(b4);
        rowlist.add(row4);

        // 5-mehmonxona: Orient Star Khiva Hotel (3*)
        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("⭐️⭐️⭐️ Orient Star Khiva");
        b5.setCallbackData("xorazm_orientstar");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return imk;
    }


    //tashkent
    public static SendPhoto hilton(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/c/3439385574/16")); // Rasm URL/ID
        sendPhoto.setCaption(
                "🏢Hilton Tashkent City ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\nAfzalliklar: " +
                        "Markaziy joylashuv, zamonaviy dizayn, hashamatli yopiq basseyn, spa markazi va shahar manzarali Pan-Osiyo tomidagi restoran mavjud. Biznes sayohatlar va dam olish uchun ideal." +
                        "\nNarxi: 300$" +
                        "\nLokatsiya: 1, Ukchi Street, Tashkent"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgatoshkent");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto hyattRegency(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/c/3439385574/17"));
        sendPhoto.setCaption(
                "🏢Hyatt Regency Tashkent ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\nAfzalliklar: " +
                        "Besh yulduzli xizmat, Registon maydoniga yaqin, yopiq basseyn, to'liq xizmat ko'rsatuvchi spa va bir nechta ovqatlanish joylari. Biznes markazlarga qulay." +
                        "\nNarxi: 280$" +
                        "\nLokatsiya: Navoiy ko'chasi 1A, Tashkent"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgatoshkent");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto wyndhamTashkent(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/c/3439385574/18"));
        sendPhoto.setCaption(
                "🏢Wyndham Tashkent ⭐️⭐️⭐️⭐️" +
                        "\n\nAfzalliklar: " +
                        "Chorsu bozoriga yaqin, ochiq basseyn, sauna va fitnes markazi. Klassik interyer va sifatli xizmat ko'rsatish. Turistik joylarga oson yetib borish mumkin." +
                        "\nNarxi: 160$" +
                        "\nLokatsiya: Amir Temur ko'chasi 7/8, Tashkent"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgatoshkent");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto courtyardMarriott(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/c/3439385574/19"));
        sendPhoto.setCaption(
                "🏢Courtyard by Marriott Tashkent ⭐️⭐️⭐️⭐️" +
                        "\n\nAfzalliklar: " +
                        "Marriott sifat standarti, yopiq basseyn va zamonaviy fitnes markazi. Aeroportga yaqin joylashuv va biznes xizmatlarining yuqoriligi." +
                        "\nNarxi: 180$" +
                        "\nLokatsiya: Kichik Xalqa yo'li ko'chasi 70A, Tashkent"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgatoshkent");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto levelHotel(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/c/3439385574/20"));
        sendPhoto.setCaption(
                "🏢Level Hotel and BC ⭐️⭐️⭐️" +
                        "\n\nAfzalliklar: " +
                        "Qulay narxda sifatli xizmat. Zamonaviy xonalar, biznes markaz bilan birlashganligi. Metro bekatiga yaqin. Shahar markazida joylashgan." +
                        "\nNarxi: 90$" +
                        "\nLokatsiya: Shahrisabz ko'chasi, Tashkent"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgatoshkent");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    //andijon
    public static SendPhoto uzbegimAndijon(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/c/3439385574/21"));
        sendPhoto.setCaption(
                "🏢O'zbegim Andijon ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\nAfzalliklar: " +
                        "Hashamatli mehmonxona, milliy uslubdagi interyer, keng xonalar, restoran va anjumanlar zallari. Andijonning eng yaxshi mehmonxonalaridan biri." +
                        "\nNarxi: 120$" +
                        "\nLokatsiya: O'zbegim ko'chasi 11, Andijon"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgaandijon");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto andijonGrand(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/c/3439385574/22"));
        sendPhoto.setCaption(
                "🏢Andijon Grand Hotel ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\nAfzalliklar: " +
                        "Yangi va zamonaviy mehmonxona, ajoyib dizayn, yuqori darajadagi xizmat, spa va yopiq basseyn. Markaziy joylashuvda." +
                        "\nNarxi: 110$" +
                        "\nLokatsiya: Bobur shoh ko'chasi, Andijon"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgaandijon");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto asiaAndijan(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/c/3439385574/23"));
        sendPhoto.setCaption(
                "🏢Asia Andijan Hotel ⭐️⭐️⭐️⭐️" +
                        "\n\nAfzalliklar: " +
                        "Qulay va shinam xonalar, ochiq basseyn, sayyohlar uchun qulay joylashuv. Shahar bo'ylab sayohat qilish uchun a'lo tanlov." +
                        "\nNarxi: 85$" +
                        "\nLokatsiya: Oltinko'l ko'chasi, Andijon"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgaandijon");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto globalStar(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/c/3439385574/24"));
        sendPhoto.setCaption(
                "🏢Global Star Hotel ⭐️⭐️⭐️⭐️" +
                        "\n\nAfzalliklar: " +
                        "Zamonaviy interyer, tinch muhit, xushmuomala xodimlar, to'xtash joyi. Qulaylik va xotirjamlikni qidiruvchilar uchun mos." +
                        "\nNarxi: 80$" +
                        "\nLokatsiya: Mash'al ko'chasi 13, Andijon"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgaandijon");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto hamkorBankHotel(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/c/3439385574/25"));
        sendPhoto.setCaption(
                "🏢Hamkor Bank Hotel ⭐️⭐️⭐️" +
                        "\n\nAfzalliklar: " +
                        "Alohida biznes mehmonxona, qulaylik va tozalik. Biznes sayohatlar uchun zarur bo'lgan barcha sharoitlar mavjud. Narx va sifat mutanosibligi." +
                        "\nNarxi: 65$" +
                        "\nLokatsiya: Hamkor ko'chasi 11, Andijon"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgaandijon");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    //buxoro
    public static SendPhoto wyndhamBukhara(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/c/3439385574/26"));
        sendPhoto.setCaption(
                "🏢 **Wyndham Bukhara** ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Zamonaviy qulayliklarga ega hashamatli mehmonxona, Buxoro aeroportiga yaqin, katta yopiq basseyn, restoran va bar xizmatlari. Biznes va dam olish uchun ajoyib tanlov." +
                        "\n**Narxi:** 140$" +
                        "\n**Lokatsiya:** Buxoro shahri, Mustaqillik ko'chasi"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgabuxoro");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto minoraiKalon(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/c/3439385574/27"));
        sendPhoto.setCaption(
                "🏢 **Minorai Kalon Hotel** ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Tarixiy markazda joylashgan, Buxoroning diqqatga sazovor joylariga yaqin. Milliy uslubdagi interyer, yuqori darajadagi xizmat. Minorai Kalon manzarasi." +
                        "\n**Narxi:** 130$" +
                        "\n**Lokatsiya:** Minorai Kalon ko'chasi, Buxoro"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgabuxoro");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto devonBegi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/3"));
        sendPhoto.setCaption(
                "🏢 **Devon Begi Hotel** ⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Lyabi-Hovuz majmuasiga yaqin joylashgan, an'anaviy Buxoro uslubi, qulay xonalar va mehmonparvar xizmat. Tarixiy muhitni sevuvchilar uchun." +
                        "\n**Narxi:** 95$" +
                        "\n**Lokatsiya:** M. Ikbol ko'chasi 3/3, Buxoro"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgabuxoro");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto omarKhayyam(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/4"));
        sendPhoto.setCaption(
                "🏢 **Omar Khayyam Hotel** ⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Eski shahar markazida, hashamatli xonalar, milliy va Yevropa taomlari restorani. Yuqori sifatli qulayliklar va xizmat ko'rsatish." +
                        "\n**Narxi:** 100$" +
                        "\n**Lokatsiya:** Buxoro shahri, Hofiz Tanish Buxoriy ko'chasi"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgabuxoro");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto sashaSon(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/5"));
        sendPhoto.setCaption(
                "🏢 **Sasha & Son Boutique Hotel** ⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Oilaviy boshqariladigan butik mehmonxona, shinam va xotirjam muhit, a'lo nonushta. Lyabi-Hovuzga yaqinligi bilan sayyohlar e'tiboriga sazovor." +
                        "\n**Narxi:** 75$" +
                        "\n**Lokatsiya:** Lyabi-Hovuz majmuasi yaqinida, Buxoro"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgabuxoro");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    //jizzax
    public static SendPhoto grandHotelZomin(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/6"));
        sendPhoto.setCaption(
                "🏢 **Grand Hotel Zomin** ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Zomin tog'li hududidagi hashamatli dam olish maskani, toza havo, spa xizmatlari, yopiq basseyn. Tabiat manzaralaridan bahra olish uchun ajoyib." +
                        "\n**Narxi:** 150$" +
                        "\n**Lokatsiya:** Zomin tog'li hududi, Jizzax viloyati"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgajizzax");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto silkRoadJizzax(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/7"));
        sendPhoto.setCaption(
                "🏢 **Silk Road Jizzax** ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Yangi va zamonaviy 5 yulduzli mehmonxona, yuqori darajadagi xizmat, konerens zallari. Jizzax shahrining markazida joylashgan." +
                        "\n**Narxi:** 110$" +
                        "\n**Lokatsiya:** Sh. Rashidov shoh ko'chasi, Jizzax"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgajizzax");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto sogdianaHotel(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/8"));
        sendPhoto.setCaption(
                "🏢 **Sogdiana Hotel** ⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Qulay va shinam xonalar, restoran va bar xizmatlari. Shahar markazida bo'lgani uchun qulay transport aloqasi mavjud." +
                        "\n**Narxi:** 75$" +
                        "\n**Lokatsiya:** G'allaorol ko'chasi 34, Jizzax"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgajizzax");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto grandHotelJizzakh(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/9"));
        sendPhoto.setCaption(
                "🏢 **Grand Hotel Jizzakh** ⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Keng xonalar, sifatli nonushta va xushmuomala xodimlar. Biznes safarlar va oilaviy dam olish uchun qulay sharoitlar." +
                        "\n**Narxi:** 80$" +
                        "\n**Lokatsiya:** Mustaqillik ko'chasi, Jizzax"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgajizzax");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto tashkentPlazaJizzax(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/10"));
        sendPhoto.setCaption(
                "🏢 **Tashkent plaza in jizzax** ⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Qulay narxda sifatli xizmat. Zamonaviy xonalar, biznes markaz bilan birlashganligi. Metro bekatiga yaqin. Shahar markazida joylashgan." +
                        "\n**Narxi:** 55$" +
                        "\n**Lokatsiya:** Oybek ko'chasi 14, Jizzax"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgajizzax");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    //qashqadaryo
    public static SendPhoto shahrisabzHotel(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/11"));
        sendPhoto.setCaption(
                "🏢 **Shahrisabz Hotel** ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Shahrisabzning tarixiy markaziga yaqin, hashamatli xonalar, yopiq basseyn va spa markazi. Amir Temurning ona shahridagi ajoyib qulayliklar." +
                        "\n**Narxi:** 130$" +
                        "\n**Lokatsiya:** Ma'rifat ko'chasi, Shahrisabz"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgaqashqadaryo");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto nasafHotel(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/12"));
        sendPhoto.setCaption(
                "🏢 **Nasaf Hotel (Qarshi)** ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Qarshining markazida joylashgan, yuqori darajadagi xizmat, zamonaviy qulayliklar. Biznes va dam olish uchun barcha sharoitlar mavjud." +
                        "\n**Narxi:** 120$" +
                        "\n**Lokatsiya:** Mustaqillik ko'chasi 5, Qarshi"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgaqashqadaryo");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto sultanHotel(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/13"));
        sendPhoto.setCaption(
                "🏢 **Sultan Hotel** ⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Qulay joylashuv, shinam xonalar, restoran va bar xizmatlari. Qarshi shahrining diqqatga sazovor joylariga yaqin." +
                        "\n**Narxi:** 85$" +
                        "\n**Lokatsiya:** Amur Temur ko'chasi, Qarshi"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgaqashqadaryo");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto grandHotelShahrisabz(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/14"));
        sendPhoto.setCaption(
                "🏢 **Grand Hotel Shahrisabz** ⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Keng va yorug' xonalar, a'lo xizmat. Shahrisabzdagi eng yirik mehmonxonalardan biri. Ko'ngilochar joylarga yaqin." +
                        "\n**Narxi:** 90$" +
                        "\n**Lokatsiya:** Islom Karimov ko'chasi, Shahrisabz"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgaqashqadaryo");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto muborakHotel(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/15"));
        sendPhoto.setCaption(
                "🏢 **Muborak Hotel** ⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Qulay narxda xotirjam yashash. Toza va shinam xonalar, xushmuomala xodimlar. Muborak shaharchasining markazida." +
                        "\n**Narxi:** 60$" +
                        "\n**Lokatsiya:** Muborak shaharchasi, Qashqadaryo viloyati"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgaqashqadaryo");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    //navoiy
    public static SendPhoto zarafshonGrand(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/16"));
        sendPhoto.setCaption(
                "🏢 **Zarafshon Grand Hotel** ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Zarafshon shahrida joylashgan hashamatli mehmonxona, katta hovli, zamonaviy qulayliklar. Sanoat va biznes sayohatlari uchun qulay." +
                        "\n**Narxi:** 110$" +
                        "\n**Lokatsiya:** Alisher Navoiy ko'chasi, Zarafshon"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortganavoiy");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto hotelNavoiyPalace(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/17"));
        sendPhoto.setCaption(
                "🏢 **Hotel Navoiy Palace** ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Navoiy shahrining markazida, yuqori darajadagi xizmat, spa va fitnes markazi. Hashamatli interyer va shinam xonalar." +
                        "\n**Narxi:** 105$" +
                        "\n**Lokatsiya:** Navoiy shahar markazi"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortganavoiy");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto silkRoadByNavoi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/20"));
        sendPhoto.setCaption(
                "🏢 **Silk Road by Navoi** ⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Yangi mehmonxona, qulay joylashuv, toza va tartibli xonalar. Xushmuomala xodimlar va a'lo darajadagi nonushta." +
                        "\n**Narxi:** 80$" +
                        "\n**Lokatsiya:** G'alaba shoh ko'chasi 57, Navoiy"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortganavoiy");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto grandStarNavoi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/21"));
        sendPhoto.setCaption(
                "🏢 **Grand Star Navoi** ⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Keng xonalar, zamonaviy jihozlar, restoran va kafe xizmatlari. Shahar markazidagi qulay joylashuv." +
                        "\n**Narxi:** 75$" +
                        "\n**Lokatsiya:** Navoiy shahar markazi, Mustaqillik ko'chasi"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortganavoiy");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto navoiyCityHotel(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/22"));
        sendPhoto.setCaption(
                "🏢 **Navoiy City Hotel** ⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Budjetga mos narxlar, shinam va toza xonalar, bepul avtoturargoh. Sayohatga kam xarajat qilmoqchi bo'lganlar uchun." +
                        "\n**Narxi:** 50$" +
                        "\n**Lokatsiya:** Navoiy shahar, Ipak yo'li ko'chasi"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortganavoiy");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    //namangan
    public static SendPhoto wyndhamNamangan(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/23"));
        sendPhoto.setCaption(
                "🏢 **Wyndham Namangan** ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Namangandagi eng hashamatli mehmonxonalardan biri, zamonaviy dizayn, yuqori sifatli xizmat. Yopiq basseyn va spa markazi mavjud." +
                        "\n**Narxi:** 140$" +
                        "\n**Lokatsiya:** Mustaqillik shoh ko'chasi 14, Namangan"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortganamangan");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto namanganPlaza(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/24"));
        sendPhoto.setCaption(
                "🏢 **Namangan Plaza Hotel** ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Keng va zamonaviy xonalar, restoran, fitnes markazi. Shahar markazidagi qulay joylashuv va bepul avtoturargoh." +
                        "\n**Narxi:** 130$" +
                        "\n**Lokatsiya:** Bobur shoh ko'chasi 2, Namangan"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortganamangan");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto afsonaHotel(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/25"));
        sendPhoto.setCaption(
                "🏢 **Afsona Hotel Namangan** ⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Ochiq basseyn, dam olish maskani, yashil hudud. Oilaviy dam olish uchun juda mos keladi. Qulay narx va sifat mutanosibligi." +
                        "\n**Narxi:** 90$" +
                        "\n**Lokatsiya:** Afsona bog'i yaqinida, Namangan"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortganamangan");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto namanganSayyoh(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/26"));
        sendPhoto.setCaption(
                "🏢 **Hotel Namangan Sayyoh** ⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Sayyohlar uchun qulay joylashuv, shinam xonalar, sifatli milliy taomlar. Shahar markaziga tez yetib borish imkoniyati." +
                        "\n**Narxi:** 85$" +
                        "\n**Lokatsiya:** Mustaqillik shoh ko'chasi, Namangan"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortganamangan");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto fajrHotel(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/27"));
        sendPhoto.setCaption(
                "🏢 **Fajr Hotel** ⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Budjetga mos narxlar, shinam xonalar, qulay joylashuv. Xodimlar xushmuomalaligi va tozaligi bilan ajralib turadi." +
                        "\n**Narxi:** 55$" +
                        "\n**Lokatsiya:** Bobur shoh ko'chasi, Namangan"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortganamangan");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    //samarqand
    public static SendPhoto movenpickSamarkand(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/28"));
        sendPhoto.setCaption(
                "🏢 **Mövenpick Samarkand** ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Yangi 'Silk Road' turizm majmuasida joylashgan, yuqori darajadagi xizmat, spa markazi, yopiq basseyn. Tarixiy obidalarga yaqin." +
                        "\n**Narxi:** 200$" +
                        "\n**Lokatsiya:** 'Silk Road' Turizm Majmuasi, Samarqand"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgasamarqand");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto silkRoadByMinyoun(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/29"));
        sendPhoto.setCaption(
                "🏢 **Silk Road by Minyoun** ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "'Silk Road' majmuasidagi xitoy-o'zbek hamkorlikdagi mehmonxona, hashamatli dizayn, a'lo oshxona. Turizm uchun qulay va zamonaviy." +
                        "\n**Narxi:** 190$" +
                        "\n**Lokatsiya:** 'Silk Road' Turizm Majmuasi, Samarqand"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgasamarqand");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto plazaHotelSamarkand(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/30"));
        sendPhoto.setCaption(
                "🏢 **Plaza Hotel Samarkand** ⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Samarqand markaziga yaqin, qulay narxda zamonaviy xonalar. Restoran va bar xizmatlari. Biznes sayohatlar uchun qulay." +
                        "\n**Narxi:** 110$" +
                        "\n**Lokatsiya:** Beruniy ko'chasi, Samarqand"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgasamarqand");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto registonPlaza(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/31"));
        sendPhoto.setCaption(
                "🏢 **Registon Plaza Hotel** ⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Registon maydoniga yaqin joylashuv, ochiq va yopiq basseynlar, turli milliy va xalqaro taomlar. Qulaylik va tarixiy joylarga yaqinlik." +
                        "\n**Narxi:** 120$" +
                        "\n**Lokatsiya:** Registon ko'chasi 57, Samarqand"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgasamarqand");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto malikaPrime(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/32"));
        sendPhoto.setCaption(
                "🏢 **Malika Prime Hotel** ⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Markaziy joylashuv, Registonga qulay masofada. An'anaviy uslubdagi interyer, shinam xonalar. Sayyohlar uchun iqtisodiy va qulay." +
                        "\n**Narxi:** 70$" +
                        "\n**Lokatsiya:** Bobur ko'chasi 33, Samarqand"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgasamarqand");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    //surxondaryo
    public static SendPhoto grandTermiz(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/33"));
        sendPhoto.setCaption(
                "🏢 **Grand Termiz Hotel** ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Termizdagi eng yirik va hashamatli mehmonxona, zamonaviy qulayliklar, konferensiyalar uchun sharoit. Markaziy Osiyoning janubiy darvozasida joylashgan." +
                        "\n**Narxi:** 110$" +
                        "\n**Lokatsiya:** Mustaqillik ko'chasi, Termiz"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgasurxondaryo");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto silkRoadTermiz(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/34"));
        sendPhoto.setCaption(
                "🏢 **Silk Road Termiz** ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Yangi va yuqori darajadagi mehmonxona, Xitoyning Silk Road brendi ostida. Zamonaviy xonalar, basseyn va spa xizmatlari." +
                        "\n**Narxi:** 105$" +
                        "\n**Lokatsiya:** Termiz shahar markazi"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgasurxondaryo");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto termizPalace(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/35"));
        sendPhoto.setCaption(
                "🏢 **Termiz Palace Hotel** ⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Qulay joylashuv, shinam xonalar, restoran va bar xizmatlari. Shahar markaziga yaqin, qulay transport aloqasi." +
                        "\n**Narxi:** 80$" +
                        "\n**Lokatsiya:** Alisher Navoiy ko'chasi 11, Termiz"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgasurxondaryo");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto assonTermiz(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/36"));
        sendPhoto.setCaption(
                "🏢 **Asson Termiz** ⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Keng xonalar, yaxshi xizmat, toza muhit. Oilaviy dam olish va biznes safarlar uchun mos. Aeroportga qulay masofa." +
                        "\n**Narxi:** 75$" +
                        "\n**Lokatsiya:** Termiz aeroportiga yaqin hudud"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgasurxondaryo");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto markaziyMehmonxonaTermiz(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/37"));
        sendPhoto.setCaption(
                "🏢 **Markaziy Mehmonxona** ⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Budjetga mos narxlar, shahar markazida joylashgan. Qulaylik va tozalik. Boshqa transport vositalariga qulaylik." +
                        "\n**Narxi:** 50$" +
                        "\n**Lokatsiya:** Mustaqillik ko'chasi, Termiz"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgasurxondaryo");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    //sirdaryo
    public static SendPhoto grandHotelGuliston(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/38"));
        sendPhoto.setCaption(
                "🏢 **Grand Hotel Guliston** ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Gulistondagi hashamatli mehmonxona, zamonaviy jihozlar, yopiq basseyn va spa xizmatlari. Biznes sayohatlar uchun yuqori daraja." +
                        "\n**Narxi:** 120$" +
                        "\n**Lokatsiya:** Mustaqillik ko'chasi 18, Guliston"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgasirdaryo");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto shodlikPalace(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/39"));
        sendPhoto.setCaption(
                "🏢 **Shodlik Palace Hotel** ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzarrliklar:** " +
                        "Keng va shinam xonalar, yuqori sifatli xizmat, restoran va tadbirlar o'tkazish zallari. Shahar markazida, qulay joylashuv." +
                        "\n**Narxi:** 115$" +
                        "\n**Lokatsiya:** Shodlik ko'chasi 5, Guliston"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgasirdaryo");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto sirdaryoHotel(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/40"));
        sendPhoto.setCaption(
                "🏢 **Sirdaryo Hotel** ⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Guliston shahrining markazida joylashgan, shinam xonalar, qulay narxlar. Xushmuomala xodimlar va toza muhit." +
                        "\n**Narxi:** 70$" +
                        "\n**Lokatsiya:** Mustaqillik ko'chasi, Guliston"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgasirdaryo");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto oasisHotelGuliston(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/41"));
        sendPhoto.setCaption(
                "🏢 **Oasis Hotel Guliston** ⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Zamonaviy interyer, a'lo darajadagi xizmat. Dam olish va ishlash uchun qulay muhit. Oilaviy safarlar uchun ham mos." +
                        "\n**Narxi:** 75$" +
                        "\n**Lokatsiya:** Alisher Navoiy ko'chasi, Guliston"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgasirdaryo");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto idealHotelGuliston(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/42"));
        sendPhoto.setCaption(
                "🏢 **Ideal Hotel Guliston** ⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Budjetga mos narx, lekin yuqori tozalik va xushmuomalalik. Guliston shahri bo'ylab sayohat qiluvchilar uchun iqtisodiy yechim." +
                        "\n**Narxi:** 55$" +
                        "\n**Lokatsiya:** Guliston shahridagi Asosiy ko'chalardan birida"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgasirdaryo");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    //fargona
    public static SendPhoto rixosKokand(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/43"));
        sendPhoto.setCaption(
                "🏢 **Rixos Kokand** ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Qo'qon shahrida joylashgan hashamatli 5 yulduzli Rixos brendi. Yuqori darajadagi qulayliklar, spa, yopiq basseyn va konferens zallar." +
                        "\n**Narxi:** 180$" +
                        "\n**Lokatsiya:** Qo'qon shahri markazi"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgafargona");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto kingPremiumHotel(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/44"));
        sendPhoto.setCaption(
                "🏢 **King Premium Hotel Fergana** ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Farg'ona shahridagi eng yuqori darajadagi mehmonxona. Hasamatli xonalar, a'lo xizmat. Markaziy joylashuv." +
                        "\n**Narxi:** 140$" +
                        "\n**Lokatsiya:** Farg'ona shahri markazi"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgafargona");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto asiaFergana(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/45"));
        sendPhoto.setCaption(
                "🏢 **Asia Fergana Hotel** ⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "An'anaviy va zamonaviy uslubdagi aralash dizayn, ochiq basseyn, restoran. Sayyohlik joylariga yaqin." +
                        "\n**Narxi:** 90$" +
                        "\n**Lokatsiya:** Al-Farg'oniy ko'chasi 57, Farg'ona"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgafargona");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto ferganaHotel(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/46"));
        sendPhoto.setCaption(
                "🏢 **Fergana Hotel** ⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Qulay va shinam xonalar, tinch muhit, xushmuomala xodimlar. Shahar markazida bo'lib, qulay transport aloqasiga ega." +
                        "\n**Narxi:** 85$" +
                        "\n**Lokatsiya:** Aeroport ko'chasi, Farg'ona"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgafargona");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto voyageHotel(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/47"));
        sendPhoto.setCaption(
                "🏢 **Voyage Hotel Fergana** ⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Budjetga mos narx, toza va tartibli xonalar. Oilaviy va yakkaxon sayohatchilar uchun qulay. Markazga yaqin." +
                        "\n**Narxi:** 60$" +
                        "\n**Lokatsiya:** Mustaqillik shoh ko'chasi, Farg'ona"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgafargona");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    //xorazm
    public static SendPhoto khivaSilkRoadPalace(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/48"));
        sendPhoto.setCaption(
                "🏢 **Khiva Silk Road Palace** ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Ichan Qal'aga yaqin, an'anaviy Xiva uslubi, hashamatli xonalar, yuqori darajadagi xizmat. Tarixiy muhitga sho'ng'ish uchun ideal." +
                        "\n**Narxi:** 130$" +
                        "\n**Lokatsiya:** Polvon Qori ko'chasi, Xiva"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgaxorazm");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto merosHotelKhiva(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/49"));
        sendPhoto.setCaption(
                "🏢 **Meros Hotel Khiva** ⭐️⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Besh yulduzli qulayliklar, ajoyib dizayn, xushmuomala xodimlar. Qadimiy shaharning qulay qismida joylashgan." +
                        "\n**Narxi:** 125$" +
                        "\n**Lokatsiya:** Ichan Qal'a darvozasiga yaqin, Xiva"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgaxorazm");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto asiaKhiva(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/50"));
        sendPhoto.setCaption(
                "🏢 **Asia Khiva Hotel** ⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Klassik sayyohlik mehmonxonasi, katta hovli, ochiq basseyn. Ichan Qal'a devorlaridan tashqarida qulay joylashuv." +
                        "\n**Narxi:** 90$" +
                        "\n**Lokatsiya:** Xiva shahri, Farhod ko'chasi"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgaxorazm");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto zarafshonXiva(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/51"));
        sendPhoto.setCaption(
                "🏢 **Zarafshon Xiva Hotel (Urganch)** ⭐️⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Urganch shahrida joylashgan, Xivaga tez yetib borish imkoniyati. Keng xonalar, biznes uchrashuvlari uchun qulay sharoitlar." +
                        "\n**Narxi:** 85$" +
                        "\n**Lokatsiya:** Urganch shahar markazi"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgaxorazm");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }

    public static SendPhoto orientStarKhiva(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/myhotelphotos/52"));
        sendPhoto.setCaption(
                "🏢 **Orient Star Khiva** ⭐️⭐️⭐️" +
                        "\n\n**Afzalliklar:** " +
                        "Ichan Qal'a ichida joylashgan (sobiq madrasa binosi), noyob me'morchilik, tarixiy muhit. Qulay va iqtisodiy narxlar." +
                        "\n**Narxi:** 70$" +
                        "\n**Lokatsiya:** Ichan Qal'a ichida, Xiva"
        );

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅️ Orqaga");
        b1.setCallbackData("ortgaxorazm");
        row1.add(b1);
        rowlist.add(row1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);
        return sendPhoto;
    }


}