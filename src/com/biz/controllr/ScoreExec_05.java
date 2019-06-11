package com.biz.controllr;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.model.ScoreVO;

public class ScoreExec_05 {

	public static void main(String[] args) {

		// 일단 비어 있는 (리스트가 없는 )자료구조 (data structuere) 를 생성
		// 필요에 따라 내용 (리스트)를 추가해서 사용할 수있는
		// 자바의 독득한 기능
		// 자바 1.8이상에서만 정상 작동된다,

		// List scList = new ArrayList();

		// 호환성을 위햇 사용하는 표준문법
		// 1.<ScoreVO(성격표)를 담을 비어있는 List를 생성

		List<ScoreVO> scList = new ArrayList<ScoreVO>();

		Random rnd = new Random();
		
		
		ScoreVO sVO = new ScoreVO();
		sVO.setNumder("1");
		sVO.setName("홍길동");
		sVO.setKor(rnd.nextInt(50) + 51);
		sVO.setEng(rnd.nextInt(50) + 51);
		sVO.setMath(rnd.nextInt(50) + 51);
		
		scList.add(sVO);
		
		sVO=new ScoreVO();
		sVO.setNumder("2");
		sVO.setName("성춘향");
		sVO.setKor(rnd.nextInt(50) + 51);
		sVO.setEng(rnd.nextInt(50) + 51);
		sVO.setMath(rnd.nextInt(50) + 51);
		
		scList.add(sVO);
	
	}

}
