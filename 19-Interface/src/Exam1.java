
public class Exam1 {
	public static void main(String[] args) {
		// 1. �ڽ� ����
		Character ch = new Character("���ΰ�");
		ch.walk();
		ch.run();
		ch.attack();
		ch.shield();
		System.out.println("-----------------");
		
		Monster mon = new Monster("�Ǵ�");
		mon.walk();
		mon.run();
		mon.attack();
		mon.shield();
		System.out.println("-----------------");
		
		// 2. �θ� ���� : �θ� ������ ��쿡��, Ư�� �θ��� ��ɸ� ����ϰ� ���� ��
		Action action = new Character("���ΰ�2");
		action.pickup();
		
		Fight fight = (Fight) action;
		fight.attack();
		fight.shield();
		
		Move move = (Move) action;
		move.walk();
		move.run();
		move.jump();		
	}
}
