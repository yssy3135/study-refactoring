package ch10.replacenestedconditionalwithguardclauses;

public class ReverseCondition {


    public double adjustedCapital(Instrument anInstrument) {
        double result = 0;
        if(anInstrument.capital <= 0) {
            return result;
        }
        if(anInstrument.interestRate > 0 && anInstrument.duration > 0) {
            result = (anInstrument.income / anInstrument.duration) * anInstrument.adjustmentFactor;
        }
        return result;
    }

}
