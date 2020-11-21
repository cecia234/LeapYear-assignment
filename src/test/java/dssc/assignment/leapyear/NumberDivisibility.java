package dssc.assignment.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberDivisibility {

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
        assertEquals(false,leapYear.divisibleBy400(2000));
    }




}
