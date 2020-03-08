package homework;

public class MONEY {

	public static void main(String[] args) {
		int m = 51548530;
		int n = m/10000;
		int q = m%10000/1000;
		int w = m%10000%1000/100;
		int e = m%10000%1000%100/10;
		int r = m%10000%1000%100%10/1;
			System.out.println("10000원짜리는" + n + "개"  );
			System.out.println("1000원짜리는 "+ q + "개");
			System.out.println("100원짜리는" + w + "개");
			System.out.println("10원짜리는" + e + "개");
			System.out.println("1원짜리는"+ r + "개");
		
		final int[] coinType = {50000,10000,5000,1000,500,100,50,10};
		int result = m;
		for(int i = 0; i < coinType[i]; i++)
		{
			System.out.println(coinType[i]+"원 짜리는" + result/coinType[i] + "개");
			result %= coinType[i];
		}
	}

}
