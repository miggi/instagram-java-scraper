package me.postaddict.instagram.scraper.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties({"__typename", "owner", "user"})
public class Story {
    private String id;
    @JsonProperty("latest_reel_media")
    private Long latestReelMedia;
    @JsonProperty("can_reply")
    private Boolean canReply;
    @JsonProperty("can_reshare")
    private Boolean canReshare;
    @JsonProperty("expiring_at")
    private Long expiringAt;
    @JsonProperty("has_besties_media")
    private Boolean hasBestiesMedia;
    @JsonProperty("has_pride_media")
    private Boolean hasPrideMedia;
    private Boolean seen;
    private List<StoryItem> items;
    // private Account owner;

}
