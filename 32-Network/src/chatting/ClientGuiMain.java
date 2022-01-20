package chatting;

public class ClientGuiMain {
	public static void main(String[] args) {
		// 127.0.0.1 : 내 pc의 기본 ip
		// "192.168.0.132" : 강사 pc ip
		ClientGui clientGui = new ClientGui("192.168.0.132", 5420);
	}
}
