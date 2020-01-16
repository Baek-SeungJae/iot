package chap07.Inheritance;

public class PersonTest {

	public static void main(String[] args) {
		Student s1 = new Student("Kim",15,100,100,60,76);
		//Student s2 = new Student("Lee",14,90,100,90,84);
		//Student s3 = new Student("Park",16,100,90,80,79);
		Teacher t1 = new Teacher("장동건",45,"Spring");
		Staff st1 = new Staff("김서연",25,"전산실");	
	
		s1.print();
		t1.print();
		st1.print();
	}
}
