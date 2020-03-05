package homework;

import java.util.concurrent.CountDownLatch;

public class GuguHw {

	int[] evenGugu(int num) {
		int gugu[] = new int[9];
		// �����ϳ��� �Է¹޾Ƽ�
		// �ش������� 1���� 9���� ���� ���� �����ϴ� 1���� �迭��
		// �����ϴ� �޼���
		// 1���� �迭�� ���鶧 for�� ���

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

	// �����ϳ��� �Է¹޾Ƽ�
	// �ش������� 1���� 9���� ���� ���� �����ϴ� 1���� �迭��
	// �����ϴ� �޼���
	// 1���� �迭�� ���鶧 while�� ���

	void printGugu(int[] gugu) {
		// 1���� �迭�� �ϳ� �Է� �޾Ƽ�
		// �迭�ȿ� �ִ� ������� ����Ұǵ�
		// ¦�� �ε��� ���� �������� ����ϴ� �޼���
		for(int i = gugu.length-1; i>=0; i--)
		{
			if( i % 2 == 1) continue;
			
				System.out.println(gugu[i]);
			}
		
			}
		}
		
	





