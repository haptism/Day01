import java.util.Scanner;

public class Day_01_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);

		/*
		 * System.out.println("이름을 입력하세요"); String name = sc.next();
		 * System.out.println("나이를 입력하세요"); int age = sc.nextInt();
		 * System.out.println("your Name : " + name); System.out.println("your Age : " +
		 * age);
		 */

		// 희망 월급을 입력 받기 3000000
		// 국민연금 : 0.3%
		// 고용보험 : 0.5%
		// 의료보험 : 2%
		// 산재보험 : 1.2%

		// 각 세금의 금액
		// 총 세금의 합계액
		// 실 수령액
		System.out.println("희망 월급을 입력하세요");
		int sal = sc.nextInt();
		double taxnat = sal * 0.003;
		double taxemp = sal * 0.005;
		double taxmed = sal * 0.02;
		double taxindu = sal * 0.012;
		double total =taxnat+taxemp+taxmed+taxindu;
		double myPay = total;

		System.out.println("국민 연금 : " + taxnat + "원");
		System.out.println("고용 보험 : " + taxemp + "원");
		System.out.println("의료 보험 : " + taxmed + "원");
		System.out.println("산재 보험 : " + taxindu + "원");
		System.out.println("총 세 금 : " + total + "원");
		System.out.println("실 급 여 : " + myPay + "원");
	}
}
