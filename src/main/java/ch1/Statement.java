package ch1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Statement {

    private Invoice invoice;

    private Map<String, Play> plays;

    public String statement(Invoice invoice, Map<String, Play> plays) {
        return renderPlainText(CreateStatementData.createStatementData(invoice, plays));
    }

    private String renderPlainText(StatementData data) {
        StringBuilder result = new StringBuilder(String.format("청구 내역 (고객명 : %s)\n", data.getCustomer()));

        for(Performance perf : data.getPerformances()) {
            result.append(String.format(" %s : %d (%d석)\n", perf.getPlay().getName(), perf.getAmount(), perf.getAudience()));
        }

        result.append(String.format("총액: %s\n", usd(totalAmount(data))));
        result.append(String.format("적립 포인트: %d점\n", totalVolumeCredits(data)));

        return result.toString();
    }

//    public String htmlStatement(Invoice invoice, Map<String, Play> plays) {
//        return renderHtml(createStatementData(invoice, plays));
//    }

    public String renderHtml(StatementData data) {
        StringBuilder result = new StringBuilder(String.format("<h1>청구 내역 (고객명 : %s)</h1>\n", data.getCustomer()));
        result.append("<table>\n");
        result.append("<tr><th>연극</th><th>좌석 수</th><th>금액</th></tr>\n");
        for(Performance perf : data.getPerformances()) {
            result.append(String.format(" <tr><td>%s</td><td>%d</td><td>%s</td></tr>\n", perf.getPlay().getName(), perf.getAudience(), usd(perf.getAmount())));
        }
        result.append("</table>\n");
        result.append(String.format("<p>총액: <em>%s</em></p>\n", usd(totalAmount(data))));
        result.append(String.format("<p>적립 포인트: <em>%d</em>점</p>\n", totalVolumeCredits(data)));
        return result.toString();
    }

    private int totalAmount(StatementData data) {

        return data.getPerformances().stream().reduce(0, (total, p) -> total + p.getAmount(), Integer::sum);
    }

    private int totalVolumeCredits(StatementData data) {
        return data.getPerformances().stream().reduce(0, (total, p) -> total + p.getVolumeCredits(), Integer::sum);
    }

    private static String usd(int aNumber) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(aNumber);
    }




}
