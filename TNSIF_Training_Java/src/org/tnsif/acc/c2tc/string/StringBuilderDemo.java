package org.tnsif.acc.c2tc.string;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Initial Value");
		
		sb.append(" -Appended"); //add appende to the end
		sb.append(" -Again");  //add again to the end

		
		sb.insert(15, "[insert]");
		
		sb.replace(16 ,27,"[replaced]");
		
		sb.delete(2, 4);
		
		sb.reverse();
		
		System.out.println("Final stringbuilder result" +"   " + sb.toString());

	}

}