package dssc.assignment.leapyear;

public class LeapYear {

    public Boolean divisibleBy4(int n){
        return n % 4 == 0;
    }

    public Boolean divisibleBy100(int n){
        return n%100 == 0;
    }

    public Boolean divisibleBy400(int n){
        return n%400 == 0;
    }

}
