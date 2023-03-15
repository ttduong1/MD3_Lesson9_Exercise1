package rikkei.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    public void testDay1() {
        String day = "01/01/2018";
        String result = "2/1/2018";
        assertEquals(result,NextDayCalculator.getNextDay(day));
    }
    @Test
    public void testDay2() {
        String day = "31/01/2018";
        String result = "1/2/2018";
        assertEquals(result,NextDayCalculator.getNextDay(day));
    }
    @Test
    public void testDay3() {
        String day = "30/04/2018";
        String result = "1/5/2018";
        assertEquals(result,NextDayCalculator.getNextDay(day));
    }
    @Test
    public void testDay4() {
        String day = "28/02/2018";
        String result = "1/3/2018";
        assertEquals(result,NextDayCalculator.getNextDay(day));
    }
    @Test
    public void testDay5() {
        String day = "29/02/2020";
        String result = "1/3/2020";
        assertEquals(result,NextDayCalculator.getNextDay(day));
    }
    @Test
    public void testDay6() {
        String day = "31/12/2018";
        String result = "1/1/2019";
        assertEquals(result,NextDayCalculator.getNextDay(day));
    }
}