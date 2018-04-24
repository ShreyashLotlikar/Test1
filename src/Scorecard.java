
public class Scorecard {

	int totalRuns = 0;
	public int CalculateScore(Over[] over) {
		// TODO Auto-generated method stub
		for(int i=0;i<over.length;i++)
		{
			totalRuns = totalRuns + over[i].getFirst() + over[i].getSecond() + over[i].getThird()
					+ over[i].getFourth() + over[i].getFifth() + over[i].getSixth();
		}
		
		System.out.println("Total Runs Scored "+totalRuns);
		return totalRuns;
	}

}
