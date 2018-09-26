package main;

public class Coach {
	String name;
	static int sid=0;
	int id=0;
	
	public void changePlayer(int teamid,int playerA,int playerb) {
		
	}

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
		Coach.sid = sid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
