package arrayList;

import java.util.ArrayList;

public class MyArrayListFunctions {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(4);
        list1.add(54);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        System.out.println(list2.isEmpty());
        list2.add(3);
        list2.add(2);
        list2.add(1);
        list2.add(9);
        list2.add(0);
        System.out.println(list2);

        list2.remove(3);
        System.out.println(list2);

        System.out.println("The size of list2 is : " + list2.size() + "\n");

        for(int i = 0; i < list2.size(); ++i){
            System.out.println("Element at index " + i + " is : " + list2.get(i));
        }

        list2.add(1 , 9);
        System.out.println(list2);

        list2.addAll(list1);
        System.out.println(list2);

        System.out.println("list1 : " + list1);
        list1.clear();
        System.out.println("list1" + list1);

        System.out.println(list1.isEmpty());
        System.out.println(list2.isEmpty());

        ArrayList list3 = new ArrayList();
        list3.add("Apha");
        list3.addAll(list2);
        list3.add("Panda");
        list3.add("oopssss");

        //printing list3

        System.out.println(list3);

        //converting list into array

        Object[] arr = list3.toArray();

        //printing array arr

        System.out.println("The elements of array arr are : ");
        for(int i = 0; i < arr.length; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
       // System.out.println(arr);

        //coverting list2 into integer array

        Integer[] arr1 = new Integer[list2.size()];
        list2.toArray(arr1);

        //printing array arr1
        System.out.println("The elements of array arr1 are : ");

        for(int i: arr1){
            System.out.print(i + " ");
        }
        System.out.print("\n");





    }
}
