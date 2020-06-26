package me.postaddict.instagram.scraper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase;
import me.postaddict.instagram.scraper.model.JsonStory;
import me.postaddict.instagram.scraper.model.ReelsMedia;
import me.postaddict.instagram.scraper.model.Story;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JsonMain {


    public static void main(String[] args) throws FileNotFoundException {

        String pathStories = "stories_example.json";
        String pathStory = "story_example.json";

        JsonbConfig config = new JsonbConfig()
                .withPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CASE_WITH_UNDERSCORES)
                .withNullValues(true);
        Jsonb jsonb = JsonbBuilder.create(config);
        InputStream is = new FileInputStream(pathStories);

        JsonStory dj = jsonb.fromJson(is, JsonStory.class);
        System.out.println(dj.getClass());
        System.out.println(dj.getData().getClass());
        System.out.println(dj.getData().getReelsMedia().getClass());
        System.out.println(dj.getData().getReelsMedia());

        // Story story = (Story) dj.getData().getReelsMedia().get(0);
        // System.out.println(dj.getData().getReelsMedia().get(0).getCanReply());


    }
}
