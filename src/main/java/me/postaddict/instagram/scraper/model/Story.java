package me.postaddict.instagram.scraper.model;

import lombok.Data;
import java.util.List;

@Data
public class Story {

    private String typeName;
    private String id;
    private long latestReelMedia;
    private boolean canReply;
    private boolean canReshare;
    private long expiringAt;
    private boolean hasBestiesMedia;
    private boolean hasPrideMedia;
    private long seen;
    private List<StoryItem> items;
    private Account owner;
}
