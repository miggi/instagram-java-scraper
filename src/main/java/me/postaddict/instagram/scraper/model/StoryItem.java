package me.postaddict.instagram.scraper.model;

import lombok.Data;

import java.util.List;

@Data
public class StoryItem {
    private String audience;
    private  EdgeStoryMediaViewers edgeStoryMediaViewers;
    private String typeName;
    private String id;
    private int height;
    private  int width;
    private List<DisplayResource> displayResources;
    private String displayUrl;
    private String mediaPreview;
    private boolean gatingInfo;
    private boolean factCheckOverallRating;
    private boolean factCheckInformation;
    private boolean sensitivityFrictionInfo;
    private long takenAtTimestamp;
    private long expiringAtTimestamp;
    private String storyCtaUrl;
    private long storyViewCount;
    private boolean isVideo;
    private String trackingToken;
    private List<TappableObject> tappableObjects;
    private String storyAppAttribution;
//    private String edgeMediaToSponsorUser;
    private String mutingInfo;
}


