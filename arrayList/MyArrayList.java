package arrayList;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {

        ArrayList mix = new ArrayList();
        mix.add("Apple");
        mix.add(78);

        ArrayList<String> list1 = new ArrayList<String>();
        /*here Generic(parameterized type) help in restricting the list1 to String type only
         It helps if i am expecting list of names and one value in list is 56 , so is this actually a name???
         No , so to avoid such problems we define the type of list that is using generic(parameterized type)*/
        list1.add("Pandey");
        //list1.add(90);
        list1.add("oops");

        System.out.println(mix);
        System.out.println(list1);







    }
}
