package com.java.oops;

public class StaticPrc {

	public static String orgazisation = "this is the main string for verification";
	public static String salary = "the main";

	public static String string3 = "this is the Max str sample for the occ word";

	static char string2[];
	static char string1[];
	static int count;
	static String stringArray[];
	public static String maxOcc;

	public static void main(String[] args) {
		StaticPrc sp = new StaticPrc();
		string2 = salary.toCharArray();
		string1 = orgazisation.toCharArray();
		
		for (char c1 : string1) {
			for (char c2 : string2) {
				if (c1 == c2) {

				}

			}
		}
			stringArray = string3.split(" ");
			for (int i = 0; i < stringArray.length - 1; i++) {

//				
				for(int j = i+1; j < stringArray.length; j++)
				{
					if(stringArray[i].equals(stringArray[j]))
					{
						maxOcc=stringArray[j];
						count++;
					}
				}

			}
			System.out.println(count);
			System.out.println(maxOcc);



		}
	}

