package day02;

import java.util.Scanner;

public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
int score=scanner.nextInt();
scanner.close();
if(score>=90)
{
	System.out.println("�ȼ�ΪA");
}
	if(score>=80&&score<90)
	{
		System.out.println("�ȼ�ΪB");
    }
	if(score>=70&&score<80)
	{
		System.out.println("�ȼ�ΪC");
	}
	if(score>=60&&score<70)
	{
		System.out.println("�ȼ�ΪD");
	}
    if(score<60)
    { 
 	System.out.println("�ȼ�ΪE");
    }	
	}
}