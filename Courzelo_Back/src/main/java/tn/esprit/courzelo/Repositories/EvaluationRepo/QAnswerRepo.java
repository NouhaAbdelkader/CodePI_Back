package tn.esprit.courzelo.Repositories.EvaluationRepo;


import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.courzelo.entities.EvaluationEntities.Evaluation;
import tn.esprit.courzelo.entities.EvaluationEntities.QAnswer;

public interface QAnswerRepo extends MongoRepository<QAnswer, String> {
}
