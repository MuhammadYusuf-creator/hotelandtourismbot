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
                editMessageText.setText("Hotellarni tanlang");

                editMessageText.setReplyMarkup(hotel.toshkent(chatId));

                try {
                    execute(editMessageText);
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

            if (data.equals("toshkenttourismId")) {
                try {
                    execute(tourism.toshkent(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("andijontourismId")) {
                try {
                    execute(tourism.andijon(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("buxorotourismId")) {
                try {
                    execute(tourism.buxoro(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("jizzaxtourismId")) {
                try {
                    execute(tourism.jizzax(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("qashqadaryotourismId")) {
                try {
                    execute(tourism.qashqadaryo(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("navoiytourismId")) {
                try {
                    execute(tourism.navoiy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("namangantourismId")) {
                try {
                    execute(tourism.namangan(chatId));
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
                try {
                    execute(tourism.surxandaryo(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("sirdaryotourismId")) {
                try {
                    execute(tourism.sirdaryo(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("fargonatourismId")) {
                try {
                    execute(tourism.fargona(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("xorazmtourismId")) {
                try {
                    execute(tourism.xorazm(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //viloyat end
            //samarqand place start

            if (data.equals("registonId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("samarqandni qaayerini aylanmoqchisiz");

                editMessageText.setReplyMarkup(tourism.registon(chatId));

                try {
                    execute(editMessageText);
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
                try {
                    execute(tourism.shaharlartourism1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("ortgabigId")) {
                try {
                    execute(hotel.menu1(chatId));
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
