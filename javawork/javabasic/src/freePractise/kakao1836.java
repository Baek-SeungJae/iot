package freePractise;

import java.util.ArrayList;
import java.util.HashSet;

public class kakao1836 {
	public static void main(String[] args) {
		// * => 42
		// . => 46
		// A~Z => 65~90

		// main�׽�Ʈ�� ���� �ʱ�ȭ
		int m1 = 3;
		int n1 = 3;
		String[] board1 = {"DBA", "C*A", "CDB"};
		Solution sol1 = new Solution();
		System.out.println(sol1.solution(m1, n1, board1));
		int m2 = 2;
		int n2 = 4;
		String[] board2 = {"NRYN", "ARYA"};
		Solution sol2 = new Solution();
		System.out.println(sol2.solution(m2, n2, board2));
		int m3 = 4;
		int n3 = 4;
		String[] board3 = {".ZI.", "M.**", "MZU.", ".IU."};
		Solution sol3 = new Solution();
		System.out.println(sol3.solution(m3, n3, board3));
		int m4 = 2;
		int n4 = 2;
		String[] board4 = {"AB", "BA"};
		Solution sol4 = new Solution();
		System.out.println(sol4.solution(m4, n4, board4));
		
	}

}

class Solution {
	public String solution(int m, int n, String[] board) {
		// board�� m*n�� char�迭�� �߶󳻱�
				HashSet<Integer> set = new HashSet<Integer>();
				char[][] charlist = new char[m][n];
				for (int i = 0; i < m; i++) {
					charlist[i] = board[i].toCharArray();
				}
				String answer = "";
				// ���ĺ����� 2�����迭�� �ʱ�ȭ
				int[][] array = new int[m][n];

				// ��ǥ�� �����ϱ� ���� �迭
				// ���ĺ� 26��
				// ù��°��ǥ�� 1,2���� �ι�°��ǥ�� 3,4���� ������ ���̰� 0��° �ε������� �·Ḧ 1,2�� �������� 3,4�� �������� üũ�ϴ� �뵵
				int[][] xy = new int[27][5];

				// ���ĺ��迭�� set���� �Ѱܼ� ����ȭ, ��ǥã�Ƽ� ����
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						// set�� ����
						set.add((int) charlist[i][j]);

						// 2�����迭�� ����
						array[i][j] = charlist[i][j];

						// ��ǥ����
						if (charlist[i][j] >= 65) {
							if (xy[(int) charlist[i][j] - 65][0] == 0) {
								xy[charlist[i][j] - 65][0] = 1;
								xy[charlist[i][j] - 65][1] = i;
								xy[charlist[i][j] - 65][2] = j;
							} else {
								xy[charlist[i][j] - 65][3] = i;
								xy[charlist[i][j] - 65][4] = j;
							}
						}
					}
				}
				set.remove(42);
				set.remove(46);
				ArrayList<Integer> arr = new ArrayList<Integer>();
				for (Integer it : set) {
					arr.add(it);
				}
				arr.sort(null);

				boolean check1 = true;
				boolean check2 = true;
				boolean check3 = true;
				boolean check4 = true;
				int i1;
				int j1;
				int i2;
				int j2;
				int k = 0;
				while (!arr.isEmpty()) {
					
					for (int data : arr) {
						k = data;
						i1 = xy[data - 65][1];
						j1 = xy[data - 65][2];
						i2 = xy[data - 65][3];
						j2 = xy[data - 65][4];
						check1 = true;
 						check2 = true;
						check3 = true;
						check4 = true;
						if (j1 < j2) {
							for (int m1 = i1; m1 < i2; m1++) {
								if (charlist[m1][j2] != 46&charlist[m1][j2]!=data) {
									check1 = false;
									break;
								}
							}
							for (int n1 = j1; n1 < j2; n1++) {
								if (charlist[i1][n1] != 46 & charlist[i1][n1] != data) {
									check2 = false;
									break;
								}
							}
							check3=false;
							check4=false;
						}
						if (j1 > j2) {
							for (int m1 = i1; m1 < i2; m1++) {
								if (charlist[m1][j2] != 46 &charlist[m1][j2]!=data) {
									check3 = false;
									break;
								}
							}
							for (int n1 = j1; n1 < j2; n1--) {
								if (charlist[i1][n1] != 46 & charlist[i1][n1] != data) {
									check4 = false;
									break;
								}
							}
							check1=false;
							check2=false;
						}
						
						if ((check1&&check2)||(check3&&check4)) {
							charlist[i1][j1] = 46;
							charlist[i2][j2] = 46;
							answer = answer + (char) data;
							break;
						}

					} // for
					if ((check1&&check2)||(check3&&check4)) {
						set.remove(k);
						arr.clear();
						for (Integer it : set) {
							arr.add(it);
						}
						arr.sort(null);
					}
				} // while
				
		/*
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						System.out.print((char) charlist[i][j]);
					}
					System.out.println();
				}
		*/
		if(answer.equals(""))
			answer="IMPOSSIBLE";
		return answer;
	}
}