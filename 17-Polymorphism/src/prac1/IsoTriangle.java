package prac1;

public class IsoTriangle extends DrawData {
	@Override
	void draw() {
		for (int i = 0; i < height; i++) {		// ��
			for (int j = 0; j < i + 1; j++) {	// ���� ����
				System.out.print(outchar);
			}
			System.out.println();				// 1�ٳѱ�
		}
		System.out.println();
	}
}
