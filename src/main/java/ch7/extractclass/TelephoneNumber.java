package ch7.extractclass;

public class TelephoneNumber {

    String areaCode;
    String number;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTelephoneNumber() {
        return ("(" + areaCode + ") " + number);
    }

    public String toString() {
        return ("(" + areaCode + ") " + number);
    }
}
