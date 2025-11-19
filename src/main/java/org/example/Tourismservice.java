package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class Tourismservice {




    public SendMessage shaharlartourism(long chatId) {
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


        imk.setKeyboard(rowlist);
        SM.setReplyMarkup(imk);
        return SM;
    }

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


        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
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
        b7.setText("Minorasi");
        b7.setCallbackData("minorasiId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Fayzulla Xo‘ja Ziyoratgohi");
        b8.setCallbackData("fayzullaxujaId");
        row8.add(b8);
        rowlist.add(row8);


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
        b6.setText("Tarixiy masjid va madrasalar");
        b6.setCallbackData("tarixiybinolarId");
        row6.add(b6);
        rowlist.add(row6);

        List<InlineKeyboardButton> row7 = new ArrayList<>();
        InlineKeyboardButton b7 = new InlineKeyboardButton();
        b7.setText("Qadimiy qadimiy yo‘llar va tog‘ manzaralari");
        b7.setCallbackData("qadimiyollarId");
        row7.add(b7);
        rowlist.add(row7);

        List<InlineKeyboardButton> row8 = new ArrayList<>();
        InlineKeyboardButton b8 = new InlineKeyboardButton();
        b8.setText("Oqtepa Ziyoratgohi");
        b8.setCallbackData("oqtepaziyoratId");
        row8.add(b8);
        rowlist.add(row8);


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
        b2.setCallbackData("mirsayidbahromId");
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
        b2.setText("Jome Masjidi");
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


        imk.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(imk);
        return sendMessage;
    }


}