package me.postaddict.instagram.scraper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyNamingStrategy;
import me.postaddict.instagram.scraper.model.Story;

public class JsonMain {

    public static void main(String[] args) throws FileNotFoundException {
        JsonbConfig config = new JsonbConfig()
                .withPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CASE_WITH_UNDERSCORES)
                .withNullValues(true);
        Jsonb jsonb = JsonbBuilder.create(config);
        InputStream is = new FileInputStream("story_example.json");
        Story story = jsonb.fromJson(is, Story.class);
        System.out.println(story);
    }

}
