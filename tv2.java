
public class tv2 {

	public static void main(String[] args) {
		//Tv��� Ŭ������ �ۼ��� ��� �޸𸮸� ���� ��������(Tv��ü�� ����),
		// �� �޸��� �ּ� ������, myTv ���������� �����ϰڴ�.
		Tv myTv = new Tv();
		myTv.color = "Black";
		
//		myTv.power = true;
		myTv.power();

//		myTv.channel = 1;
		myTv.channelUp();
		System.out.println(myTv.channel);
	}

}
