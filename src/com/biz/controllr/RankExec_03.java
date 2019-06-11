package com.biz.controllr;

import java.util.Random;

public class RankExec_03 {

	public static void main(String[] args) {

		int[] intNum = new int[10];
		int[] intKor = new int[10];
		int[] intEng = new int[10];
		int[] intmath = new int[10];
		
		int[] intTotal = new int[10];
		Random rnd = new Random();
		for (int i = 0; i < intNum.length; i++) {
	
				intNum[i] = i + 1;
				intKor[i] = rnd.nextInt(50) + 51;
				intEng[i] = rnd.nextInt(50) + 51;
				intmath[i] = rnd.nextInt(50) + 51;
				intTotal[i] = intKor[i] + intEng[i] + intmath[i];
			}
		
		int index=0;
			for (int num: intNum ) {
				System.out.printf("%d:%d\t",num,intTotal[index++]);
				
			}
		
		for (int i = 0; i < intTotal.length; i++) {
			for (int j = i + 1; j < intTotal.length; j++) {
				if (intTotal[i] > intTotal[j]) {
					int _n = intTotal[i];
					intTotal[i] = intTotal[j];
					intTotal[j] = _n;
					int _m = intNum[i];
					intNum[i] = intNum[j];
					intNum[j] = _m;
				}
			}
		}
		System.out.println();
		 index=0;
		for (int num: intNum ) {
			System.out.printf("%d:%d\t",num,intTotal[index++]);
			
		}
		

		
		
	}

}
