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
	public float gettime() {
		return time;
	}
	public int getpointa() {
		return pointA;
	}
	public int getpointb() {
		return pointB;
	}
}
