package com.TIB.excption;

import java.net.MalformedURLException;
import java.net.URL;

public class throwm {

	static void validate(int age) {
		if (age < 18)

			throw new ArithmeticException("not valid age for voting");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String[] args) throws MalformedURLException {
		validate(13);
	}

}
