import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReportTest {

    private Report report;

    @Before
    public void setUp(){
        report = new Report();
    }

    @Test
    public void shouldReturnReportType(){
        report.setReportType("Membership");
        assertEquals("Membership", report.getReportType());
    }
}
