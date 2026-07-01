package com.array;

public class Count {

	String str = "aabba cdeba eeeee abde";
			

				public static void main(String[] args) {
					String str = "aabba cdeba eeeee abdec";
					countChar(str, 'e');
				}

				private static void countChar(String str, char c) {
					String[] words = str.split(" ");
					int cnt = 0,idx;
					for (String word : words) {
						if (countEachChar(word, c) > cnt) {
							cnt = countEachChar(word, c);
						}

					}
					System.out.println("e = " + cnt);
				}

				private static int countEachChar(String word, char c) {
					int cnt =0;
					for(int i = 0; i<word.length();i++) {
						if(word.charAt(i)== c)
							cnt++;
					}
					return cnt;
				}
				
				
				
				
				
				
				
				
				
				
				
				
				

			}

