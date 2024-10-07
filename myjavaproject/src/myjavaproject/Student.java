package myjavaproject;

import java.util.Scanner;

public class Student {
	int s_id;
	String s_name;
void accept(int id,String name) {
	s_id=id;
	s_name=name;
}
void display() {
	System.out.println("s_id="+s_id);
	System.out.println("s_name="+s_name);
}
}
class ArrayObjectExample{
	public static void main(String[]args) {
		Scanner S=new Scanner(System.in);
		Student S1[]=new Student[3];
		int i;
		for(i=0;i<3;i++)
		{
			S1[i]=new Student();
			System.out.println("Enter Id=");
			S1[i].s_id=S.nextInt();
			System.out.println("Enter Name=");
			S1[i].s_name=S.toString();
			S1[i].accept(S1[i].s_id,S1[i].s_name);
		}
		for(i=0;i<3;i++) {
			S1[i].display();
		}
	}
}
