
public class Exam1 {
	public static void main(String[] args) {
		// 1. 자식 기준
		Character ch = new Character("주인공");
		ch.walk();
		ch.run();
		ch.attack();
		ch.shield();
		System.out.println("-----------------");
		
		Monster mon = new Monster("악당");
		mon.walk();
		mon.run();
		mon.attack();
		mon.shield();
		System.out.println("-----------------");
		
		// 2. 부모 기준 : 부모가 여럿일 경우에는, 특정 부모의 기능만 사용하고 싶을 때
		Action action = new Character("주인공2");
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
