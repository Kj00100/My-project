package p1.com;

public class Team 
{
  
   private  String TeamName,CaptainName,TeamCoach;
   private int TeamSize,TeamAchiv;
   
   public String capnames,teams,coachName;
   public int  players,achivements;
   
   public String getTeamName( String teams)
   {
	   TeamName = teams;
	   return TeamName;
   }
   public void setTeamNme(String teams)
   {
	   this. teams = teams;
   }
   public String getCaptainNme(String capnames)
   {
	   CaptainName = capnames;
	   return CaptainName;
   }
   public void setCaptainName( String capnames )
   {
	 this. capnames = capnames;
   }
   public String getTeamCoach(String coachName)
   {
	   TeamCoach = coachName;
	   return TeamCoach;
   }
   public void setTeamCoach(String coachName)
   {
	   this.coachName =coachName ;
   }
   public int getTeamSize(int players)
   {
	   TeamSize = players;
	   return TeamSize;
   }
   public void  setTeamSize(int  players)
   {
	    this .players = players;
   }
   public int getTeamAchiv(int achivements)
   {
	   TeamAchiv = achivements;
	   return TeamAchiv;
   }
   public void setTeamAchiv(int achivements)
   {
	   this. achivements = achivements;
   }


}
