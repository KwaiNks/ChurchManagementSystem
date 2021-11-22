import java.util.Date;

public class Report {

    private int reportID;
    private String reportType;
    private Date reportDate;

    public Report(){

    }
    public Report(int reportID, String reportType) {
        this.reportID = reportID;
        this.reportType = reportType;
        this.reportDate = new Date();
    }

    public int getReportID() {
        return reportID;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public Date getReportDate() {
        return reportDate;
    }
}
