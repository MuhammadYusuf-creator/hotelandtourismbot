package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class Tourismservice {




    public InlineKeyboardMarkup shaharlartourism(long chatId) {
        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Qayerni aylanmoqchisiz");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton btn = new InlineKeyboardButton();
        btn.setText("Toshkent");
        btn.setCallbackData("toshkenttourismId");
        row.add(btn);

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Andijon");
        button.setCallbackData("andijontourismId");
        row.add(button);
        rowlist.add(row);


        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("Buxoro");
        btn1.setCallbackData("buxorotourismId");
        row1.add(btn1);

        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("Jizzax");
        btn2.setCallbackData("jizzaxtourismId");
        row1.add(btn2);
        rowlist.add(row1);


        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("Qashqadaryo");
        btn3.setCallbackData("qashqadaryotourismId");
        row3.add(btn3);

        InlineKeyboardButton btn4 = new InlineKeyboardButton();
        btn4.setText("Navoiy");
        btn4.setCallbackData("navoiytourismId");
        row3.add(btn4);
        rowlist.add(row3);


        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton btn5 = new InlineKeyboardButton();
        btn5.setText("Namangan");
        btn5.setCallbackData("namangantourismId");
        row4.add(btn5);

        InlineKeyboardButton btn6 = new InlineKeyboardButton();
        btn6.setText("Samarqand");
        btn6.setCallbackData("SamarqandtourismId");
        row4.add(btn6);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton btn7 = new InlineKeyboardButton();
        btn7.setText("Surxondaryo");
        btn7.setCallbackData("surxondaryotourismId");
        row5.add(btn7);

        InlineKeyboardButton btn8 = new InlineKeyboardButton();
        btn8.setText("Sirdaryo");
        btn8.setCallbackData("sirdaryotourismId");
        row5.add(btn8);
        rowlist.add(row5);


        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton btn9 = new InlineKeyboardButton();
        btn9.setText("Farg'ona");
        btn9.setCallbackData("fargonatourismId");
        row6.add(btn9);

        InlineKeyboardButton btn10 = new InlineKeyboardButton();
        btn10.setText("Xorazm");
        btn10.setCallbackData("xorazmtourismId");
        row6.add(btn10);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b99 = new InlineKeyboardButton();
        b99.setText("⬅\uFE0F Ortga");
        b99.setCallbackData("ortgabigId");
        row7.add(b99);
        rowlist.add(row7);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);

        return imk;
    }
    public SendMessage shaharlartourism1(long chatId) {

        SendMessage SM = new SendMessage();
        SM.setChatId(chatId);
        SM.setText("Qayerni aylanmoqchisiz");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton btn = new InlineKeyboardButton();
        btn.setText("Toshkent");
        btn.setCallbackData("toshkenttourismId");
        row.add(btn);

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Andijon");
        button.setCallbackData("andijontourismId");
        row.add(button);
        rowlist.add(row);


        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("Buxoro");
        btn1.setCallbackData("buxorotourismId");
        row1.add(btn1);

        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("Jizzax");
        btn2.setCallbackData("jizzaxtourismId");
        row1.add(btn2);
        rowlist.add(row1);


        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("Qashqadaryo");
        btn3.setCallbackData("qashqadaryotourismId");
        row3.add(btn3);

        InlineKeyboardButton btn4 = new InlineKeyboardButton();
        btn4.setText("Navoiy");
        btn4.setCallbackData("navoiytourismId");
        row3.add(btn4);
        rowlist.add(row3);


        List<InlineKeyboardButton> row4 = new ArrayList<>();
        InlineKeyboardButton btn5 = new InlineKeyboardButton();
        btn5.setText("Namangan");
        btn5.setCallbackData("namangantourismId");
        row4.add(btn5);

        InlineKeyboardButton btn6 = new InlineKeyboardButton();
        btn6.setText("Samarqand");
        btn6.setCallbackData("SamarqandtourismId");
        row4.add(btn6);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton btn7 = new InlineKeyboardButton();
        btn7.setText("Surxondaryo");
        btn7.setCallbackData("surxondaryotourismId");
        row5.add(btn7);

        InlineKeyboardButton btn8 = new InlineKeyboardButton();
        btn8.setText("Sirdaryo");
        btn8.setCallbackData("sirdaryotourismId");
        row5.add(btn8);
        rowlist.add(row5);


        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton btn9 = new InlineKeyboardButton();
        btn9.setText("Farg'ona");
        btn9.setCallbackData("fargonatourismId");
        row6.add(btn9);

        InlineKeyboardButton btn10 = new InlineKeyboardButton();
        btn10.setText("Xorazm");
        btn10.setCallbackData("xorazmtourismId");
        row6.add(btn10);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b99 = new InlineKeyboardButton();
        b99.setText("⬅\uFE0F Ortga");
        b99.setCallbackData("ortgabigId");
        row7.add(b99);
        rowlist.add(row7);

        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);

        return SM;
    }

    //head tugadi

    public static SendMessage samarqand(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("samarqandni qaayerini aylanmoqchisiz");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Registon maydoni");
        b1.setCallbackData("registonId");
        row1.add(b1);
        rowlist.add(row1);

        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("Shohi Zinda majmuasi");
        b2.setCallbackData("shohizindaId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Go‘ri Amir maqbarasi");
        b3.setCallbackData("guriamirId");
        row3.add(b3);
        rowlist.add(row3);

        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("Bibi Xonim masjidi");
        b4.setCallbackData("bibixonimId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Ulug‘bek rasadxonasi");
        b5.setCallbackData("ulugbekrasadxonaId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Afrosiyob muzeyi");
        b6.setCallbackData("afrosiyobmuzeyId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Hazrati Xizr masjidi");
        b7.setCallbackData("hazratixizrId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Siyob bozori");
        b8.setCallbackData("siyobbozorId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅\uFE0F Ortga");
        b9.setCallbackData("ortgaId");
        row9.add(b9);
        rowlist.add(row9);



        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }
    public static InlineKeyboardMarkup samarqand1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("samarqandni qaayerini aylanmoqchisiz");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Registon maydoni");
        b1.setCallbackData("registonId");
        row1.add(b1);
        rowlist.add(row1);

        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("Shohi Zinda majmuasi");
        b2.setCallbackData("shohizindaId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Go‘ri Amir maqbarasi");
        b3.setCallbackData("guriamirId");
        row3.add(b3);
        rowlist.add(row3);

        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("Bibi Xonim masjidi");
        b4.setCallbackData("bibixonimId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Ulug‘bek rasadxonasi");
        b5.setCallbackData("ulugbekrasadxonaId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Afrosiyob muzeyi");
        b6.setCallbackData("afrosiyobmuzeyId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Hazrati Xizr masjidi");
        b7.setCallbackData("hazratixizrId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Siyob bozori");
        b8.setCallbackData("siyobbozorId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅\uFE0F Ortga");
        b9.setCallbackData("ortgaId");
        row9.add(b9);
        rowlist.add(row9);



        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return imk;
    }

    public static SendMessage qashqadaryo(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("qashqadaryoni qaayerini aylanmoqchisiz");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Kitob Geologiya Qo‘riqxonasi");
        b1.setCallbackData("kitobgeologiyaId");
        row1.add(b1);
        rowlist.add(row1);

        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("Shahrisabz – Oqsaroy Majmuasi");
        b2.setCallbackData("oqsaroyId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Dorut-Tilovat Majmuasi");
        b3.setCallbackData("doruttilovatId");
        row3.add(b3);
        rowlist.add(row3);

        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("Dorus-Saodat Majmuasi");
        b4.setCallbackData("dorussaodatId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Hazrati Bashir Ziyoratgohi");
        b5.setCallbackData("hazratibashirId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Qarshi Registani");
        b6.setCallbackData("qarshiregistanId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Yakkabog‘ – Langar Ota Ziyoratgohi");
        b7.setCallbackData("langarotaId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Kitob Astronomik Observatoriyasi");
        b8.setCallbackData("kitobobservatoriyaId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅\uFE0F Ortga");
        b9.setCallbackData("ortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static SendMessage surxandaryo(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("surxandaryoni qaayerini aylanmoqchisiz");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Fayoztepa");
        b1.setCallbackData("fayoztepaId");
        row1.add(b1);
        rowlist.add(row1);

        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("Kampirtepa");
        b2.setCallbackData("kampirtepaId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Al-Hakim Termizi Ziyoratgohi");
        b3.setCallbackData("alhakimtermiziId");
        row3.add(b3);
        rowlist.add(row3);

        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("Sayrob Qishlog‘i");
        b4.setCallbackData("sayrobId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Darband Darasi");
        b5.setCallbackData("darbandId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Qumtepa");
        b6.setCallbackData("qumtepaId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Jarkurgan Minorasi");
        b7.setCallbackData("minorasiId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Fayzulla Xo‘ja Ziyoratgohi");
        b8.setCallbackData("fayzullaxujaId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅\uFE0F Ortga");
        b9.setCallbackData("ortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static SendMessage sirdaryo(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("sirdaryoni qaayerini aylanmoqchisiz");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Zarafshon Sohili");
        b1.setCallbackData("zarafshonsohilId");
        row1.add(b1);
        rowlist.add(row1);

        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("Mirzaobod Qishlog‘i");
        b2.setCallbackData("mirzaobodId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Shirin Suv Ombori");
        b3.setCallbackData("shirinsuvomboriId");
        row3.add(b3);
        rowlist.add(row3);

        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("Boyovut Qishlog‘i");
        b4.setCallbackData("boyovutId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Sardoba Suv Ombori");
        b5.setCallbackData("sardobaomboriId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Oqoltin Qishlog‘i");
        b6.setCallbackData("oqoltinId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Xovosdagi tarixiy masjid");
        b7.setCallbackData("xovostarixmasjidId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Tuyabo‘g‘iz tog‘lari");
        b8.setCallbackData("tuyabugiztogId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅\uFE0F Ortga");
        b9.setCallbackData("ortgaId");
        row9.add(b9);
        rowlist.add(row9);


        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static SendMessage fargona(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("fargonani qaayerini aylanmoqchisiz");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Xon saroyi");
        b1.setCallbackData("xonsaroyiId");
        row1.add(b1);
        rowlist.add(row1);

        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("Norbutabiy madrasasi");
        b2.setCallbackData("norbutabiymadrasaId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Ipak Fabrikasi va Ipak Muzeyi");
        b3.setCallbackData("ipakmuzeyId");
        row3.add(b3);
        rowlist.add(row3);

        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("Kulolchilik Markazi");
        b4.setCallbackData("kulolchilikId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Farg‘ona Botanika Bog‘i");
        b5.setCallbackData("fargonabotanikaId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Buvayda Tarixiy masjid va madrasalar");
        b6.setCallbackData("tarixiybinolarId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("So'x Qadimiy qadimiy yo‘llar va tog‘ manzaralari");
        b7.setCallbackData("qadimiyollarId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Oqtepa Ziyoratgohi");
        b8.setCallbackData("oqtepaziyoratId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅\uFE0F Ortga");
        b9.setCallbackData("ortgaId");
        row9.add(b9);
        rowlist.add(row9);


        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static SendMessage xorazm(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("xorazmni qaayerini aylanmoqchisiz");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Ichan-Qal’a");
        b1.setCallbackData("ichanqalaId");
        row1.add(b1);
        rowlist.add(row1);

        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("Kalta Minor");
        b2.setCallbackData("kaltaminorId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Pakhlavan Mahmud maqbarasi");
        b3.setCallbackData("pakhlavanmahmudId");
        row3.add(b3);
        rowlist.add(row3);

        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("Juma Masjidi");
        b4.setCallbackData("jumamasjidiId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Hazrati Pahlavon Ziyoratgohi");
        b5.setCallbackData("hazratipahlavonId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Xorazm Tarixiy Muzeyi");
        b6.setCallbackData("xorazmmuzeyId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Toshhovli Majmuasi");
        b7.setCallbackData("toshhovliId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Islam Khoja Minorasi");
        b8.setCallbackData("islamxojaId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅\uFE0F Ortga");
        b9.setCallbackData("ortgaId");
        row9.add(b9);
        rowlist.add(row9);


        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static SendMessage namangan(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("namanganni qaayerini aylanmoqchisiz");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Chortoq Sanatoriyasi");
        b1.setCallbackData("chortoqsanatoriyaId");
        row1.add(b1);
        rowlist.add(row1);

        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("Chust Do‘ppilar Markazi");
        b2.setCallbackData("chustdoppiId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Bobur Bog‘i");
        b3.setCallbackData("boburboginamanganId");
        row3.add(b3);
        rowlist.add(row3);

        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("Axsikent Xarobalari");
        b4.setCallbackData("axsikentId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Qoradaryo Sohili");
        b5.setCallbackData("qoradaryosohilId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Norin Bo‘yidagi Damak Maskanlari");
        b6.setCallbackData("norindamId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Uchkurgan Surxontepa");
        b7.setCallbackData("surxontepaId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("O‘rxontog‘ (Tog‘ manzaralari)");
        b8.setCallbackData("urxontogId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅\uFE0F Ortga");
        b9.setCallbackData("ortgaId");
        row9.add(b9);
        rowlist.add(row9);


        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static SendMessage buxoro(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("buxoroni qaayerini aylanmoqchisiz");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Ark Qal’asi");
        b1.setCallbackData("arkqalaId");
        row1.add(b1);
        rowlist.add(row1);

        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("Po‘i Kalon Majmuasi");
        b2.setCallbackData("poikolonId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Labi Hovuz Majmuasi");
        b3.setCallbackData("labihovuzId");
        row3.add(b3);
        rowlist.add(row3);

        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("Bolo Hauz Masjidi");
        b4.setCallbackData("bolohauzId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Sitorai Mohi Xossa Saroyi");
        b5.setCallbackData("sitoraimohixossaId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Chashmai Ayub");
        b6.setCallbackData("chashmaiayubId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Chor Bakr Nekropol");
        b7.setCallbackData("chorbakrId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Bahouddin Naqshband Ziyoratgohi");
        b8.setCallbackData("naqshbandId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅\uFE0F Ortga");
        b9.setCallbackData("ortgaId");
        row9.add(b9);
        rowlist.add(row9);


        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static SendMessage navoiy(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("navoiyni qaayerini aylanmoqchisiz");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Sarmishsoy Darasi");
        b1.setCallbackData("sarmishsoyId");
        row1.add(b1);
        rowlist.add(row1);

        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("Mir Said Bahrom Maqbarasi");
        b2.setCallbackData("mirsaidbahromId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Abdullaxon Bandining Qal’asi");
        b3.setCallbackData("abdullaxonbandiId");
        row3.add(b3);
        rowlist.add(row3);

        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("Qiziltepa Cho‘llari");
        b4.setCallbackData("qiziltepaId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Raboti Malik Karvonsaroyi");
        b5.setCallbackData("rabotimalikId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Chashma Majmuasi");
        b6.setCallbackData("chashmamajmuaId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Nurota Qal’asi");
        b7.setCallbackData("nurotaqalaId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Aydarko‘l Ko‘li");
        b8.setCallbackData("aydorkulId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅\uFE0F Ortga");
        b9.setCallbackData("ortgaId");
        row9.add(b9);
        rowlist.add(row9);


        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static SendMessage andijon(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("andijonni qaayerini aylanmoqchisiz");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Bobur Bog‘i");
        b1.setCallbackData("boburbogiandijonId");
        row1.add(b1);
        rowlist.add(row1);

        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("jome masjidi");
        b2.setCallbackData("jomemasjidiandijonId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Bobur Nomidagi Memorial Majmua");
        b3.setCallbackData("boburmemorialId");
        row3.add(b3);
        rowlist.add(row3);

        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("Qadimiy Andijon qal’asi qoldiqlari");
        b4.setCallbackData("andijonqalaId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("GM Uzbekistan Avtozavodi ko‘rgazma markazi");
        b5.setCallbackData("gmuzbekistanId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Andijonsoy Sohili");
        b6.setCallbackData("andijonsoyId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Xonobod – Kurort hududi");
        b7.setCallbackData("xonobodId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Shahrixonsoy Dam olish maskanlari");
        b8.setCallbackData("shahrixonsoyId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅\uFE0F Ortga");
        b9.setCallbackData("ortgaId");
        row9.add(b9);
        rowlist.add(row9);


        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static SendMessage toshkent(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("toshkenterini aylanmoqchisiz");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Amirsoy Mountain Resort");
        b1.setCallbackData("amirsoyId");
        row1.add(b1);
        rowlist.add(row1);

        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("Charvak Suv Ombori");
        b2.setCallbackData("charvakId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Chimgan Tog‘lari");
        b3.setCallbackData("chimganId");
        row3.add(b3);
        rowlist.add(row3);

        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("Beldersoy Tog‘ Kurorti");
        b4.setCallbackData("beldersoyId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("GG‘ofur G‘ulom nomidagi dam olish maskani");
        b5.setCallbackData("gofurgulomId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("Solar IQ Quyosh Elektr Stansiyasi");
        b6.setCallbackData("solariqId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Kumushkon tog‘lari");
        b7.setCallbackData("kumushkonId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("“Men Valley”");
        b8.setCallbackData("menvalleyId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅\uFE0F Ortga");
        b9.setCallbackData("ortgaId");
        row9.add(b9);
        rowlist.add(row9);


        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }

    public static SendMessage jizzax(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("jizzaxni aylanmoqchisiz");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("Zomin Milliy Bog‘i");
        b1.setCallbackData("zominmilliybogiId");
        row1.add(b1);
        rowlist.add(row1);

        InlineKeyboardButton b2 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        b2.setText("Zomin Sanatoriysi");
        b2.setCallbackData("zominsanatoriyaId");
        row2.add(b2);
        rowlist.add(row2);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton b3 = new InlineKeyboardButton();
        b3.setText("Orom” Dam Olish Maskani");
        b3.setCallbackData("oromId");
        row3.add(b3);
        rowlist.add(row3);

        InlineKeyboardButton b4 = new InlineKeyboardButton();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        b4.setText("Forish Tog‘lari");
        b4.setCallbackData("forishtogId");
        row4.add(b4);
        rowlist.add(row4);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        InlineKeyboardButton b5 = new InlineKeyboardButton();
        b5.setText("Arnasoy Ko‘l Tizimi");
        b5.setCallbackData("arnasoykulId");
        row5.add(b5);
        rowlist.add(row5);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        InlineKeyboardButton b6 = new InlineKeyboardButton();
        b6.setText("O‘rmon Xo‘jaligi hududi");
        b6.setCallbackData("urmonxujaligiId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Nurafshon Masjidi");
        b7.setCallbackData("nurafshonmasjidId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("“Obirahmat G‘ori”");
        b8.setCallbackData("obirahmatgoriId");
        row8.add(b8);
        rowlist.add(row8);

        List<InlineKeyboardButton> row9 = new ArrayList<>();
        InlineKeyboardButton b9 = new InlineKeyboardButton();
        b9.setText("⬅\uFE0F Ortga");
        b9.setCallbackData("ortgaId");
        row9.add(b9);
        rowlist.add(row9);

        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }
// viloyat tugad
//samarqand placec
    public static SendPhoto registon(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/2"));
        sendPhoto.setCaption("Samarqandning ramzi. Uchta mashhur madrasa: Ulug‘bek, Tilakori va Shir-Dor madrasalari joylashgan. Amir Temur davridagi eng ulkan me’moriy majmua.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasamarqandId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;


    }

    public static SendPhoto goriamir(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/3"));
        sendPhoto.setCaption("XI–XIX asrlarga oid maqbaralar majmuasi. “Tirik shoh” deb tarjima qilinadi. Ko‘k g‘ishtli naqshlari bilan dunyoga mashhur.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasamarqandId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;
    }

    public static SendPhoto shohizinda(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/4"));
        sendPhoto.setCaption("Amir Temur, Mirzo Ulug‘bek va Temuriylar sulolasining boshqa vakillari dafn etilgan. Temuriylar me’morchiligining durdonasi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasamarqandId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;
    }

    public static SendPhoto bibixonim(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/5"));
        sendPhoto.setCaption("Amir Temur tomonidan qurdirilgan ulkan jome masjidi. O‘sha davrning eng katta masjidlaridan biri bo‘lgan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasamarqandId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;
    }

    public static SendPhoto ulugbekras(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/6"));
        sendPhoto.setCaption("XV asrda Mirzo Ulug‘bek tomonidan qurilgan astronomik rasadxona. Ulug‘bekning mashhur \"Zij\" astronomik jadvali shu yerda yaratilgan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasamarqandId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;
    }

    public static SendPhoto afrosiyob(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/7"));
        sendPhoto.setCaption("Samarqandning eng qadimgi hududi — Afrosiyobdan topilgan artefaktlar, devoriy rasmlar, qadimgi shahar tarixi namoyish etiladi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasamarqandId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;
    }

    public static SendPhoto hazratihizr(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/8"));
        sendPhoto.setCaption("Juda qadimgi masjid. Chiroyli tepalikda joylashgan, shahar manzarasi juda yorqin ko‘rinadi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasamarqandId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;
    }

    public static SendPhoto siyob(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/9"));
        sendPhoto.setCaption("Mahalliy shirinliklar, mevalar, yong‘oqlar, suvenirlar sotiladigan tarixiy bozor. Turistlar eng ko‘p tashrif buyuradigan joylardan biri.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasamarqandId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;
    }


    //qashqadaryo place
    public static SendPhoto kquriqxona(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/11"));
        sendPhoto.setCaption("Yer tarixining million yillik qatlamlari ochiq ko‘rinadigan noyob joy. Geologlar, talabalar va turistlar uchun tabiiy “darslik” vazifasini o‘taydi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaqashqadaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto oqsaroy(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/12"));
        sendPhoto.setCaption("Amir Temurning ulkan saroyi. Bir vaqtlar Markaziy Osiyodagi eng katta saroy bo‘lgan. Hozir ham baland devor qoldiqlari o‘zining qudratini ko‘rsatadi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaqashqadaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto dorut(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/13"));
        sendPhoto.setCaption("XIV asrda bunyod etilgan diniy yodgorlik. Amir Temurning otasi Tarag‘ay Bahodir shu yerda dafn etilgan. Tinch, ma’naviy maskan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaqashqadaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto dorus(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/14"));
        sendPhoto.setCaption("Temuriylar sulolasiga oid muhim majmua. Amir Temurning asl rejalangan maqbarasi shu yerda joylashgan. Me’moriy jihatdan juda qadimiy va tarixiy ahamiyatga ega.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaqashqadaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto bashr(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/15"));
        sendPhoto.setCaption("Qashqadaryoning muqaddas joylaridan biri. Ziyoratchilar tez-tez tashrif buyuradigan sokin va xotirjam maskan, qadimiy rivoyatlarga boy.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaqashqadaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto qregiston(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/16"));
        sendPhoto.setCaption("Qarshi shahrining tarixiy markaziy maydoni. Atrofida madrasa, hammom va eski bozorlardan iborat tarixiy majmua joylashgan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaqashqadaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto lanagrota(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/17"));
        sendPhoto.setCaption("Qadimiy va mashhur ziyorat joyi. Langar ota maqbarasi va masjidi bor. Atrofida ulkan chinorlar, sokin muhit mavjud.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaqashqadaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto kastronimik(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/18"));
        sendPhoto.setCaption("Astronomlar uchun ilmiy markaz. Yulduzlar, sayyoralar va kosmik kuzatuvlar o‘tkaziladigan joy. O‘quvchilar va sayyohlar ko‘p tashrif buyuradi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaqashqadaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    //surxondaryo place

    public static SendPhoto fayoztepa(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/20"));
        sendPhoto.setCaption("Qadimgi Kushon davriga oid buddaviylik ibodatxonasi. Termiz yaqinida joylashgan bo‘lib, arxeologlar tomonidan topilgan eng muhim yodgorliklardan biri.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasurxandaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto kampirtepa(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/21"));
        sendPhoto.setCaption("Amudaryoning bo‘yida joylashgan eng qadimiy port shahri xarobalari. Bu yerda qadimgi savdo yo‘llari bo‘lgan va ellinistik davrga oid topilmalar ko‘p.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasurxandaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto alhakim(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/22"));
        sendPhoto.setCaption("Mashhur alloma va mutasavvuf Abu Abdulloh al-Hakim Termiziyning maqbarasi. Ziyoratchilar eng ko‘p boradigan muqaddas joylardan biri.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasurxandaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto sayrob(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/23"));
        sendPhoto.setCaption("Tarixiy qishloq bo‘lib, qadimiy me’moriy uylar va an’anaviy hayot tarzi bilan mashhur. Sayyohlar uchun jonli “muzey-qishloq”.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasurxandaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto darband(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/24"));
        sendPhoto.setCaption("Tabiiy daralar, toshli tog‘ yo‘laklari va chiroyli manzaralari bilan mashhur. Tog‘ sayohatlari va piknik uchun eng mashhur joylardan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasurxandaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto qumtepa(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/25"));
        sendPhoto.setCaption("Qadimiy shahar xarobalari joylashgan arxeologik hudud. Kushonlar davriga oid katta ahamiyatga ega tarixiy maskan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasurxandaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto jarkurgan(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/26"));
        sendPhoto.setCaption("XI–XII asrlarda qurilgan noyob minora. Spiral shaklli g‘ishtlari bilan O‘rta Osiyoda yagona me’moriy yodgorliklardan biri hisoblanadi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasurxandaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto fayzullaxoja(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/27"));
        sendPhoto.setCaption("Mahalliy avliyolardan biri Fayzulla Xo‘janing ziyoratgohi. Sokinzor hududda joylashgan, diniy va ma’naviy ahamiyati yuqori maskan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasurxandaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    // sirdaryo place
    public static SendPhoto zarafshon(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/29"));
        sendPhoto.setCaption("Navoiy viloyatidan oqib oʻtuvchi Zarafshon daryosining qirgʻoqlari boʻlib, bu yerda aholi va sayyohlar uchun dam olish maskanlari tashkil etilgan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasirdaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto mirzaobod(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/30"));
        sendPhoto.setCaption("Sirdaryo viloyatining Mirzaobod tumanida joylashgan yirik aholi punkti, Mirzachoʻlning dehqonchilik qilinadigan hududlaridan biri hisoblanadi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasirdaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto shirinsuv(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/31"));
        sendPhoto.setCaption("Bu nom rasmiy maʼlumotlarda kam uchraydi, biroq Oʻzbekistondagi boshqa kichik sunʼiy koʻl yoki suv inshootlariga nisbatan qoʻllanilishi mumkin.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasirdaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto boyovut(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/32"));
        sendPhoto.setCaption("Sirdaryo viloyatidagi Boyovut tumanining maʼmuriy markazi hisoblanuvchi shahar tipidagi aholi punkti va unga tegishli yirik qishloq.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasirdaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto sardobasuv(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/33"));
        sendPhoto.setCaption("Sirdaryo viloyatida 2017-yilda qurilgan, ulkan sigʻimga ega suv inshooti boʻlib, asosan Mirzachoʻl yerlarini sugʻorish uchun moʻljallangan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasirdaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto oqoltin(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/34"));
        sendPhoto.setCaption("Oqoltin tumanining markaziy hududlaridan biri boʻlib, bu yerda asosan qishloq xoʻjaligi, xususan paxtachilik rivojlangan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasirdaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto xovos(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/35"));
        sendPhoto.setCaption("Sirdaryo viloyati Xovos tumanida joylashgan va oʻzining qadimiy meʼmoriy uslubi yoki uzoq tarixi bilan mahalliy aholi uchun ahamiyatli boʻlgan masjid.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasirdaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto tuyabogiz(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/36"));
        sendPhoto.setCaption("Rasmiy manbalar asosan Toshkent viloyatidagi Ohangaron daryosida joylashgan yirik Tuyaboʻgʻiz suv ombori (Toshkent dengizi)ni qayd etadi; togʻlar esa uning atrofidagi hududlarga tegishli boʻlishi mumkin.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgasirdaryoId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }
    //fargona place
    public static SendPhoto xonsaroyi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/38"));
        sendPhoto.setCaption("Farg‘ona vodiysining tarixiy me’moriy durdonalaridan biri. Saroy XIX asrda qurilgan bo‘lib, unda o‘sha davr hukmdorlarining hayoti, saroy madaniyati va milliy uslubdagi bezaklar aks etgan. Ichki devorlaridagi naqshlar juda boy va chiroyli.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgafargonaId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto norbutabiy(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/39"));
        sendPhoto.setCaption("XVIII asrga mansub qadimiy madrasa bo‘lib, Farg‘onadagi eng mashhur diniy-ma’rifiy maskanlardan biri. Madrasa me’morchiligi o‘ziga xos, peshtoqlari va gumbazlari tarixiy ruhni saqlab qolgan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgafargonaId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto ipakmuzey(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/40"));
        sendPhoto.setCaption("Bu yerda haqiqiy o‘zbek ipakchiligini ko‘rish mumkin. Ipakning dastlabki ishlovidan tortib tayyor mahsulotgacha bo‘lgan jarayon namoyish etiladi. Muzeyda milliy atlas va adras matolari tarixi haqida ma’lumotlar mavjud.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgafargonaId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto kulolchilik(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/41"));
        sendPhoto.setCaption("Farg‘ona vodiysi qadimdan kulolchilik bilan mashhur. Bu markazda hunarmandlarning ishlash jarayonini ko‘rish, milliy naqshli idishlar tayyorlanishini kuzatish va hatto o‘zingiz ham sinab ko‘rish imkoniyati bor.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgafargonaId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto farbotanika(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/42"));
        sendPhoto.setCaption("Katta hududni egallagan, minglab o‘simliklar jamlangan tabiat maskani. Sayr qilish, suratga olish va dam olish uchun ideal joy. Nodir daraxt va gullar bilan to‘la.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgafargonaId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto buvaydat(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/43"));
        sendPhoto.setCaption("Buvayda tumani o‘zining qadimiy diniy binolari bilan mashhur. Masjid va madrasalar o‘tmish me’morchiligi, g‘isht terish usullari va sokin muhit bilan sayyohlarni jalb qiladi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgafargonaId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto suxqadimiy(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/44"));
        sendPhoto.setCaption("So‘x tumani — tog‘lar bag‘ridagi tabiiy go‘zal hudud. Bu yerda qadimiy qishloqlar, tog‘ yo‘llari, sharsharalar va ajoyib manzaralar mavjud. Tabiatni yaxshi ko‘radiganlar uchun eng zo‘r maskan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgafargonaId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto oqtepaziyorat(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/45"));
        sendPhoto.setCaption("Farg‘onadagi mashhur ziyorat joylaridan biri. Bu yer tinch, sokin va ma’naviy jihatdan muhim maskan hisoblanadi. Atrofida qadimiy yodgorliklar va tarixiy izlar mavjud.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgafargonaId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    //xorazm place
    public static SendPhoto ichanqala(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/47"));
        sendPhoto.setCaption("Xorazmning eng mashhur yodgorligi, qadimiy qal’a va tarixiy shahar markazi. UNESCO Jahon merosi ro‘yxatida.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaxorazmId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto kaltaminor(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/48"));
        sendPhoto.setCaption("Qadimiy minor, noyob mozaika bezaklari bilan mashhur. Shahar ramzlaridan biri.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaxorazmId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto pahlavonmahmud(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/49"));
        sendPhoto.setCaption("Mashhur Xorazm shoir va qo‘riqchi Pakhlavan Mahmudning maqbarasi, ziyorat va sayyohlik joyi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaxorazmId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto jumamasjidi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/50"));
        sendPhoto.setCaption("IX asrga oid tarixiy masjid. Qadimiy ustunlari va me’moriy bezaklari bilan taniqli.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaxorazmId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto hazratipahlavon(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/51"));
        sendPhoto.setCaption("Ziyoratgoh va tarixiy yodgorlik, ko‘plab turistlar tashrif buyuradi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaxorazmId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto xmuzeyi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/52"));
        sendPhoto.setCaption("Hudud tarixi, arxeologiya va etnografiya bo‘yicha boy eksponatlar mavjud.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaxorazmId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto toshhovli(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/53"));
        sendPhoto.setCaption("Qadimiy madrasalar va masjidlar majmuasi. Arxitektura va tarixga qiziqqanlar uchun muhim.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaxorazmId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto islomxoja(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/53"));
        sendPhoto.setCaption("Xorazmning eng baland minorasi, shahar va qal’ani yuqoridan kuzatish imkoniyati bilan mashhur.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaxorazmId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    //namangan place
    public static SendPhoto chortoq(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/56"));
        sendPhoto.setCaption("O‘zbekistonning eng mashhur shifobaxsh kurortlaridan biri. Mineral suvlari bilan davolanish uchun juda ko‘p turistlar keladi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortganamanganId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto chustdoppi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/57"));
        sendPhoto.setCaption("Chust do‘ppisi butun dunyoga mashhur. Bu yerda do‘ppi tikish jarayonini tomosha qilish va sovg‘a xarid qilish mumkin.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortganamanganId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto boburbog(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/58"));
        sendPhoto.setCaption("Shahar markazidagi katta, zamonaviy va juda chiroyli bog‘. Ko‘plab fontanlar, istirohat maskanlari va manzaralar bor.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortganamanganId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto axsikent(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/59"));
        sendPhoto.setCaption("Namangan yaqinidagi qadimiy shahar xarobalari. Tarixiy sayohatni yaxshi ko‘radiganlar uchun juda qiziqarli joy.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortganamanganId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto qoradaryo(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/60"));
        sendPhoto.setCaption("Tabiat manzaralari, dam olish va eng mashhur piknik maskanlaridan biri.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortganamanganId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto damak(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/61"));
        sendPhoto.setCaption("Tog‘lar oralig‘idagi sokin va manzarali hudud. Tabiatni yaxshi ko‘radigan turistlar ko‘p tashrif buyuradi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortganamanganId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto surxontepa(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/62"));
        sendPhoto.setCaption("Tarixiy arxeologik joy. Qadimiy davrlarga oid topilmalar bor.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortganamanganId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto urxontog(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/63"));
        sendPhoto.setCaption("Tog‘ etaklaridagi sayyohlik maskani. Trekking, tog‘ havosi va tabiat bilan mashhur.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortganamanganId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    //buxoro place
    public static SendPhoto arkqala(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/65"));
        sendPhoto.setCaption("Buxoroning eng qadimiy binosi boʻlib, ming yillar davomida Buxoro amirlarining rasmiy qarorgohi vazifasini oʻtagan. Hozirda muzey sifatida xizmat qiladi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgabuxoroId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto poikalon(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/66"));
        sendPhoto.setCaption("Buxoroning markaziy diniy majmuasi. Unda mashhur Kalon Minorasi (Minorai Kalon), Kalon Masjidi va Miri Arab Madrasasi joylashgan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgabuxoroId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto labihovuz(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/67"));
        sendPhoto.setCaption("Oʻtmishda Buxoroning yashil dam olish maskani boʻlgan katta sunʼiy hovuz atrofida qurilgan majmua. Unda Nodir Devonbegi Madrasasi va Xonaqosi hamda Koʻkaldosh Madrasasi joylashgan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgabuxoroId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto bolohauz(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/68"));
        sendPhoto.setCaption("Minorasi boʻlmagan bu masjid Amirlarning namoz oʻqish joyi boʻlgan. Ayniqsa, masjidning naqshinkor, yogʻoch ustunli ayvoni diqqatga sazovordir.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgabuxoroId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto sitoramohi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/69"));
        sendPhoto.setCaption("Buxoro amirlarining yozgi saroyi. Yevropa va sharq meʼmorchilik uslublarini oʻzida mujassam etgan, ayniqsa, \"Oq zal\"i bilan mashhur.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgabuxoroId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto chashmai(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/70"));
        sendPhoto.setCaption("Muqaddas buloq ustida qurilgan inshoot. Rivoyatlarga koʻra, bu buloqni Ayyub paygʻambar (Ish) yaratgan. Turli davrlarda qurilgan gumbazlari bilan ajralib turadi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgabuxoroId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto chorbakr(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/71"));
        sendPhoto.setCaption("Buxoro yaqinida joylashgan yirik ziyoratgoh. Shayx Abu Bakr Saʼd ibn Yaʼqubning qabri joylashgan boʻlib, meʼmoriy jihatdan katta qiziqish uygʻotadi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgabuxoroId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto bahouddin(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/72"));
        sendPhoto.setCaption("Naqshbandiya tariqatining asoschisi Bahouddin Naqshband dafn etilgan muqaddas joy. Bu joy Islom olamida juda hurmatga sazovor ziyoratgohlardan biridir.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgabuxoroId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    //navoiy place
    public static SendPhoto sarmishsoy(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/74"));
        sendPhoto.setCaption("Sarmishsoy darasi toshga o‘yilgan qadimgi rasmlari bilan mashhur bo‘lib, minglab petrogliflar saqlangan tarixiy hudud.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortganavoiyId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto mirsaid(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/75"));
        sendPhoto.setCaption("Bu maqbara qadimiy me’moriy yodgorlik bo‘lib, Mir Said Bahromning dafn qilingan muqaddas maskani hisoblanadi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortganavoiyId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto abdullaqalasi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/76"));
        sendPhoto.setCaption("Qadimiy mudofaa qal’asi bo‘lib, Abdullaxon davrida qurilgan va tarixiy harbiy inshoot sifatida qimmatli hisoblanadi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortganavoiyId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto qiziltepa(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/77"));
        sendPhoto.setCaption("Buyuk ipak yo‘li davriga oid yirik karvonsaroy bo‘lib, savdogarlar dam oladigan va tuyalar saqlanadigan tarixiy majmua.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortganavoiyId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto rabotimalik(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/78"));
        sendPhoto.setCaption("Muqaddas deb hisoblangan tabiiy buloq joylashgan ziyoratgoh bo‘lib, atrofida me’moriy obidalar mavjud.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortganavoiyId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto nchashma(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/79"));
        sendPhoto.setCaption("Buyuk ipak yo‘li davriga oid yirik karvonsaroy bo‘lib, savdogarlar dam oladigan va tuyalar saqlanadigan tarixiy majmua.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortganavoiyId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto nurotaqala(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/80"));
        sendPhoto.setCaption("Nurota shahridagi qadimgi qal’a boʻlib, Aleksandr Makedonskiy davriga borib taqaladi. Shahar ustidan nazorat qiluvchi baland joyda qurilgan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortganavoiyId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto aydarkol(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/81"));
        sendPhoto.setCaption("Aydarko‘l — keng va sokin sun’iy ko‘l bo‘lib, dam olish, baliq ovlash va tabiatdan zavq olish uchun mashhur joy.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortganavoiyId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    //andijon place
    public static SendPhoto aboburbogi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/83"));
        sendPhoto.setCaption("Zahiriddin Bobur xotirasiga bag‘ishlangan, tabiat go‘zalligi va sokin muhitga ega katta dam olish bog‘i.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaandijonId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto ajomemasjidi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/84"));
        sendPhoto.setCaption("Andijonning markaziy jome masjidi bo‘lib, tarixiy me’morchilik va diniy muhit bilan ajralib turadi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaandijonId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto boburmemorial(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/85"));
        sendPhoto.setCaption("Bobur hayoti va merosiga bag‘ishlangan yodgorlik majmuasi, muzey va tarixiy eksponatlari bilan mashhur.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaandijonId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto andijonqala(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/86"));
        sendPhoto.setCaption("Shahar tarixidan hikoya qiluvchi qadimiy qal’a devorlari va arxeologik izlar joylashgan hudud.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaandijonId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto gmuzb(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/87"));
        sendPhoto.setCaption("O‘zbekistonda ishlab chiqarilayotgan avtomobillar ko‘rgazmasi, yangi modellar va texnologiyalar namoyish etiladigan markaz.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaandijonId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto andijonsoy(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/88"));
        sendPhoto.setCaption("Shaharning eng chiroyli sayr joylaridan biri bo‘lib, sohil bo‘yida dam olish va fotosessiya uchun qulay hudud.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaandijonId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto xonobod(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/89"));
        sendPhoto.setCaption("Toza havo, shifobaxsh manzaralar va dam olish maskanlari bilan mashhur sanatoriya hududi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaandijonId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto shahrixonsoy(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/90"));
        sendPhoto.setCaption("Tabiat qo‘ynidagi ko‘ngilochar joylar, oilaviy dam olish va piknik uchun ideal maskan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgaandijonId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    //toshkent place
    public static SendPhoto amirsoy(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/92"));
        sendPhoto.setCaption("O‘zbekistondagi eng zamonaviy tog‘ kurortlaridan biri. Qishda chang‘i, yozda dam olish uchun ideal.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgatoshkentId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto chorvoq(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/93"));
        sendPhoto.setCaption("Ko‘k suvli katta ombor va atrofidagi tog‘lar bilan mashhur dam olish maskani.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgatoshkentId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto chimyon(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/94"));
        sendPhoto.setCaption("Tabiati, havo tozaligi va piyoda sayr yo‘llari bilan mashhur tog‘ hududi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgatoshkentId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto bildirsoy(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/95"));
        sendPhoto.setCaption("Chang‘i trassalari va tabiiy manzaralari bilan tanilgan tog‘ kurorti.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgatoshkentId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto gofurgulom(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/96"));
        sendPhoto.setCaption("Oila va bolalar uchun qulay, tabiat bag‘rida joylashgan hordiq maskani.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgatoshkentId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto solariq(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/97"));
        sendPhoto.setCaption("Yirik quyosh energiyasi loyihasi, ekologik toza elektr ishlab chiqaradi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgatoshkentId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto kumushkon(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/98"));
        sendPhoto.setCaption("Sokinkina tabiat, tog‘ yo‘llari va toza havo bilan tanilgan hudud.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgatoshkentId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto menvalley(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/99"));
        sendPhoto.setCaption("Zamonaviy va estetik vizual joy, suratga tushish va dam olish uchun mashhur maskan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgatoshkentId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    //jizzax
    public static SendPhoto zominmilliybog(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/100"));
        sendPhoto.setCaption("O‘zbekistondagi eng zamonaviy tog‘ kurorti, qishda chang‘i va snoubord, yozda dam olish uchun a’lo joy.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgajizzaxId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto zominsanatoriya(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/101"));
        sendPhoto.setCaption("Ko‘k rangli katta suv ombori, piknik va suv sportlari uchun mashhur maskan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgajizzaxId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto orom(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/102"));
        sendPhoto.setCaption("Tabiati chiroyli, sayr qilish va dam olish uchun eng ko‘p boriladigan tog‘ hududi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgajizzaxId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto forish(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/103"));
        sendPhoto.setCaption("Chang‘i trassalari, koʻtaruvchi kanat yo‘llari va tinch dam olish joylari bilan tanilgan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgajizzaxId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto arnasoy(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/104"));
        sendPhoto.setCaption("Oila bilan hordiq chiqarish uchun qulay, tabiat bag‘ridagi maskan.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgajizzaxId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto ormanxojaligi(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/105"));
        sendPhoto.setCaption("Quyosh energiyasidan elektr ishlab chiqaradigan yirik texnologik loyihalardan biri.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgajizzaxId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto nurafshonmasjid(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/106"));
        sendPhoto.setCaption("Tinch, sokin va tabiati beg‘ubor bo‘lgan tog‘lar majmuasi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgajizzaxId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }

    public static SendPhoto obirahmatgori(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hoteltoursimbotimages/107"));
        sendPhoto.setCaption("Zamonaviy dizaynli, foto va kontent olish uchun mashhur manzara vodiysi.");

        InlineKeyboardMarkup imk = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        rowlist.add(row1);

        InlineKeyboardButton b1 = new InlineKeyboardButton();
        b1.setText("⬅\uFE0F ortga");
        b1.setCallbackData("ortgajizzaxId");
        row1.add(b1);

        imk.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(imk);

        return sendPhoto;

    }
}

