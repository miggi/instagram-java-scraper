package me.postaddict.instagram.scraper;

import me.postaddict.instagram.scraper.interceptor.UserAgents;
import me.postaddict.instagram.scraper.model.Account;
import me.postaddict.instagram.scraper.model.Media;
import me.postaddict.instagram.scraper.model.PageObject;
import me.postaddict.instagram.scraper.model.Story;

import java.io.IOException;

public class MainApp {
    
    public static void main(String[] args) {
        try {
            Instagram instagram = new Instagram(null);

//            Account account = instagram.getAccountByUsername("shiraz1400.ir");
            long[] ids = { 2004595101, 470174409, 2097652665 };
            // userId 2097652665
            // "shirazfood"
            // PageObject<Media> media = instagram.getMedias("shirazfood", 1);
            Story story = instagram.getStory(ids);
<<<<<<< HEAD
            // // System.out.println(account.getMedia().getCount());
            System.out.println("hi");
=======
            // System.out.println(account.getMedia().getCount());
            System.out.println(story);
>>>>>>> 3d5fe49e29b8ccbbd13c7774894a0f7ea7db0efd

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
