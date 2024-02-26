package day01;

import java.lang.reflect.Array;
import java.util.ArrayList;

// 향상된 for
public class Example06 {
	public static void main(String[] args) {
		ArrayList<Integer> list01 = new ArrayList<>();
		list01.add(10);
		list01.add(20);
		list01.add(30);
		
		// 향상된 for : js의 of, 파이썬의 in
		for(Integer ob : list01) {
			System.out.println(ob);
		}
		
		ArrayList list02 = new ArrayList();
		list02.add(10);
		list02.add(20);
		list02.add(30);
		// 자바의 모든 객체를 가리킬 수 있는 참조변수 타입인 Object  *해결책은 아님
		for(Object  ob : list02) {
			System.out.println(ob);
		}
	}
}
