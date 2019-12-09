package dl.constructor.basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
	}
	public void addUser(MemberDTO user) {
		dao.add(user);		
	}

	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

}
