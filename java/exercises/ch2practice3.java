package exercises;

import java.util.Scanner;

public class ch2practice3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int kwon = scanner.nextInt();
		int a = kwon/50000;
		System.out.println("5������ " + a + "��");
		kwon = kwon - 50000 * a;
		int b = kwon/10000;
		System.out.println("1������ " + b + "��");
		kwon = kwon - 10000 * b ;
		int d = kwon/1000;
		System.out.println("õ���� " + d + "��");
		scanner.close();
	}
}