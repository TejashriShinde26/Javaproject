package play;
import java.util.Scanner;

public class Football_Player extends PLAYER{
	int goal;
	int penalties;
	void accept(){
		Scanner sc=new Scanner (System.in);
		super.accept();
		System.out.println("Enter goal no.: ");
		goal=sc.nextInt();
		System.out.println("Enter no.of panalties : ");
		penalties=sc.nextInt();
	}
	void display(){
		super.display();
		System.out.println("No of goals are "+goal);
		System.out.println("No of penalties are "+penalties);
	}
}
