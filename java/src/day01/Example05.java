package day01;

import java.util.ArrayList;

// for문 : 일반 for, 향상된 for(js의 of, python의 in)
public class Example05 {
	public static void main(String[] args) {
		ArrayList list01 = new ArrayList<>();
		ArrayList<Integer> list02 = new ArrayList<>();
		
		list01.add(10);
		list01.add(20);
		list01.add(30);
		
		for(int i = 0; i <3; i++) {
			System.out.println(list01.get(i));
		}
		
		// list01은 객체(object) -> 객체는 자기 일은 자기가 알아서 하는 s/w 부품
		// list01의 크기는 자기가 알고 있다
		for(int i=0; i<list01.size(); i++) {
			System.out.println(list01.get(i));
		}
	}
}
