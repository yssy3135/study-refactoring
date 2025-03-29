package ch11.parameterizefunction;

import java.math.BigDecimal;
import java.math.MathContext;

public class Example1 {

    public void tenPercentRaise(Person aPerson) {
        aPerson.salary = aPerson.salary.multiply(BigDecimal.valueOf(1.1));
    }

    public void fivePercentRaise(Person aPerson) {
        aPerson.salary = aPerson.salary.multiply(BigDecimal.valueOf(1.05));
    }

    public void raise(Person aPerson, BigDecimal factor) {
        aPerson.salary = aPerson.salary.multiply((factor.add(BigDecimal.ONE)));
    }

}
