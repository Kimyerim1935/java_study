
public class tv2 {

	public static void main(String[] args) {
		//Tv라는 클래스에 작성된 대로 메모리를 새로 빌린다음(Tv객체를 만들어서),
		// 그 메모리의 주소 정보를, myTv 참조변수에 저장하겠다.
		Tv myTv = new Tv();
		myTv.color = "Black";
		
//		myTv.power = true;
		myTv.power();

//		myTv.channel = 1;
		myTv.channelUp();
		System.out.println(myTv.channel);
	}

}
