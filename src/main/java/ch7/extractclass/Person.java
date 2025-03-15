package ch7.extractclass;

public class Person {
    protected String name;
    protected TelephoneNumber telephoneNumber;

    public Person() {
        telephoneNumber = new TelephoneNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getOfficeAreaCode() {
        return telephoneNumber.getOfficeAreaCode();
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.telephoneNumber.setOfficeAreaCode(officeAreaCode);
    }

    public String getOfficeNumber() {
        return this.telephoneNumber.getOfficeNumber();
    }

    public void setOfficeNumber(String officeNumber) {
        this.telephoneNumber.setOfficeNumber(officeNumber);
    }

    public String getTelephoneNumber() {
        return telephoneNumber.getTelephoneNumber();
    }
}
