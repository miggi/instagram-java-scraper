package me.postaddict.instagram.scraper.mapper;

import me.postaddict.instagram.scraper.model.*;

import java.io.InputStream;

public interface Mapper {
    Account mapAccount(InputStream jsonStream);

    PageObject<Media> mapMedias(InputStream jsonStream);

    Media mapMedia(InputStream jsonStream);

    ReelsMedia mapStory(InputStream jsonStream);

    PageObject<Comment> mapComments(InputStream jsonStream);

    Location mapLocation(InputStream jsonStream);

    Tag mapTag(InputStream jsonStream);

    PageObject<Account> mapFollow(InputStream jsonStream);

    PageObject<Account> mapFollowers(InputStream jsonStream);

    ActionResponse<Comment> mapMediaCommentResponse(InputStream jsonStream);

    String getLastMediaShortCode(InputStream jsonStream);

    PageObject<Account> mapLikes(InputStream likesStream);

    ActivityFeed mapActivity(InputStream jsonStream);

    boolean isAuthenticated(InputStream jsonStream);
}
