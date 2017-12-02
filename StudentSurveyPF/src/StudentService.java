// Sameera Bammidi
// This class has all the computations for the mean and standard deviation of the numbers entered through raffle.
import java.util.ArrayList;

public class StudentService
{
	public StudentService()	{ }

	// This method gets the string value from the raffle text field 
	// of the form and converts into array of double to further compute the values.
	// Set the mean and standard deviations of Winning Result class here.
	public static double getMean(String raffletext)
	{
		// Convert string from raffle text box to double here
		String[] numbers = raffletext.split("\\s*,\\s*");
		ArrayList<Integer> data = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++)
		{
			if(Integer.parseInt(numbers[i]) <= 100)
			{
				data.add(Integer.parseInt(numbers[i]));
			}
		}
		if (data.size() == 0)
		{
			return 0;
		}
		double sum = 0.0;
		for (int index = 0; index != data.size(); ++index)
		{
			sum += data.get(index);
		}

		/*WinningResult winningResult = new WinningResult();
		winningResult.setMean(sum / data.size());*/

		//	System.out.println(sum / data.size());
		return sum / data.size();
	}

	public static double getStandardDeviation(String raffleText)
	{
		// Convert string from raffle text box to double here
		//Student student = new Student();
		String[] numbers = raffleText.split("\\s*,\\s*");
		ArrayList<Integer> data = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++)
		{
			if(Integer.parseInt(numbers[i]) <= 100)
			{
				data.add(Integer.parseInt(numbers[i]));
			}
		}
		double mean = getMean(raffleText);
		double sum = 0;
		for (int index = 0; index != data.size(); ++index)
		{
			sum += Math.pow(Math.abs(mean - data.get(index)), 2);
		}
		/*WinningResult winningResult = new WinningResult();
		winningResult.setStandardDeviation(Math.sqrt(sum / data.size()));*/
		//		System.out.println(sum/data.size());
		return Math.sqrt(sum / data.size());
	}	
}
