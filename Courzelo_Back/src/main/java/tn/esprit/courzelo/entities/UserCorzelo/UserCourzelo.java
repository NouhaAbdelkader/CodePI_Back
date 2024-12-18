package tn.esprit.courzelo.entities.UserCorzelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import tn.esprit.courzelo.entities.EvaluationEntities.Evaluation;
import tn.esprit.courzelo.entities.EvaluationEntities.Test;
import tn.esprit.courzelo.entities.FeedBackEntities.Feedback;
import tn.esprit.courzelo.entities.ForumEntities.*;
import tn.esprit.courzelo.entities.AcademicProgramEntities.Class;
import tn.esprit.courzelo.entities.ProjectEntities.GroupProject;
import tn.esprit.courzelo.entities.ProjectEntities.Project;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "UserCourzelo")
@JsonIgnoreProperties({"feedbackTeachers", "classes", "projects", "chatRoom", "questionForums","answers", "votes"})

        public class UserCourzelo {
        @Id
        private  String id;
        @Indexed
        private String firstName;
        @Indexed
        private String username;
        @Indexed
        private String lastName;
        @Indexed
        private String email;
        @Indexed
        private String password;
        @Indexed
        private String sexe;
        @Indexed
        private Date date_of_birth;
        @Indexed
        private Date date_of_creation;
        @Indexed
        private int nbMaxHeurePerWeek;
        @Indexed
        private int nbHourPerWeek=0;
        @DBRef
        private Set<Role> roles = new HashSet<>();
        @Indexed
        private String companyName;
        @Indexed
        private String descriptionRecruiter;
        @Indexed
        private float scoreXp;
        @Indexed
        private List<badgeType> badges;
        @Indexed
        private String resume;
        @Indexed
        private Speciality speciality;
        @Indexed
        private int level =1 ;
        @Indexed
        private boolean approved=false;
        @Indexed
        private int validVoteCount=0;
        @Indexed
        private boolean canVote=true;
        @Indexed
        private int nbVoteForIncentives=0;
        @Indexed
        private int nbPrimeVoteForBadges;
        @Indexed
        private int PaymentDay;
        @Indexed
        private String CentreOffIntrest;
        @Indexed
        private Float overAll_average;
        @Indexed
        private boolean disponibility;
        @DBRef
        private List<Feedback> feedback;
        @DBRef
        private Class classe;
        @DBRef
        private List<Project> projects;
        @DBRef
        private List<ChatRoom> chatRoom;

        @DBRef
        private List<QuestionForum> questionForums;
        @DBRef
        private List<Answer> answers;
        @DBRef
        private List<Votes> votes;
        @DBRef
        private Module module;
        @DBRef
        private List<GroupProject> groupProjectsAsMember;
        public UserCourzelo(String username, String email, String password) {
                this.username = username;
                this.email = email;
                this.password = password;




}
        public UserCourzelo(String id) {
                this.id = id;
                // Initialize other fields if needed
        }


        @Override
        public String toString() {
                return "UserCourzelo{" +
                        "id='" + id + '\'' +
                        ", firstName='" + firstName + '\'' +
                        ", username='" + username + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", email='" + email + '\'' +
                        ", password='" + password + '\'' +
                        ", sexe='" + sexe + '\'' +
                        ", date_of_birth=" + date_of_birth +
                        ", date_of_creation=" + date_of_creation +
                        ", nbMaxHeurePerWeek=" + nbMaxHeurePerWeek +
                        ", nbHourPerWeek=" + nbHourPerWeek +
                        ", roles=" + roles +
                        ", companyName='" + companyName + '\'' +
                        ", descriptionRecruiter='" + descriptionRecruiter + '\'' +
                        ", scoreXp=" + scoreXp +
                        ", badges=" + badges +
                        ", resume='" + resume + '\'' +
                        ", speciality=" + speciality +
                        ", level=" + level +
                        ", approved=" + approved +
                        ", validVoteCount=" + validVoteCount +
                        ", canVote=" + canVote +
                        ", nbVoteForIncentives=" + nbVoteForIncentives +
                        ", nbPrimeVoteForBadges=" + nbPrimeVoteForBadges +
                        ", PaymentDay=" + PaymentDay +
                        ", CentreOffIntrest='" + CentreOffIntrest + '\'' +
                        ", overAll_average=" + overAll_average +
                        ", feedback=" + feedback +
                        ", classe=" + classe +
                        ", projects=" + projects +
                        ", chatRoom=" + chatRoom +
                        ", questionForums=" + questionForums +
                        ", answers=" + answers +
                        ", votes=" + votes +
                        '}';
        }
}



