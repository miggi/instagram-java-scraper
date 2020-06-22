package me.postaddict.instagram.scraper.model;

import lombok.Data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@JsonIgnoreProperties({"owner", "audience", "edge_story_media_viewers", "__typename", "dimensions",
        "display_resources", "tappable_objects", "edge_media_to_sponsor_user",
        "story_app_attribution", "media_overlay_info", "overlay_image_resources", "video_resources",
        "muting_info"})
public class StoryItem {
    // private EdgeStoryMediaViewers edgeStoryMediaViewers;
    private String id;
    // private int height;
    // private int width;
    // private List<DisplayResource> displayResources;
    private String displayUrl;
    private String mediaPreview;
    private Boolean gatingInfo;
    private Boolean factCheckOverallRating;
    private Boolean factCheckInformation;
    private Boolean sensitivityFrictionInfo;
    private Long takenAtTimestamp;
    private Long expiringAtTimestamp;
    private String storyCtaUrl;
    private Long storyViewCount;
    private Boolean isVideo;
    private String trackingToken;
    private Boolean hasAudio;
    private Double videoDuration;
    // private List<TappableObject> tappableObjects;
    // private String storyAppAttribution;
    // private String edgeMediaToSponsorUser;
}


