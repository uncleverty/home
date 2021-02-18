package exercise2;

import java.util.Date;

import static org.junit.Assert.fail;


public class DateRange {

    private Date beginDate;
    private Date endDate;

    public DateRange() {
        beginDate = new Date();
        endDate = new Date();
    }

    public DateRange(Date beginDate, Date endDate) {
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    /**
     * Implement a date range being equal to another date range.
     *   Example # 1 : Return true
     *     Date Range #1:     Oct 17 - Oct 25  |_____________|
     *     Date Range #2:     Oct 17 - Oct 25  |_____________|
     *
     *   Example # 2 : Return false
     *     Date Range #1:     Oct 17 - Oct 25  |_____________|
     *     Date Range #2:     Oct 19 - Oct 27    |_____________|
     */
    public boolean equals(DateRange dateRange) {
        fail("TODO implement equals method");
        return true;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

}