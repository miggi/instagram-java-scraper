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
import me.postaddict.instagram.scraper.model.ReelsMedias;
import me.postaddict.instagram.scraper.model.Story;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JsonMain {


    public static void main(String[] args) throws FileNotFoundException {

        String pathStories = "stories_example2.json";
        String pathStory = "story_example.json";

        InputStream is1 = new FileInputStream(pathStories);

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.setPropertyNamingStrategy(
                    com.fasterxml.jackson.databind.PropertyNamingStrategy.SNAKE_CASE);

            JsonStory dj1 = objectMapper.readValue(is1, JsonStory.class);
            JsonNode jsonNode = objectMapper.readTree(is1);
            System.out.println("hi");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
