package exercises;

import java.util.Scanner;

public class ch2practice8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		boolean c = inRect(a, b, 100, 100, 200, 200);
		if(c == true)
			System.out.println("�� ���簢���� �浹�մϴ�.");
		else
			System.out.println("�� ���簢���� �浹���� �ʽ��ϴ�.");
		scanner.close();
	}
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else return false;
	}
}
