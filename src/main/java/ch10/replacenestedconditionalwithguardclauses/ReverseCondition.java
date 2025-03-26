package ch10.replacenestedconditionalwithguardclauses;

public class ReverseCondition {


    public double adjustedCapital(Instrument anInstrument) {

        if(anInstrument.capital <= 0
        || anInstrument.interestRate <= 0
        || anInstrument.duration <= 0) {
            return 0;
        }

        return (anInstrument.income / anInstrument.duration) * anInstrument.adjustmentFactor;
    }

}
