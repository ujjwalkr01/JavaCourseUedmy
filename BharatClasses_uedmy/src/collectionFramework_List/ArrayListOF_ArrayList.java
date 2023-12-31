package collectionFramework_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListOF_ArrayList {

	public static void main(String[] args) {

		int n=3;
		ArrayList<ArrayList<Integer> > aList = new ArrayList<ArrayList<Integer> >(n);

      // Create n lists one by one and append to the 
      // master list (ArrayList of ArrayList)
      ArrayList<Integer> a1 = new ArrayList<Integer>();
      a1.add(1);
      a1.add(2);
      aList.add(a1);
      System.out.println(aList);

      ArrayList<Integer> a2 = new ArrayList<Integer>();
      a2.add(5);
      aList.add(a2);
      System.out.println(aList);

      ArrayList<Integer> a3 = new ArrayList<Integer>();
      a3.add(10);
      a3.add(20);
      a3.add(30);
      aList.add(a3);
      
      System.out.println(aList);

      for (int i = 0; i < aList.size(); i++) {
          for (int j = 0; j < aList.get(i).size(); j++) {
              System.out.print(aList.get(i).get(j) + " ");
          }
          System.out.println();
      }
      
	}

}
