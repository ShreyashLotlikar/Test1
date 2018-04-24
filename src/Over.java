
public class Over {

	int overNum,first,second,third,fourth,fifth,sixth;
	int totalRuns;
	public Over(int overNum, int first, int second, int third, int fourth, int fifth, int sixth) {
		// TODO Auto-generated constructor stub
		this.overNum = overNum;
		this.first = first;
		this.second = second;
		this.third = third;
		this.fourth = fourth;
		this.fifth = fifth; 
		this.sixth = sixth;
	}

	public int getOverNum() {
		return overNum;
	}

	public int getFirst() {
		return first;
	}

	public int getSecond() {
		return second;
	}

	public int getThird() {
		return third;
	}

	public int getFourth() {
		return fourth;
	}

	public int getFifth() {
		return fifth;
	}

	public int getSixth() {
		return sixth;
	}

	public int totalOver() {
		totalRuns = first +second+third+fourth+fifth+sixth;
		System.out.println("Runs scored in "+this.overNum+":"+this.totalRuns);
		return totalRuns;
	}

	public int RunsPerBall(int ballNum) {
		// TODO Auto-generated method stub
		int runs = 0;
		if(ballNum == 1)
		{
			System.out.println("over"+this.overNum+"Ball 1 Runs"+getFirst());
			runs = getFirst();
		}
		if(ballNum == 2)
		{
			System.out.println("over"+this.overNum+"Ball 2 Runs"+getSecond());
			runs = getSecond();
		}
		if(ballNum == 3)
		{
			System.out.println("over"+this.overNum+"Ball 3 Runs"+getThird());
			runs = getThird();
		}
		if(ballNum == 4)
		{
			System.out.println("over"+this.overNum+"Ball 4 Runs"+getFourth());
			runs = getFourth();
		}
		if(ballNum == 5)
		{
			System.out.println("over"+this.overNum+"Ball 1 Runs"+getFirst());
			runs = getFifth();
		}
		if(ballNum == 6)
		{
			System.out.println("over"+this.overNum+"Ball 1 Runs"+getFirst());
			runs = getSixth();
		}
		return runs;
	}
	
	

}
