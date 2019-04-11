import java.util.Scanner;

public class Day_01_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(sc);

		int n1 = 10;
		int n2 = 3;
		int r1 = n1 / n2;
		int r2 = n1 % n2;
		System.out.println(r1);
		System.out.println(r2);

		// 편의점 알바
		// 물건의 합계 금액 입력 : 25640
		// 손님이 낸돈 입력 : 50000
		// 거스름돈 : 24360
		// 만원 2
		// 천원 4
		// 백원 3
		// 십원 6

		int pay = 50000;
		System.out.println("손님이 낼 금액을 입력하세요 : " + pay + "원");
		int total = 25640;
		System.out.println("물건의 합계 금액을 입력하세요 : " + total + "원");
		int change = pay - total;
		System.out.println("거스름돈 : " + change + "원");

		int man = change / 10000;
		int ocheon = change / 5000;
		int cheon = change / 1000;
		int obeak = change / 500;
		int beak = change / 100;
		int sib = change / 10;

		System.out.println("만원 : " + man);
		System.out.println("오천원 : " + ocheon);
		System.out.println("천원 : " + cheon);
		System.out.println("오백원 : " + obeak);
		System.out.println("백원 : " + beak);
		System.out.println("십원 : " + sib);

		// 4의 배수마다 +7 나머지 +1
		// 951224-1234567
		// 0 -> 0
		// 1 -> 1
		// 2 -> 2
		// 3 -> 3

		// 4 -> 10
		// 5 -> 11
		// 6 -> 12
		// 7 -> 13

		// 8 -> 20
		// 9 -> 21
		// 10 -> 22
		// 11 -> 23

		// 12 -> 30


		// num / 4 * 10 + num % 4

	}
}
