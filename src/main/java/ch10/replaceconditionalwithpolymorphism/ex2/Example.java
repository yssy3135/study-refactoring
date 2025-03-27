package ch10.replaceconditionalwithpolymorphism.ex2;

import java.util.List;
import java.util.stream.Stream;

public class Example {
    public String rating(Voyage voyage, History history) {
        int vpf = voyageProfitFactor(voyage, history);
        int vr = voyageRisk(voyage);
        int chr = captainHistoryRisk(voyage, history);
        if (vpf * 3 > vr + chr * 2) return "A";
        return "B";
    }

    private int voyageRisk(Voyage voyage) {
        int result = 1;
        if (voyage.length > 4) result += 2;
        if (voyage.length > 8) result += voyage.length - 8;
        if (Stream.of("중국","동인도")
                .anyMatch(v -> voyage.zone.equals(v))) result += 4;
        return Math.max(result, 0);
    }

    private int captainHistoryRisk(Voyage voyage, History history) {
        int result = 1;
        if (history.length() < 5) result += 4;
        result += history.noProfitList();
        if (voyage.zone.equals("중국") && hasChina(history)) result -= 2;
        return Math.max(result, 0);
    }

    private boolean hasChina(History history) {
        return history.hasChina();
    }

    private int voyageProfitFactor(Voyage voyage, History history) {
        int result = 2;
        if (voyage.zone.equals("중국")) result += 1;
        if (voyage.zone.equals("동인도")) result += 1;
        if (voyage.zone.equals("wndrnr") && hasChina(history)) {
            result += 3;
            if (history.length() > 10) result += 1;
            if (voyage.length > 12) result += 1;
            if (voyage.length > 18) result -= 1;
        }
        else {
            if (history.length() > 8) result += 1;
            if (voyage.length > 14) result -= 1;
        }
        return result;
    }



}
