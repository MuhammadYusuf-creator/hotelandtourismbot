package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class TorismServiceEng {
    public static InlineKeyboardMarkup engshaharlartourism(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Which place would you like to explore?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton btn = new InlineKeyboardButton();
        btn.setText("Tashkent");
        btn.setCallbackData("engtoshkenttourismId");
        row.add(btn);

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Andijan");
        button.setCallbackData("engandijontourismId");
        row.add(button);
        rowlist.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("Bukhara");
        btn1.setCallbackData("engbuxorotourismId");
        row1.add(btn1);

        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("Jizzakh");
        btn2.setCallbackData("engjizzaxtourismId");
        row1.add(btn2);
        rowlist.add(row1);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("Kashkadarya");
        btn3.setCallbackData("engqashqadaryotourismId");
        row3.add(btn3);

        InlineKeyboardButton btn4 = new InlineKeyboardButton();
        btn4.setText("Navoi");
        btn4.setCallbackData("engnavoiytourismId");
        row3.add(btn4);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton btn5 = new InlineKeyboardButton();
        btn5.setText("Namangan");
        btn5.setCallbackData("engnamangantourismId");
        row4.add(btn5);

        InlineKeyboardButton btn6 = new InlineKeyboardButton();
        btn6.setText("Samarkand");
        btn6.setCallbackData("engSamarqandtourismId");
        row4.add(btn6);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton btn7 = new InlineKeyboardButton();
        btn7.setText("Surkhandarya");
        btn7.setCallbackData("engsurxondaryotourismId");
        row5.add(btn7);

        InlineKeyboardButton btn8 = new InlineKeyboardButton();
        btn8.setText("Sirdarya");
        btn8.setCallbackData("engsirdaryotourismId");
        row5.add(btn8);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton btn9 = new InlineKeyboardButton();
        btn9.setText("Fergana");
        btn9.setCallbackData("engfargonatourismId");
        row6.add(btn9);

        InlineKeyboardButton btn10 = new InlineKeyboardButton();
        btn10.setText("Khorezm");
        btn10.setCallbackData("engxorazmtourismId");
        row6.add(btn10);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b99 = new InlineKeyboardButton();
        b99.setText("⬅️ Back");
        b99.setCallbackData("engortgabigId");
        row7.add(b99);
        rowlist.add(row7);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);

        return imk;
    }

    public static SendMessage engshaharlartourism1(long chatId) {

        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Which place would you like to explore?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton btn = new InlineKeyboardButton();
        btn.setText("Tashkent");
        btn.setCallbackData("engtoshkenttourismId");
        row.add(btn);

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Andijan");
        button.setCallbackData("engandijontourismId");
        row.add(button);
        rowlist.add(row);

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("Bukhara");
        btn1.setCallbackData("engbuxorotourismId");
        row1.add(btn1);

        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("Jizzakh");
        btn2.setCallbackData("engjizzaxtourismId");
        row1.add(btn2);
        rowlist.add(row1);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("Kashkadarya");
        btn3.setCallbackData("engqashqadaryotourismId");
        row3.add(btn3);

        InlineKeyboardButton btn4 = new InlineKeyboardButton();
        btn4.setText("Navoi");
        btn4.setCallbackData("engnavoiytourismId");
        row3.add(btn4);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton btn5 = new InlineKeyboardButton();
        btn5.setText("Namangan");
        btn5.setCallbackData("engnamangantourismId");
        row4.add(btn5);

        InlineKeyboardButton btn6 = new InlineKeyboardButton();
        btn6.setText("Samarkand");
        btn6.setCallbackData("engSamarqandtourismId");
        row4.add(btn6);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton btn7 = new InlineKeyboardButton();
        btn7.setText("Surkhandarya");
        btn7.setCallbackData("engsurxondaryotourismId");
        row5.add(btn7);

        InlineKeyboardButton btn8 = new InlineKeyboardButton();
        btn8.setText("Sirdarya");
        btn8.setCallbackData("engsirdaryotourismId");
        row5.add(btn8);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton btn9 = new InlineKeyboardButton();
        btn9.setText("Fergana");
        btn9.setCallbackData("engfargonatourismId");
        row6.add(btn9);

        InlineKeyboardButton btn10 = new InlineKeyboardButton();
        btn10.setText("Khorezm");
        btn10.setCallbackData("engxorazmtourismId");
        row6.add(btn10);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b99 = new InlineKeyboardButton();
        b99.setText("⬅️ Back");
        b99.setCallbackData("engortgabigId");
        row7.add(b99);
        rowlist.add(row7);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);

        return SM;
    }
//head end

    public static SendMessage engsamarqand(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Which part of Samarkand do you want to visit?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Registan Square");
        b1.setCallbackData("engregistonId");
        row1.add(b1);
        rowlist.add(row1);

        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("Shakhi Zinda Complex");
        b2.setCallbackData("engshohizindaId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Gur-e Amir Mausoleum");
        b3.setCallbackData("engguriamirId");
        row3.add(b3);
        rowlist.add(row3);

        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("Bibi Khanum Mosque");
        b4.setCallbackData("engbibixonimId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Ulugbek Observatory");
        b5.setCallbackData("engulugbekrasadxonaId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Afrosiyob Museum");
        b6.setCallbackData("engafrosiyobmuzeyId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Hazrat Khizr Mosque");
        b7.setCallbackData("enghazratixizrId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Siyob Bazaar");
        b8.setCallbackData("engsiyobbozorId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅️ Back");
        b9.setCallbackData("engortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static InlineKeyboardMarkup engsamarqand1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Which part of Samarkand do you want to visit?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Registan Square");
        b1.setCallbackData("engregistonId");
        row1.add(b1);
        rowlist.add(row1);

        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("Shakhi Zinda Complex");
        b2.setCallbackData("engshohizindaId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Gur-e Amir Mausoleum");
        b3.setCallbackData("engguriamirId");
        row3.add(b3);
        rowlist.add(row3);

        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("Bibi Khanum Mosque");
        b4.setCallbackData("engbibixonimId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Ulugbek Observatory");
        b5.setCallbackData("engulugbekrasadxonaId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Afrosiyob Museum");
        b6.setCallbackData("engafrosiyobmuzeyId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Hazrat Khizr Mosque");
        b7.setCallbackData("enghazratixizrId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Siyob Bazaar");
        b8.setCallbackData("engsiyobbozorId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅️ Back");
        b9.setCallbackData("engortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        return imk;
    }

    public static SendMessage engqashqadaryo(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Which part of Qashqadaryo would you like to explore?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Kitob Geology Reserve");
        b1.setCallbackData("engkitobgeologiyaId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Shahrisabz – Oqsaroy Complex");
        b2.setCallbackData("engoqsaroyId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Dorut-Tilovat Complex");
        b3.setCallbackData("engdoruttilovatId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Dorus-Saodat Complex");
        b4.setCallbackData("engdorussaodatId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Hazrati Bashir Pilgrimage Site");
        b5.setCallbackData("enghazratibashirId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Qarshi Registan");
        b6.setCallbackData("engqarshiregistanId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Yakkabog‘ – Langar Ota Pilgrimage Site");
        b7.setCallbackData("englangarotaId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Kitob Astronomical Observatory");
        b8.setCallbackData("engkitobobservatoriyaId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅️ Back");
        b9.setCallbackData("engortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static InlineKeyboardMarkup engqashqadaryo1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Which part of Qashqadaryo would you like to explore?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Kitob Geology Reserve");
        b1.setCallbackData("engkitobgeologiyaId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Shahrisabz – Oqsaroy Complex");
        b2.setCallbackData("engoqsaroyId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Dorut-Tilovat Complex");
        b3.setCallbackData("engdoruttilovatId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Dorus-Saodat Complex");
        b4.setCallbackData("engdorussaodatId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Hazrati Bashir Pilgrimage Site");
        b5.setCallbackData("enghazratibashirId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Qarshi Registan");
        b6.setCallbackData("engqarshiregistanId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Yakkabog‘ – Langar Ota Pilgrimage Site");
        b7.setCallbackData("englangarotaId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Kitob Astronomical Observatory");
        b8.setCallbackData("engkitobobservatoriyaId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅️ Back");
        b9.setCallbackData("engortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return imk;
    }

    public static SendMessage engsurxandaryo(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Which part of Surxondaryo would you like to explore?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Fayoztepa");
        b1.setCallbackData("engfayoztepaId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Kampirtepa");
        b2.setCallbackData("engkampirtepaId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Al-Hakim Termizi Pilgrimage Site");
        b3.setCallbackData("engalhakimtermiziId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Sayrob Village");
        b4.setCallbackData("engsayrobId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Darband Gorge");
        b5.setCallbackData("engdarbandId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Qumtepa");
        b6.setCallbackData("engqumtepaId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Jarkurgan Minaret");
        b7.setCallbackData("engminorasiId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Fayzulla Khoja Pilgrimage Site");
        b8.setCallbackData("engfayzullaxujaId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅️ Back");
        b9.setCallbackData("engortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static InlineKeyboardMarkup engsurxandaryo1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Which part of Surxondaryo would you like to explore?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Fayoztepa");
        b1.setCallbackData("engfayoztepaId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Kampirtepa");
        b2.setCallbackData("engkampirtepaId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Al-Hakim Termizi Pilgrimage Site");
        b3.setCallbackData("engalhakimtermiziId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Sayrob Village");
        b4.setCallbackData("engsayrobId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Darband Gorge");
        b5.setCallbackData("engdarbandId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Qumtepa");
        b6.setCallbackData("engqumtepaId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Jarkurgan Minaret");
        b7.setCallbackData("engminorasiId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Fayzulla Khoja Pilgrimage Site");
        b8.setCallbackData("engfayzullaxujaId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅️ Back");
        b9.setCallbackData("engortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return imk;
    }

    public static SendMessage engsirdaryo(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Which part of Sirdaryo would you like to explore?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Zarafshon Shore");
        b1.setCallbackData("engzarafshonsohilId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Mirzaobod Village");
        b2.setCallbackData("engmirzaobodId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Shirin Suv Reservoir");
        b3.setCallbackData("engshirinsuvomboriId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Boyovut Village");
        b4.setCallbackData("engboyovutId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Sardoba Reservoir");
        b5.setCallbackData("engsardobaomboriId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Oqoltin Village");
        b6.setCallbackData("engoqoltinId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Historic Mosque in Xovos");
        b7.setCallbackData("engxovostarixmasjidId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Tuyabo‘g‘iz Mountains");
        b8.setCallbackData("engtuyabugiztogId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅️ Back");
        b9.setCallbackData("engortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static InlineKeyboardMarkup engsirdaryo1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Which part of Sirdaryo would you like to explore?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Zarafshon Shore");
        b1.setCallbackData("engzarafshonsohilId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Mirzaobod Village");
        b2.setCallbackData("engmirzaobodId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Shirin Suv Reservoir");
        b3.setCallbackData("engshirinsuvomboriId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Boyovut Village");
        b4.setCallbackData("engboyovutId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Sardoba Reservoir");
        b5.setCallbackData("engsardobaomboriId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Oqoltin Village");
        b6.setCallbackData("engoqoltinId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Historic Mosque in Xovos");
        b7.setCallbackData("engxovostarixmasjidId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Tuyabo‘g‘iz Mountains");
        b8.setCallbackData("engtuyabugiztogId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅️ Back");
        b9.setCallbackData("engortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return imk;
    }

    public static SendMessage engfargona(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Which part of Fergana would you like to explore?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Khan Palace");
        b1.setCallbackData("engxonsaroyiId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Norbutabiy Madrasa");
        b2.setCallbackData("engnorbutabiymadrasaId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Silk Factory and Silk Museum");
        b3.setCallbackData("engipakmuzeyId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Pottery Center");
        b4.setCallbackData("engkulolchilikId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Fergana Botanical Garden");
        b5.setCallbackData("engfargonabotanikaId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Buvayda Historical Mosque and Madrasas");
        b6.setCallbackData("engtarixiybinolarId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("So'x Ancient Roads and Mountain Views");
        b7.setCallbackData("engqadimiyollarId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Oqtepa Pilgrimage Site");
        b8.setCallbackData("engoqtepaziyoratId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅️ Back");
        b9.setCallbackData("engortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static InlineKeyboardMarkup engfargona1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Which part of Fergana would you like to explore?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Khan Palace");
        b1.setCallbackData("engxonsaroyiId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Norbutabiy Madrasa");
        b2.setCallbackData("engnorbutabiymadrasaId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Silk Factory and Silk Museum");
        b3.setCallbackData("engipakmuzeyId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Pottery Center");
        b4.setCallbackData("engkulolchilikId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Fergana Botanical Garden");
        b5.setCallbackData("engfargonabotanikaId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Buvayda Historical Mosque and Madrasas");
        b6.setCallbackData("engtarixiybinolarId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("So'x Ancient Roads and Mountain Views");
        b7.setCallbackData("engqadimiyollarId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Oqtepa Pilgrimage Site");
        b8.setCallbackData("engoqtepaziyoratId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅️ Back");
        b9.setCallbackData("engortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return imk;
    }

    public static SendMessage engxorazm(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Which part of Khorezm would you like to visit?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Ichan-Qal’a");
        b1.setCallbackData("engichanqalaId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Kalta Minor");
        b2.setCallbackData("engkaltaminorId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Pakhlavan Mahmud Mausoleum");
        b3.setCallbackData("engpakhlavanmahmudId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Juma Mosque");
        b4.setCallbackData("engjumamasjidiId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Hazrati Pahlavan Shrine");
        b5.setCallbackData("enghazratipahlavonId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Khorezm Historical Museum");
        b6.setCallbackData("engxorazmmuzeyId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Toshhovli Complex");
        b7.setCallbackData("engtoshhovliId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Islom Khoja Minaret");
        b8.setCallbackData("engislamxojaId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅\uFE0F Back");
        b9.setCallbackData("engortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static InlineKeyboardMarkup engxorazm1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Which part of Khorezm would you like to visit?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Ichan-Qal’a");
        b1.setCallbackData("engichanqalaId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Kalta Minor");
        b2.setCallbackData("engkaltaminorId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Pakhlavan Mahmud Mausoleum");
        b3.setCallbackData("engpakhlavanmahmudId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Juma Mosque");
        b4.setCallbackData("engjumamasjidiId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Hazrati Pahlavon Shrine");
        b5.setCallbackData("enghazratipahlavonId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Khorezm Historical Museum");
        b6.setCallbackData("engxorazmmuzeyId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Toshhovli Complex");
        b7.setCallbackData("engtoshhovliId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Islam Khoja Minaret");
        b8.setCallbackData("engislamxojaId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅\uFE0F Back");
        b9.setCallbackData("engortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return imk;
    }

    public static SendMessage engnamangan(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Which part of Namangan would you like to visit?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Chortoq Sanatorium");
        b1.setCallbackData("engchortoqsanatoriyaId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Chust Do‘ppi Center");
        b2.setCallbackData("engchustdoppiId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Bobur Park");
        b3.setCallbackData("engboburboginamanganId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Axsikent Ruins");
        b4.setCallbackData("engaxsikentId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Qoradaryo Riverside");
        b5.setCallbackData("engqoradaryosohilId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Norin River Retreats");
        b6.setCallbackData("engnorindamId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Uchkurgan Surxontepa");
        b7.setCallbackData("engsurxontepaId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("O‘rxontog‘ (Mountain Views)");
        b8.setCallbackData("engurxontogId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅\uFE0F Back");
        b9.setCallbackData("engortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static InlineKeyboardMarkup enggnamangan1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Which part of Namangan would you like to visit?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Chortoq Sanatorium");
        b1.setCallbackData("engchortoqsanatoriyaId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Chust Do‘ppi Center");
        b2.setCallbackData("engchustdoppiId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Bobur Park");
        b3.setCallbackData("engboburboginamanganId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Axsikent Ruins");
        b4.setCallbackData("engaxsikentId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Qoradaryo Riverside");
        b5.setCallbackData("engqoradaryosohilId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Norin River Retreats");
        b6.setCallbackData("engnorindamId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Uchkurgan Surxontepa");
        b7.setCallbackData("engsurxontepaId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("O‘rxontog‘ (Mountain Views)");
        b8.setCallbackData("engurxontogId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅\uFE0F Back");
        b9.setCallbackData("engortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return imk;
    }

    public static SendMessage engbuxoro(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Where do you want to visit in Bukhara?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Ark Citadel");
        b1.setCallbackData("engarkId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Poi Kalon Complex");
        b2.setCallbackData("engpoikalonId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Labi Hovuz Complex");
        b3.setCallbackData("englabihovuzId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Bolo Hauz Mosque");
        b4.setCallbackData("engbolohauzId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Sitorai Mohi Hossa Palace");
        b5.setCallbackData("sitoraimohixossaId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Chashmai Ayub");
        b6.setCallbackData("engchashmaiayubId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Chor Bakr Necropolis");
        b7.setCallbackData("chorbakrId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Bahouddin Naqshband Shrine");
        b8.setCallbackData("engnaqshbandId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅️ Back");
        b9.setCallbackData("engbackId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static InlineKeyboardMarkup engbuxoro1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Where do you want to visit in Bukhara?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Ark Citadel");
        b1.setCallbackData("engarkId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Poi Kalon Complex");
        b2.setCallbackData("engpoikalonId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Labi Hovuz Complex");
        b3.setCallbackData("englabihovuzId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Bolo Hauz Mosque");
        b4.setCallbackData("engbolohauzId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Sitorai Mohi Hossa Palace");
        b5.setCallbackData("engsitoraimohixossaId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Chashmai Ayub");
        b6.setCallbackData("engchashmaiayubId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Chor Bakr Necropolis");
        b7.setCallbackData("engchorbakrId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Bahouddin Naqshband Shrine");
        b8.setCallbackData("engnaqshbandId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅️ Back");
        b9.setCallbackData("engbackId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return imk;
    }

    public static SendMessage engnavoiy(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Where do you want to visit in Navoiy?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Sarmishsoy Valley");
        b1.setCallbackData("engsarmishsoyId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Mir Said Bahrom Mausoleum");
        b2.setCallbackData("engmirsaidbahromId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Abdullaxon Bandi Fortress");
        b3.setCallbackData("engabdullaxonbandiId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Qiziltepa Desert");
        b4.setCallbackData("engqiziltepaId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Raboti Malik Caravanserai");
        b5.setCallbackData("engrabotimalikId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Chashma Complex");
        b6.setCallbackData("engchashmamajmuaId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Nurota Fortress");
        b7.setCallbackData("engnurotaqalaId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Aydarkul Lake");
        b8.setCallbackData("engaydorkulId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅️ Back");
        b9.setCallbackData("engbackId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static InlineKeyboardMarkup engnavoiy1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Where do you want to visit in Navoiy?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Sarmishsoy Valley");
        b1.setCallbackData("engsarmishsoyId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Mir Said Bahrom Mausoleum");
        b2.setCallbackData("engmirsaidbahromId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Abdullaxon Bandi Fortress");
        b3.setCallbackData("engabdullaxonbandiId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Qiziltepa Desert");
        b4.setCallbackData("engqiziltepaId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Raboti Malik Caravanserai");
        b5.setCallbackData("engrabotimalikId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Chashma Complex");
        b6.setCallbackData("engchashmamajmuaId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Nurota Fortress");
        b7.setCallbackData("engnurotaqalaId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Aydarkul Lake");
        b8.setCallbackData("engaydorkulId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅️ Back");
        b9.setCallbackData("engbackId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return imk;
    }

    public static SendMessage engandijon(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Where do you want to visit in Andijan?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Bobur Garden");
        b1.setCallbackData("engboburbogiandijonId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Jome Mosque");
        b2.setCallbackData("engjomemasjidiandijonId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Babur Memorial Complex");
        b3.setCallbackData("engboburmemorialId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Ancient Andijan Fortress Ruins");
        b4.setCallbackData("engandijonqalaId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("GM Uzbekistan Auto Plant Exhibition Center");
        b5.setCallbackData("enggmuzbekistanId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Andijonsoy Riverside");
        b6.setCallbackData("engandijonsoyId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Khanabad – Resort Area");
        b7.setCallbackData("engxonobodId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Shahrixonsoy Recreation Area");
        b8.setCallbackData("engshahrixonsoyId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅️ Back");
        b9.setCallbackData("engortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static InlineKeyboardMarkup engandijon1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Where do you want to visit in Andijan?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Bobur Garden");
        b1.setCallbackData("engboburbogiandijonId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Jome Mosque");
        b2.setCallbackData("engjomemasjidiandijonId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Bobur Memorial Complex");
        b3.setCallbackData("engboburmemorialId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Ancient Andijan Fortress Ruins");
        b4.setCallbackData("engandijonqalaId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("GM Uzbekistan Car Factory Exhibition Center");
        b5.setCallbackData("enggmuzbekistanId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Andijonsoy Riverbank");
        b6.setCallbackData("engandijonsoyId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Khanabad – Resort Area");
        b7.setCallbackData("engxonobodId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Shahrixonsoy Recreation Areas");
        b8.setCallbackData("engshahrixonsoyId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅️ Back");
        b9.setCallbackData("engortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return imk;
    }

    public static SendMessage engtoshkent(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Where do you want to visit in Tashkent?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Amirsoy Mountain Resort");
        b1.setCallbackData("engamirsoyId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Charvak Reservoir");
        b2.setCallbackData("engcharvakId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Chimgan Mountains");
        b3.setCallbackData("engchimganId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Beldersoy Mountain Resort");
        b4.setCallbackData("engbeldersoyId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("G‘ofur G‘ulom Recreation Area");
        b5.setCallbackData("enggofurgulomId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Solar IQ Solar Power Station");
        b6.setCallbackData("engsolariqId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Kumushkon Mountains");
        b7.setCallbackData("engkumushkonId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Men Valley");
        b8.setCallbackData("engmenvalleyId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅️ Back");
        b9.setCallbackData("engortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static InlineKeyboardMarkup engtoshkent1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Where do you want to visit in Tashkent?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Amirsoy Mountain Resort");
        b1.setCallbackData("engamirsoyId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Charvak Reservoir");
        b2.setCallbackData("engcharvakId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Chimgan Mountains");
        b3.setCallbackData("engchimganId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Beldersoy Mountain Resort");
        b4.setCallbackData("engbeldersoyId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("G‘ofur G‘ulom Recreation Area");
        b5.setCallbackData("enggofurgulomId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Solar IQ Solar Power Station");
        b6.setCallbackData("engsolariqId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Kumushkon Mountains");
        b7.setCallbackData("engkumushkonId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Men Valley");
        b8.setCallbackData("engmenvalleyId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅️ Back");
        b9.setCallbackData("engortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return imk;
    }

    public static SendMessage engjizzax(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Where do you want to visit in Jizzakh?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Zomin National Park");
        b1.setCallbackData("engzominmilliybogiId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Zomin Sanatorium");
        b2.setCallbackData("engzominsanatoriyaId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Orom Recreation Area");
        b3.setCallbackData("engoromId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Forish Mountains");
        b4.setCallbackData("engforishtogId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Arnasoy Lake System");
        b5.setCallbackData("engarnasoykulId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Forestry Area");
        b6.setCallbackData("engurmonxujaligiId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Nurafshon Mosque");
        b7.setCallbackData("engnurafshonmasjidId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Obirahmat Cave");
        b8.setCallbackData("engobirahmatgoriId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅️ Back");
        b9.setCallbackData("engortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static InlineKeyboardMarkup engjizzax1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Where do you want to visit in Jizzakh?");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Zomin National Park");
        b1.setCallbackData("engzominmilliybogiId");
        row1.add(b1);
        rowlist.add(row1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton b2 = new InlineKeyboardButton();
        b2.setText("Zomin Sanatorium");
        b2.setCallbackData("engzominsanatoriyaId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Orom Recreation Area");
        b3.setCallbackData("engoromId");
        row3.add(b3);
        rowlist.add(row3);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton b4 = new InlineKeyboardButton();
        b4.setText("Forish Mountains");
        b4.setCallbackData("forishtogId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Arnasoy Lake System");
        b5.setCallbackData("engarnasoykulId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Forestry Area");
        b6.setCallbackData("engurmonxujaligiId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Nurafshon Mosque");
        b7.setCallbackData("engnurafshonmasjidId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Obirahmat Cave");
        b8.setCallbackData("engobirahmatgoriId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅️ Back");
        b9.setCallbackData("engortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return imk;
    }

//viloyat end
    //placec start
    //samarqand start
    public static SendPhoto engregiston(Long chatId) {
    SendPhoto sendPhoto = new SendPhoto();
    sendPhoto.setChatId(chatId);
    sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/2"));
    sendPhoto.setCaption("The symbol of Samarkand. Home to three famous madrasahs: Ulugbek, Tilya-Kori and Shir-Dor. The largest architectural complex from the era of Amir Timur.");

    InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
    List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
    List<InlineKeyboardButton> row1 = new ArrayList<>();

    InlineKeyboardButton b1 = new InlineKeyboardButton();
    b1.setText("⬅\uFE0F Back");
    b1.setCallbackData("engortgasamarqandId");
    row1.add(b1);
    rowlist.add(row1);

    imk.setKeyboard(rowlist);
    sendPhoto.setReplyMarkup(imk);
    return sendPhoto;
}

    public static SendPhoto enggoriamir(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/3"));
        sendPhoto.setCaption("A mausoleum complex dating from the 11th–19th centuries. Its name translates as 'The Living King'. Famous worldwide for its blue brick decorations.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasamarqandId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;
    }

    public static SendPhoto engshohizinda(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/4"));
        sendPhoto.setCaption("The burial place of Amir Timur, Mirzo Ulugbek and other members of the Timurid dynasty. A gem of Timurid architecture.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasamarqandId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;
    }

    public static SendPhoto engbibixonim(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/5"));
        sendPhoto.setCaption("A large congregational mosque commissioned by Amir Timur. It was one of the largest mosques of its time.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasamarqandId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;
    }

    public static SendPhoto engulugbekras(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/6"));
        sendPhoto.setCaption("An astronomical observatory built by Mirzo Ulugbek in the 15th century. Ulugbek's famous \"Zij\" astronomical tables were created here.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasamarqandId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;
    }

    public static SendPhoto engafrosiyob(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/7"));
        sendPhoto.setCaption("Samarkand's oldest area — artifacts, wall paintings and exhibits from Afrasiyab showcase the ancient city's history.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasamarqandId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;
    }

    public static SendPhoto enghazratihizr(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/8"));
        sendPhoto.setCaption("A very ancient mosque. Located on a beautiful hill with a bright view of the city.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasamarqandId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;
    }

    public static SendPhoto engsiyob(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/9"));
        sendPhoto.setCaption("A historic bazaar selling local sweets, fruits, nuts and souvenirs. One of the most visited places by tourists.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasamarqandId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;
    }
    //samarqand end
    //qashqadaryo start
    public static SendPhoto engkquriqxona(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/11"));
        sendPhoto.setCaption("A unique place where million-year layers of Earth's history are openly visible. It serves as a natural 'textbook' for geologists, students, and tourists.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaqashqadaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engoqsaroy(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/12"));
        sendPhoto.setCaption("Amir Timur's vast palace. It was once the largest palace in Central Asia. Even now, the remnants of its high walls demonstrate its power.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaqashqadaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engdorut(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/13"));
        sendPhoto.setCaption("A religious monument built in the XIV century. Amir Timur's father, Taragay Bahadur, is buried here. A peaceful, spiritual sanctuary.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaqashqadaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engdorus(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/14"));
        sendPhoto.setCaption("An important complex belonging to the Timurid dynasty. Amir Timur's originally planned mausoleum is located here. Architecturally very ancient and historically significant.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaqashqadaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engbashr(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/15"));
        sendPhoto.setCaption("One of the sacred places of Kashkadarya. A quiet and tranquil sanctuary frequently visited by pilgrims, rich in ancient legends.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaqashqadaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engqregiston(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/16"));
        sendPhoto.setCaption("The historic central square of Karshi city. A historical complex consisting of a madrasah, a bathhouse, and old bazaars is located around it.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaqashqadaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto englanagrota(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/17"));
        sendPhoto.setCaption("An ancient and famous pilgrimage site. It includes the Langar Ota mausoleum and mosque. Surrounded by huge plane trees, with a tranquil atmosphere.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaqashqadaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engkastronimik(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/18"));
        sendPhoto.setCaption("A scientific center for astronomers. A place where stellar, planetary, and cosmic observations are conducted. Frequently visited by students and tourists.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaqashqadaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }
    //qashqadaryo end
    //surxondaryo start
    public static SendPhoto engfayoztepa(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/20"));
        sendPhoto.setCaption("A Buddhist temple dating back to the ancient Kushan Empire period. Located near Termez, it is one of the most important monuments discovered by archaeologists.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasurxandaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engkampirtepa(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/21"));
        sendPhoto.setCaption("The ruins of the oldest port city located on the banks of the Amu Darya river. Ancient trade routes passed through here, and many Hellenistic-era finds have been discovered.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasurxandaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engalhakim(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/22"));
        sendPhoto.setCaption("The mausoleum of the famous scholar and mystic Abu Abdullah al-Hakim Termizi. It is one of the most frequently visited holy places by pilgrims.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasurxandaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engsayrob(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/23"));
        sendPhoto.setCaption("A historical village famous for its ancient architectural houses and traditional lifestyle. A vibrant 'museum-village' for tourists.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasurxandaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engdarband(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/24"));
        sendPhoto.setCaption("Famous for its natural gorges, rocky mountain paths, and beautiful views. One of the most popular places for mountain trekking and picnics.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasurxandaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engqumtepa(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/25"));
        sendPhoto.setCaption("An archaeological site where the ruins of an ancient city are located. A historically significant place from the Kushan period.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasurxandaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engjarkurgan(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/26"));
        sendPhoto.setCaption("A unique minaret built in the XI–XII centuries. With its spiral-shaped bricks, it is considered one of the singular architectural monuments in Central Asia.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasurxandaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engfayzullaxoja(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/27"));
        sendPhoto.setCaption("The pilgrimage site of Fayzulla Khoja, one of the local saints. Located in a tranquil area, a place of high religious and spiritual significance.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasurxandaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }
    //surxondaryo end
    //sirdaryo start
    public static SendPhoto engzarafshon(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/29"));
        sendPhoto.setCaption("The banks of the Zarafshan River flowing through Navoiy region, where recreational areas have been established for the local population and tourists.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasirdaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engmirzaobod(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/30"));
        sendPhoto.setCaption("A large settlement located in the Mirzaobod district of Sirdaryo region, considered one of the cultivated areas of Mirzachol (Mirza Steppe).");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasirdaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engshirinsuv(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/31"));
        sendPhoto.setCaption("This name is rarely found in official sources, but may be used in reference to a small artificial lake or water facility elsewhere in Uzbekistan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasirdaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engboyovut(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/32"));
        sendPhoto.setCaption("A town-type settlement and a large associated village that serves as the administrative center of the Boyovut district in Sirdaryo region.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasirdaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engsardobasuv(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/33"));
        sendPhoto.setCaption("A large-capacity water facility built in 2017 in Sirdaryo region, primarily intended for the irrigation of the Mirzachol lands.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasirdaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engoqoltin(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/34"));
        sendPhoto.setCaption("One of the central areas of Oqoltin district, where agriculture, particularly cotton growing, is mainly developed.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasirdaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engxovos(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/35"));
        sendPhoto.setCaption("A mosque located in the Khovos district of Sirdaryo region, significant to the local population due to its ancient architectural style or long history.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasirdaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engtuyabogiz(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/36"));
        sendPhoto.setCaption("Official sources mainly refer to the large Tuyaboʻgʻiz Reservoir (Tashkent Sea) located on the Ohangaron River in Tashkent region; the mountains may refer to the surrounding areas.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgasirdaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    //sirdaryo end
    //fargona start
    public static SendPhoto engxonsaroyi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/38"));
        sendPhoto.setCaption("One of the historical architectural masterpieces of the Fergana Valley. The palace was built in the 19th century, reflecting the life of the rulers of that period, court culture, and national style decorations. The patterns on the interior walls are very rich and beautiful.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgafargonaId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engnorbutabiy(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/39"));
        sendPhoto.setCaption("An ancient madrasah dating back to the 18th century, and one of the most famous religious and educational centers in Fergana. The madrasah architecture is distinctive; its portals and domes have preserved a historical spirit.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgafargonaId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engipakmuzey(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/40"));
        sendPhoto.setCaption("Here, one can see authentic Uzbek sericulture. The entire process, from the initial processing of silk to the final product, is demonstrated. The museum contains information about the history of national Atlas and Adras fabrics.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgafargonaId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engkulolchilik(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/41"));
        sendPhoto.setCaption("The Fergana Valley has been famous for pottery since ancient times. At this center, visitors have the opportunity to observe the work process of craftsmen, watch the preparation of national patterned dishes, and even try their hand at it.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgafargonaId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engfarbotanika(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/42"));
        sendPhoto.setCaption("A large natural area covering a wide territory, containing thousands of plant species. An ideal place for walking, photography, and recreation. Full of rare trees and flowers.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgafargonaId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engbuvaydat(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/43"));
        sendPhoto.setCaption("Buvayda district is famous for its ancient religious buildings. Mosques and madrasahs attract tourists with their past architecture, bricklaying methods, and tranquil atmosphere.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgafargonaId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engsuxqadimiy(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/44"));
        sendPhoto.setCaption("Sokh district is a naturally beautiful area nestled among the mountains. It features ancient villages, mountain paths, waterfalls, and stunning views. The best destination for nature lovers.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgafargonaId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engoqtepaziyorat(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/45"));
        sendPhoto.setCaption("One of the famous pilgrimage sites in Fergana. This place is considered a peaceful, tranquil, and spiritually important sanctuary. Ancient monuments and historical traces are present around it.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgafargonaId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }
    //fargona end
    //xorazm start
    public static SendPhoto engichanqala(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/47"));
        sendPhoto.setCaption("The most famous monument of Khorezm, an ancient fortress and historic city center. A UNESCO World Heritage Site.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaxorazmId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engkaltaminor(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/48"));
        sendPhoto.setCaption("An ancient minaret, famous for its unique mosaic decorations. One of the symbols of the city.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaxorazmId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engpahlavonmahmud(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/49"));
        sendPhoto.setCaption("The mausoleum of the famous Khorezm poet and warrior, Pakhlavan Mahmud, a place of pilgrimage and tourism.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaxorazmId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engjumamasjidi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/50"));
        sendPhoto.setCaption("A historical mosque dating back to the 9th century. Known for its ancient columns and architectural decorations.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaxorazmId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto enghazratipahlavon(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/51"));
        sendPhoto.setCaption("A pilgrimage site and historical monument, visited by many tourists.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaxorazmId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engxmuzeyi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/52"));
        sendPhoto.setCaption("Rich exhibits on the history, archaeology, and ethnography of the region are available.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaxorazmId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engtoshhovli(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/53"));
        sendPhoto.setCaption("A complex of ancient madrasahs and mosques. Important for those interested in architecture and history.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaxorazmId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engislomxoja(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/53"));
        sendPhoto.setCaption("The tallest minaret in Khorezm, famous for offering a high view of the city and the fortress.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaxorazmId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }
    //xorazm end
    //namangan start
    public static SendPhoto engchortoq(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/56"));
        sendPhoto.setCaption("One of the most famous health resorts in Uzbekistan. Many tourists visit for treatment with its mineral waters.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortganamanganId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engchustdoppi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/57"));
        sendPhoto.setCaption("The Chust do'ppi (skullcap) is famous worldwide. Here, one can watch the do'ppi making process and purchase souvenirs.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortganamanganId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engboburbog(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/58"));
        sendPhoto.setCaption("A large, modern, and very beautiful park in the city center. Features many fountains, recreation areas, and scenic views.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortganamanganId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engaksikent(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/59"));
        sendPhoto.setCaption("The ruins of an ancient city near Namangan. A very interesting place for those who love historical journeys.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortganamanganId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engqoradaryo(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/60"));
        sendPhoto.setCaption("Scenic natural views, relaxation, and one of the most famous picnic spots.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortganamanganId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engdamak(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/61"));
        sendPhoto.setCaption("A tranquil and scenic area among the mountains. Frequently visited by tourists who love nature.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortganamanganId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engsurxontepa(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/62"));
        sendPhoto.setCaption("A historical archaeological site. Contains artifacts dating back to ancient times.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortganamanganId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engurxontog(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/63"));
        sendPhoto.setCaption("A tourist destination at the foot of the mountains. Famous for trekking, mountain air, and nature.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortganamanganId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }
    //namangan end
    //buxoro start
    public static SendPhoto engarkqala(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/65"));
        sendPhoto.setCaption("The oldest building in Bukhara, which served as the official residence of the Emirs of Bukhara for thousands of years. It currently functions as a museum.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgabuxoroId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engpoikalon(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/66"));
        sendPhoto.setCaption("Bukhara's central religious complex. It contains the famous Kalyan Minaret (Minorai Kalon), Kalyan Mosque, and Mir-i-Arab Madrasah.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgabuxoroId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto englabihovuz(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/67"));
        sendPhoto.setCaption("A complex built around a large artificial pool that was formerly a green recreation area in Bukhara. It includes the Nodir Devonbegi Madrasah and Khanaka, as well as the Kukeldash Madrasah.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgabuxoroId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engbolohauz(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/68"));
        sendPhoto.setCaption("This mosque without a minaret was the place of prayer for the Emirs. The mosque's richly decorated, wooden-columned aivan (porch) is particularly noteworthy.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgabuxoroId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engsitoramohi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/69"));
        sendPhoto.setCaption("The summer palace of the Emirs of Bukhara. It blends European and Eastern architectural styles and is especially famous for its 'White Hall'.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgabuxoroId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engchashmai(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/70"));
        sendPhoto.setCaption("A structure built over a sacred spring. According to legends, this spring was created by Prophet Ayyub (Job). It is distinguished by its domes built in different periods.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgabuxoroId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engchorbakr(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/71"));
        sendPhoto.setCaption("A large pilgrimage site located near Bukhara. It contains the grave of Shaykh Abu Bakr Sa'd ibn Ya'qub and is of great architectural interest.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgabuxoroId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engbahouddin(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/72"));
        sendPhoto.setCaption("The holy site where Bahauddin Naqshband, the founder of the Naqshbandi order, is buried. This place is one of the most respected pilgrimage sites in the Islamic world.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgabuxoroId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }
    //buxoro end
    //navoiy start
    public static SendPhoto engsarmishsoy(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/74"));
        sendPhoto.setCaption("Sarmishsoy gorge is famous for its ancient rock carvings, a historical area containing thousands of petroglyphs.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortganavoiyId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engmirsaid(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/75"));
        sendPhoto.setCaption("This mausoleum is an ancient architectural monument and is considered the sacred burial place of Mir Said Bahrom.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortganavoiyId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engabdullaqalasi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/76"));
        sendPhoto.setCaption("An ancient defensive fortress built during the time of Abdullah Khan, considered valuable as a historical military structure.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortganavoiyId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engqiziltepa(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/77"));
        sendPhoto.setCaption("A large caravanserai dating back to the Great Silk Road era, a historical complex where merchants rested and camels were kept.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortganavoiyId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engrabotimalik(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/78"));
        sendPhoto.setCaption("A pilgrimage site featuring a natural spring considered sacred, with architectural monuments surrounding it.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortganavoiyId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engnchashma(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/79"));
        sendPhoto.setCaption("A large caravanserai dating back to the Great Silk Road era, a historical complex where merchants rested and camels were kept.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortganavoiyId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engnurotaqala(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/80"));
        sendPhoto.setCaption("An ancient fortress in the city of Nurata, dating back to the time of Alexander the Great. Built on high ground overlooking the city.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortganavoiyId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engaydarkol(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/81"));
        sendPhoto.setCaption("Aidarkul is a vast and tranquil artificial lake, a popular spot for relaxation, fishing, and enjoying nature.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortganavoiyId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }
    //navoiy end
    //andijon start
    public static SendPhoto engaboburbogi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/83"));
        sendPhoto.setCaption("A large recreation park dedicated to the memory of Zahiriddin Babur, featuring natural beauty and a tranquil atmosphere.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaandijonId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engajomemasjidi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/84"));
        sendPhoto.setCaption("The central Jome Mosque of Andijan, distinguished by its historical architecture and religious ambiance.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaandijonId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engboburmemorial(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/85"));
        sendPhoto.setCaption("A memorial complex dedicated to Babur's life and legacy, famous for its museum and historical exhibits.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaandijonId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engandijonqala(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/86"));
        sendPhoto.setCaption("An area containing ancient fortress walls and archaeological traces that recount the city's history.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaandijonId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto enggmuzb(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/87"));
        sendPhoto.setCaption("A demonstration center for new car models and technologies manufactured in Uzbekistan (GM Uzbekistan).");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaandijonId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engandijonsoy(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/88"));
        sendPhoto.setCaption("One of the city's most beautiful walking areas, a convenient location for relaxing and photoshoots along the riverbank.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaandijonId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engxonobod(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/89"));
        sendPhoto.setCaption("A sanatorium area famous for its clean air, healing landscapes, and recreational facilities.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaandijonId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engshahrixonsoy(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/90"));
        sendPhoto.setCaption("Recreational areas amidst nature, an ideal place for family relaxation and picnics.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgaandijonId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }
    //andijon end
    //toshkent start
    public static SendPhoto engamirsoy(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/92"));
        sendPhoto.setCaption("One of the most modern mountain resorts in Uzbekistan. Ideal for skiing in winter and recreation in summer.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgatoshkentId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engchorvoq(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/93"));
        sendPhoto.setCaption("A famous recreational area known for its large reservoir with blue water and the surrounding mountains.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgatoshkentId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engchimyon(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/94"));
        sendPhoto.setCaption("A mountain region famous for its nature, clean air, and hiking trails.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgatoshkentId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engbildirsoy(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/95"));
        sendPhoto.setCaption("A mountain resort known for its ski slopes and natural landscapes.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgatoshkentId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto enggofurgulom(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/96"));
        sendPhoto.setCaption("A recreational area located amidst nature, convenient for families and children.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgatoshkentId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engsolariq(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/97"));
        sendPhoto.setCaption("A major solar energy project that generates eco-friendly electricity.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgatoshkentId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engkumushkon(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/98"));
        sendPhoto.setCaption("An area known for its peaceful nature, mountain trails, and clean air.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgatoshkentId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engmenvalley(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/99"));
        sendPhoto.setCaption("A modern and aesthetically pleasing visual location, a popular place for photoshoots and relaxation.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgatoshkentId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }
    //toshkent end
    //jizzax start
    public static SendPhoto engzominmilliybog(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/100"));
        sendPhoto.setCaption("The most modern mountain resort in Uzbekistan, an excellent place for skiing and snowboarding in winter, and recreation in summer.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgajizzaxId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engzominsanatoriya(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/101"));
        sendPhoto.setCaption("A popular spot for picnics and water sports, known for its large blue-water reservoir.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgajizzaxId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engorom(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/102"));
        sendPhoto.setCaption("A beautiful natural mountain area, the most frequently visited for hiking and recreation.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgajizzaxId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engforish(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/103"));
        sendPhoto.setCaption("Known for its ski slopes, cable car routes, and peaceful relaxation areas.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgajizzaxId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engarnasoy(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/104"));
        sendPhoto.setCaption("A recreational area amidst nature, suitable for family outings.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgajizzaxId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engormanxojaligi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/105"));
        sendPhoto.setCaption("One of the major technological projects generating electricity from solar energy.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgajizzaxId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engnurafshonmasjid(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/106"));
        sendPhoto.setCaption("A mountain complex with peaceful, tranquil, and pristine nature.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgajizzaxId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto engobirahmatgori(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/107"));
        sendPhoto.setCaption("A scenic valley with modern design, popular for photos and content creation.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F Back");
        b1.setCallbackData("engortgajizzaxId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }
    //jizzax end




}