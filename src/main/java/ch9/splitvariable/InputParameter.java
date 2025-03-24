package ch9.splitvariable;

public class InputParameter {
    public int discount(int inputValue, int quantity) {
        int result = inputValue;
        if (inputValue > 50) result -= 2;
        if (quantity > 100) result -= 1;
        return result;
    }

}
