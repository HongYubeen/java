package day01_2;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GuestBook {
	private long gno;
	private String content;
	private String writer;
	private LocalDate writeday;
	
	public GuestBook(Long gno, String content, String writer, LocalDate writeday) {
		this.gno = gno;
		this.content = content;
		this.writer = writer;
		this.writeday = writeday;
	}
	
	// overload
	public GuestBook() {
		
	}
}
