package day01_1;

import java.time.LocalDate;

// 테스트 클래스 : main 대신

public class TodoTest {
	public void test1() {
		// 정수 리터럴의 타입? int
//		Todo t1 = new Todo(1, "작업1", LocalDate.now(), false);
		
		// 객체 생성자
		Todo t1 = new Todo(1L, "할일1", LocalDate.now(), false);
	}
}
