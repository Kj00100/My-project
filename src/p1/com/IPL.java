package p1.com;

import java.util.Scanner;

public class IPL 
{
    public void showDetails(Team t1)
    {
       System.out.println("captain name is :" + t1. getCaptainNme(t1.capnames));
       System.out.println("\n coach name is : " + t1.getTeamCoach(t1.coachName));
       System.out.println("\n team name is : " + t1.getTeamName( t1. teams));
       System.out.println("\n team achivement is : " + t1. getTeamAchiv(t1.achivements));
       System.out.println("\n number of players is : " + t1. getTeamSize(t1.players));
    }
	
	
	
	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner (System.in);
	System.out.println("enter cantain name :");
	String capnames =sc.nextLine();
	
	 System.out.println("enter coach name  :");
	 String coach = sc.nextLine();
	 
	 System.out.println("enter team name : ");
	 String team = sc.nextLine();
	 
	 System.out.println("enter players : ");
	 int  players = sc.nextInt();
	 
	 System.out.println("enter achivements :");
	 int  achiv = sc.nextInt();
	 
		Team t= new Team();
		t.setCaptainName(capnames);
		t.setTeamNme(team);
		t. setTeamCoach(coach);
		t.setTeamSize(players);
		t.setTeamAchiv(achiv);
		
		IPL i = new IPL();
		i.showDetails(t);
	}

}
