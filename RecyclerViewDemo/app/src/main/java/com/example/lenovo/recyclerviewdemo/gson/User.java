package com.example.lenovo.recyclerviewdemo.gson;

import java.util.List;

public class User {

    /**
     * appCode : toutiao
     * hasNext : false
     * pageToken : null
     * dataType : profile
     * data : [{"screenName":"你饿唔饿啊","url":"http://www.toutiao.com/c/user/6868583999/","shareCount":91949,"idVerified":true,"likeCount":null,"id":"6868583999_6867895105","postCount":null,"viewCount":0,"followCount":46,"idVerifiedInfo":"优质娱乐领域创作者","videoCount":202,"fansCount":84499,"biography":"关于娱乐、八卦、剧集、搞笑、电影的大小事。合作请私信。","avatarUrl":"http://p9-xg.bytecdn.cn/large/78f0009d43a8f41dcd4"}]
     * retcode : 000000
     */

    private String appCode;
    private boolean hasNext;
    private Object pageToken;
    private String dataType;
    private String retcode;
    private List<DataBean> data;

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public Object getPageToken() {
        return pageToken;
    }

    public void setPageToken(Object pageToken) {
        this.pageToken = pageToken;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getRetcode() {
        return retcode;
    }

    public void setRetcode(String retcode) {
        this.retcode = retcode;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * screenName : 你饿唔饿啊
         * url : http://www.toutiao.com/c/user/6868583999/
         * shareCount : 91949
         * idVerified : true
         * likeCount : null
         * id : 6868583999_6867895105
         * postCount : null
         * viewCount : 0
         * followCount : 46
         * idVerifiedInfo : 优质娱乐领域创作者
         * videoCount : 202
         * fansCount : 84499
         * biography : 关于娱乐、八卦、剧集、搞笑、电影的大小事。合作请私信。
         * avatarUrl : http://p9-xg.bytecdn.cn/large/78f0009d43a8f41dcd4
         */

        private String screenName;
        private String url;
        private int shareCount;
        private boolean idVerified;
        private Object likeCount;
        private String id;
        private Object postCount;
        private int viewCount;
        private int followCount;
        private String idVerifiedInfo;
        private int videoCount;
        private int fansCount;
        private String biography;
        private String avatarUrl;

        public String getScreenName() {
            return screenName;
        }

        public void setScreenName(String screenName) {
            this.screenName = screenName;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getShareCount() {
            return shareCount;
        }

        public void setShareCount(int shareCount) {
            this.shareCount = shareCount;
        }

        public boolean isIdVerified() {
            return idVerified;
        }

        public void setIdVerified(boolean idVerified) {
            this.idVerified = idVerified;
        }

        public Object getLikeCount() {
            return likeCount;
        }

        public void setLikeCount(Object likeCount) {
            this.likeCount = likeCount;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Object getPostCount() {
            return postCount;
        }

        public void setPostCount(Object postCount) {
            this.postCount = postCount;
        }

        public int getViewCount() {
            return viewCount;
        }

        public void setViewCount(int viewCount) {
            this.viewCount = viewCount;
        }

        public int getFollowCount() {
            return followCount;
        }

        public void setFollowCount(int followCount) {
            this.followCount = followCount;
        }

        public String getIdVerifiedInfo() {
            return idVerifiedInfo;
        }

        public void setIdVerifiedInfo(String idVerifiedInfo) {
            this.idVerifiedInfo = idVerifiedInfo;
        }

        public int getVideoCount() {
            return videoCount;
        }

        public void setVideoCount(int videoCount) {
            this.videoCount = videoCount;
        }

        public int getFansCount() {
            return fansCount;
        }

        public void setFansCount(int fansCount) {
            this.fansCount = fansCount;
        }

        public String getBiography() {
            return biography;
        }

        public void setBiography(String biography) {
            this.biography = biography;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }
    }
}
