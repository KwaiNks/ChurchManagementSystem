    import java.util.ArrayList;
    import java.util.List;

    public class Church {

        private Member member;
        private Report report;
        private List<Member> listOfMembers;
        private List<Report> listOfReports;
        String searchedMember;
        int searchedReport;

        public Church(int numberOfMembers,int numberOfReports) {
            member = new Member();
            report = new Report();
            listOfMembers = new ArrayList<>(numberOfMembers);
            listOfReports = new ArrayList<>(numberOfReports);

            for (int i = 0; i < numberOfMembers; i++) {
               listOfMembers.add(new Member());
            }

            for (int i = 0; i < numberOfReports; i++) {
                listOfReports.add(new Report());
            }
        }

        public int getTotalNumberOfMembersInTheChurch() {
         return listOfMembers.size();
        }

        public int getTotalNumberOfReportsInTheChurch() {
            return listOfReports.size();
        }

        public void addMemberToChurch(Member member2) {
            listOfMembers.add(member2);
        }

        public void addReportToChurch(Report report2) {
            listOfReports.add(report2);
        }

        public int removeMemberFromChurchList(int memberID) {
            for (int i = 0; i < listOfMembers.size(); i++) {
                if(listOfMembers.get(i).getMemberID() == memberID)
                   member = listOfMembers.get(i);
                    listOfMembers.remove(member);
         }
            return listOfMembers.size();
        }

        public String searchMemberFromChurch(int memberID) {
            for (int i = 0; i < listOfMembers.size(); i++) {
                if (listOfMembers.get(i).getMemberID() == memberID)
                   searchedMember = listOfMembers.get(i).getMemberName();
            }
           return  searchedMember;
        }

        public void removeReportFromChurch(int reportNumber) {
            for (int i = 0; i < listOfReports.size(); i++) {
                if (listOfReports.get(i).getReportID() == reportNumber)
                    report = listOfReports.get(i);
                    listOfReports.remove(report);
            }
            listOfReports.size();
        }

        public int searchReportFromChurch(int reportNumber) {
            for (int i = 0; i < listOfReports.size(); i++) {
                if (listOfReports.get(i).getReportID() == reportNumber)
                    searchedReport = listOfReports.get(i).getReportID();
            }
            return searchedReport;
        }
    }
