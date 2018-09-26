package main;

public class Player {
	String name;
	static int sid=0;
	int id=0;
	int violation=0;
	int number;
	public void bat() {}
	public void passball(int teamid, int playerid){}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getSid() {
		return sid;
	}
	public static void setSid(int sid) {
		Player.sid = sid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getViolation() {
		return violation;
	}
	public void setViolation(int violation) {
		this.violation = violation;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
