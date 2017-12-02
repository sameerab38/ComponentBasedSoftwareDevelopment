// Sameera Bammidi
// This class has all the fields to get and set mean and standard deviation of the entered raffle numbers
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class WinningResult
{
	private double mean;
	private double standardDeviation;

	public WinningResult(){	}
	
	public double getMean()
	{
		return mean;
	}
	public void setMean(double mean)
	{
		this.mean = mean;
	}
	public double getStandardDeviation()
	{
		return standardDeviation;
	}
	public void setStandardDeviation(double standardDeviation)
	{
		this.standardDeviation = standardDeviation;
	}
}
