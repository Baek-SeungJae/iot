package workbook.workshop5.Test02Company;

public class Test02 {

	public static void main(String[] args) {
		Company com = new Company(Double.parseDouble(args[0]));
		//int�� �Է��ߴ��� �ڵ�ĳ������ �ȴ�.
		
		System.out.printf("�� �⺻�� ��: %.1f ����: %.1f\n",com.getIncome(),com.getAfterTaxIncome());
		System.out.printf("�� ���ʽ� ��: %.1f ����: %.1f\n",com.getBonus(),com.getAfterTaxBonus());
		System.out.printf("�� ���޾� ��: %.1f\n",com.getAfterTaxBonus()+com.getAfterTaxIncome());
	}
}
