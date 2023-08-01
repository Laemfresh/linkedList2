import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer>linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i <50 ; i++) {
            int randomNumber = random.nextInt(0,2);
            arrayList.add(randomNumber);
            linkedList.add(randomNumber);

        }

        System.out.println(methods(arrayList));
        System.out.println(methods2(linkedList));
    }
    public static  LinkedList<Integer> methods(ArrayList<Integer> linkedList){
        LinkedList<Integer>list = new LinkedList<>();
        for (Integer integer:linkedList) {
            if (integer == 0){
                list.addFirst(integer);

            }else {
                list.addLast(integer);
            }

        }
        return list;

    }
    public static ArrayList<Integer> methods2(LinkedList<Integer> linkedLIst){
        LinkedList<Integer>list2 = new LinkedList<>();
        for (Integer integer2:linkedLIst) {
            if (integer2 == 0 ){
                list2.addFirst(integer2);

            }else {
                list2.addLast(integer2);
            }

        }
        return new ArrayList<>(list2);
    }
}