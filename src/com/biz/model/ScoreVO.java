package com.biz.model;
/*
 * VO: Value Obiect 클래스
 * 1객체의 (사람,책)의 데이터를 저장해서 
 * 메서드간, 클레스간에 이동할때 바구니처럼 
 * 사용하는 클래스
 * 
 * Dto (Data Transfer Object)
 */
public class ScoreVO {

	
	/*
	 * vo 패턴 특징
	 * 1. 맴버 변수(필드)는 꼭 필요한 용도가 아니면 대체로
	 * 	 priveate 으로 선언을한다
	 * 2.맴버변수를 외부에서 접근 (저장,읽기)할수 있도록
	 *  getter와 setter메서드를 생성해서 사용한다
	 *  -- 데이터의 은닉(감추기)해서 데이터를 보호하는 목적
	 *  3. toString() 메서드를 재정의 (Override)해서
	 *   필드에 저장된 값을 외부에서 확일 할 수 있도록 한다.
	 */
	
	private String numder;
	private String name;
	private int Kor;
	private int eng;
	private int math;
	
	private int total;
	private int aberage;
	
	private int rank;

	public String getNumder() {
		return numder;
	}

	public void setNumder(String numder) {
		this.numder = numder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return Kor;
	}

	public void setKor(int kor) {
		Kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAberage() {
		return aberage;
	}

	public void setAberage(int aberage) {
		this.aberage = aberage;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	// toStrint()운 원래 Object클래스의 정의되어있는 매서드 이며
	//객체가 저장된 메모리 주소를 알려주는 메서드이다
	// 이 메서드를 각 필드의 값을 확인 시켜주는 용도로 변경
	@Override
	public String toString() {
		return "ScoreVO [numder=" + numder + ", name=" + name + ", Kor=" + Kor + ", eng=" + eng + ", math=" + math
				+ ", total=" + total + ", aberage=" + aberage + ", rank=" + rank + "]";
	}
	
	
}
