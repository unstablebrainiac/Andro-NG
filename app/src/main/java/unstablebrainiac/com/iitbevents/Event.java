package unstablebrainiac.com.iitbevents;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by unstablebrainiac on 10/2/18.
 */

public class Event {
    private String name;
    @SerializedName("image")
    private String imageURL;
    private String description;
    @SerializedName("event_type")
    private String eventType;
    @SerializedName("start_time")
    private String startTime;
    @SerializedName("end_time")
    private String endTime;
    private String venue;
    @SerializedName("created_by")
    private int createdBy;
    private ArrayList<Integer> attending;
    @SerializedName("not_attending")
    private ArrayList<Integer> notAttending;
    private ArrayList<Integer> interested;

    public Event(String name, String imageURL, String description, String eventType, String startTime, String endTime, String venue, int createdBy, ArrayList<Integer> attending, ArrayList<Integer> notAttending, ArrayList<Integer> interested) {
        this.name = name;
        this.imageURL = imageURL;
        this.description = description;
        this.eventType = eventType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.venue = venue;
        this.createdBy = createdBy;
        this.attending = attending;
        this.notAttending = notAttending;
        this.interested = interested;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public ArrayList<Integer> getAttending() {
        return attending;
    }

    public void setAttending(ArrayList<Integer> attending) {
        this.attending = attending;
    }

    public ArrayList<Integer> getNotAttending() {
        return notAttending;
    }

    public void setNotAttending(ArrayList<Integer> notAttending) {
        this.notAttending = notAttending;
    }

    public ArrayList<Integer> getInterested() {
        return interested;
    }

    public void setInterested(ArrayList<Integer> interested) {
        this.interested = interested;
    }
}
