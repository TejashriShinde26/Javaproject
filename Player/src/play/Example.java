package play;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int choice;
		System.out.println("Enter 1 for cricker & 2 for Football :");
		choice=sc.nextInt();
		switch(choice){
		case 1:
			Cricket_Player cp=new Cricket_Player();
			cp.accept();
			cp.display();
			break;
		case 2:
			Football_Player fp=new Football_Player();
			fp.accept();
			fp.display();
			break;
		default : 
			System.out.println("Enter Valid choice.");
			
			
		}
		
	}

}