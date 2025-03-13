package ch6.combinefunctionsintotransform;

public class Original {


    private static Integer baseRate(int month, int year) {

        //임의 계산
        return month + year;
    }

    //임의 계산
    private int taxThreshold(int year) {
        return year + 10;
    }

    public static Reading acquireReading() {
        return new Reading("ivan", 10,5, 2017);
    }

    private int calculateBaseCharge(Reading aReading) {
        return baseRate(aReading.month, aReading.year) * aReading.quantity;
    }

    public class client1 {
        Reading aReading = acquireReading();
        int baseCharge = baseRate(aReading.month, aReading.year) * aReading.quantity;
    }


    public class client2 {
        Reading aReading = acquireReading();
        int base = baseRate(aReading.month, aReading.year) * aReading.quantity;
        Integer taxableCharge = Math.max(0, base - taxThreshold(aReading.year));
    }

    public class client3 {
        Reading aReading = acquireReading();
        int basicChargeAmount = calculateBaseCharge(aReading);

    }

}
