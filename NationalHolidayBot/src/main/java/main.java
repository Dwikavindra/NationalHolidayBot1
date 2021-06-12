
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import javax.security.auth.login.LoginException;
import java.text.SimpleDateFormat;
import java.util.*;

public class main extends ListenerAdapter {
    long year_in_milliseconds = 1000L * 60 * 60 * 24 * 365;

    public static JDABuilder builder;

    public static void main(String[] args) throws LoginException {
        String token = System.getenv("TOKEN");
        builder = JDABuilder.createDefault(token);
        builder.addEventListeners(new main());
        builder.build();
    }

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) {
            return;
        }

        if (event.getMessage().getContentRaw().toLowerCase(Locale.ROOT).equals("/showallnationalholiday")) {//lower case all the letters first
            String message="https://bit.ly/2TQ9tiW";
            event.getChannel().sendMessage("U can check our next holidays here!  "+message).queue();
        }
    }

    @Override
    public void onReady(ReadyEvent event) {

        Calendar TahunBaruMasehi = new GregorianCalendar(2021, 0, 1,9,00);
        Date tahunbarumasehi = TahunBaruMasehi.getTime();
        Calendar HariRayaNyepi = new GregorianCalendar(2021, 2, 14,9,00);
        Date harirayanyepi = HariRayaNyepi.getTime();
        Calendar IdulFitri = new GregorianCalendar(2021, 4, 13,9,00);
        Date idulfitri = IdulFitri.getTime();
        Calendar IdulAdha = new GregorianCalendar(2021, 6, 20,9,00);
        Date iduladha = IdulAdha.getTime();
        Calendar HariNatal = new GregorianCalendar(2021, 11, 25,9,00);
        Date harinatal = HariNatal.getTime();
        Calendar TahunBaruImlek = new GregorianCalendar(2021, 1, 12,9,00);
        Date tahunbaruimlek = TahunBaruImlek.getTime();
        Calendar JumatAgung = new GregorianCalendar(2021, 3, 2,9,00);
        Date jumatagung = JumatAgung.getTime();
        Calendar CutiBersama = new GregorianCalendar(2021, 2, 12,9,00);
        Date cutibersama = CutiBersama.getTime();
        Calendar TahunBaruHijriyah = new GregorianCalendar(2021, 0, 1,9,00);
        Date tahunbaruhijriyah = TahunBaruHijriyah.getTime();
        Calendar IsraMiraj = new GregorianCalendar(2021, 7, 10,9,00);
        Date isramiraj = IsraMiraj.getTime();
        Calendar HariBuruh = new GregorianCalendar(2021, 4, 1,9,00);
        Date hariburuh = HariBuruh.getTime();
        Calendar HariRayaWaisak = new GregorianCalendar(2021, 4, 26,9,00);
        Date harirayawaisak = HariRayaWaisak.getTime();
        Calendar HariKemerdekaan = new GregorianCalendar(2021, 7, 17,9,00);
        Date harikemerdekaan = HariKemerdekaan.getTime();
        Calendar KenaikanIsaAlamasih = new GregorianCalendar(2021, 4, 13,9,00);
        Date kenaikanisalmasih = KenaikanIsaAlamasih.getTime();
        Calendar HariLahirPancasila = new GregorianCalendar(2021, 5, 1,9,00);
        Date harilahirpancasila = HariLahirPancasila.getTime();
        Calendar MaulidNabi = new GregorianCalendar(2021, 9, 18,9,00);
        Date maulidnabi = MaulidNabi.getTime();
        Calendar CutiBersama1 = new GregorianCalendar(2021, 4, 17,9,00);
        Date cutibersama1 = CutiBersama1.getTime();






        Timer TAHUNBARUMASEHI = new Timer();
        TAHUNBARUMASEHI.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run(){
                String message = "(THE BOT HAS A TENDANCY TO NOTIFY PASSED HOLIDAY PLEASE IGNORE IF THE EVENT HAS HAPPENED) Today is Tahun Baru Masehi/New year"+ "\n" +" Happy New Year To all of You! May 2021 bring joy and greatness to all of us\n"+"Here are some facts about it https://en.wikipedia.org/wiki/New_Year";
                JDA jda = event.getJDA();
                //explain the bot has a tendancy to write others already passed events
                for (Guild guild : jda.getGuilds()) {
                    guild.getDefaultChannel().sendMessage(message).queue();
                }

            }
        },tahunbarumasehi,year_in_milliseconds);

        Timer HARIRAYANYEPI = new Timer();
        HARIRAYANYEPI.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run(){
                String message = "(THE BOT HAS A TENDANCY TO NOTIFY PASSED HOLIDAY PLEASE IGNORE IF THE EVENT HAS HAPPENED) Today is Nyepi/Balinese Day of Silence"+ "\n" +"Check out some facts about it https://en.wikipedia.org/wiki/Nyepi";
                JDA jda = event.getJDA();
                //explain the bot has a tendancy to write others already passed events
                for (Guild guild : jda.getGuilds()) {
                    guild.getDefaultChannel().sendMessage(message).queue();
                }

            }
        },harirayanyepi,year_in_milliseconds);
        Timer IDULFITRI = new Timer();
        IDULFITRI.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run(){
                String message = "(THE BOT HAS A TENDANCY TO NOTIFY PASSED HOLIDAY PLEASE IGNORE IF THE EVENT HAS HAPPENED) Today is Idul Fitri The Holiday will last from 13th to 14th of May 2021 "+ "\n" +" Happy Eid Al Fitr to all of those who celebrate it !\n"+"Here are some facts about it https://en.wikipedia.org/wiki/Eid_al-Fitr";
                JDA jda = event.getJDA();
                //explain the bot has a tendancy to write others already passed events
                for (Guild guild : jda.getGuilds()) {
                    guild.getDefaultChannel().sendMessage(message).queue();
                }

            }
        },idulfitri,year_in_milliseconds);
        Timer IDULADHA = new Timer();
        IDULADHA.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run(){
                String message = "(THE BOT HAS A TENDANCY TO NOTIFY PASSED HOLIDAY PLEASE IGNORE IF THE EVENT HAS HAPPENED) Today is Idul Adha "+ "\n" +" Happy Eid Al Adha To all of You who celebrated ! May 2021 bring joy and greatness to all of us\n"+"Here are some facts about it https://en.wikipedia.org/wiki/Eid_al-Adha";
                JDA jda = event.getJDA();
                //explain the bot has a tendancy to write others already passed events
                for (Guild guild : jda.getGuilds()) {
                    guild.getDefaultChannel().sendMessage(message).queue();
                }

            }
        },iduladha,year_in_milliseconds);
        Timer HARINATAL= new Timer();
        HARINATAL.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run(){
                String message = "(THE BOT HAS A TENDANCY TO NOTIFY PASSED HOLIDAY PLEASE IGNORE IF THE EVENT HAS HAPPENED) Today is Christmas"+ "\n" +" Merry Christmas New Year To all of You! \n"+"Here are some facts about it https://en.wikipedia.org/wiki/Christmas ";
                JDA jda = event.getJDA();
                //explain the bot has a tendancy to write others already passed events
                for (Guild guild : jda.getGuilds()) {
                    guild.getDefaultChannel().sendMessage(message).queue();
                }

            }
        },harinatal,year_in_milliseconds);
        Timer TAHUNBARUIMLEK = new Timer();
        TAHUNBARUIMLEK.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run(){
                String message = "(THE BOT HAS A TENDANCY TO NOTIFY PASSED HOLIDAY PLEASE IGNORE IF THE EVENT HAS HAPPENED) Today is Chinese New Year"+ "\n" +" Happy Chinese New Year To all of You! \n"+"Here are some facts about it https://en.wikipedia.org/wiki/Chinese_New_Year";
                JDA jda = event.getJDA();
                //explain the bot has a tendancy to write others already passed events
                for (Guild guild : jda.getGuilds()) {
                    guild.getDefaultChannel().sendMessage(message).queue();
                }

            }
        },tahunbaruimlek,year_in_milliseconds);
        Timer JUMATAGUNG = new Timer();
        JUMATAGUNG.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run(){
                String message = "(THE BOT HAS A TENDANCY TO NOTIFY PASSED HOLIDAY PLEASE IGNORE IF THE EVENT HAS HAPPENED) Today is GoodFriday"+ "\n"+"Here are some facts about it https://en.wikipedia.org/wiki/Good_Friday";
                JDA jda = event.getJDA();
                //explain the bot has a tendancy to write others already passed events
                for (Guild guild : jda.getGuilds()) {
                    guild.getDefaultChannel().sendMessage(message).queue();
                }

            }
        },jumatagung,year_in_milliseconds);
        Timer CUTIBERSAMA = new Timer();
        CUTIBERSAMA.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run(){
                String message = "(THE BOT HAS A TENDANCY TO NOTIFY PASSED HOLIDAY PLEASE IGNORE IF THE EVENT HAS HAPPENED) Holiday has come..... from 17-19 Mei is Cuti Bersama"+ "\n" +" Hope everyone has a great 3 days holiday\n";
                JDA jda = event.getJDA();
                //explain the bot has a tendancy to write others already passed events
                for (Guild guild : jda.getGuilds()) {
                    guild.getDefaultChannel().sendMessage(message).queue();
                }

            }
        },cutibersama,year_in_milliseconds);
        Timer CUTIBERSAMA1 = new Timer();
        CUTIBERSAMA1.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run(){
                String message = "(THE BOT HAS A TENDANCY TO NOTIFY PASSED HOLIDAY PLEASE IGNORE IF THE EVENT HAS HAPPENED) Another holiday has come... but this time its only for one day hahah"+ "\n" +" Happy Holidays to everyone!\n";
                JDA jda = event.getJDA();
                //explain the bot has a tendancy to write others already passed events
                for (Guild guild : jda.getGuilds()) {
                    guild.getDefaultChannel().sendMessage(message).queue();
                }

            }
        },cutibersama1,year_in_milliseconds);
        Timer ISRAMIRAJ = new Timer();
        ISRAMIRAJ.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run(){
                String message = "(THE BOT HAS A TENDANCY TO NOTIFY PASSED HOLIDAY PLEASE IGNORE IF THE EVENT HAS HAPPENED) Today is ISRAMIRAJ"+ "\n"+"Here are some facts about it https://en.wikipedia.org/wiki/Isra_and_Mi%27raj";
                JDA jda = event.getJDA();
                //explain the bot has a tendancy to write others already passed events
                for (Guild guild : jda.getGuilds()) {
                    guild.getDefaultChannel().sendMessage(message).queue();
                }

            }
        },isramiraj,year_in_milliseconds);
        Timer TAHUNBARUHIJRIAH = new Timer();
        TAHUNBARUHIJRIAH.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run(){
                String message = "(THE BOT HAS A TENDANCY TO NOTIFY PASSED HOLIDAY PLEASE IGNORE IF THE EVENT HAS HAPPENED) Today is Tahun Baru Hijriah"+ "\n"+"Here are some facts about it https://id.wikipedia.org/wiki/Tahun_Baru_Hijriyah";
                JDA jda = event.getJDA();
                //explain the bot has a tendancy to write others already passed events
                for (Guild guild : jda.getGuilds()) {
                    guild.getDefaultChannel().sendMessage(message).queue();
                }

            }
        },tahunbaruhijriyah,year_in_milliseconds);
        Timer HARIBURUH = new Timer();
        HARIBURUH.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run(){
                String message = "(THE BOT HAS A TENDANCY TO NOTIFY PASSED HOLIDAY PLEASE IGNORE IF THE EVENT HAS HAPPENED) Today is MAYDAY !!!"+ "\n" +"Here are some facts about it https://en.wikipedia.org/wiki/Mayday";
                JDA jda = event.getJDA();
                //explain the bot has a tendancy to write others already passed events
                for (Guild guild : jda.getGuilds()) {
                    guild.getDefaultChannel().sendMessage(message).queue();
                }

            }
        },hariburuh,year_in_milliseconds);
        Timer HARIRAYAWAISAK = new Timer();
        HARIRAYAWAISAK.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run(){
                String message = "(THE BOT HAS A TENDANCY TO NOTIFY PASSED HOLIDAY PLEASE IGNORE IF THE EVENT HAS HAPPENED) Today is Vesak day..."+ "\n"+"Here are some facts about it https://en.wikipedia.org/wiki/Vesak";
                JDA jda = event.getJDA();
                //explain the bot has a tendancy to write others already passed events
                for (Guild guild : jda.getGuilds()) {
                    guild.getDefaultChannel().sendMessage(message).queue();
                }

            }
        },harirayawaisak,year_in_milliseconds);
        Timer HARIRAYAKEMERDEKAAN = new Timer();
        HARIRAYAKEMERDEKAAN.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run(){
                String message = "(THE BOT HAS A TENDANCY TO NOTIFY PASSED HOLIDAY PLEASE IGNORE IF THE EVENT HAS HAPPENED) MERDEKA!!! Today is our Independence Day!!"+ "\n" +" Don't forget to raise your flags and celebrate with pride on this joyous day\n"+"Here are some facts about it https://en.wikipedia.org/wiki/Independence_Day_(Indonesia)";
                JDA jda = event.getJDA();
                //explain the bot has a tendancy to write others already passed events
                for (Guild guild : jda.getGuilds()) {
                    guild.getDefaultChannel().sendMessage(message).queue();
                }

            }
        },harikemerdekaan,year_in_milliseconds);
        Timer KENAIKANISAALAMASIH = new Timer();
        KENAIKANISAALAMASIH.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run(){
                String message = "\"(THE BOT HAS A TENDANCY TO NOTIFY PASSED HOLIDAY PLEASE IGNORE IF THE EVENT HAS HAPPENED) MERDEKA!!! Today is Ascension Day\n"+"Here are some facts about it https://id.wikipedia.org/wiki/Kenaikan_Yesus_Kristus";
                JDA jda = event.getJDA();
                //explain the bot has a tendancy to write others already passed events
                for (Guild guild : jda.getGuilds()) {
                    guild.getDefaultChannel().sendMessage(message).queue();
                }

            }
        },kenaikanisalmasih,year_in_milliseconds);
        Timer HARILAHIRPANCASILA = new Timer();
        HARILAHIRPANCASILA.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run(){
                String message = "(THE BOT HAS A TENDANCY TO NOTIFY PASSED HOLIDAY PLEASE IGNORE IF THE EVENT HAS HAPPENED) Today is Pancasila Day"+ "\n" +" Let us take a moment an honour the heroes that has fallen fighting for this country's indepedence \n"+"Here are some facts about it https://id.wikipedia.org/wiki/Lahirnya_Pancasila";
                JDA jda = event.getJDA();
                //explain the bot has a tendancy to write others already passed events
                for (Guild guild : jda.getGuilds()) {
                    guild.getDefaultChannel().sendMessage(message).queue();
                }

            }
        },harilahirpancasila,year_in_milliseconds);
        Timer MAULIDNABI = new Timer();
        MAULIDNABI.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run(){
                String message = "(THE BOT HAS A TENDANCY TO NOTIFY PASSED HOLIDAY PLEASE IGNORE IF THE EVENT HAS HAPPENED) Today is Maulid Nabi"+ "\n"+"Here are some facts about it https://id.wikipedia.org/wiki/Maulid_Nabi_Muhammad";
                JDA jda = event.getJDA();
                //explain the bot has a tendancy to write others already passed events
                for (Guild guild : jda.getGuilds()) {
                    guild.getDefaultChannel().sendMessage(message).queue();
                }

            }
        },maulidnabi,year_in_milliseconds);
    }
    }
