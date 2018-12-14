package com.cts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReplacer {

	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the content:");
		String str = buf.readLine();
		System.out.println("Enter the word to replace for:");
		String replaceWord = buf.readLine();
		System.out.println("Enter the word to replace with:");
		String replacer = buf.readLine();
		String output =str.replaceAll(replaceWord, replacer);

		System.out.println(output);
	}

}
