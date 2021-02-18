package exercise2;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DateRangeTest {

    DateRange dateRange1 = new DateRange();
    DateRange dateRange2 = new DateRange();

    @Test
    public void equals_Null() {
        dateRange2 = null;
        assertFalse(dateRange1.equals(dateRange2));
    }

    @Test
    public void equals_Itself() {
        assertTrue(dateRange1.equals(dateRange1));
    }

    @Test
    public void equals_BothEquals() {
        dateRange1.setEndDate(new Date(12345));
        dateRange2.setEndDate(new Date(12345));
        assertTrue(dateRange1.equals(dateRange2));
    }

    @Test
    public void equals_Different() {
        dateRange2.setEndDate(new Date(12345));
        assertFalse(dateRange1.equals(dateRange2));
    }

    @Test
    public void equals_SameDateOnDifferentDays() {
        dateRange1.setBeginDate(new Date(12345));
        dateRange2.setEndDate(new Date(12345));
        assertFalse(dateRange1.equals(dateRange2));
    }

}