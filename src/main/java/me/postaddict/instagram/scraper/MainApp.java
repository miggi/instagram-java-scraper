package me.postaddict.instagram.scraper;

import me.postaddict.instagram.scraper.interceptor.UserAgents;
import me.postaddict.instagram.scraper.model.Account;
import me.postaddict.instagram.scraper.model.Media;
import me.postaddict.instagram.scraper.model.PageObject;
import me.postaddict.instagram.scraper.model.Story;
import okhttp3.OkHttpClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        try {

            // Instagram instagram = new Instagram(null);
            Instagram instagram = InstagramFactory.getAuthenticatedInstagramClient(
                    "javadzomorodian", "continueTalash@2020", UserAgents.OSX_SAFARI);

            // Account account = instagram.getAccountByUsername("shiraz1400.ir");
            long[] ids = {2004595101, 470174409, 2097652665};
            // userId 2097652665
            // "shirazfood"
            // PageObject<Media> media = instagram.getMedias("shirazfood", 1);
            List<Story> stories = instagram.getStories(ids);
            // System.out.println(account.getMedia().getCount());
            System.out.println(stories);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
