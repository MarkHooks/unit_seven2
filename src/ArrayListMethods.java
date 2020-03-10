import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
    public static Scanner scan = new Scanner(System.in);
    public static ArrayList<Integer> numberList(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(-5);
        list.add(7);
        list.add(12);
        list.add(-1);
        System.out.println(list);

        list.set(2,10);
        System.out.println(list);

        list.set(1,9);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        return list;

    }
    public static ArrayList<Double> firstAndLast(){
        ArrayList<Double> list = new ArrayList<Double>();
        int x = 1;
        while(x!=0){
            System.out.println("Please enter a decimal: ");
            double decimal = scan.nextDouble();


            if(decimal == 0){
                x =0;
            }else {
                list.add(decimal);
            }
        }
        ArrayList<Double> list2 = new ArrayList<>();
        list2.add((double)list.size());
        list2.add(list.get(0));
        list2.add(list.get(list.size() - 1));
        return list2;



    }
    public static ArrayList<Double> getNumbers(){
        ArrayList<Double> list = new ArrayList<Double>();
        for(int i = 0; i < 3; i++) {
            System.out.println("Enter decimal: ");
            double decimal = scan.nextDouble();
            list.add(decimal);
        }

        return list;
    }
    public static ArrayList<Double> arrangeList(ArrayList<Double> numbers){
        double biggest = numbers.get(0);
        double smallest = numbers.get(0);
        double middle = numbers.get(0);
        for(int x = 0; x < numbers.size(); x++){
            if(numbers.get(x) < smallest) {
                smallest = numbers.get(x);
            }
            else if(numbers.get(x) > biggest) {
                biggest = numbers.get(x);
            }
            for(int y = 0; y < numbers.size(); y++){
                if(numbers.get(x) != biggest && numbers.get(x) != smallest){
                    middle = numbers.get(x);
                }
            }


        }
        ArrayList<Double> list = new ArrayList<>();
        list.add(smallest);
        list.add(middle);
        list.add(biggest);

        return list;
    }





    public static void main(String[] args){
        numberList();
        System.out.println(firstAndLast());
        ArrayList<Double> list2 = getNumbers();
        System.out.println(arrangeList(list2));
    }
}
