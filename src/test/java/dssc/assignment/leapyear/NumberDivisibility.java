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

   @ParameterizedTest
   @CsvSource({"2000, true","1996, true","2001, false" ,"1900, true"})
   void numbersDivisible_4(int number , Boolean expected){
       LeapYear leapYear = new LeapYear();
       assertEquals(expected,leapYear.divisibleBy4(number));

   }

    @ParameterizedTest
    @CsvSource({"2000, true","1996, false","2001, false" ,"1900, true"})
    void numbersDivisible_100(int number , Boolean expected){
        LeapYear leapYear = new LeapYear();
        assertEquals(expected,leapYear.divisibleBy100(number));
    }


    @ParameterizedTest
    @CsvSource({"2000, true","1996, false","2001, false" ,"1900, false"})
    void numbersDivisible_400(int number , Boolean expected){
        LeapYear leapYear = new LeapYear();
        assertEquals(expected,leapYear.divisibleBy400(number));
    }



}
