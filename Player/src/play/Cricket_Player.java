package play;

import java.util.Scanner;

public class Cricket_Player extends PLAYER{
	float Strike_rate;
	int wicket;
	double run;
	void accept(){
		Scanner sc=new Scanner(System.in);
		super.accept();
		System.out.println("Enter a Strike rate : ");
		Strike_rate=sc.nextFloat();
		System.out.println("Enter wickets :");
		wicket=sc.nextInt();
		System.out.println("Enter run : ");
		run=sc.nextDouble();
	}
		void display(){
			super.display();
			System.out.println("Strike rate is "+Strike_rate);
			System.out.println("wicket are "+wicket);
			System.out.println("runs are "+run);
		
		
		
	}

}