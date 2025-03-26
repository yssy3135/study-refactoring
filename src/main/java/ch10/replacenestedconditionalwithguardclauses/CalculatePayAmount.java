package ch10.replacenestedconditionalwithguardclauses;

public class CalculatePayAmount {

    private Employee employee;

    public Pay payAmount() {
       Pay result;
       if(employee.isSeparated) {
           result = new Pay(0, "SEP");
       }
       else {
           if(employee.isRetired) {
               result = new Pay(0, "RET");
           }
           else {
               // 급여 계산로직
               result = somFinalComputation();
           }
       }
       return result;
    }

    private Pay somFinalComputation() {
        return new Pay(0, "TMP");
    }
}
