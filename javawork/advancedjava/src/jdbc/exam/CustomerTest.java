package jdbc.exam;

import java.util.Scanner;
public class CustomerTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******customer********");
		System.out.println("1. ���");
		System.out.println("2. ����");
		System.out.println("3. ����");
		int c = key.nextInt();
		CustomerDAO dao = new CustomerDAO();
		
		switch(c) {
			case 1:{
				System.out.println("*******������********");
				System.out.print("���̵�:");
				String id = key.next();
				System.out.print("�н�����:");
				String pass = key.next();
				System.out.print("����:");
				String name = key.next();
				System.out.print("����:");
				int point = key.nextInt();
				System.out.print("�ּ�:");
				String addr = key.next();
				CustomerDTO member = new CustomerDTO(id,pass,name,point,addr);
				int result = dao.insert(member);
				if(result>0) {
					System.out.println("��� ����");
				}
				else {
					System.out.println("��� ����");
				}
				break;
			}
			case 2:{
				System.out.println("*******�������********");
				System.out.print("���̵�:");
				String id = key.next();
				System.out.print("�ּ�:");
				String addr = key.next();
				int result = dao.update(id, addr);
				if(result>0) {
					System.out.println("��� ���� ����");
				}
				else {
					System.out.println("��� ���� ����");
				}
				break;
			}
			case 3:{
				System.out.println("*******�������********");
				System.out.print("���̵�:");
				String id = key.next();
				int result = dao.delete(id);
				if(result>0) {
					System.out.println("���� ����");
				}
				else {
					System.out.println("���� ����");
				}
				break;
			}
			
		}
	}
}
