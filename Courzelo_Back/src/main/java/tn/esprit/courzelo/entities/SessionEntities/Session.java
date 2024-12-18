package tn.esprit.courzelo.entities.SessionEntities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.esprit.courzelo.entities.AcademicProgramEntities.Class;
import tn.esprit.courzelo.entities.AcademicProgramEntities.Module;
import tn.esprit.courzelo.entities.UserCorzelo.UserCourzelo;


import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Session")
public class Session {
    @Id
    private  String id;
    @Indexed
    private LocalDateTime date;
    @Indexed
    private String startTime;
    @Indexed
    private String endTime;
    @Indexed
    private String ConferenceLink;
    //@Indexed
    //private List<UserCourzelo> participants;
    @Indexed
    private long day;
    @Indexed
    private int temp;
    @Indexed
    private UserCourzelo teacher;
    @Indexed
    private TypeSession typeSession;
    @Indexed
    private Class aClass;
    @DBRef
    private Module module;

}
