class Living {
	void live() { System.out.println("살아있다.");	}
	void breath() {	System.out.println("Living : 산소로 호흡한다."); }
	void walk() { System.out.println("Living : 네발로 걷는다."); }
}
class Animal extends Living {
	void breath() {	System.out.println("산소로 호흡한다."); }
	void move() { System.out.println("움직인다."); }
}
class Mammalia extends Animal {
	void bringingUp() { System.out.println("젖으로 새끼를 양육한다."); }
	void walk() { System.out.println("네발로 걷는다."); }
}
public class Exam1 {
	public static void main(String[] args) {
		Living living = new Living();
		living.live();
		System.out.println("-------------");
		// 부모 클래스 기준 : 다형성 방법
		Living r1 = new Animal();
		r1.live();
		r1.breath();
		System.out.println("-------------");
		Living r2 = new Mammalia();
		r2.live();
		r2.breath();
		r2.walk();
		System.out.println("-------------");
		// 자식 클래스 기준 : 기본 사용법
		Animal animal = new Animal();
		animal.live();
		animal.breath();
		System.out.println("-------------");
		Mammalia mammalia = new Mammalia();
		mammalia.live();
		mammalia.breath();
		mammalia.walk();
	}
}
