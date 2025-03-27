package ch10.replaceconditionalwithpolymorphism.ex2;

public class ExperiencedChinaRating extends Rating {

    public ExperiencedChinaRating(Voyage voyage, History history) {
        super(voyage, history);
    }


    @Override
    protected int captainHistoryRisk() {
        int result = super.captainHistoryRisk() - 2;
        return Math.max(result, 0);
    }

}
