package me.postaddict.instagram.scraper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyNamingStrategy;
import me.postaddict.instagram.scraper.model.JsonStory;
import me.postaddict.instagram.scraper.model.ReelsMedia;
import me.postaddict.instagram.scraper.model.Story;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JsonMain {


    public static void main(String[] args) throws FileNotFoundException {

        String pathStories = "stories_example.json";

        JsonbConfig config = new JsonbConfig()
                .withPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CASE_WITH_UNDERSCORES)
                .withNullValues(true);
        Jsonb jsonb = JsonbBuilder.create(config);
        InputStream is = new FileInputStream(pathStories);

        JsonStory dj = jsonb.fromJson(is, JsonStory.class);
        System.out.println("hi");
        System.out.println(dj.getData().getReelsMedia().get(0).getItems().get(0));

    }

    public static String is2string(String path) {
        String result = "";
        try {
            // Creating an InputStream object
            InputStream inputStream = new FileInputStream(path);
            // creating an InputStreamReader object
            InputStreamReader isReader = new InputStreamReader(inputStream);
            // Creating a BufferedReader object
            BufferedReader reader = new BufferedReader(isReader);
            StringBuffer sb = new StringBuffer();
            String str;
            while ((str = reader.readLine()) != null) {
                sb.append(str);
            }
            System.out.println(sb.toString());
            result = sb.toString();
        } catch (Exception exception) {
            System.out.println(exception);
        }
        return result;
    }
}
