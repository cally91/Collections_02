package com.biz.controllr;

import com.biz.model.ScoreVO;

public class Score_Exec_02 {

	public static void main(String[] args) {

		//ScoreVO클래스를 이용해서 2개의 배열을 생성
		// 각 각 배열에 2먕의 성적을 저장
		ScoreVO[] sVOs=new ScoreVO[2];
		// 생성된 배열에 각각 2명의 성적을 저장
		sVOs[0] =new ScoreVO();
		sVOs[0].setNumder("1");
		sVOs[0].setName("홍길동");
		sVOs[0].setKor(90);
		sVOs[0].setEng(80);
		sVOs[0].setMath(70);
		
		int intTotal =sVOs[0].getKor();
		intTotal +=sVOs[0].getEng();
		intTotal +=sVOs[0].getMath();
		
		sVOs[0].setTotal(intTotal);
		sVOs[0].setAberage(intTotal/3);
		
		System.out.println(sVOs[0].toString());
		
		sVOs[1] =new ScoreVO();
		sVOs[1].setNumder("2");
		sVOs[1].setName("성춘향");
		sVOs[1].setKor(70);
		sVOs[1].setEng(80);
		sVOs[1].setMath(88);
		
		intTotal =sVOs[1].getKor();
		intTotal +=sVOs[1].getEng();
		intTotal +=sVOs[1].getMath();
				sVOs[1].setTotal(intTotal);
				sVOs[1].setAberage(intTotal/3);
		System.out.println(sVOs[1].toString());
	
		
	}

}
