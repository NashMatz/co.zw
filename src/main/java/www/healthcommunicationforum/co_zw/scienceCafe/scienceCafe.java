package www.healthcommunicationforum.co_zw.scienceCafe;


import javax.persistence.*;
import java.util.Arrays;

@Entity

public class scienceCafe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String topic;
    private byte[] image;
    private String dcaption;
    private String datetime;

    public scienceCafe(Long id, String topic, byte[] image, String dcaption, String datetime) {
        this.id = id;
        this.topic = topic;
        this.image = image;
        this.dcaption = dcaption;
        this.datetime = datetime;
    }
    public scienceCafe() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDcaption() {
        return dcaption;
    }

    public void setDcaption(String caption) {
        this.dcaption = caption;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "scienceCafe{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", image=" + Arrays.toString(image) +
                ", dcaption='" + dcaption + '\'' +
                ", datetime='" + datetime + '\'' +
                '}';
    }
}
