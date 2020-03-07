//tv클래스는 세개의 멤버 변수와 세개의 메서드로 구성되어 있다.
//세 개의 멤버변수 : color, power,channel
//세 개의 메서드 : color(), channelUp(), channelDown()
public class Tv {

	String color;
	boolean power; // true:on, false:off
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}
}
