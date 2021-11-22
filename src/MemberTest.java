import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MemberTest {

    private int memberID;
    private String memberName;
    private String memberRole;
    private Member member;

    @Before
    public void setUp(){
        member = new Member();
    }

    @Test
    public void shouldReturnMemberId(){
        member.setMemberID(7214);
        assertEquals(7214, member.getMemberID());
    }

    @Test
    public void shouldReturnMemberName(){
        member.setMemberName("David Brown");
        assertEquals("David Brown", member.getMemberName());
    }

    @Test
    public void shouldReturnMemberRole(){
        member.setMemberRole("Administrator");
    assertEquals("Administrator", member.getMemberRole());
    }
}