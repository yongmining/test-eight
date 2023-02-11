import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		/* 주현이는 5살이라서 아직 기억력이 좋지 않은 편이다.
		주현이 엄마는 주현이의 기억력을 향상시키기 위해 매일 훈련을 시킨다.
		어느 날, 주현이 엄마는 주현이에게 10개의 숫자를 차례대로 말한 다음 "k번째 숫자는 뭘까요?"하고 물어본다.
		이번에는 주현이가 좋아하는 '또봇'이라는 로봇변신 자동차가 상품으로 걸려있다.
		주현이가 '또봇'을 가질 수 있도록 프로그래밍하시오.
		입력
		첫째 줄에 숫자 10개가 차례대로 입력된다.
		둘째, try {
        	Thread.sleep(3000); //3초
    	}catch(Exception e) { }
		을 이용하여 5초정도 숫자 10개를 볼수 있도록 한다.
		둘째, println()문을 여러 번 사용하여 숫자가 없어지도록 한다.
		셋째 줄에 k값이 입력된다. 
		출력
		k번째 숫자가 무엇이었는지 출력한다.
		입력 예시 
		10 9 8 7 6 5 4 3 2 1
		(10초 대기)
		.
		.
		.
		.
		.
		.
		3번째숫자는?
		(scanner 입력대기)
		출력 예시
		8
		도움말
		10개의 숫자 중 3번째 숫자는 8이다
		 */
		int[] motherNum = {18,29,48,39,24,23,11,77,99,55};
		for(int m : motherNum) {
			System.out.print(m+" ");
		}
		System.out.println();

		try {
			Thread.sleep(5000); //5초
		}catch(Exception e) { }

		for(int i=0; i<50; i++)
			System.out.println("...");

		System.out.println("3번째 숫자는?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		boolean isExist = false;
		if(num==motherNum[2]) {
			isExist = true;
		}

		if(isExist==true) {
			System.out.println("정답!");
		}else {
			System.out.println("오답!");
		}
	}

}
