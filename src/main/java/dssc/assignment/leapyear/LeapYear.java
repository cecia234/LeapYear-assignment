package dssc.assignment.leapyear;

public class LeapYear {

    public Boolean n_divisible_by_m(int n, int m){
        return n % m == 0;
    }
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
