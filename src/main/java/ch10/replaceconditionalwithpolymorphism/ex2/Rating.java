package ch10.replaceconditionalwithpolymorphism.ex2;

import java.util.stream.Stream;

public class Rating {

    protected final Voyage voyage;

    protected final History history;

    public Rating(Voyage voyage, History history) {
        this.voyage = voyage;
        this.history = history;
    }

    public static Rating createRating(Voyage voyage, History history) {
        if ("중국".equals(voyage.zone) && history.hasChina()) {
            return new ExperiencedChinaRating(voyage, history);
        }
        return new Rating(voyage, history);
    }


    public String getValue() {
        int vpf = voyageProfitFactor();
        int vr = voyageRisk();
        int chr = captainHistoryRisk();
        if (vpf * 3 > vr + chr * 2) return "A";
        return "B";
    }

    private int voyageRisk() {
        int result = 1;
        if (voyage.length > 4) result += 2;
        if (voyage.length > 8) result += voyage.length - 8;
        if (Stream.of("중국","동인도")
                .anyMatch(v -> voyage.zone.equals(v))) result += 4;
        return Math.max(result, 0);
    }

    protected int captainHistoryRisk() {
        int result = 1;
        if (history.length() < 5) result += 4;
        result += history.noProfitList();
        return Math.max(result, 0);
    }

    protected int voyageProfitFactor() {
        int result = 2;
        if (voyage.zone.equals("중국")) result += 1;
        if (voyage.zone.equals("동인도")) result += 1;
        result += historyLengthFactor();
        result += voyageLengthFactor();
        return result;
    }

    protected int voyageLengthFactor() {
        return (this.voyage.length > 14) ? -1 : 0;
    }

    protected int historyLengthFactor() {
        return (history.length() > 8) ? 1 : 0;
    }



}
