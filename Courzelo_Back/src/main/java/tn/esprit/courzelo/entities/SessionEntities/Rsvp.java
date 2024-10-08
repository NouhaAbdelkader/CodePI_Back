package tn.esprit.courzelo.entities.SessionEntities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.esprit.courzelo.Repositories.UserRepo.UserRepository;
import tn.esprit.courzelo.entities.UserCorzelo.UserCourzelo;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Rsvp")
public class Rsvp {
    @Id
    private String id;

    @DBRef
    private UserCourzelo user;

    @Indexed
    private Event event;

    @Indexed
    private String status;

    @Override
    public String toString() {
        return "Rsvp{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", event=" + event +
                ", status='" + status + '\'' +
                '}';
    }
}
