package day01;

import java.util.ArrayList;

import javax.swing.JButton;

// for문 : 일반 for, 향상된 for
public class Example04 {
	public static void main(String[] args) {
		// 반복문을 사용하려면 데이터의 집합
		// 파이썬의 경우 list, set, tuple, dictionary
		// 이런 집합들을 자바에서는 Collection
		// 파이썬의 list -> 자바스크립트의 배열
		// python : a= [1,3,5]
		// js : const a = [1,3,5];
		
		// 자바에서는 ArrayList 객체
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add("Hello");
		list1.add(new JButton("클릭하세요"));
		
		// 자바에서 15라인처럼 ArrayList를 만들면 list01은 아무 거나 다 담을 수 있다
		// 담을 수 있는 값에 제한을 걸자 : Diamond 연산자
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		
//		ArrayList<TV> 리스트 = new ArrayList<생략가능>();
	}
}
