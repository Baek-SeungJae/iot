package workbook.workshop5;

public class Test04 {

	public static void main(String[] args) {
		Student studentArray[] = new Student[3];
		studentArray[0] = new Student("ȫ�浿",15,171,81);
		studentArray[1] = new Student("�ѻ��",13,183,72);
		studentArray[2] = new Student("�Ӳ���",16,175,65);
		int sumAge=0;
		int sumHeight=0;
		int sumWeight=0;
		System.out.println("�̸�\t����\t����\t������\t");
		for(int i=0; i<studentArray.length; i++)
		{
			System.out.println(studentArray[i].getName()+"\t"+studentArray[i].getAge()+"\t"+studentArray[i].getHeight()+"\t"+studentArray[i].getWeight());
			sumAge+=studentArray[i].getAge();
			sumHeight+=studentArray[i].getHeight();
			sumWeight+=studentArray[i].getWeight();
		}
		
		System.out.println("������ ���: "+Math.round((double)sumAge/studentArray.length*100)/100.0);
		System.out.println("������ ���: "+Math.round((double)sumHeight/studentArray.length*100)/100.0);
		System.out.println("�������� ���: "+Math.round((double)sumWeight/studentArray.length*100)/100.0);
		
	}

}
