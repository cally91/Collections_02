package com.biz.controllr;

import java.util.Random;

import com.biz.model.ScoreVO;

public class Score_Exec_03 {

	public static void main(String[] args) {

		// ScoreVO 클래스를 이용해서 10개을 배열을 생성하고
		// 번호는 순서대로 설정하고
		// 이름은 입력하지않고
		// kor, eng ,math 점수릏 각각 난수로 생성해서 저장
		// 단 점수는 51 100까지
		// 입력 (저장된)값을 콘솔에서 확인하고
		// 총점과 평균을 계삭해봅시다

		ScoreVO[] sVO = new ScoreVO[10];
		Random rnd = new Random();

		
		for (int i = 0; i < sVO.length; i++) {
			int j = 0;
			j = rnd.nextInt(51) + 50;
			sVO[i] = new ScoreVO();
			sVO[i].setNumder("" + (i + 1));
			sVO[i].setKor(j);
			j = rnd.nextInt(51) + 50;
			sVO[i].setEng(j);
			j = rnd.nextInt(51) + 50;
			sVO[i].setMath(j);
			
			int intTotal = sVO[i].getKor();
			intTotal += sVO[i].getEng();
			intTotal += sVO[i].getMath();
			sVO[i].setTotal(intTotal);
			sVO[i].setAberage(intTotal / 3);
			
	
			System.out.println(sVO[i].toString());
			
		}

	}

}
