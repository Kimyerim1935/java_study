
public class Methodtest {

	public static void main(String[] args) {//main 메서드 : 시작점
		Method myTest = new Method();
		myTest.plus(10,3);
		
		int result = myTest.plus(10,3);
		System.out.println(myTest.plus(10,3));
		
		int result2 = myTest.plus(10,3)+3;
		System.out.println(result2);
		int result3 = myTest.plus(10,myTest.plus(10,3));
		System.out.println(result3);
	}

}
