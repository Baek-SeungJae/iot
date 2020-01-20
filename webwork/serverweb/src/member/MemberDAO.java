package member;

import java.util.ArrayList;

public interface MemberDAO {
	int insert(MemberDTO member);
	int delete(String id);
	MemberDTO readMember(String name);
	ArrayList<MemberDTO> memberList();
}
