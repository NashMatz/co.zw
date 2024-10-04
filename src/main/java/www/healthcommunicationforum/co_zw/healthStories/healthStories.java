package www.healthcommunicationforum.co_zw.healthStories;

import lombok.*;

import javax.persistence.*;
import java.awt.image.BufferedImage;
//import javax.persistence.Table;


@Entity
@Getter
@Setter
@ToString
@Builder


public class healthStories {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    public String heading_of_story;
    public String the_story;

    @Lob
    public byte[] image;
    public String datetime;

    public healthStories(long id, String heading_of_story, String the_story, byte[] image, String datetime) {
        this.id = id;
        this.heading_of_story = heading_of_story;
        this.the_story = the_story;
        this.image = image;
        this.datetime = datetime;
    }
    public healthStories() {}

    public long getId() {
        return id;
    }

    public healthStories setId(long id) {
        this.id = id;
        return this;
    }

    public String getHeading_of_story() {
        return heading_of_story;
    }

    public healthStories setHeading_of_story(String heading_of_story) {
        this.heading_of_story = heading_of_story;
        return this;
    }

    public String getThe_story() {
        return the_story;
    }

    public healthStories setThe_story(String the_story) {
        this.the_story = the_story;
        return this;
    }

    public byte[] getImage() {
        return image;
    }

    public healthStories setImage(byte[] image) {
        this.image = image;
        return this;
    }

    public String getDatetime() {
        return datetime;
    }

    public healthStories setDatetime(String datetime) {
        this.datetime = datetime;
        return this;
    }
}