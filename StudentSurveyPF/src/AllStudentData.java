import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class AllStudentData implements Serializable
{
	private static final long serialVersionUID = 7518652443086674853L;
	public static ArrayList<StudentData> allData = new ArrayList<StudentData>();

	public String getAllData()
	{
		return allData.toString();
	}
	public List<StudentData> getAllStudentData()
	{
        return allData;
    }
}
