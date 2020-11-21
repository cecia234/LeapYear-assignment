package dssc.assignment.leapyear;

public class LeapYear {

    public Boolean n_divisible_by_m(int n, int m){
        return n % m == 0;
    }

    public Boolean isLeapYear(int n){
        if(!n_divisible_by_m(n,400))
            return !n_divisible_by_m(n, 100) && n_divisible_by_m(n, 4);
        else return true;

    }

}
