package jdbc.member.exam;

import java.util.ArrayList;

public interface MemberDAO {
	int insert(MemberDTO user);
	int update(String id, String addr);
	int delete(String id);
	ArrayList<MemberDTO> memberList();
	ArrayList<MemberDTO> findByAddr(String addr);
	MemberDTO login(String id, String pass);
}
