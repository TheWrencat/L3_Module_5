package other;

import java.util.ArrayList;

public class LearningArrayLists {

	public static ArrayList createArrayList() {
		ArrayList<String> testList = new ArrayList<String>();
		return testList;
	}

	public static void addToArrayList(ArrayList testList, String string) {
		testList.add(string);
	}

	public static Object getNumberOfItems(ArrayList testList) {
		return testList.size();
	}

	public static String getItem(ArrayList<String> testList, int i) {
		return testList.get(i);
	}

	public static String iterateOver(ArrayList testList) {
		String iterate = "";
		String current = "";
		for (int i = 0; i < testList.size(); i++) {
			current = (String) testList.get(i);
			iterate += current;
		}
		return iterate;
	}

	public static int findItemOnList(ArrayList testList, String string) {
		int correctItem = 0;
		String currentItem = "";
		for (int j = 0; j < testList.size(); j++) {
			currentItem = (String) testList.get(j);
			if (currentItem.equals(string)) {
				correctItem = j;
				break;
			}
		}
		return correctItem;
	}

	public static void replaceItem(ArrayList testList, int i, String string) {
		testList.set(i, string);
	}

	public static void insertItem(ArrayList testList, int i, String string) {
		testList.add(i, string);
	}

	public static Object addAllInteger(ArrayList<Integer> testList) {
		int total = 0;
		int current = 0;
		for (int i = 0; i < testList.size(); i++) {
			current = testList.get(i);
			total += current;
		}
		return total;
	}

	public static String addAllString(ArrayList<String> testList) {
		String all = "";
		String current = "";
		for (int i = 0; i < testList.size(); i++) {
			current = (String) testList.get(i);
			all += current;
		}

		return all;
	}

}
