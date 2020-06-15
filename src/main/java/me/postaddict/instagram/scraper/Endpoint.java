package me.postaddict.instagram.scraper;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Endpoint {
    public static final String REFERER = "Referer";
    public static final String BASE_URL = "https://www.instagram.com";
    public static final String LOGIN_URL = "https://www.instagram.com/accounts/login/ajax/";
    public static final String MEDIA_LINK = "https://www.instagram.com/p/{{code}}";
    public static final String ACCOUNT_JSON_INFO = "https://www.instagram.com/{{username}}/?__a=1";
    public static final String ACCOUNT_MEDIAS = "https://instagram.com/graphql/query/?query_id=17888483320059182&id={{userId}}&first=30&after={{maxId}}";
    public static final String TAG_JSON_INFO = "https://www.instagram.com/explore/tags/{{tag_name}}/?__a=1";
    public static final String MEDIA_JSON_INFO = "https://www.instagram.com/p/{{code}}/?__a=1";
    public static final String MEDIA_JSON_BY_LOCATION_ID = "https://www.instagram.com/explore/locations/{{facebookLocationId}}/?__a=1&max_id={{maxId}}";
    public static final String MEDIA_JSON_BY_TAG = "https://www.instagram.com/explore/tags/{{tag}}/?__a=1&max_id={{maxId}}";
    public static final String GENERAL_SEARCH = "https://www.instagram.com/web/search/topsearch/?query={{query}}";
    public static final String ACCOUNT_JSON_INFO_BY_ID = "https://www.instagram.com/graphql/query/?query_id=17880160963012870&id={{userId}}&first=1";
    public static final String LAST_COMMENTS_BY_CODE = "ig_shortcode({{code}}){comments.last({{count}}){count,nodes{id,created_at,text,user{id,profile_pic_url,username,follows{count},followed_by{count},biography,full_name,media{count},is_private,external_url,is_verified}},page_info}}";
    public static final String COMMENTS_BEFORE_COMMENT_ID_BY_CODE = "https://www.instagram.com/graphql/query/?query_id=17852405266163336&shortcode={{shortcode}}&first={{count}}&after={{commentId}}";
    public static final String MEDIA_LIKE = "https://www.instagram.com/web/likes/{{mediaId}}/like/";
    public static final String MEDIA_UNLIKE = "https://www.instagram.com/web/likes/{{mediaId}}/unlike/";
    public static final String MEDIA_COMMENTS_ADD = "https://www.instagram.com/web/comments/{{mediaId}}/add/";
    public static final String MEDIA_COMMENTS_DELETE = "https://www.instagram.com/web/comments/{{mediaId}}/delete/{{commentId}}/";
    public static final String LIKES_BY_SHORTCODE = "https://www.instagram.com/graphql/query/?query_id=17864450716183058&variables={\"shortcode\":\"{{shortcode}}\",\"first\":{{count}},\"after\":\"{{after}}\"}";
    public static final String FOLLOWS_URL = "https://www.instagram.com/graphql/query/?query_id=17874545323001329&variables={\"id\": {{userId}}, \"first\": {{count}}, \"after\": \"{{endCursor}}\"}";
    public static final String FOLLOWERS_URL = "https://www.instagram.com/graphql/query/?query_id=17851374694183129&variables={\"id\": {{userId}}, \"first\": {{count}}, \"after\": \"{{endCursor}}\"}";
    public static final String FOLLOW_ACCOUNT = "https://www.instagram.com/web/friendships/{{userId}}/follow/";
    public static final String UNFOLLOW_ACCOUNT = "https://www.instagram.com/web/friendships/{{userId}}/unfollow/";
    public static final String ACTIVITY_FEED = "https://www.instagram.com/accounts/activity/?__a=1";
    public static final String ACTIVITY_MARK_CHECKED = "https://www.instagram.com/web/activity/mark_checked/";

    // ***** STORY *****
    public static final String STORIES_URL = BASE_URL
            + "/graphql/query/?query_hash=f455598773da838d763d2ebad0eb658b&variables={\"reel_ids\":[{{reelIds}}],\"tag_names\":[],\"location_ids\":[],\"highlight_reel_ids\":[],\"precomposed_overlay\":false,\"show_story_viewer_list\":true,\"story_viewer_fetch_count\":50,\"story_viewer_cursor\":\"\",\"stories_video_dash_manifest\":false}";
    // public static final String MAIN_STORIES_URL = BASE_URL +
    // "/graphql/query/?query_hash=45246d3fe16ccc6577e0bd297a5db1ab&variables={\"reel_ids\":[],\"tag_names\":[],\"location_ids\":[],\"highlight_reel_ids\":[{{highlightReelIds}}],\"precomposed_overlay\":false}";
    // public static final String HIGHLIGHT_STORIES_USER_ID_URL = BASE_URL +
    // "/graphql/query/?query_hash=c9100bf9110dd6361671f113dd02e7d6&variables={\"user_id\":\"{{userId}}\",\"include_chaining\":false,\"include_reel\":false,\"include_suggested_users\":false,\"include_logged_out_extras\":false,\"include_highlight_reels\":true,\"include_related_profiles\":false}";
    // public static final String HIGHLIGHT_STORIES_REEL_ID_URL = BASE_URL +
    // "/graphql/query/?query_hash=45246d3fe16ccc6577e0bd297a5db1ab&variables={\"reel_ids\":[],\"tag_names\":[],\"location_ids\":[],\"highlight_reel_ids\":[],\"precomposed_overlay\":false}";
    // public static final String STORIES_UA = "Instagram 123.0.0.21.114 (iPhone;
    // CPU iPhone OS 11_4 like Mac OS X; en_US; en-US; scale=2.00; 750x1334)
    // AppleWebKit/605.1.15";
    // ***** STORY *****

    public static final String USERNAME = "{{username}}";
    public static final String USER_ID = "{{userId}}";
    public static final String MAX_ID = "{{maxId}}";
    public static final String CODE = "{{code}}";
    public static final String TAG_NAME = "{{tag_name}}";
    public static final String COUNT = "{{count}}";
    public static final String AFTER = "{{after}}";
    public static final String SHORTCODE = "{{shortcode}}";
    public static final String COMMENT_ID = "{{commentId}}";
    public static final String MEDIA_ID = "{{mediaId}}";
    public static final String END_CURSOR = "{{endCursor}}";
    public static final String TAG = "{{tag}}";
    public static final String QUERY = "{{query}}";
    public static final String FACEBOOK_LOCATION_ID = "{{facebookLocationId}}";
    public static final String REEL_IDS = "{{reelIds}}";

    public static String getAccountId(String username) {
        return ACCOUNT_JSON_INFO.replace(USERNAME, username);
    }

    public static String getStoryJsonInfoLinkByAccountId(long[] userIds) {
        String ids = "";
        for (long userId : userIds) {
            ids += "\"" + String.valueOf(userId) + "\", ";
        }
        return STORIES_URL.replace(REEL_IDS, ids.substring(0, ids.length() - 2));
    }

    public static String getAccountJsonInfoLinkByAccountId(long userId) {
        return ACCOUNT_JSON_INFO_BY_ID.replace(USER_ID, "" + userId);
    }

    public static String getAccountMediasJsonLink(long userId, String maxId) {
        if (maxId == null) {
            maxId = "";
        }
        return ACCOUNT_MEDIAS.replace(USER_ID, Long.toString(userId)).replace(MAX_ID, maxId);
    }

    public static String getTagJsonByTagName(String tagName) {
        return TAG_JSON_INFO.replace(TAG_NAME, tagName);
    }

    public static String getMediaPageLinkByCode(String code) {
        return MEDIA_LINK.replace(CODE, code);
    }

    public static String getMediaPageLinkByCodeMatcher() {
        return MEDIA_LINK.replace(CODE, "[\\w-_]+");
    }

    public static String getMediaJsonLinkByShortcode(String shortcode) {
        return MEDIA_JSON_INFO.replace(CODE, shortcode);
    }

    public static String getMediasJsonByLocationIdLink(String facebookLocationId, String maxId) {
        if (maxId == null) {
            maxId = "";
        }
        return MEDIA_JSON_BY_LOCATION_ID.replace(FACEBOOK_LOCATION_ID, facebookLocationId).replace(MAX_ID, maxId);
    }

    public static String getMediasJsonByTagLink(String tag, String maxId) {
        if (maxId == null) {
            maxId = "";
        }
        return MEDIA_JSON_BY_TAG.replace(TAG, tag).replace(MAX_ID, maxId);
    }

    public static String getGeneralSearchJsonLink(String query) {
        return GENERAL_SEARCH.replace(QUERY, query);
    }

    public static String getLastCommentsByCodeLink(String code, int count) {
        return LAST_COMMENTS_BY_CODE.replace(CODE, code).replace(COUNT, "" + count);
    }

    public static String getCommentsBeforeCommentIdByCode(String shortcode, int count, String commentId) {
        return COMMENTS_BEFORE_COMMENT_ID_BY_CODE.replace(SHORTCODE, shortcode).replace(COUNT, "" + count)
                .replace(COMMENT_ID, commentId);
    }

    public static String getMediaLikeLink(String mediaId) {
        return MEDIA_LIKE.replace(MEDIA_ID, mediaId);
    }

    public static String getMediaUnlikeLink(String mediaId) {
        return MEDIA_UNLIKE.replace(MEDIA_ID, mediaId);
    }

    public static String addMediaCommentLink(String mediaId) {
        return MEDIA_COMMENTS_ADD.replace(MEDIA_ID, mediaId);
    }

    public static String deleteMediaCommentLink(String mediaId, String commentId) {
        return MEDIA_COMMENTS_DELETE.replace(MEDIA_ID, mediaId).replace(COMMENT_ID, commentId);
    }

    public static String getLikesByShortcode(String shortcode, int count, String endCursor) {
        return LIKES_BY_SHORTCODE.replace(SHORTCODE, shortcode).replace(COUNT, String.valueOf(count)).replace(AFTER,
                endCursor);
    }

    public static String getFollowAccountLink(long userId) {
        return FOLLOW_ACCOUNT.replace(USER_ID, String.valueOf(userId));
    }

    public static String getUnfollowAccountLink(long userId) {
        return UNFOLLOW_ACCOUNT.replace(USER_ID, String.valueOf(userId));
    }

    public static String getFollowsLinkVariables(long userId, int count, String endCursor) {
        return FOLLOWS_URL.replace(USER_ID, String.valueOf(userId)).replace(COUNT, String.valueOf(count))
                .replace(END_CURSOR, endCursor);
    }

    public static String getFollowersLinkVariables(long userId, int count, String endCursor) {
        return FOLLOWERS_URL.replace(USER_ID, String.valueOf(userId)).replace(COUNT, String.valueOf(count))
                .replace(END_CURSOR, endCursor);
    }
}
