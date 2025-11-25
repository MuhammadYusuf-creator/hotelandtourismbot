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

    public SendMessage menu1(long chatId) {
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

    public InlineKeyboardMarkup toshkent(long chatId){
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

    public SendMessage andijon(long chatId){
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

    public SendMessage buxoro(long chatId){
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

    public SendMessage jizzax(long chatId){
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

    public SendMessage qashqadaryo(long chatId){
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

    public SendMessage navoiy(long chatId){
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

    public SendMessage namangan(long chatId){
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

    public SendMessage samarqand(long chatId){
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

    public SendMessage surxondaryo(long chatId){
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Surxondaryo (Termiz) mehmonxonalari:");

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

    public SendMessage sirdaryo(long chatId){
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Sirdaryo viloyati (Guliston) mehmonxonalari:");

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

    public SendMessage fargona(long chatId){
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

    public SendMessage xorazm(long chatId){
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Xorazm (Xiva/Urganch) mehmonxonalari:");

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
        b5.setText("⭐️⭐️⭐️ Orient Star Khiva (Madrasa)");
        b5.setCallbackData("xorazm_orientstar");
        row5.add(b5);
        rowlist.add(row5);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return SM;
    }

}
