class Living {
	void live() { System.out.println("����ִ�.");	}
	void breath() {	System.out.println("Living : ��ҷ� ȣ���Ѵ�."); }
	void walk() { System.out.println("Living : �׹߷� �ȴ´�."); }
}
class Animal extends Living {
	void breath() {	System.out.println("��ҷ� ȣ���Ѵ�."); }
	void move() { System.out.println("�����δ�."); }
}
class Mammalia extends Animal {
	void bringingUp() { System.out.println("������ ������ �����Ѵ�."); }
	void walk() { System.out.println("�׹߷� �ȴ´�."); }
}
public class Exam1 {
	public static void main(String[] args) {
		Living living = new Living();
		living.live();
		System.out.println("-------------");
		// �θ� Ŭ���� ���� : ������ ���
		Living r1 = new Animal();
		r1.live();
		r1.breath();
		System.out.println("-------------");
		Living r2 = new Mammalia();
		r2.live();
		r2.breath();
		r2.walk();
		System.out.println("-------------");
		// �ڽ� Ŭ���� ���� : �⺻ ����
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
