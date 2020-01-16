package workbook.workshop5;

public class Test05 {
	public static void main(String[] args) {
		Ltab lt = new Ltab("Ltab", 500, "AP-01");
		Otab ot = new Otab("Otab", 1000, "AND-20");
		
		System.out.println(" Mobile \t Battery \t OS");
		System.out.println("----------------------------------------------");
		System.out.println(" "+lt.getMoblieName()+" \t\t "+lt.getBatterySize()+" \t\t "+lt.getOsType());
		System.out.println(" "+ot.getMoblieName()+" \t\t "+ot.getBatterySize()+" \t\t "+ot.getOsType());
		
		System.out.println("\n10분 충전");
		System.out.println(" Mobile \t Battery \t OS");
		System.out.println("----------------------------------------------");
		System.out.println(" "+lt.getMoblieName()+" \t\t "+lt.charge(10)+" \t\t "+lt.getOsType());
		System.out.println(" "+ot.getMoblieName()+" \t\t "+ot.charge(10)+" \t\t "+ot.getOsType());
		
		System.out.println("\n5분 통화");
		System.out.println(" Mobile \t Battery \t OS");
		System.out.println("----------------------------------------------");
		System.out.println(" "+lt.getMoblieName()+" \t\t "+lt.operate(5)+" \t\t "+lt.getOsType());
		System.out.println(" "+ot.getMoblieName()+" \t\t "+ot.operate(5)+" \t\t "+ot.getOsType());
		
	}
}