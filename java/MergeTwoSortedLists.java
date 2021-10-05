import java.util.List;
import java.util.LinkedList;


public class MergeTwoSortedLists {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();

        List<Integer> list2 = new LinkedList<>();

        List<Integer> resultList = new LinkedList<>();

        list1.add(1);
        list1.add(3);
        list1.add(6);

        list2.add(2);
        list2.add(4);
        list2.add(5);

        int i = 0;
        int j = 0;

        while(i < list1.size() && j < list2.size()){
            if(list1.get(i) < list2.get(j)){
                resultList.add(list1.get(i));
                i++;
            }

            else{
                resultList.add(list2.get(j));
                j++;
            }
        }

        while(i < list1.size()){
            resultList.add(list1.get(i));
            i++;
        }

        while(j < list2.size()){
            resultList.add(list2.get(j));
            j++;
        }

        System.out.print("Resulting List After the Merging the Two Sorted Lists : ");

        for(int k = 0;k<resultList.size();k++){
            System.out.print(resultList.get(k) + " ");
        }

        System.out.println("");
    }
}
