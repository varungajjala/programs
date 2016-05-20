import java.util.*;

public class TreeMapDemo{

	public static void main(String args[]){
		TreeMap<Integer,List<Integer>> tm = new TreeMap<Integer,List<Integer>>();
		tm.put(0,1);
		tm.put(2,2);
		tm.put(1,3);
		tm.put(3,4);
		tm.put(1,5);

		for(int key: tm.keySet()){
			System.out.println(key + "::" + tm.get(key));

		}
	}
}
