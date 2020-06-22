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
    @JsonProperty("display_url")
    private String displayUrl;
    @JsonProperty("media_preview")
    private String mediaPreview;
    @JsonProperty("gating_info")
    private Boolean gatingInfo;
    @JsonProperty("fact_check_overall_rating")
    private Boolean factCheckOverallRating;
    @JsonProperty("fact_check_information")
    private Boolean factCheckInformation;
    @JsonProperty("sensitivity_friction_info")
    private Boolean sensitivityFrictionInfo;
    @JsonProperty("taken_at_timestamp")
    private Long takenAtTimestamp;
    @JsonProperty("expiring_at_timestamp")
    private Long expiringAtTimestamp;
    @JsonProperty("story_cta_url")
    private String storyCtaUrl;
    @JsonProperty("story_view_count")
    private Long storyViewCount;
    @JsonProperty("is_video")
    private Boolean isVideo;
    @JsonProperty("tracking_token")
    private String trackingToken;
    @JsonProperty("has_audio")
    private Boolean hasAudio;
    @JsonProperty("video_duration")
    private Double videoDuration;
    // private List<TappableObject> tappableObjects;
    // private String storyAppAttribution;
    // private String edgeMediaToSponsorUser;
}


