package com.biz.controllr;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.model.ScoreVO;

public class ScoreExec_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<ScoreVO> scList= new ArrayList<ScoreVO>();
		
		Random rnd = new Random();
		for (int i=0;i<50; i++) {
			/*
			 * 어떤 클래스를 객체로 생성해서
			 * List에 추가하고자 할때는
			 * 값들을 대입하기에앞서
			 * 반드시 클래스를 객체로 (새로) 생성해서 
			 * 사용한다
			 */
			ScoreVO sVO = new ScoreVO();
			sVO.setNumder(""+(i+1));
			
			sVO.setKor(rnd.nextInt(50) + 51);
			sVO.setEng(rnd.nextInt(50) + 51);
			sVO.setMath(rnd.nextInt(50) + 51);
			
		scList.add(sVO);
		}
		for(ScoreVO s:scList) {
			System.out.println(s.toString());
		}
	}

}
