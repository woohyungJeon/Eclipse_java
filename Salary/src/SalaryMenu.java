import java.util.Scanner;

public class SalaryMenu extends SalaryVO {
	Scanner sc = new Scanner(System.in);

	SalaryVO[] salary = new SalaryVO[20];
	int num = 0;	// 직원수를 관리하는 변수

	// 입력
	public void input() {
		if (num < 20) {
			salary[num] = new SalaryVO();
			System.out.print("이름 : ");
			salary[num].setName(sc.next());
			System.out.print("직급 : ");
			salary[num].setRank(sc.next());
			System.out.print("기본급 : ");
			salary[num].setNormal(sc.nextInt());
			System.out.print("수당 : ");
			salary[num].setAlw(sc.nextInt());
			
			calc_tariff(num);	// 세율 계산
			calc_salary(num);	// 월급 계산
			
			num++;	// 직원수 증가
		} else {
			System.out.println("인원은 20명 까지 입니다.");
		}
	}
	// 월급 계산
	public void calc_salary(int n) {		
		int sal = (int)(salary[n].getNormal() + salary[n].getAlw() 
				     - (salary[n].getNormal() + salary[n].getAlw()) * salary[n].getTariff());
		salary[n].setSalary(sal);
	}
	// 세율 계산
	public void calc_tariff(int n) {
		/* 세율 : 기본급 + 수당
		 * 세율은 200만원 이하 : 1%(0.01) 400만원 이하 : 2%(0.02) 400만원 초과 : 3%(0.03)
		 */
		int sal = salary[n].getNormal() + salary[n].getAlw();

		if (sal <= 2000000) {
			salary[n].setTariff(0.01);
		} else if (sal <= 4000000) {
			salary[n].setTariff(0.02);
		} else if (sal > 4000000) {
			salary[n].setTariff(0.03);
		}
	}

	// 출력
	public void output_title() {
		// 타이틀 출력
		String title = "이름\t직급\t기본급\t수당\t세율\t월급";		
		System.out.println(title);
	}
	public void output() {
		output_title();
		
		for (int i = 0; i < num; i++) {
			System.out.println(salary[i].toString());
		}
	}

	// 수정
	public void modify() {
		boolean chk_name = false; // 이름 존재 유무 저장, true: 존재, faslse: 존재하지 않음
		System.out.print("수정할 직원의 이름을 입력하시오 :");
		String name = sc.next();

		for (int i = 0; i < num; i++) {
			if (salary[i].getName().equals(name)) {
				output_title();			// 타이틀 출력
				System.out.println(salary[i].toString());	// 검색 결과 출력
				System.out.println(); 	// 한줄넘김

				System.out.print("직급 : ");
				salary[i].setRank(sc.next());
				System.out.print("기본급 : ");
				salary[i].setNormal(sc.nextInt());
				System.out.print("수당 : ");
				salary[i].setAlw(sc.nextInt());
				
				calc_tariff(i);	// 세율 계산
				calc_salary(i);	// 월급 계산

				chk_name = true;
				break;
			}
		}

		if (!chk_name) {
			System.out.println("등록된 이름이 없습니다.");
			System.out.println(); // 한줄 넘김
		}
	} //

	// 검색
	public void searchName() {
		boolean chk_name = false;
		System.out.println("검색할 직원의 이름을 입력하시오 : ");
		String name = sc.next();

		for (int i = 0; i < num; i++) {
			if (salary[i].getName().equals(name)) {
				output_title();
				System.out.println(salary[i].toString());
				System.out.println(); // 한줄 넘김

				chk_name = true;
				break;
			}
		}
		if (!chk_name) {
			System.out.println("등록된 이름이 없습니다.");
		}
	}
}
