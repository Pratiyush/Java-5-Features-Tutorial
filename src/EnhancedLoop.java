import java.util.ArrayList;
import java.util.List;


public class EnhancedLoop {
	public static void main(String[] args) 
    {
        List<String> names = new ArrayList<String>();
        names.add("Ram");
        names.add("Peter");
        names.add("Khan");
        names.add("Singh");

        for (String name : names) {
            System.out.println(" Name = " + name);
        }
    }
}
