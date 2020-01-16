package workbook.workshop5;

public class Test04 {

	public static void main(String[] args) {
		Student studentArray[] = new Student[3];
		studentArray[0] = new Student("홍길동",15,171,81);
		studentArray[1] = new Student("한사람",13,183,72);
		studentArray[2] = new Student("임꺽정",16,175,65);
		int sumAge=0;
		int sumHeight=0;
		int sumWeight=0;
		System.out.println("이름\t나이\t신장\t몸무게\t");
		for(int i=0; i<studentArray.length; i++)
		{
			System.out.println(studentArray[i].getName()+"\t"+studentArray[i].getAge()+"\t"+studentArray[i].getHeight()+"\t"+studentArray[i].getWeight());
			sumAge+=studentArray[i].getAge();
			sumHeight+=studentArray[i].getHeight();
			sumWeight+=studentArray[i].getWeight();
		}
		
		System.out.println("나이의 평균: "+Math.round((double)sumAge/studentArray.length*100)/100.0);
		System.out.println("신장의 평균: "+Math.round((double)sumHeight/studentArray.length*100)/100.0);
		System.out.println("몸무게의 평균: "+Math.round((double)sumWeight/studentArray.length*100)/100.0);
		
	}

}
