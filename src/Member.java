    public class Member {

        private int memberID;
        private String memberName;
        private String memberRole;

        public Member(){

        }
        public Member(int memberID, String memberName, String memberRole) {
            this.memberID = memberID;
            this.memberName = memberName;
            this.memberRole = memberRole;
        }

        public int getMemberID() {
            return memberID;
        }

        public void setMemberID(int memberID) {
            this.memberID = memberID;
        }

        public String getMemberName() {
            return memberName;
        }

        public void setMemberName(String memberName) {
            this.memberName = memberName;
        }

        public String getMemberRole() {
            return memberRole;
        }

        public void setMemberRole(String memberRole) {
            this.memberRole = memberRole;
        }
    }
