package day33mapanditerators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/*    hasNext() => checks the condition for elements of a collection
			   	next() => gets elements 1 by 1

			   	hasPrevious() => checks the elements starting from the last index

			   	previous() => get the last element

			   	remove() => delete the current element

			   	next vs hasNext => next returns the element,
			   	but hasNext returns true or false if element exists or not

			   	hasPrevious vs previous => it returns true or false if the element from last index exists,
			   	but previous will take the last index and give element from last  going through first

			   	ListIterator => it is applicable only for LISTS

			   	hasNext, next, hasPrevious, previous, remove, set

			   	Iterator => it applies to all collections

			   	hasNext, next, remove*/

public class Iterator01 {
    public static void main(String[] args) {

            List<String > list1 = new ArrayList<>();
            list1.add("A");
            list1.add("B");
            list1.add("C");
//        for (String w: list1){
//
//          list1.remove(w);
//
//
//        }
//        list1.remove("A");
            System.out.println(list1);
            ListIterator list1Itr = list1.listIterator();
//            while (list1Itr.hasNext()){
//            Object element =  list1Itr.next();
//            list1Itr.set(element+"EEE");
//            //When we use Iterator, we can modify all elements of a list at the same time
//            //we cannot do modification with For each loop, but we can read the date with for each loop
//        }
            System.out.println(list1);
            ListIterator list2Itr = list1.listIterator();
            while (list2Itr.hasNext()){
                Object element = list2Itr.next();
                if(element.toString().equalsIgnoreCase("C")){
                    list2Itr.remove();//to remove a specific element by using if code
                }
            }
            System.out.println(list1);

        }

    }

