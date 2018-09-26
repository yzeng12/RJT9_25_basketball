package main;

/**
 * @author yzeng
 *
 */
public class Team {
	int player[]=new int[5];
	static int sid=0;
	int id=0;
	int coach[]=new int[2];
	
	public void defendpenalty(int teamid,int playerid) {
		
	}
	public void gainpoint(int teamid,int point) {}
	public int[] getPlayer() {
		return player;
	}
	public void setPlayer(int[] player) {
		this.player = player;
	}
	public static int getSid() {
		return sid;
	}
	public static void setSid(int sid) {
		Team.sid = sid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int[] getCoach() {
		return coach;
	}
	public void setCoach(int[] coach) {
		this.coach = coach;
	}
	
	
	
}
