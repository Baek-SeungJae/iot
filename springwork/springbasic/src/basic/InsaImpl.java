package basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	// 1.�����ڸ� �̿��ؼ� �۾�
	// 2. setter�޼ҵ带 ȣ��
	
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
