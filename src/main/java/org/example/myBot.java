package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
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
            Integer messageId = callbackQuery.getMessage().getMessageId();

            System.out.println(data);

            if (data.equals("ozbekId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(hotel.menu(chatId));

                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("englishId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
//                editMessageReplyMarkup.setInlineMessageId("choose one");
                editMessageReplyMarkup.setReplyMarkup(hotel.engmenu(chatId));

                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("menuhotelId")) {

                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Shaharlarni tanlang");

                editMessageText.setReplyMarkup(hotel.shaharlarhotel(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("toshkentId")){
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Toshkentdagi mehmonxonalar. Quyidagi mehmonxonalardan birini tanlang:");

                editMessageText.setReplyMarkup(hotel.toshkent(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("andijonId")){
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Andijon viloyati mehmonxonalari:");

                editMessageText.setReplyMarkup(hotel.andijon1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("buxoroId")){
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Buxorodagi mehmonxonalar:");

                editMessageText.setReplyMarkup(hotel.buxoro1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("jizzaxId")){
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Jizzax viloyati mehmonxonalari:");

                editMessageText.setReplyMarkup(hotel.jizzax1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("qashqadaryoId")){
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Qashqadaryo mehmonxonalari:");

                editMessageText.setReplyMarkup(hotel.qashqadaryo1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("navoiyId")){
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Navoiy viloyati mehmonxonalari:");

                editMessageText.setReplyMarkup(hotel.navoiy1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("namanganId")){
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Namangan viloyati mehmonxonalari:");

                editMessageText.setReplyMarkup(hotel.namangan1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("SamarqandId")){
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Samarqanddagi mehmonxonalar:");

                editMessageText.setReplyMarkup(hotel.samarqand1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("surxondaryoId")){
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Surxondaryo mehmonxonalari:");

                editMessageText.setReplyMarkup(hotel.surxondaryo1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("sirdaryoId")){
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Sirdaryo viloyati mehmonxonalari:");

                editMessageText.setReplyMarkup(hotel.sirdaryo1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("fargonaId")){
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Farg'ona viloyati mehmonxonalari:");

                editMessageText.setReplyMarkup(hotel.fargona1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("xorazmId")){
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Xorazm mehmonxonalari:");

                editMessageText.setReplyMarkup(hotel.xorazm1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //viloyatlar tugadi



// 1. Hilton Tashkent City
            if (data.equals("tashkent_hilton")) {
                try {
                    execute(hotel.hilton(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 2. Hyatt Regency Tashkent
            if (data.equals("tashkent_hyatt")) {
                try {
                    execute(hotel.hyattRegency(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 3. Wyndham Tashkent
            if (data.equals("tashkent_wyndham")) {
                try {
                    execute(hotel.wyndhamTashkent(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 4. Courtyard by Marriott Tashkent
            if (data.equals("tashkent_marriott")) {
                try {
                    execute(hotel.courtyardMarriott(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 5. Level Hotel and BC
            if (data.equals("tashkent_level")) {
                try {
                    execute(hotel.levelHotel(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// ⬅️ Orqaga tugmasi uchun
            if (data.equals("ortgatoshkent")) {
                try {
                    execute(hotel.toshkent1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }




// 1. O'zbegim Andijon
            if (data.equals("andijon_uzbegim")) {
                try {
                    execute(hotel.uzbegimAndijon(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 2. Andijon Grand Hotel
            if (data.equals("andijon_grand")) {
                try {
                    execute(hotel.andijonGrand(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 3. Asia Andijan Hotel
            if (data.equals("andijon_asia")) {
                try {
                    execute(hotel.asiaAndijan(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 4. Global Star Hotel
            if (data.equals("andijon_global")) {
                try {
                    execute(hotel.globalStar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 5. Hamkor Bank Hotel
            if (data.equals("andijon_hamkor")) {
                try {
                    execute(hotel.hamkorBankHotel(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// ⬅️ Orqaga tugmasi uchun (Andijon ro'yxatiga qaytish)
            if (data.equals("ortgaandijon")) {
                try {
                    execute(hotel.andijon(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }




// 1. Wyndham Bukhara
            if (data.equals("buxoro_wyndham")) {
                try {
                    execute(hotel.wyndhamBukhara(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 2. Minorai Kalon Hotel
            if (data.equals("buxoro_minora")) {
                try {
                    execute(hotel.minoraiKalon(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 3. Devon Begi Hotel
            if (data.equals("buxoro_devonbegi")) {
                try {
                    execute(hotel.devonBegi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 4. Omar Khayyam Hotel
            if (data.equals("buxoro_omarkhayyam")) {
                try {
                    execute(hotel.omarKhayyam(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 5. Sasha & Son Boutique Hotel
            if (data.equals("buxoro_sasha")) {
                try {
                    execute(hotel.sashaSon(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// ⬅️ Orqaga tugmasi uchun (Buxoro ro'yxatiga qaytish)
            if (data.equals("ortgabuxoro")) {
                try {
                    execute(hotel.buxoro(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }




// 1. Grand Hotel Zomin
            if (data.equals("jizzax_zomin")) {
                try {
                    execute(hotel.grandHotelZomin(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 2. Silk Road Jizzax
            if (data.equals("jizzax_silkroad")) {
                try {
                    execute(hotel.silkRoadJizzax(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 3. Sogdiana Hotel
            if (data.equals("jizzax_sogdiana")) {
                try {
                    execute(hotel.sogdianaHotel(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 4. Grand Hotel Jizzakh
            if (data.equals("jizzax_grand")) {
                try {
                    execute(hotel.grandHotelJizzakh(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 5. Tashkent plaza in jizzax
            if (data.equals("jizzax_markaziy")) {
                try {
                    // Sizning SendPhoto metodining nomi: tashkentPlazaJizzax
                    execute(hotel.tashkentPlazaJizzax(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// ⬅️ Orqaga tugmasi uchun (Jizzax ro'yxatiga qaytish)
            if (data.equals("ortgajizzax")) {
                try {
                    execute(hotel.jizzax(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }



// 1. Shahrisabz Hotel
            if (data.equals("qashqadaryo_shahrisabz")) {
                try {
                    execute(hotel.shahrisabzHotel(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 2. Nasaf Hotel (Qarshi)
            if (data.equals("qashqadaryo_nasaf")) {
                try {
                    execute(hotel.nasafHotel(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 3. Sultan Hotel (Koddagi nom Sultan hotel, callback Bahrin deb belgilangan)
            if (data.equals("qashqadaryo_bahrin")) { // Koddagi callback: qashqadaryo_bahrin
                try {
                    execute(hotel.sultanHotel(chatId)); // Koddagi metod: sultanHotel
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 4. Grand Hotel Shahrisabz
            if (data.equals("qashqadaryo_grand")) {
                try {
                    execute(hotel.grandHotelShahrisabz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 5. Muborak Hotel
            if (data.equals("qashqadaryo_muborak")) {
                try {
                    execute(hotel.muborakHotel(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// ⬅️ Orqaga tugmasi uchun (Qashqadaryo ro'yxatiga qaytish)
            if (data.equals("ortgaqashqadaryo")) {
                try {
                    execute(hotel.qashqadaryo(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }



// 1. Zarafshon Grand Hotel
            if (data.equals("navoiy_zarafshon")) {
                try {
                    execute(hotel.zarafshonGrand(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 2. Hotel Navoiy Palace
            if (data.equals("navoiy_palace")) {
                try {
                    execute(hotel.hotelNavoiyPalace(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 3. Silk Road by Navoi
            if (data.equals("navoiy_silkroad")) {
                try {
                    execute(hotel.silkRoadByNavoi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 4. Grand Star Navoi
            if (data.equals("navoiy_grandstar")) {
                try {
                    execute(hotel.grandStarNavoi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 5. Navoiy City Hotel
            if (data.equals("navoiy_city")) {
                try {
                    execute(hotel.navoiyCityHotel(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// ⬅️ Orqaga tugmasi uchun (Navoiy ro'yxatiga qaytish)
            if (data.equals("ortganavoiy")) {
                try {
                    execute(hotel.navoiy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }



// 1. Wyndham Namangan
            if (data.equals("namangan_wyndham")) {
                try {
                    execute(hotel.wyndhamNamangan(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 2. Namangan Plaza Hotel
            if (data.equals("namangan_plaza")) {
                try {
                    execute(hotel.namanganPlaza(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 3. Afsona Hotel Namangan
            if (data.equals("namangan_afsona")) {
                try {
                    execute(hotel.afsonaHotel(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 4. Hotel Namangan Sayyoh
            if (data.equals("namangan_sayyoh")) {
                try {
                    execute(hotel.namanganSayyoh(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 5. Fajr Hotel
            if (data.equals("namangan_fajr")) {
                try {
                    execute(hotel.fajrHotel(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// ⬅️ Orqaga tugmasi uchun (Namangan ro'yxatiga qaytish)
            if (data.equals("ortganamangan")) {
                try {
                    execute(hotel.namangan(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }



// 1. Mövenpick Samarkand
            if (data.equals("samarqand_movenpick")) {
                try {
                    execute(hotel.movenpickSamarkand(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 2. Silk Road by Minyoun
            if (data.equals("samarqand_minyoun")) {
                try {
                    execute(hotel.silkRoadByMinyoun(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 3. Plaza Hotel Samarkand
            if (data.equals("samarqand_plaza")) {
                try {
                    execute(hotel.plazaHotelSamarkand(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 4. Registon Plaza Hotel
            if (data.equals("samarqand_registon")) {
                try {
                    execute(hotel.registonPlaza(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 5. Malika Prime Hotel
            if (data.equals("samarqand_malika")) {
                try {
                    execute(hotel.malikaPrime(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// ⬅️ Orqaga tugmasi uchun (Samarqand ro'yxatiga qaytish)
            if (data.equals("ortgasamarqand")) {
                try {
                    execute(hotel.samarqand(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }



// 1. Grand Termiz Hotel
            if (data.equals("surxondaryo_grandtermiz")) {
                try {
                    execute(hotel.grandTermiz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 2. Silk Road Termiz
            if (data.equals("surxondaryo_silkroad")) {
                try {
                    execute(hotel.silkRoadTermiz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 3. Termiz Palace Hotel
            if (data.equals("surxondaryo_palace")) {
                try {
                    execute(hotel.termizPalace(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 4. Asson Termiz
            if (data.equals("surxondaryo_asson")) {
                try {
                    execute(hotel.assonTermiz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 5. Markaziy Mehmonxona (markaziyMehmonxonaTermiz)
            if (data.equals("surxondaryo_markaziy")) {
                try {
                    execute(hotel.markaziyMehmonxonaTermiz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// ⬅️ Orqaga tugmasi uchun (Surxondaryo ro'yxatiga qaytish)
            if (data.equals("ortgasurxondaryo")) {
                try {
                    execute(hotel.surxondaryo(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }



// 1. Grand Hotel Guliston
            if (data.equals("sirdaryo_grand")) {
                try {
                    execute(hotel.grandHotelGuliston(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 2. Shodlik Palace Hotel
            if (data.equals("sirdaryo_shodlik")) {
                try {
                    execute(hotel.shodlikPalace(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 3. Sirdaryo Hotel
            if (data.equals("sirdaryo_hotel")) {
                try {
                    execute(hotel.sirdaryoHotel(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 4. Oasis Hotel Guliston
            if (data.equals("sirdaryo_oasis")) {
                try {
                    execute(hotel.oasisHotelGuliston(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 5. Ideal Hotel Guliston
            if (data.equals("sirdaryo_ideal")) {
                try {
                    execute(hotel.idealHotelGuliston(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// ⬅️ Orqaga tugmasi uchun (Sirdaryo ro'yxatiga qaytish)
            if (data.equals("ortgasirdaryo")) {
                try {
                    execute(hotel.sirdaryo(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }




// 1. Rixos Kokand
            if (data.equals("fargona_rixos")) {
                try {
                    execute(hotel.rixosKokand(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 2. King Premium Hotel Fergana
            if (data.equals("fargona_king")) {
                try {
                    execute(hotel.kingPremiumHotel(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 3. Asia Fergana Hotel
            if (data.equals("fargona_asia")) {
                try {
                    execute(hotel.asiaFergana(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 4. Fergana Hotel
            if (data.equals("fargona_hotel")) {
                try {
                    execute(hotel.ferganaHotel(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 5. Voyage Hotel Fergana
            if (data.equals("fargona_voyage")) {
                try {
                    execute(hotel.voyageHotel(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// ⬅️ Orqaga tugmasi uchun (Farg'ona ro'yxatiga qaytish)
            if (data.equals("ortgafargona")) {
                try {
                    execute(hotel.fargona(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }



// 1. Khiva Silk Road Palace
            if (data.equals("xorazm_silkroad")) {
                try {
                    execute(hotel.khivaSilkRoadPalace(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 2. Meros Hotel Khiva
            if (data.equals("xorazm_meros")) {
                try {
                    execute(hotel.merosHotelKhiva(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 3. Asia Khiva Hotel
            if (data.equals("xorazm_asia")) {
                try {
                    execute(hotel.asiaKhiva(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 4. Zarafshon Xiva Hotel (Urganch)
            if (data.equals("xorazm_zarafshon")) {
                try {
                    execute(hotel.zarafshonXiva(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// 5. Orient Star Khiva
            if (data.equals("xorazm_orientstar")) {
                try {
                    execute(hotel.orientStarKhiva(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

// ⬅️ Orqaga tugmasi uchun (Xorazm ro'yxatiga qaytish)
            if (data.equals("ortgaxorazm")) {
                try {
                    execute(hotel.xorazm(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (data.equals("orqagamenu")) {
                try {
                    execute(hotel.shaharlarhotel1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("orqagashaharlar")) {
                try {
                    execute(hotel.menu3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (data.equals("menutourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Shaharlarni tanlang");

                editMessageText.setReplyMarkup(tourism.shaharlartourism(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engmenutourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Choose cities");

                editMessageText.setReplyMarkup(TorismServiceEng.engshaharlartourism(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("toshkenttourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("toshkentni qayerini aylanmoqchisiz");

                editMessageText.setReplyMarkup(tourism.toshkent1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("andijontourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("andijonni qayerini aylanmoqchisiz");

                editMessageText.setReplyMarkup(tourism.andijon1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("buxorotourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("buxoroni qayerini aylanmoqchisiz");

                editMessageText.setReplyMarkup(tourism.buxoro1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("jizzaxtourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("jizzaxni qayerini aylanmoqchisiz");

                editMessageText.setReplyMarkup(tourism.jizzax1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("qashqadaryotourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("qashqadaryoni qaayerini aylanmoqchisiz");

                editMessageText.setReplyMarkup(tourism.qashqadaryo1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("navoiytourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("navoiyni qayerini aylanmoqchisiz");

                editMessageText.setReplyMarkup(tourism.navoiy1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("namangantourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("namanganni qayerini aylanmoqchisiz");

                editMessageText.setReplyMarkup(tourism.namangan1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("SamarqandtourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("samarqandni qaayerini aylanmoqchisiz");

                editMessageText.setReplyMarkup(tourism.samarqand1(chatId));


                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("surxondaryotourismId")) {

                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("surxandaryoni qaayerini aylanmoqchisiz");

                editMessageText.setReplyMarkup(tourism.surxandaryo1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("sirdaryotourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("sirdaryoni qayerini aylanmoqchisiz");

                editMessageText.setReplyMarkup(tourism.sirdaryo1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("fargonatourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("fargonani qayerini aylanmoqchisiz");

                editMessageText.setReplyMarkup(tourism.fargona1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("xorazmtourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("xorazmni qayerini aylanmoqchisiz");

                editMessageText.setReplyMarkup(tourism.xorazm1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //viloyat end uzb
            //viloyat start eng
            if (data.equals("engtoshkenttourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Where do you want to visit in Tashkent?");

                editMessageText.setReplyMarkup(TorismServiceEng.engtoshkent1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engandijontourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Where do you want to visit in Andijan?");

                editMessageText.setReplyMarkup(TorismServiceEng.engandijon1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engbuxorotourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Where do you want to visit in Bukhara?");

                editMessageText.setReplyMarkup(TorismServiceEng.engbuxoro1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engjizzaxtourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Where do you want to visit in JIzzakh?");

                editMessageText.setReplyMarkup(TorismServiceEng.engjizzax1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engqashqadaryotourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Where do you want to visit in Kashkadarya?");

                editMessageText.setReplyMarkup(TorismServiceEng.engqashqadaryo1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engnavoiytourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Where do you want to visit in Navoi?");

                editMessageText.setReplyMarkup(TorismServiceEng.engnavoiy1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engnamangantourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Where do you want to visit in Namangan?");

                editMessageText.setReplyMarkup(TorismServiceEng.enggnamangan1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engSamarqandtourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Where do you want to visit in Samarkand?");

                editMessageText.setReplyMarkup(TorismServiceEng.engsamarqand1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engsurxondaryotourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Where do you want to visit in Surkhandarya?");

                editMessageText.setReplyMarkup(TorismServiceEng.engsurxandaryo1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engsirdaryoourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Where do you want to visit in SyrDarya?");

                editMessageText.setReplyMarkup(TorismServiceEng.engsirdaryo1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engfargonatourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Where do you want to visit in Fergana?");

                editMessageText.setReplyMarkup(TorismServiceEng.engfargona1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engxorazmtourismId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Where do you want to visit in Khorezm?");

                editMessageText.setReplyMarkup(TorismServiceEng.engxorazm1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //viloyat end
            //samarqand place start

            if (data.equals("registonId")) {
                try {
                    execute(tourism.registon(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("shohizindaId")) {
                try {
                    execute(tourism.shohizinda(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("guriamirId")) {
                try {
                    execute(tourism.goriamir(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("bibixonimId")) {
                try {
                    execute(tourism.bibixonim(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("ulugbekrasadxonaId")) {
                try {
                    execute(tourism.ulugbekras(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("afrosiyobmuzeyId")) {
                try {
                    execute(tourism.afrosiyob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("hazratixizrId")) {
                try {
                    execute(tourism.hazratihizr(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("siyobbozorId")) {
                try {
                    execute(tourism.siyob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            // samarqand end
            //qashqadaryo start

            if (data.equals("kitobgeologiyaId")) {
                try {
                    execute(tourism.kquriqxona(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("oqsaroyId")) {
                try {
                    execute(tourism.oqsaroy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("doruttilovatId")) {
                try {
                    execute(tourism.dorut(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("dorussaodatId")) {
                try {
                    execute(tourism.dorus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("hazratibashirId")) {
                try {
                    execute(tourism.bashr(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("qarshiregistanId")) {
                try {
                    execute(tourism.qregiston(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("langarotaId")) {
                try {
                    execute(tourism.lanagrota(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("kitobobservatoriyaId")) {
                try {
                    execute(tourism.kastronimik(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //qashqadaryo end
            //surxandaryo start
            if (data.equals("fayoztepaId")) {
                try {
                    execute(tourism.fayoztepa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("kampirtepaId")) {
                try {
                    execute(tourism.kampirtepa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("alhakimtermiziId")) {
                try {
                    execute(tourism.alhakim(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("alhakimtermiziId")) {
                try {
                    execute(tourism.alhakim(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("sayrobId")) {
                try {
                    execute(tourism.sayrob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("darbandId")) {
                try {
                    execute(tourism.darband(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("qumtepaId")) {
                try {
                    execute(tourism.qumtepa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("minorasiId")) {
                try {
                    execute(tourism.jarkurgan(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("fayzullaxujaId")) {
                try {
                    execute(tourism.fayzullaxoja(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //surxandaryo end
            //sirdaryo start
            if (data.equals("zarafshonsohilId")) {
                try {
                    execute(tourism.zarafshon(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("mirzaobodId")) {
                try {
                    execute(tourism.mirzaobod(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("shirinsuvomboriId")) {
                try {
                    execute(tourism.shirinsuv(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("boyovutId")) {
                try {
                    execute(tourism.boyovut(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("sardobaomboriId")) {
                try {
                    execute(tourism.sardobasuv(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("oqoltinId")) {
                try {
                    execute(tourism.oqoltin(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("xovostarixmasjidId")) {
                try {
                    execute(tourism.xovos(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("tuyabugiztogId")) {
                try {
                    execute(tourism.tuyabogiz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //siraryo end
            //fargona start
            if (data.equals("xonsaroyiId")) {
                try {
                    execute(tourism.xonsaroyi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("norbutabiymadrasaId")) {
                try {
                    execute(tourism.norbutabiy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("ipakmuzeyId")) {
                try {
                    execute(tourism.ipakmuzey(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("kulolchilikId")) {
                try {
                    execute(tourism.kulolchilik(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("fargonabotanikaId")) {
                try {
                    execute(tourism.farbotanika(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("tarixiybinolarId")) {
                try {
                    execute(tourism.buvaydat(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("qadimiyollarId")) {
                try {
                    execute(tourism.suxqadimiy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("oqtepaziyoratId")) {
                try {
                    execute(tourism.oqtepaziyorat(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //fargona end
            //xorazm start
            if (data.equals("ichanqalaId")) {
                try {
                    execute(tourism.ichanqala(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("kaltaminorId")) {
                try {
                    execute(tourism.kaltaminor(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("pakhlavanmahmudId")) {
                try {
                    execute(tourism.pahlavonmahmud(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("jumamasjidiId")) {
                try {
                    execute(tourism.jumamasjidi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("hazratipahlavonId")) {
                try {
                    execute(tourism.hazratipahlavon(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("xorazmmuzeyId")) {
                try {
                    execute(tourism.xmuzeyi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("toshhovliId")) {
                try {
                    execute(tourism.toshhovli(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("islamxojaId")) {
                try {
                    execute(tourism.islomxoja(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //xorazm end
            //namangan start
            if (data.equals("chortoqsanatoriyaId")) {
                try {
                    execute(tourism.chortoq(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("chustdoppiId")) {
                try {
                    execute(tourism.chustdoppi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("boburboginamanganId")) {
                try {
                    execute(tourism.boburbog(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("axsikentId")) {
                try {
                    execute(tourism.axsikent(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("qoradaryosohilId")) {
                try {
                    execute(tourism.qoradaryo(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("norindamId")) {
                try {
                    execute(tourism.damak(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("surxontepaId")) {
                try {
                    execute(tourism.surxontepa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("urxontogId")) {
                try {
                    execute(tourism.urxontog(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //namangan end
            //buxoro start
            if (data.equals("arkqalaId")) {
                try {
                    execute(tourism.arkqala(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("poikolonId")) {
                try {
                    execute(tourism.poikalon(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("labihovuzId")) {
                try {
                    execute(tourism.labihovuz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("bolohauzId")) {
                try {
                    execute(tourism.bolohauz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("sitoraimohixossaId")) {
                try {
                    execute(tourism.sitoramohi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("chashmaiayubId")) {
                try {
                    execute(tourism.chashmai(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("chorbakrId")) {
                try {
                    execute(tourism.chorbakr(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("naqshbandId")) {
                try {
                    execute(tourism.bahouddin(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //buxoro end
            //navoi start
            if (data.equals("sarmishsoyId")) {
                try {
                    execute(tourism.sarmishsoy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("mirsaidbahromId")) {
                try {
                    execute(tourism.mirsaid(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("abdullaxonbandiId")) {
                try {
                    execute(tourism.abdullaqalasi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("qiziltepaId")) {
                try {
                    execute(tourism.qiziltepa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("rabotimalikId")) {
                try {
                    execute(tourism.rabotimalik(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("chashmamajmuaId")) {
                try {
                    execute(tourism.nchashma(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("nurotaqalaId")) {
                try {
                    execute(tourism.nurotaqala(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("aydorkulId")) {
                try {
                    execute(tourism.aydarkol(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //navoi end
            //andijon start
            if (data.equals("boburbogiandijonId")) {
                try {
                    execute(tourism.aboburbogi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("jomemasjidiandijonId")) {
                try {
                    execute(tourism.ajomemasjidi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("boburmemorialId")) {
                try {
                    execute(tourism.boburmemorial(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("andijonqalaId")) {
                try {
                    execute(tourism.andijonqala(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("gmuzbekistanId")) {
                try {
                    execute(tourism.gmuzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("andijonsoyId")) {
                try {
                    execute(tourism.andijonsoy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("xonobodId")) {
                try {
                    execute(tourism.xonobod(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("shahrixonsoyId")) {
                try {
                    execute(tourism.shahrixonsoy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //andijon end
            //toshkent start
            if (data.equals("amirsoyId")) {
                try {
                    execute(tourism.amirsoy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("charvakId")) {
                try {
                    execute(tourism.chorvoq(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("chimganId")) {
                try {
                    execute(tourism.chimyon(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("beldersoyId")) {
                try {
                    execute(tourism.bildirsoy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("gofurgulomId")) {
                try {
                    execute(tourism.gofurgulom(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("solariqId")) {
                try {
                    execute(tourism.solariq(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("kumushkonId")) {
                try {
                    execute(tourism.kumushkon(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("menvalleyId")) {
                try {
                    execute(tourism.menvalley(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //toshkent end
            //jizzax start
            if (data.equals("zominmilliybogiId")) {
                try {
                    execute(tourism.zominmilliybog(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("zominsanatoriyaId")) {
                try {
                    execute(tourism.zominsanatoriya(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("oromId")) {
                try {
                    execute(tourism.orom(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("forishtogId")) {
                try {
                    execute(tourism.forish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("arnasoykulId")) {
                try {
                    execute(tourism.arnasoy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("urmonxujaligiId")) {
                try {
                    execute(tourism.ormanxojaligi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("nurafshonmasjidId")) {
                try {
                    execute(tourism.nurafshonmasjid(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("obirahmatgoriId")) {
                try {
                    execute(tourism.obirahmatgori(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //jizzax end
            //buttons  back overall






            if (data.equals("ortgaId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Shaharlarni tanlang");

                editMessageText.setReplyMarkup(tourism.shaharlartourism(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("ortgabigId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Bittasini tanlang");

                editMessageText.setReplyMarkup(hotel.menu1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engortgabigId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Choose one");

                editMessageText.setReplyMarkup(hotel.engmenu1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("engortgaId")) {
                try {
                    execute(TorismServiceEng.engshaharlartourism1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("ortgasamarqandId")) {
                try {
                    execute(tourism.samarqand(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("ortgaqashqadaryoId")) {
                try {
                    execute(tourism.qashqadaryo(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("ortgasurxandaryoId")) {
                try {
                    execute(tourism.surxandaryo(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("ortgasirdaryoId")) {
                try {
                    execute(tourism.sirdaryo(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("ortgafargonaId")) {
                try {
                    execute(tourism.fargona(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("ortgaxorazmId")) {
                try {
                    execute(tourism.xorazm(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("ortganamanganId")) {
                try {
                    execute(tourism.namangan(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("ortgabuxoroId")) {
                try {
                    execute(tourism.buxoro(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("ortganavoiyId")) {
                try {
                    execute(tourism.navoiy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("ortgaandijonId")) {
                try {
                    execute(tourism.andijon(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("ortgatoshkentId")) {
                try {
                    execute(tourism.toshkent(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("ortgajizzaxId")) {
                try {
                    execute(tourism.jizzax(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //eng start
            if (data.equals("engortgabigId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Bittasini tanlang");

                editMessageText.setReplyMarkup(hotel.engmenu1(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (data.equals("engortgasamarqandId")) {
                try {
                    execute(TorismServiceEng.engsamarqand(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engortgaqashqadaryoId")) {
                try {
                    execute(TorismServiceEng.engqashqadaryo(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engortgasurxandaryoId")) {
                try {
                    execute(TorismServiceEng.engsurxandaryo(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engortgasirdaryoId")) {
                try {
                    execute(TorismServiceEng.engsirdaryo(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engortgafargonaId")) {
                try {
                    execute(TorismServiceEng.engfargona(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engortgaxorazmId")) {
                try {
                    execute(TorismServiceEng.engxorazm(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engortganamanganId")) {
                try {
                    execute(TorismServiceEng.engnamangan(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engortgabuxoroId")) {
                try {
                    execute(TorismServiceEng.engbuxoro(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engortganavoiyId")) {
                try {
                    execute(TorismServiceEng.engnavoiy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engortgaandijonId")) {
                try {
                    execute(TorismServiceEng.engandijon(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engortgatoshkentId")) {
                try {
                    execute(TorismServiceEng.engtoshkent(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engortgajizzaxId")) {
                try {
                    execute(TorismServiceEng.engjizzax(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

//viloyat end desripption start
            //samarqand str
            if (data.equals("engregistonId")) {
                try {
                    execute(TorismServiceEng.engregiston(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("engshohizindaId")) {
                try {
                    execute(TorismServiceEng.engshohizinda(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engguriamirId")) {
                try {
                    execute(TorismServiceEng.enggoriamir(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engbibixonimId")) {
                try {
                    execute(TorismServiceEng.engbibixonim(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engulugbekrasadxonaId")) {
                try {
                    execute(TorismServiceEng.engulugbekras(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engafrosiyobmuzeyId")) {
                try {
                    execute(TorismServiceEng.engafrosiyob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("enghazratixizrId")) {
                try {
                    execute(TorismServiceEng.enghazratihizr(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engsiyobbozorId")) {
                try {
                    execute(TorismServiceEng.engsiyob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //samarqand end
            //qashqadaryo start
            if (data.equals("engkitobgeologiyaId")) {
                try {
                    execute(TorismServiceEng.engkquriqxona(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engoqsaroyId")) {
                try {
                    execute(TorismServiceEng.engoqsaroy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engdoruttilovatId")) {
                try {
                    execute(TorismServiceEng.engdorut(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engdorussaodatId")) {
                try {
                    execute(TorismServiceEng.engdorus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("enghazratibashirId")) {
                try {
                    execute(TorismServiceEng.engbashr(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engqarshiregistanId")) {
                try {
                    execute(TorismServiceEng.engqregiston(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("englangarotaId")) {
                try {
                    execute(TorismServiceEng.englanagrota(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engkitobobservatoriyaId")) {
                try {
                    execute(TorismServiceEng.engkastronimik(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //qashqadaryo end
            //surxandaryo str
            if (data.equals("engfayoztepaId")) {
                try {
                    execute(TorismServiceEng.engfayoztepa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engkampirtepaId")) {
                try {
                    execute(TorismServiceEng.engkampirtepa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engalhakimtermiziId")) {
                try {
                    execute(TorismServiceEng.engalhakim(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engsayrobId")) {
                try {
                    execute(TorismServiceEng.engsayrob(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engdarbandId")) {
                try {
                    execute(TorismServiceEng.engdarband(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engqumtepaId")) {
                try {
                    execute(TorismServiceEng.engqumtepa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engminorasiId")) {
                try {
                    execute(TorismServiceEng.engjarkurgan(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engfayzullaxujaId")) {
                try {
                    execute(TorismServiceEng.engfayzullaxoja(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //surxandaryo end
            //sirdaryo str
            if (data.equals("engzarafshonsohilId")) {
                try {
                    execute(TorismServiceEng.engzarafshon(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engmirzaobodId")) {
                try {
                    execute(TorismServiceEng.engmirzaobod(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engshirinsuvomboriId")) {
                try {
                    execute(TorismServiceEng.engshirinsuv(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engboyovutId")) {
                try {
                    execute(TorismServiceEng.engboyovut(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engsardobaomboriId")) {
                try {
                    execute(TorismServiceEng.engsardobasuv(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engoqoltinId")) {
                try {
                    execute(TorismServiceEng.engoqoltin(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engxovostarixmasjidId")) {
                try {
                    execute(TorismServiceEng.engxovos(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engtuyabugiztogId")) {
                try {
                    execute(TorismServiceEng.engtuyabogiz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //sirdaryo end
            //fargona str
            if (data.equals("engxonsaroyiId")) {
                try {
                    execute(TorismServiceEng.engxonsaroyi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engnorbutabiymadrasaId")) {
                try {
                    execute(TorismServiceEng.engnorbutabiy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engipakmuzeyId")) {
                try {
                    execute(TorismServiceEng.engipakmuzey(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engkulolchilikId")) {
                try {
                    execute(TorismServiceEng.engkulolchilik(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engfargonabotanikaId")) {
                try {
                    execute(TorismServiceEng.engfarbotanika(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engtarixiybinolarId")) {
                try {
                    execute(TorismServiceEng.engbuvaydat(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engqadimiyollarId")) {
                try {
                    execute(TorismServiceEng.engsuxqadimiy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engoqtepaziyoratId")) {
                try {
                    execute(TorismServiceEng.engoqtepaziyorat(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //fargona end
            //xorazm str
            if (data.equals("engichanqalaId")) {
                try {
                    execute(TorismServiceEng.engichanqala(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engkaltaminorId")) {
                try {
                    execute(TorismServiceEng.engkaltaminor(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engpakhlavanmahmudId")) {
                try {
                    execute(TorismServiceEng.engpahlavonmahmud(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engjumamasjidiId")) {
                try {
                    execute(TorismServiceEng.engjumamasjidi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("enghazratipahlavonId")) {
                try {
                    execute(TorismServiceEng.enghazratipahlavon(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engxorazmmuzeyId")) {
                try {
                    execute(TorismServiceEng.engxmuzeyi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engtoshhovliId")) {
                try {
                    execute(TorismServiceEng.engtoshhovli(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engislamxojaId")) {
                try {
                    execute(TorismServiceEng.engislomxoja(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //xorazm end
            //namangan str
            if (data.equals("engchortoqsanatoriyaId")) {
                try {
                    execute(TorismServiceEng.engchortoq(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engchustdoppiId")) {
                try {
                    execute(TorismServiceEng.engchustdoppi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engboburboginamanganId")) {
                try {
                    execute(TorismServiceEng.engboburbog(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engaxsikentId")) {
                try {
                    execute(TorismServiceEng.engaksikent(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engqoradaryosohilId")) {
                try {
                    execute(TorismServiceEng.engqoradaryo(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engnorindamId")) {
                try {
                    execute(TorismServiceEng.engdamak(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engsurxontepaId")) {
                try {
                    execute(TorismServiceEng.engsurxontepa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engurxontogId")) {
                try {
                    execute(TorismServiceEng.engurxontog(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            // namangan end
            //buxoro str
            if (data.equals("engarkqalaId")) {
                try {
                    execute(TorismServiceEng.engarkqala(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engpoikolonId")) {
                try {
                    execute(TorismServiceEng.engpoikalon(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("englabihovuzId")) {
                try {
                    execute(TorismServiceEng.englabihovuz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engbolohauzId")) {
                try {
                    execute(TorismServiceEng.engbolohauz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engsitoraimohixossaId")) {
                try {
                    execute(TorismServiceEng.engsitoramohi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engchashmaiayubId")) {
                try {
                    execute(TorismServiceEng.engchashmai(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engchorbakrId")) {
                try {
                    execute(TorismServiceEng.engchorbakr(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engnaqshbandId")) {
                try {
                    execute(TorismServiceEng.engbahouddin(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //bbuxoro end
            //navoi start
            if (data.equals("engsarmishsoyId")) {
                try {
                    execute(TorismServiceEng.engsarmishsoy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engmirsaidbahromId")) {
                try {
                    execute(TorismServiceEng.engmirsaid(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engabdullaxonbandiId")) {
                try {
                    execute(TorismServiceEng.engabdullaqalasi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engqiziltepaId")) {
                try {
                    execute(TorismServiceEng.engqiziltepa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engrabotimalikId")) {
                try {
                    execute(TorismServiceEng.engrabotimalik(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engchashmamajmuaId")) {
                try {
                    execute(TorismServiceEng.engnchashma(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engnurotaqalaId")) {
                try {
                    execute(TorismServiceEng.engnurotaqala(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engaydorkulId")) {
                try {
                    execute(TorismServiceEng.engaydarkol(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //navoi end
            //andijon str
            if (data.equals("engboburbogiandijonId")) {
                try {
                    execute(TorismServiceEng.engaboburbogi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engjomemasjidiandijonId")) {
                try {
                    execute(TorismServiceEng.engajomemasjidi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engboburmemorialId")) {
                try {
                    execute(TorismServiceEng.engboburmemorial(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engandijonqalaId")) {
                try {
                    execute(TorismServiceEng.engandijonqala(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("enggmuzbekistanId")) {
                try {
                    execute(TorismServiceEng.enggmuzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engandijonsoyId")) {
                try {
                    execute(TorismServiceEng.engandijonsoy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engxonobodId")) {
                try {
                    execute(TorismServiceEng.engxonobod(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engshahrixonsoyId")) {
                try {
                    execute(TorismServiceEng.engshahrixonsoy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //andijon end
            //toshkent str
            if (data.equals("engamirsoyId")) {
                try {
                    execute(TorismServiceEng.engamirsoy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engcharvakId")) {
                try {
                    execute(TorismServiceEng.engchorvoq(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engchimganId")) {
                try {
                    execute(TorismServiceEng.engchimyon(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engbeldersoyId")) {
                try {
                    execute(TorismServiceEng.engbildirsoy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("enggofurgulomId")) {
                try {
                    execute(TorismServiceEng.enggofurgulom(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engsolariqId")) {
                try {
                    execute(TorismServiceEng.engsolariq(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engkumushkonId")) {
                try {
                    execute(TorismServiceEng.engkumushkon(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engmenvalleyId")) {
                try {
                    execute(TorismServiceEng.engmenvalley(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //toshkent end
            //jizzax str
            if (data.equals("engzominmilliybogiId")) {
                try {
                    execute(TorismServiceEng.engzominmilliybog(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engzominsanatoriyaId")) {
                try {
                    execute(TorismServiceEng.engzominsanatoriya(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engoromId")) {
                try {
                    execute(TorismServiceEng.engorom(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engforishtogId")) {
                try {
                    execute(TorismServiceEng.engforish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engarnasoykulId")) {
                try {
                    execute(TorismServiceEng.engarnasoy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engurmonxujaligiId")) {
                try {
                    execute(TorismServiceEng.engormanxojaligi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engnurafshonmasjidId")) {
                try {
                    execute(TorismServiceEng.engnurafshonmasjid(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("engobirahmatgoriId")) {
                try {
                    execute(TorismServiceEng.engobirahmatgori(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //jizzax end
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
