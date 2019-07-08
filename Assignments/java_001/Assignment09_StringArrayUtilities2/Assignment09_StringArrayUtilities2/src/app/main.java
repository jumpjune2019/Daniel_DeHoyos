package app;
import static arrayUtil.Assignment09_StringArrayUtilities.*;
public class main {

	public static void main(String[] args) {
		String[] myList = {"Bozo", "FooBar", "Delta", "Foozball", "Demo", "Money", "Zoo"};
		System.out.println("This is the a test of the arrayHasExactMatch and indexOfOccurenceInArray methods");
		System.out.println("The array to test contains the following items");
		System.out.println("{\"Bozo\", \"FooBar\", \"Delta\", \"Foozball\", \"Demo\", \"Money\", \"Zoo\"}");
		System.out.println("Scenario 1");
		System.out.println("arrayUtils(myList, \"zo\", false): is "+ arrayUtils(myList,"zo",false));
		System.out.println("Scenario 2");
		System.out.println("arrayUtils (myList, \"zoo\", false);"+arrayUtils (myList, "zoo", false));
		System.out.println("Scenario 3");
		System.out.println("arrayUtils (myList, \"zoo\", true)"+arrayUtils(myList, "zoo", true));
		System.out.println("Scenario 4");
		System.out.println("arrayUtils (myList, \"foo\", true)"+arrayUtils (myList, "foo", true));
		System.out.println("Scenario 5");
		System.out.println("aarrayUtils (myList, \"foo\", false)"+arrayUtils (myList, "foo", false));
		System.out.println("Scenario 6");
		System.out.println("arrayUtils (myList, \"delta\", true)"+arrayUtils(myList, "delta", true));
		System.out.println("Scenario 7");
		System.out.println("arrayUtils (myList, \"Delta\", true)"+arrayUtils (myList, "Delta", true));
		System.out.println("Scenario 8");
		System.out.println("indexOfOccuranceInArray (myList, \"zo\", false)"+printArray(indexOfOccuranceInArray (myList, "zo", false)));
		System.out.println("Scenario 9");
		System.out.println("indexOfOccuranceInArray (myList, \"zoo\", true)"+printArray(indexOfOccuranceInArray (myList, "zoo", true)));
		System.out.println("Scenario 10");
		System.out.println("indexOfOccuranceInArray (myList, \"zoo\", false)"+printArray(indexOfOccuranceInArray (myList, "zoo", false)));
		System.out.println("Scenario 11");
		System.out.println("indexOfOccuranceInArray (myList, \"foo\", true)"+printArray(indexOfOccuranceInArray (myList, "foo", true)));
		System.out.println("Scenario 12");
		System.out.println("indexOfOccuranceInArray (myList, \"foo\", false)"+printArray(indexOfOccuranceInArray (myList, "foo", false)));
		System.out.println("Scenario 13");
		System.out.println("indexOfOccuranceInArray (myList, \"delta\", true)"+printArray(indexOfOccuranceInArray (myList, "delta", true)));
		System.out.println("Scenario 14");
		System.out.println("indexOfOccuranceInArray (myList, \"Delta\", true)"+printArray(indexOfOccuranceInArray (myList, "Delta", true)));
		

	}

}
