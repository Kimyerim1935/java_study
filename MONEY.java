package homework;

public class MONEY {

	public static void main(String[] args) {
		int m = 51548530;
		int n = m/10000;
		int q = m%10000/1000;
		int w = m%10000%1000/100;
		int e = m%10000%1000%100/10;
		int r = m%10000%1000%100%10/1;
			System.out.println("10000��¥����" + n + "��"  );
			System.out.println("1000��¥���� "+ q + "��");
			System.out.println("100��¥����" + w + "��");
			System.out.println("10��¥����" + e + "��");
			System.out.println("1��¥����"+ r + "��");
		
		final int[] coinType = {50000,10000,5000,1000,500,100,50,10};
		int result = m;
		for(int i = 0; i < coinType[i]; i++)
		{
			System.out.println(coinType[i]+"�� ¥����" + result/coinType[i] + "��");
			result %= coinType[i];
		}
	}

}
