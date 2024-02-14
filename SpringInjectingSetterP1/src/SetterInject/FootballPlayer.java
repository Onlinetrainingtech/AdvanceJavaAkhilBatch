package SetterInject;

public class FootballPlayer implements Player
{
   private String football;

public void play() {
	
	System.out.println("I am Playing with as::"+football);
	
}

public String getFootball() {
	return football;
}

public void setFootball(String football) {
	this.football = football;
}
 


}
