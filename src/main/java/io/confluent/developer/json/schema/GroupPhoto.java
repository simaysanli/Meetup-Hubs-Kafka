
package io.confluent.developer.json.schema;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "highres_link",
    "photo_link",
    "photo_id",
    "thumb_link"
})
@Generated("jsonschema2pojo")
public class GroupPhoto {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("highres_link")
    private String highresLink;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("photo_link")
    private String photoLink;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("photo_id")
    private Long photoId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("thumb_link")
    private String thumbLink;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("highres_link")
    public String getHighresLink() {
        return highresLink;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("highres_link")
    public void setHighresLink(String highresLink) {
        this.highresLink = highresLink;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("photo_link")
    public String getPhotoLink() {
        return photoLink;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("photo_link")
    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("photo_id")
    public Long getPhotoId() {
        return photoId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("photo_id")
    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("thumb_link")
    public String getThumbLink() {
        return thumbLink;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("thumb_link")
    public void setThumbLink(String thumbLink) {
        this.thumbLink = thumbLink;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GroupPhoto.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("highresLink");
        sb.append('=');
        sb.append(((this.highresLink == null)?"<null>":this.highresLink));
        sb.append(',');
        sb.append("photoLink");
        sb.append('=');
        sb.append(((this.photoLink == null)?"<null>":this.photoLink));
        sb.append(',');
        sb.append("photoId");
        sb.append('=');
        sb.append(((this.photoId == null)?"<null>":this.photoId));
        sb.append(',');
        sb.append("thumbLink");
        sb.append('=');
        sb.append(((this.thumbLink == null)?"<null>":this.thumbLink));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
