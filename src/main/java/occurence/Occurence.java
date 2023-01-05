package occurence;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter elements separated by comma: ");
		String list = scanner.nextLine();
		System.out.println("Enter occurence for the first element: ");
		Integer occurence = scanner.nextInt();

		String[] strArray = list.split(",");
		Map<String,Integer> map = new LinkedHashMap<String, Integer>();
		for(int i = 0 ; i <  strArray.length; i++) {
			if(map.containsKey(strArray[i])) {
				int value = map.get(strArray[i]);
				map.put(strArray[i], ++value);
			}else {
				map.put(strArray[i], 1);
			}
		}
		boolean found = false;
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			if(entry.getValue() == occurence) {
				System.out.println(entry.getValue()+" is the first element found in sequence with "+occurence+ " times repeated.");
				found =true;
				break;
			}
		}
		if(!found) {
			System.out.println("the occurence you are looking for not found!!");
		}
	}

}
