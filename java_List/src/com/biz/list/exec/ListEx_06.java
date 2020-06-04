package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_06 {

	public static void main(String[] args) {

		// Character형 리스트
		// 문자 데이터를 포함하는 리스트
		List<Character> charList = new ArrayList<Character>();

		Random rnd = new Random();

		// 알파벳 개수 : 대소문자 각각 26개
		char char1 = (char) (rnd.nextInt(26) + 'A'); // A의 char 값은 96
		System.out.println(char1);
		// 알파벳 A ~ Z까지 중에서 임의의 문자를 만들어내는 코드

		// 데이터를 만드는부분
		for (int i = 0; i < 100; i++) {

			// 0 ~ 25 까지 정수를 만들고
			// 여기에 영문자 A의 char(ASCII)코드값을 더하여
			// 'A' ~ 'Z' 까지 임의의 문자 1개를 생성하는 코드
			char char2 = (char) (rnd.nextInt(26) + 'A');
			charList.add(char2);
		}

		// 데이터를 찾는부분
		// 배열을 만들었을때
		// 배열의 개수를 알고 싶으면 배열.length를 읽어보면 된다.
		// for(int i = 0 ; i < 배열.lenght ; i++){ }
		// 리스트에서는 리스트.size() method를 호출하면
		// 리스트의 개수를 알수 있다.
		for (int i = 0; i < charList.size(); i++) {
			char charGet = charList.get(i);
			
			if(charGet == 'F') {
				System.out.println(i + "번째에서 찾음");
				break;
				
			}
		}
		int CharSize = charList.size();
		for(int i = 0 ; i < CharSize ; i++) {
			char charGet = charList.get(i);
			if(charGet == 'F') {
				System.out.println(i + "번째에서 찾음");
				
			}
		}

	}

}
