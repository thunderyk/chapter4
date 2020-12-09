package com.javaex.ex06;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Set<Integer> set = new HashSet<Integer>();
		while(set.size()<6) {
			set.add((int) ((Math.random()*46)+1));
		}
		System.out.println(set.toString());
	}

}
