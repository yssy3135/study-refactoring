package ch9.changereferencetovalue;

public class Person {
    TelephoneNumber telephoneNumber;

    public Person() {
        telephoneNumber = new TelephoneNumber();
    }

    public String getOfficeAreaCode() { return telephoneNumber.areaCode; }
    public void setOfficeAreaCode(String areaCode) { telephoneNumber.setAreaCode(areaCode); }

    public String getOfficeNumber() { return telephoneNumber.number; }
    public void setOfficeNumber(String number ) { telephoneNumber.setNumber(number);}
}
