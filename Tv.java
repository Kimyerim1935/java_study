//tvŬ������ ������ ��� ������ ������ �޼���� �����Ǿ� �ִ�.
//�� ���� ������� : color, power,channel
//�� ���� �޼��� : color(), channelUp(), channelDown()
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
