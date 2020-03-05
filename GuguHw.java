package homework;

import java.util.concurrent.CountDownLatch;

public class GuguHw {

	int[] evenGugu(int num) {
		int gugu[] = new int[9];
		// 정수하나를 입력받아서
		// 해당정수를 1부터 9까지 곱한 값을 저장하는 1차원 배열을
		// 리턴하는 메서드
		// 1차원 배열을 만들때 for문 사용

		for (int i = 0; i < gugu.length; i++) {
			gugu[i] = num * (i + 1);
		}
		return gugu;
	}

	int[] oddGugu(int num) {
		int i = 0;
		int gugu[] = new int[9];
		while (i < gugu.length) {

			gugu[i] = num * (i + 1);
			System.out.println(gugu[i]);
			i++;
		}
		return gugu;
	}

	// 정수하나를 입력받아서
	// 해당정수를 1부터 9까지 곱한 값을 저장하는 1차원 배열을
	// 리턴하는 메서드
	// 1차원 배열을 만들때 while문 사용

	void printGugu(int[] gugu) {
		// 1차원 배열을 하나 입력 받아서
		// 배열안에 있는 내용들을 출력할건데
		// 짝수 인덱스 값만 역순으로 출력하는 메서드
		for(int i = gugu.length-1; i>=0; i--)
		{
			if( i % 2 == 1) continue;
			
				System.out.println(gugu[i]);
			}
		
			}
		}
		
	





