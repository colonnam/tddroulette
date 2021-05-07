package roulette;

public class ResultRoulette {
	
	String number;
	String color;
	String parity;

	public ResultRoulette(int location) {
		setNumber(location);
		setcolor(location);
		setparity(location);
	}

	private void setparity(int location) {
		if (location==0||location==37)
			parity="none";
		else if(location%2==0)
			parity="pair";
		else
			parity="impair";
		
	}

	private void setcolor(int location) {
		if (location==0||location==37)
			color="green";
		else if(location%2==0)
			color="black";
		else
			color="red";
		
	}
		

	private void setNumber(int location) {
		if(location==37)
			number="00";
		else
			number=String.valueOf(location);
		
	}

	public String getColor() {
		return color;
	}
	public String getNumber() {
		return number;
	}
	public String getParity() {
		return parity;
	}

}
