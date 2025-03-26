package ch10.replacenestedconditionalwithguardclauses;

public class CalculatePayAmount {

    private Employee employee;

    public Pay payAmount() {
       Pay result;
       if(employee.isSeparated) {
           return new Pay(0, "SEP");
       }

       if(employee.isRetired) {
           return new Pay(0, "RET");
       }

       // 급여 계산로직
       result = somFinalComputation();


       return result;
    }

    private Pay somFinalComputation() {
        return new Pay(0, "TMP");
    }
}
