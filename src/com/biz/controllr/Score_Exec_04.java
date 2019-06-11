package com.biz.controllr;

import java.util.Random;

import com.biz.model.ScoreVO;
import com.biz.model.ScoreVO;
public class Score_Exec_04 {

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
			sVO[i] = new ScoreVO();
			sVO[i].setNumder("" + (i + 1));
			sVO[i].setKor(rnd.nextInt(51) + 50);
			sVO[i].setEng(rnd.nextInt(51) + 50);
			sVO[i].setMath(rnd.nextInt(51) + 50);

			int intTotal = sVO[i].getKor();
			intTotal += sVO[i].getEng();
			intTotal += sVO[i].getMath();
			sVO[i].setTotal(intTotal);
			sVO[i].setAberage(intTotal / 3);
			System.out.println(sVO[i].toString());
		}
		System.out.println("======================================");
		System.out.println("빅데이터반 성적처리");
		System.out.println("======================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("---------------------------------------");
		for (ScoreVO vo : sVO) {
			System.out.printf("%s\t%3d\t%3d\t%3d\t%3d\t%5d\t%3d\n", 
					vo.getNumder(), 
					vo.getKor(), 
					vo.getEng(),
					vo.getMath(), 
					vo.getTotal(),
					vo.getAberage(), 
					vo.getRank()
					);
		}
		
		System.out.println("=========================================");
		
	}

}
