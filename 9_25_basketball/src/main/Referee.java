package main;

public class Referee {
	int stage[]=new int[4];
	float time=0.0f;
	int pointA=0;
	int pointB=0;
	
	public void violation(int playerID,int Teamid) {
		
	}
	public void start() {
		
	} 
	public void stop() {}
	public void pasue() {}
	public void tick() {}
	public void changePlayer(int teamid,int playerA,int playerb) {
		
	}
	public int[] getStage() {
		return stage;
	}
	public void setStage(int[] stage) {
		this.stage = stage;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	public int getPointA() {
		return pointA;
	}
	public void setPointA(int pointA) {
		this.pointA = pointA;
	}
	public int getPointB() {
		return pointB;
	}
	public void setPointB(int pointB) {
		this.pointB = pointB;
	}
	
}
