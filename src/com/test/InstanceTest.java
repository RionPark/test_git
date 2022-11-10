package com.test;

public class InstanceTest {
	
	private String name = "";

	public static void main(String[] args) {
		/*
		 * JVM
		 * main메소드는 자바로 만들어진 어떤 프로그램의 시작점!!
		 * 
		 * 모든 멤버 변수 멤버 함수 즉 어떤 클래스안에 있는 것들은
		 * static이 아니면 반드시 메모리 생성(인스턴스화)을 해줘야 하기 때문임!!
		 */
		//저런 태구는 그랬구나..
		InstanceTest it = new InstanceTest();
		System.out.println(it.name.length()); //오류 뜬다 null pointer exception
	}
}
