package ch9.changereferencetovalue;

import java.util.Objects;

public class Person {
    TelephoneNumber telephoneNumber;

    public Person(String areaCode, String number) {
        telephoneNumber = new TelephoneNumber(areaCode, number);
    }

    public String getOfficeAreaCode() { return telephoneNumber.areaCode; }
    public void setOfficeAreaCode(String areaCode) { new TelephoneNumber(areaCode, this.getOfficeNumber()); }

    public String getOfficeNumber() { return telephoneNumber.number; }
    public void setOfficeNumber(String number ) { new TelephoneNumber(this.getOfficeAreaCode(), number); }


    @Override
    public boolean equals(Object o) {
        if(!(o instanceof TelephoneNumber)) return false;
        return Objects.equals(this.getOfficeAreaCode(), ((TelephoneNumber) o).getAreaCode()) &&
                Objects.equals(this.getOfficeNumber(), ((TelephoneNumber) o).getNumber());
    }

}
