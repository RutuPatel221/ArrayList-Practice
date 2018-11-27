import java.util.ArrayList;

public class ArrayListPractice3{

	public static ArrayList<Integer> fillArrayList( ArrayList<Integer> list ){

		int random = 0;

		for(int i = 0; i < 10; i++){
			random = (int)(Math.random()*10)+1;
			list.add( random );
		}

		return list;

	}
	public static ArrayList<Integer> mergeArrayLists( ArrayList<Integer> listA, ArrayList<Integer> listB ){

		ArrayList<Integer> newlist = new ArrayList<>();

		for(int i = 0; i < listA.size(); i++){
			newlist.add ( listA.get(i) );
		}
		for(int i = 0; i < listB.size(); i++){
			newlist.add ( listB.get(i) );
		}

			return newlist;

	}

	public static void main(String[]args){

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		System.out.println( fillArrayList( list1 ) );
		System.out.println( fillArrayList( list2 ) );

		System.out.println( mergeArrayLists( list1, list2 ) );

	}

}