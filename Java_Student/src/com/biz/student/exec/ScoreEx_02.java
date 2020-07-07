package com.biz.student.exec;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class ScoreEx_02 {
	
	// 학번, 국어, 영어, 수학, 총점, 평균 데이터를 생성하여
	// 엑셀이서 열어서사용 할수  있도록 파일을 작성
	// 엑셀을 ils, xlsx파일 왜에 csv라는 파일을 읽어서
	// 엑셀 데이터처럼 취급할수 잇는데
	
	
	//.csv 파일은
	// 컴마로 데이터들을 구분하는 문자열로 만들고
	// 그 내용을 text  형식으로 저장된다.
	public static void main(String[] args) {
		
		PrintWriter outPut = null; // System.out;
		String outFile = "src/com/biz/student/exec/score.csv";
		
		// 지금부터 outFile 변수에 저장된 파일 이름으로
		// text를 기록하기 위해 파일을 만들어라
		try {
			outPut = new PrintWriter(outFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Random rnd = new Random();
		String score;
		for(int i =0; i < 30 ; i++) {
			int intKor = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;
			
			int intSum = (intKor+intEng+intMath);
			int intAvg = intSum/3;
			
			// System.out.printf()
			score = String.format("%d,%d,%d,%d,%d,%d\n", 
					(i + 1),intKor, intEng, intMath, intSum, intAvg);
			
			outPut.print(score);
			
			
		}
		outPut.close();
		System.out.println("완료");
	}

}