package me.postaddict.instagram.scraper;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import me.postaddict.instagram.scraper.model.Story;

public class JacksonMain {
    public static void main(String[] args)
            throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        Story story = mapper.readValue(new File("story_example.json"), Story.class);
        System.out.println(story);
    }
}
