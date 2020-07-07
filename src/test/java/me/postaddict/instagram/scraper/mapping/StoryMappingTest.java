package me.postaddict.instagram.scraper.mapping;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.junit.Test;
import junit.framework.Assert;
import me.postaddict.instagram.scraper.mapper.Mapper;
import me.postaddict.instagram.scraper.mapper.ModelMapper;
import me.postaddict.instagram.scraper.model.*;
import java.util.List;

public class StoryMappingTest {

    @Test
    public void test() throws FileNotFoundException {
        File file = new File("stories_example2.json");
        InputStream jsonStream = new FileInputStream(file);
        ModelMapper mapper = new ModelMapper();
        List<Story> stories = mapper.mapStory(jsonStream);

        Long a = 2004595101L;
        assertEquals(stories.get(0).getId(), a);

        assertEquals(stories.get(0).getOwner().getUsername(), "shiraz1400.ir");

        assertFalse(stories.get(0).getItems().get(0).getIsVideo());


        assertTrue(stories.get(0).getCanReply());

        // System.out.println(stories);

    }
}
