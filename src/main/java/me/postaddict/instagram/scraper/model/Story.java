package me.postaddict.instagram.scraper.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties({"__typename", "user"})
public class Story {
    private Long id;
    private Long latestReelMedia;
    private Boolean canReply;
    private Boolean canReshare;
    private Long expiringAt;
    private Boolean hasBestiesMedia;
    private Boolean hasPrideMedia;
    private Boolean seen;
    private List<StoryItem> items;
    private Account owner;

}
