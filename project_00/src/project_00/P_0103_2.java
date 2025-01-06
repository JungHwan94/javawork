package project_00;

import java.util.Scanner;
//import java.util.Arrays;

import javax.swing.Box;

public class P_0103_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*1. 길이 10인 배열을 선언하고 1~10까지 반복문을 
		   이용하여 순서대로 넣고 출력하기
		   */
		/*
		int[]num = new int[10];
		for(int i=0; i<num.length; i++) {
			num[i] = i +1;
		}
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		*/	   
		// 배열 전체를 한 번에 출력
        //System.out.println(Arrays.toString(num));
		
		/*   
		2. 길이 10인 배열을 선언하고 1~10까지 값을 반복문을
		   이용하여 역순으로 배열 인덱스에 넣고 값 출력
		   */
		/*
		int[]num = new int[10];
		for(int i=0; i<num.length; i++) {
			num[i] = i +1;
		}
		for(int i=num.length-1; i>=0; i--) {
			System.out.println(num[i]);
		}
		*/
/*
		3. 사용자로 부터 입력받은 수 만큼 배열을 만들고
		   1~입력받은 수를 차례대로 넣어 출력*/
		/*
		System.out.println("숫자 입력: ");
		int num = scan.nextInt();
		int[] box = new int[num];
		
		for(int i=0; i<box.length; i++) {
			box[i] = i+1;
		}
		for(int i=0; i<box.length; i++) {
			System.out.println(i+1 + "번째 숫자 출력: " + box[i]);
		}
		   
/*
		4. 길이가 5일 배열에 사과,귤,포도,복숭아,참외로 초기화한후
		   배열 인덱스를 이용하여 귤 출력*/
/*
		String[] fru = new String[5];
		fru[0] = "사과";
        fru[1] = "귤";
        fru[2] = "포도";
        fru[3] = "복숭아";
        fru[4] = "참외";
		
		for(int i = 0; i<fru.length; i++) {
			switch(fru[i]) {
			case "귤":
				System.out.println("귤이다!");
				break;
				
				default:
					break;
			}
		}
*/


/*
		5. 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		   개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력
		   ex)
		   문자열 : application
		   문자 : i
		   application에 i가 존재하는 위치(인덱스) : 4 8 
		   i 개수 : 2*/
		/*
		System.out.println("문자 입력: ");
		String mon = scan.nextLine();
		char[] box = new char[mon.length()];

		for (int i = 0; i < box.length; i++) {
		    box[i] = mon.charAt(i);
		}

		System.out.println("찾는 문자? ");
		char find = scan.next().charAt(0);

		int count = 0;
		for (int i = 0; i < box.length; i++) {
		    if (box[i] == find) {
		        System.out.println("위치: " + i);
		        count++;
		    }
		}

		System.out.println("개수: " + count);
		*/

/*		6. 배열에 요일(월,화,수,목,금,토,일)을 초기화하여 넣고 사용자로 부터 0~6사이의 숫자를 입력받아
		   숫자와 같은 요일 출력
		   ex.
		   0 ~ 6 사이 숫자 입력 : 4			
		   금요일
		   0 ~ 6 사이 숫자 입력 : 7
		   잘못 입력하셨습니다. */
		/*
		char [] days = {'월','화','수','목','금','토','일'};
		System.out.println("0~6사이 숫자 입력: ");
		int num = scan.nextInt();
		
		if(num >=0 && num <= 6) {
			System.out.println(days[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		*/
		/*7. 사용자로 부터 배열의 크기를 입력받아 그 배열의 갯수만큼 숫자로 입력받아 배열에 저장하고
		   배열 전체의 합 출력 */
		/*
		System.out.println("배열 입력: ");
		int num = scan.nextInt();
		int arr[] = new int[num];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+1 + "번째 값 입력: ");
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		System.out.println("합: " +sum);
		   */
		   
		   
/*
		8. 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		   중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		   단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		   다시 정수를 받도록 하세요. 

		   ex.
		   정수 : 4
		   다시 입력하세요.
		   정수 : -6
		   다시 입력하세요.
		   정수 : 5
		   1, 2, 3, 2, 1 */
		/*
		System.out.println("3이상인 홀수의 정수 입력: ");
		int num = scan.nextInt();
		
		if(num>=3 && num%2 == 1) {
			int value = 1;
			int[] arr = new int[num];
			for(int i=0; i<arr.length; i++) {
				if(i < num / 2) {
					arr[i] = value++; 
				} else {
					arr[i] = value--;
				}
				System.out.print(arr[i] + " ");
			}
		} else {
			System.out.println("다시 입력하세요");
		}
*/



		/*9. 사용자가 입력한 값이 배열에 있는지 검색하여
		   있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		   단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		   ex.
		   치킨 이름을 입력하세요 : 양념			
		   양념치킨 배달 가능

		   치킨 이름을 입력하세요 : 불닭
		   불닭치킨은 없는 메뉴입니다.*/
		/*
		String[] chi = {"후라이드", "양념", "뿌링클", "핫후라이드"};
		System.out.println("치킨 이름을 입력하세요: ");
		String menu = scan.next();
		
		boolean flag = false;
		for(int i=0; i<chi.length; i++) {
			if(menu.equals(chi[i])) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println(menu + "치킨 배달 가능");
		} else {
			System.out.println(menu + "치킨은 없는 메뉴입니다");
		}
		*/

		/*10. 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		     1~10 사이의 난수를 발생시켜 배열에 초기화 후
		     배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.

		     ex.
		     5 3 2 7 4 8 6 10 9 10 
		     최대값 : 10
		     최소값 : 2 */
		     /*
		int[] arr = new int[10];
        Random random = new Random();

        // 배열 초기화: 1~10 사이의 난수를 각 칸에 저장
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10) + 1; // 1~10 사이의 난수
        }

        // 배열 전체 값 출력
        System.out.print("배열 값: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 최대값과 최소값 초기화
        int max = arr[0];
        int min = arr[0];

        // 최대값과 최소값 계산
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // 결과 출력
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
*/



		/*11. 사용자로부터 정수값 5개 배열에 입력
		   오름차순 정렬로 정렬하기*/
		   /*
		   int[] num1 = new int[5];

        System.out.println("정수값 5개 입력:");
        for (int i = 0; i < num1.length; i++) {
            System.out.print((i + 1) + "번째 정수: ");
            num1[i] = scan.nextInt();
        }

        for (int i = 0; i < num1.length - 1; i++) {
            for (int j = 0; j < num1.length - 1 - i; j++) {
                if (num1[j] > num1[j + 1]) {
                    int temp = num1[j];
                    num1[j] = num1[j + 1];
                    num1[j + 1] = temp;
                }
            }
        }

        System.out.println("오름차순 정렬 결과:");
        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i] + " ");
        }
*/
		/*12. 각 학생별 국어 영어 수학점수의 총점과 평균을 구하고
		   각 과목별 총점과 평균을 구해 아래와 같이 출력하기
		   점수는 2차원 배열로 마음대로 넣는다.

		  번호  국어  영어  수학  총점  평균
		-----------------------------------------
		   1     95    100     78   273  83.3
		   2     68     57    100   273  83.3
		   3     62     97     85    273  83.3
		   4     85     83     69    273  83.3
		   5     86     74     38    273  83.3
		------------------------------------------
		총점   479   500   387 
		평균  95.0  100.0  78.3
		*/
		
		//총점, 평균 구하기
		
		int score[][] = {{95, 100, 78},
				 {63, 97, 85},
				 {68, 57, 100},
				 {85, 84, 69},
				 {86, 74, 39}};

		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");	
		System.out.println("----------------------------------------------");

		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		for(int i=0; i<score.length; i++) {  // 행
			korSum += score[i][0];
			engSum += score[i][1];
			mathSum += score[i][2];
	
		int sum2 = 0;
		System.out.print(" " + (i+1) + "\t");
		for(int j=0; j<score[i].length; j++) {   // 열
		sum2 += score[i][j];
		System.out.print(score[i][j] + "\t");
	}
		System.out.printf("%d\t%.1f\n", sum2, (double)sum2/score[i].length);
}

		System.out.println("----------------------------------------------");
		System.out.println("총점\t" + korSum + "\t" + engSum + "\t" + mathSum);
		System.out.printf("평균\t%.1f\t%.1f\t%.1f\n", korSum/(double)5, engSum/(double)5, mathSum/(double)5);
		}		
	

}
