package basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	// 1.생성자를 이용해서 작업
	// 2. setter메소드를 호출
	
	public InsaImpl() {
		
	}
	
	public InsaImpl(MemberDAO dao) {
		this.dao = dao;
	}
	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);		
	}

	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}
	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}
}
