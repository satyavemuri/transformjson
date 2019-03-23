import com.fasterxml.jackson.annotation.JsonProperty;

public class WebsiteModel {
    @JsonProperty("PersonID")
    private String personID;
    @JsonProperty("WebsiteID")
    private String websiteID;
    private String description;
    @JsonProperty("URL")
    private String url;

    public WebsiteModel(SourceType sourceType, SourceType.Website website) {
        this.personID = sourceType.getPersonID();
        this.websiteID = website.getWebsiteID();
        this.description = website.getDescription();
        this.url = website.getUrl();
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

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
}
