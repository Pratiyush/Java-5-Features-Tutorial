import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*Generics is one of the most useful features added in Java 5. It adds compile-time type safety to the Collections Framework and eliminates the necessity for type casting.*/
public class GenericsDemo {
	
	public static void main(String[] args) 
	{
		genericCollection();
		nonGenericCollection();
		
	}
/*	We can also nest generics as follows:

	    Map<Integer, List<String>> mapStudents = new HashMap<Integer, List<String>>();*/
	public static void genericCollection() 
	{
	    List<String> names = new ArrayList<String>();
	    names.add("Ram");
	    names.add("Peter");
	    names.add("Khan");
	    names.add("Singh");
	    names.add(new Date());	// Compiler error
	    for(int i = 0; i < names.size(); i++) {
		// No need of type casting (String)
		String name = names.get(i);	
		System.out.println(" Name = " + name);
	    }
	}
	
	/* Exception in thread "main" java.lang.ClassCastException: 
	        java.util.Date cannot be cast to java.lang.String*/
	public static void nonGenericCollection() 
	{
		List names = new ArrayList();
	    names.add("Ram");
	    names.add("Peter");
	    names.add("Khan");
	    names.add("Singh");
	    names.add(new Date());	// Compiler accepts
	    for(int i = 0; i < names.size(); i++) {
	        // Gets Exception for Date object
	        String name = (String)names.get(i);	
	        System.out.println(" Name = " + name);
	    }
	}
}
