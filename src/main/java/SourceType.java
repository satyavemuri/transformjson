import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SourceType {

    @JsonProperty("PersonID")
    private String personID;
    private String first_name;
    private String last_name;
    private String location;
    private List<Website> websites;

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Website> getWebsites() {
        return websites;
    }

    public void setWebsites(List<Website> websites) {
        this.websites = websites;
    }

    public static class Website {

        @JsonProperty("WebsiteID")
        private String websiteID;
        private String description;
        @JsonProperty("URL")
        private String url;
        private List<SocialMedia> social_media;

        public String getWebsiteID() {
            return websiteID;
        }

        public void setWebsiteID(String websiteID) {
            this.websiteID = websiteID;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public List<SocialMedia> getSocial_media() {
            return social_media;
        }

        public void setSocial_media(List<SocialMedia> social_media) {
            this.social_media = social_media;
        }
    }

    public static class SocialMedia {
        @JsonProperty("Name")
        private String name;
        private String medialink;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMedialink() {
            return medialink;
        }

        public void setMedialink(String medialink) {
            this.medialink = medialink;
        }
    }
}
