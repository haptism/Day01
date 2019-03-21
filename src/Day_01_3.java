
public class Day_01_3 {

	public static void main(String[] args) {
		int num = 10;
		long l = num; // 자동형변환
		num = (int) l; // 강제형변환, 명시적형변환

		System.out.println(l);

		double d1 = 2.725;
		num = (int) d1;
		System.out.println(num);

		int r = num + (int) 2.2;
		System.out.println(r);

		int kor = 35;
		int eng = 65;
		int math = 10;

		double sum = kor + eng + math;
		double avg = (double) sum / 3;
		System.out.println(avg);
		// 평균을 계산후 변수에 담아서 출력

		char ch = 'A';
		num = ch;
		System.out.println(num);

	}
}
