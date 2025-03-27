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

    @Override
    protected int voyageAndHistoryLengthFactor() {
        int result = 0;
        if (history.length() > 10) result += 1;
        if (voyage.length > 12) result += 1;
        if (voyage.length > 18) result -= 1;

        return result;
    }

}
