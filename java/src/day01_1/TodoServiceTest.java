package day01_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;

public class TodoServiceTest {
	// TodoService를 테스트하기 위해 객체를 생성
	private TodoService service = new TodoService();

	// junit으로 테스트하려면 반드시 public void 형식이어야 한다
	@Test
	public void findAllTest() {
		// Todo가 없는 상태에서 0인지 테스트
		ArrayList<Todo> list1 = service.findAll();
		assertEquals(0L, list1.size());

		service.save(new Todo(1L, "자바공부", LocalDate.now(), false));
		ArrayList<Todo> list = service.findAll();

		// assert 메소드는 검증하는 메소드
		// assertEquals(내가 원하는 값, 실제 값);
		assertEquals(1L, list.size());
	}

	@Test
	public void deleteTest() {
		service.save(new Todo(1L, "자바공부", LocalDate.now(), false));
		service.save(new Todo(2L, "영어공부", LocalDate.now(), false));
		// 삭제 성공 테스트
		assertEquals(1L, service.delete(2L));
		// 삭제 실패 테스트
		assertEquals(0L, service.delete(222L));
	}
	
	@Test
	public void updateTest() {
		service.save(new Todo(1L, "자바공부", LocalDate.now(), false));
		service.save(new Todo(2L, "영어공부", LocalDate.now(), false));
		
		assertEquals(1L, service.change(2L));
	}
}
