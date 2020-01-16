package workbook.workshop5.Test02Company;

public class Test02 {

	public static void main(String[] args) {
		Company com = new Company(Double.parseDouble(args[0]));
		//int로 입력했더라도 자동캐스팅이 된다.
		
		System.out.printf("연 기본급 합: %.1f 세후: %.1f\n",com.getIncome(),com.getAfterTaxIncome());
		System.out.printf("연 보너스 합: %.1f 세후: %.1f\n",com.getBonus(),com.getAfterTaxBonus());
		System.out.printf("연 지급앱 합: %.1f\n",com.getAfterTaxBonus()+com.getAfterTaxIncome());
	}
}
