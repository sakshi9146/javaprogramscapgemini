package com.edu;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Source1 {
	public String insertSpace(String s) {
		return s.chars()
				.mapToObj(c->(char)c+" ")
				.collect(Collectors.joining())
				.trim();
	}
	public static void main(String[] args) {
		Source1 s = new Source1();
		String input = "capgemini";
		String output = s.insertSpace(input);
		System.out.println(output);

	}

}
