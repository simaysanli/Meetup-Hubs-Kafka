
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
    "utc_offset",
    "rsvp_limit",
    "venue_visibility",
    "visibility",
    "maybe_rsvp_count",
    "description",
    "mtime",
    "event_url",
    "yes_rsvp_count",
    "payment_required",
    "name",
    "id",
    "time",
    "group",
    "status"
})
@Generated("jsonschema2pojo")
public class EventProcessing {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("utc_offset")
    private Long utcOffset;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rsvp_limit")
    private Long rsvpLimit;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("venue_visibility")
    private String venueVisibility;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("visibility")
    private String visibility;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("maybe_rsvp_count")
    private Long maybeRsvpCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    private String description;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mtime")
    private Long mtime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("event_url")
    private String eventUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("yes_rsvp_count")
    private Long yesRsvpCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("payment_required")
    private String paymentRequired;
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
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("time")
    private Long time;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group")
    private Group group;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("utc_offset")
    public Long getUtcOffset() {
        return utcOffset;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("utc_offset")
    public void setUtcOffset(Long utcOffset) {
        this.utcOffset = utcOffset;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rsvp_limit")
    public Long getRsvpLimit() {
        return rsvpLimit;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rsvp_limit")
    public void setRsvpLimit(Long rsvpLimit) {
        this.rsvpLimit = rsvpLimit;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("venue_visibility")
    public String getVenueVisibility() {
        return venueVisibility;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("venue_visibility")
    public void setVenueVisibility(String venueVisibility) {
        this.venueVisibility = venueVisibility;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("maybe_rsvp_count")
    public Long getMaybeRsvpCount() {
        return maybeRsvpCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("maybe_rsvp_count")
    public void setMaybeRsvpCount(Long maybeRsvpCount) {
        this.maybeRsvpCount = maybeRsvpCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mtime")
    public Long getMtime() {
        return mtime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mtime")
    public void setMtime(Long mtime) {
        this.mtime = mtime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("event_url")
    public String getEventUrl() {
        return eventUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("event_url")
    public void setEventUrl(String eventUrl) {
        this.eventUrl = eventUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("yes_rsvp_count")
    public Long getYesRsvpCount() {
        return yesRsvpCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("yes_rsvp_count")
    public void setYesRsvpCount(Long yesRsvpCount) {
        this.yesRsvpCount = yesRsvpCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("payment_required")
    public String getPaymentRequired() {
        return paymentRequired;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("payment_required")
    public void setPaymentRequired(String paymentRequired) {
        this.paymentRequired = paymentRequired;
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
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("time")
    public Long getTime() {
        return time;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("time")
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group")
    public Group getGroup() {
        return group;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group")
    public void setGroup(Group group) {
        this.group = group;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
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
        sb.append(EventProcessing.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("utcOffset");
        sb.append('=');
        sb.append(((this.utcOffset == null)?"<null>":this.utcOffset));
        sb.append(',');
        sb.append("rsvpLimit");
        sb.append('=');
        sb.append(((this.rsvpLimit == null)?"<null>":this.rsvpLimit));
        sb.append(',');
        sb.append("venueVisibility");
        sb.append('=');
        sb.append(((this.venueVisibility == null)?"<null>":this.venueVisibility));
        sb.append(',');
        sb.append("visibility");
        sb.append('=');
        sb.append(((this.visibility == null)?"<null>":this.visibility));
        sb.append(',');
        sb.append("maybeRsvpCount");
        sb.append('=');
        sb.append(((this.maybeRsvpCount == null)?"<null>":this.maybeRsvpCount));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("mtime");
        sb.append('=');
        sb.append(((this.mtime == null)?"<null>":this.mtime));
        sb.append(',');
        sb.append("eventUrl");
        sb.append('=');
        sb.append(((this.eventUrl == null)?"<null>":this.eventUrl));
        sb.append(',');
        sb.append("yesRsvpCount");
        sb.append('=');
        sb.append(((this.yesRsvpCount == null)?"<null>":this.yesRsvpCount));
        sb.append(',');
        sb.append("paymentRequired");
        sb.append('=');
        sb.append(((this.paymentRequired == null)?"<null>":this.paymentRequired));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
        sb.append(',');
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null)?"<null>":this.group));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
