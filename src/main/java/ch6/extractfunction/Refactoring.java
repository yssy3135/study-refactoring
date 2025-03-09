package ch6.extractfunction;

import java.time.LocalDateTime;

public class Refactoring {

    public void printOwing(Invoice invoice) {

        printBanner();

        int outstanding = calculateOutstanding(invoice);

        recordDueDate(invoice);

        printDetails(invoice, outstanding);

    }

    private static int calculateOutstanding(Invoice invoice) {
        // 미해결 채무 (outstanding) 을 계산한다.
        int result = 0;
        for (Order o : invoice.getOrders()) {
            result += o.amount;
        }
        return result;
    }

    private static void recordDueDate(Invoice invoice) {
        // 마감일(dueDate) 설정.
        LocalDateTime today = Clock.today();
        invoice.dueDate = today.plusDays(30);
    }

    private void printDetails(Invoice invoice, int outstanding) {
        // 세부 사항을 출력한다.
        System.out.println(String.format("고객명: %s", invoice.customer));
        System.out.println(String.format("채무액: %d", outstanding));
        System.out.println(String.format("마감일: %s", invoice.dueDate));
    }

    private void printBanner() {
        System.out.println("*****************");
        System.out.println("**** 고객 채무 ****");
        System.out.println("*****************");
    }
}
