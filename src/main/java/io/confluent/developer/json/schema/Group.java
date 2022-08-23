
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
    "join_mode",
    "country",
    "city",
    "name",
    "group_lon",
    "id",
    "state",
    "urlname",
    "category",
    "group_photo",
    "group_lat"
})
@Generated("jsonschema2pojo")
public class Group {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("join_mode")
    private String joinMode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    private String country;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    private String city;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group_lon")
    private Double groupLon;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private Long id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    private String state;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("urlname")
    private String urlname;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("category")
    private Category category;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group_photo")
    private GroupPhoto groupPhoto;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group_lat")
    private Double groupLat;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("join_mode")
    public String getJoinMode() {
        return joinMode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("join_mode")
    public void setJoinMode(String joinMode) {
        this.joinMode = joinMode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group_lon")
    public Double getGroupLon() {
        return groupLon;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group_lon")
    public void setGroupLon(Double groupLon) {
        this.groupLon = groupLon;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("urlname")
    public String getUrlname() {
        return urlname;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("urlname")
    public void setUrlname(String urlname) {
        this.urlname = urlname;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group_photo")
    public GroupPhoto getGroupPhoto() {
        return groupPhoto;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group_photo")
    public void setGroupPhoto(GroupPhoto groupPhoto) {
        this.groupPhoto = groupPhoto;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group_lat")
    public Double getGroupLat() {
        return groupLat;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group_lat")
    public void setGroupLat(Double groupLat) {
        this.groupLat = groupLat;
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
        sb.append(Group.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("joinMode");
        sb.append('=');
        sb.append(((this.joinMode == null)?"<null>":this.joinMode));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("groupLon");
        sb.append('=');
        sb.append(((this.groupLon == null)?"<null>":this.groupLon));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("urlname");
        sb.append('=');
        sb.append(((this.urlname == null)?"<null>":this.urlname));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("groupPhoto");
        sb.append('=');
        sb.append(((this.groupPhoto == null)?"<null>":this.groupPhoto));
        sb.append(',');
        sb.append("groupLat");
        sb.append('=');
        sb.append(((this.groupLat == null)?"<null>":this.groupLat));
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
