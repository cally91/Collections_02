package com.biz.controllr;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.model.ScoreVO;

public class ScoreExec_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<ScoreVO> scList = new ArrayList<ScoreVO>();

		Random rnd = new Random();
		for (int i = 0; i < 50; i++) {
			/*
			 * 어떤 클래스를 객체로 생성해서 List에 추가하고자 할때는 값들을 대입하기에앞서 반드시 클래스를 객체로 (새로) 생성해서 사용한다
			 */
			ScoreVO sVO = new ScoreVO();
			sVO.setNumder("" + (i + 1));

			sVO.setKor(rnd.nextInt(50) + 51);
			sVO.setEng(rnd.nextInt(50) + 51);
			sVO.setMath(rnd.nextInt(50) + 51);

			scList.add(sVO);
		}
		for (ScoreVO s : scList) {
			System.out.println(s.toString());
		}
		/*
		 * LIst의 크기를 알수있는 method로 List.size()가있다 이 List.size() 메서드는 호출할때만 매번 Lis의 개수을
		 * 계산한다 따라서 배열의 langth와는 성질이 달라서 for 문 내에서 가급적 사용하지말고 for 가 시작되시전에 미리 변수에 담아놓고
		 * for 반복문을 실행하는것이 좋다.
		 */
		int scLan = scList.size();
		for (int i = 0; i < scLan; i++) {
			// scList의 i번째 위치에 저장된 scoreVO의 주소를 읽어서
			// VO에 담아달라

			ScoreVO vo = scList.get(i);

			int intTotal = vo.getKor() + vo.getEng() + vo.getMath();
			intTotal = scList.get(i).getKor();
			intTotal += scList.get(i).getEng();
			intTotal += scList.get(i).getMath();
			vo.setTotal(intTotal);
			vo.setAberage(intTotal / 3);

			// build패턴
			// scList의 주소를 직접 참조하여
			// 주소로 부터 Total변수의위치를
			// 그 Total 변수에 값을 setting
			scList.get(i).setTotal(intTotal);

		}
		scLan=scList.size();
		for (int i =0; i <scLan;i++) {
			for(int j =i+1; j <scLan;j++) {
				ScoreVO v1 =scList.get(i);
				ScoreVO v2 =scList.get(j);
				if (v1.getTotal()>v2.getTotal()) {
					ScoreVO _score =scList.get(i);
					scList.set(i,v2);
					scList.set(j,_score);
				}
			}
		}
	}

}
