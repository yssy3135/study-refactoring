package ch11.replacefunctionwithcommand;

public class Score {

    private Candidate candidate;
    private MedicalExam medicalExam;
    private ScoringGuide scoringGuide;
    private int result;
    private int healthLevel;
    private boolean highMedicalRiskFlag;

    public Score(Candidate candidate, MedicalExam medicalExam, ScoringGuide scoringGuide) {
        this.candidate = candidate;
        this.medicalExam = medicalExam;
        this.scoringGuide = scoringGuide;
    }

    public int execute() {
        result = 0;
        healthLevel = 0;
        highMedicalRiskFlag = false;

        scoreSmoking();

        String certificationGrade = "regular";
        if (scoringGuide.stateWithLowCertification(candidate.getOriginState())) {
            certificationGrade = "low";
            result -= 5;
        }


        result -= Math.max(healthLevel - 5, 0);
        return result;
    }

    private void scoreSmoking() {
        if (medicalExam.isSmoker()) {
            healthLevel += 10;
            highMedicalRiskFlag = true;
        }
    }
}
