package chatting;

public class ClientGuiMain {
	public static void main(String[] args) {
		// 127.0.0.1 : �� pc�� �⺻ ip
		// "192.168.0.132" : ���� pc ip
		ClientGui clientGui = new ClientGui("192.168.0.132", 5420);
	}
}
