package me.postaddict.instagram.scraper.model;

import lombok.Data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@JsonIgnoreProperties({"__typename", "tallies", "option_a_font_size", "option_b_font_size",
        "option_a", "option_b", "is_private", "media", "name"})
public class TappableObject {
    // private String typename;
    private float x;
    private float y;
    private float width;
    private float height;
    private float rotation;
    private String customTitle;
    private String attribution;

    private String shortcode;
    private String username;
    private String fullName;
    // private boolean isPrivate;

    private String id;
    // private String option_a;
    // private String option_b;
    // private float option_a_font_size;
    // private float option_b_font_size;
    private String question;
    private boolean viewerCanInteract;
    private String viewerVote;
    // private List<Tally> tallies;
}
