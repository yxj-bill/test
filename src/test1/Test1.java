package test1;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List list1 = new ArrayList<String>();
       list1.add("aa");
       list1.add("bb");
       list1.add(4);
       System.err.println("list 增强for循环----");
      /* for (String string : list1) {
		System.err.println(string);
	}*/
       for (int i = 0; i < list1.size(); i++) {
		System.err.println(list1.get(i));
	}
       Set<String> set1 = new HashSet<String>();
       set1.add("11");
       set1.add("22");
       System.err.println("set ----");
       for(String str : set1){
    	   System.err.println(str);
       }
	}

}
