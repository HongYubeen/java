package day01_2;

import java.util.ArrayList;

public class GuestBookService {
	// 데이터베이스 대신 ArrayList
	private ArrayList<GuestBook> list = new ArrayList<>();
	
	public ArrayList<GuestBook> findAll() {
		return list;
	}
	
	// 번호를 주면 GuestBook을 찾아서 리턴
	public GuestBook findById(Long gno) {
		for(GuestBook g : list) {
			if(g.getGno() == gno) {
				return g;
			}
		}
		return null;
	}
	
	public void save(GuestBook g) {
		list.add(g);
	}
	
	public Long delete(Long gno) {
		for(GuestBook g : list) {
			if(g.getGno() == gno) {
				list.remove(g);
				return 1L;
			}
		}
		return 0L;
	}
}
