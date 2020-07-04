package me.postaddict.instagram.scraper.model;

import java.util.List;
import lombok.Data;

@Data
public class GatingInfo {
    private List<String> buttons;
    private String description;
    private String gatingType;
    private String title;
    private String centerButton;
    private String postRevealCta;

}
