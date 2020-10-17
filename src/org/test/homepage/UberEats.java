package org.test.homepage;

public class UberEats extends Snapdeal{
public static void main(String[] args) {
	String s = "Welcome To Java Class";
	String s1 ="";
	//index starts from 0 to n-1;
	int length = s.length();
	System.out.println(length);
	char c = s.charAt(8);
	System.out.println(c);
	for (int i = 0; i < s.length(); i++) {
		char cs = s.charAt(i);
		System.out.println(cs);
	}
	String u = s.toUpperCase();
	System.out.println(u);
	
	String l = s.toLowerCase();
	System.out.println(l);
	
	int indexOf = s.indexOf("a");
	System.out.println(indexOf);
	
	int lastIndexOf = s.lastIndexOf("a");
	System.out.println(lastIndexOf);
	
	boolean con = s.contains("j");
	System.out.println(con);
	
	boolean equals = s.equals("welcome To Java Class");
	System.out.println(equals);
	
	boolean eq = s.equalsIgnoreCase("Welcome To Java class");
	System.out.println(eq);
	
	boolean startsWith = s.startsWith("Wel");
	System.out.println(startsWith);
	
	boolean endsWith = s.endsWith("Wel");
	System.out.println(endsWith);
	
	boolean empty = s.isEmpty();
	System.out.println("Empty: "+empty);
	
	String trim = s.trim();
	System.out.println(trim);
	
	String replace = s.replace("a", "@");
	System.out.println(replace);
	
	String replaceAll = s.replaceAll("Welcome To Java Class", "Java");
	System.out.println(replaceAll);
	
	String substring = s.substring(0, 7);
	System.out.println(substring);
}
}
