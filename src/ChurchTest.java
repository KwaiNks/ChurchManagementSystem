
    import org.junit.Before;
    import org.junit.Test;
    import java.util.ArrayList;
    import java.util.List;
    import static org.junit.Assert.assertEquals;

    public class ChurchTest {

        private Church church;
        private Member member;
        private Report report;

        @Before
        public void setUp(){
            member = new Member(15, "Peterkin Boadu", "Member");
            report = new Report(5436, "Financial");
            church = new Church(3,5);
        }

        @Test
        public void shouldReturnTotalNumberOfMembersInTheChurch(){
            assertEquals(3, church.getTotalNumberOfMembersInTheChurch());
        }

        @Test
        public void shouldReturnTotalNumberOfReportsInTheChurch(){
            assertEquals(5, church.getTotalNumberOfReportsInTheChurch());
        }

        @Test
        public void shouldAddMemberToTheListOfMembersInTheChurch(){
            church.addMemberToChurch(member);
            assertEquals(4, church.getTotalNumberOfMembersInTheChurch());
        }

        @Test
        public void shouldAddReportToTheListOfReportsInTheChurch() {
            church.addReportToChurch(report);
            assertEquals(6, church.getTotalNumberOfReportsInTheChurch());
        }

        @Test
        public void shouldRemoveMemberFromTheListOfMembersInTheChurch(){

            Member member2 = new Member(7, "Frank Amponsah", "Deacon");
            church.addMemberToChurch(member2);
            church.addMemberToChurch(member);
            church.removeMemberFromChurchList(15);

            assertEquals(4, church.getTotalNumberOfMembersInTheChurch());
        }

        @Test
        public void shouldSearchMemberFromTheListOfMembersInTheChurch(){

            Member member1 = new Member(14, "Incolla","Member");
            church.addMemberToChurch(member);
            church.addMemberToChurch(member1);

            assertEquals("Peterkin Boadu", church.searchMemberFromChurch(15));
        }

        @Test
        public void shouldRemoveReportFromTheListOfReportsInTheChurch() {

            Report report1 = new Report(0006, "Membership");
            church.addReportToChurch(report);
            church.addReportToChurch(report1);

            church.removeReportFromChurch(0006);

            assertEquals(6, church.getTotalNumberOfReportsInTheChurch());
        }

        @Test
        public void shouldSearchReportFromTheListOfReportsInTheChurch() {
            church.addReportToChurch(report);

            assertEquals(5436, church.searchReportFromChurch(5436));
        }
    }