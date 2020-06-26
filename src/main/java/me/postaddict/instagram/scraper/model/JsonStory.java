package me.postaddict.instagram.scraper.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties({"status"})
public class JsonStory {
    private ReelsMedias data;
}
