import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		/* n개의 숫자가 입력되면,
		n개의 숫자를 왼쪽으로 하나씩 돌려서 출력하시오.
		예) 1 2 3 4 5가 입력된 경우,
		1 2 3 4 5
		2 3 4 5 1
		3 4 5 1 2
		4 5 1 2 3
		5 1 2 3 4
		입력
		첫째 줄에 숫자의 개수 n이 입력된다.( 1 <= n <= 1,000)
		둘째 줄에 n개의 정수 k가 차례로 구분되어 입력된다.(1 <= k <= 1,000)
		출력
		숫자를 로테이션한 결과를 출력한다.(단, 왼쪽으로만 돌린다.)
		입력 예시 
		5
		1
		2
		3
		4
		5
		출력 예시
		1 2 3 4 5
		2 3 4 5 1
		3 4 5 1 2
		4 5 1 2 3
		5 1 2 3 4
		}
		}
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int n = sc.nextInt();
		int[] nums = new int[1000];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		//nxn으로 출력
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				System.out.print(nums[j]+" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print(nums[k]+" ");
			}
			System.out.println();
		}
	}
}
