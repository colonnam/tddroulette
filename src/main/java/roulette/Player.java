package roulette;

public class Player {
	
	private int mise;
	private String number;
	
	Player(int m,int n){
		mise=m;
		if(n==37)
			number="00";
		else
			number=String.valueOf(n);
	}
	
	String getnumber(){
		return number;
	}
	
	int getmise() {
		return mise;
	}

}
