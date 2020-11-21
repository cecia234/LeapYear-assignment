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

}
