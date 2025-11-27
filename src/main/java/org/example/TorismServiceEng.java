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
        b1.setCallbackData("registonId");
        row1.add(b1);
        rowlist.add(row1);

        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("Shakhi Zinda Complex");
        b2.setCallbackData("shohizindaId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Gur-e Amir Mausoleum");
        b3.setCallbackData("guriamirId");
        row3.add(b3);
        rowlist.add(row3);

        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("Bibi Khanum Mosque");
        b4.setCallbackData("bibixonimId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Ulugbek Observatory");
        b5.setCallbackData("ulugbekrasadxonaId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Afrosiyob Museum");
        b6.setCallbackData("afrosiyobmuzeyId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Hazrat Khizr Mosque");
        b7.setCallbackData("hazratixizrId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Siyob Bazaar");
        b8.setCallbackData("siyobbozorId");
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
        b1.setCallbackData("registonId");
        row1.add(b1);
        rowlist.add(row1);

        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("Shakhi Zinda Complex");
        b2.setCallbackData("shohizindaId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Gur-e Amir Mausoleum");
        b3.setCallbackData("guriamirId");
        row3.add(b3);
        rowlist.add(row3);

        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("Bibi Khanum Mosque");
        b4.setCallbackData("bibixonimId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Ulugbek Observatory");
        b5.setCallbackData("ulugbekrasadxonaId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Afrosiyob Museum");
        b6.setCallbackData("afrosiyobmuzeyId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Hazrat Khizr Mosque");
        b7.setCallbackData("hazratixizrId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Siyob Bazaar");
        b8.setCallbackData("siyobbozorId");
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
    public static SendPhoto engregiston(Long chatId) {
    SendPhoto sendPhoto = new SendPhoto();
    sendPhoto.setChatId(chatId);
    sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/2"));
    sendPhoto.setCaption("The symbol of Samarkand. Home to three famous madrasahs: Ulugbek, Tilya-Kori and Shir-Dor. The largest architectural complex from the era of Amir Timur.");

    InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
    List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
    List<InlineKeyboardButton> row1 = new ArrayList<>();

    InlineKeyboardButton b1 = new InlineKeyboardButton();
    b1.setText("⬅\uFE0F ortga");
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
        b1.setText("⬅\uFE0F ortga");
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
        b1.setText("⬅\uFE0F ortga");
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
        b1.setText("⬅\uFE0F ortga");
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
        b1.setText("⬅\uFE0F ortga");
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
        b1.setText("⬅\uFE0F ortga");
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
        b1.setText("⬅\uFE0F ortga");
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
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("engortgasamarqandId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;
    }




}