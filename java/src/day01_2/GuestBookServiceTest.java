package day01_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class GuestBookServiceTest {
	private GuestBookService service = new GuestBookService();
	
	@Test
	public void findAllTest() {
		// GuestBook이 없는 상태에서 0인지 테스트
		ArrayList<GuestBook> list01 = service.findAll();
		assertEquals(0L, list01.size());
		
		// 추가하고
		service.save(new GuestBook(1L, "내용01", "글쓴이01", LocalDate.now()));
		
		// 다시 테스트
		ArrayList<GuestBook> list02 = service.findAll();
		assertEquals(1L, list02.size());
	}
	
	@Test
	public void findByIdTest() {
		service.save(new GuestBook(1L, "내용01", "글쓴이01", LocalDate.now()));
		service.save(new GuestBook(2L, "내용02", "글쓴이02", LocalDate.now()));
		
		assertEquals(1L, service.findById(1L).getGno());
		assertEquals(null, service.findById(100L));
		
		// 읽기 성공
		assertNotNull(service.findById(1L));
		// 읽기 실패
		assertNull(service.findById(111L));
	}
	
	@Test
	public void deleteTest() {
		service.save(new GuestBook(1L, "내용01", "글쓴이01", LocalDate.now()));
		service.save(new GuestBook(2L, "내용02", "글쓴이02", LocalDate.now()));
		
		assertEquals(1L, service.delete(1L));
		assertEquals(0L, service.delete(2222L));
	}
}
