package ch11.replacefunctionwithcommand;

public class Example {

    public int score(Candidate candidate, MedicalExam medicalExam, ScoringGuide scoringGuide) {
       return new Score().execute(candidate, medicalExam, scoringGuide);
    }
}
