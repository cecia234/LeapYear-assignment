package dssc.assignment.leapyear;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberDivisibility {

    @ParameterizedTest
    @CsvSource({"2000, 4 , true", "2000, 100 , true","2000, 400 , true"})
    void numbersDivisible (int n , int m , Boolean expected){
        LeapYear leapYear = new LeapYear();
        assertEquals(expected,leapYear.n_divisible_by_m(n,m));

    }




}
