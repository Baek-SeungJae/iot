package di.setter.basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	public InsaImpl() {
		System.out.println("�⺻������");
	}
	
	public MemberDAO getDao() {
		return dao;
	}
	public void setDao(MemberDAO dao) {
		System.out.println("setter�޼ҵ� ȣ��");
		this.dao = dao;
	}
	
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