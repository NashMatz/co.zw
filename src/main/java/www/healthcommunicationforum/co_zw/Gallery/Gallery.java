package www.healthcommunicationforum.co_zw.Gallery;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Setter
@Getter

@Builder
public class Gallery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String image;
    private String name_of_event;

    public Gallery(Long id, String image, String name_of_event) {
        this.id = id;
        this.image = image;
        this.name_of_event = name_of_event;
    }

    public Gallery() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName_of_event() {
        return name_of_event;
    }

    public void setName_of_event(String name_of_event) {
        this.name_of_event = name_of_event;
    }
}
