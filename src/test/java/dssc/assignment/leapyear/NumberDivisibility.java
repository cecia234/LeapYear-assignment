package dssc.assignment.leapyear;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberDivisibility {

   @ParameterizedTest
   @CsvSource({"2000, true","1996, true","2001, false" ,"1900, true"})
   void numbersDivisible_4(int number , Boolean expected){
       LeapYear leapYear = new LeapYear();
       assertEquals(expected,leapYear.divisibleBy4(number));

   }

    @Test
   void twoThousands_divisible_by_4(){
        LeapYear leapYear = new LeapYear();
        assertEquals(true,leapYear.divisibleBy4(2000));
    }

    @Test
    void twoThousands01_divisible_by_4(){
        LeapYear leapYear = new LeapYear();
        assertEquals(false,leapYear.divisibleBy4(2001));
    }

    @Test
    void twoThousands_divisible_by_100(){
        LeapYear leapYear = new LeapYear();
        assertEquals(true,leapYear.divisibleBy100(2000));
    }

    @Test
    void twoThousands_divisible_by_400(){
        LeapYear leapYear = new LeapYear();
        assertEquals(true,leapYear.divisibleBy400(2000));
    }

    @Test
    void nineteen00_divisible_by_100(){
        LeapYear leapYear = new LeapYear();
        assertEquals(true,leapYear.divisibleBy100(2000));
    }

    @Test
    void nineteen00_divisible_by_400(){
        LeapYear leapYear = new LeapYear();
        assertEquals(false,leapYear.divisibleBy400(1900));
    }




}
