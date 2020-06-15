package me.postaddict.instagram.scraper;

import me.postaddict.instagram.scraper.interceptor.UserAgents;
import me.postaddict.instagram.scraper.model.Media;
import me.postaddict.instagram.scraper.model.PageObject;
import me.postaddict.instagram.scraper.model.Story;

import java.io.IOException;

public class MainApp {
    public static void main(String[] args) {
        try {
            Instagram instagram = InstagramFactory.getAuthenticatedInstagramClient("javadzomorodian",
                    "continueTalash@2020", UserAgents.OSX_CHROME);

            // Account account = instagram.getAccountByUsername("shiraz1400.ir");
            long[] ids = { 2004595101, 470174409, 2097652665 };
            PageObject<Media> media = instagram.getMedias("shirazfood", 1);
            Story story = instagram.getStory(ids);
            // System.out.println(account.getMedia().getCount());
            System.out.println("hi");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
