import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {
    public static ArrayList<Integer> getUnsorted() throws FileNotFoundException{
        ArrayList<Integer> unsorted = new ArrayList<>();
        Scanner scan = new Scanner(new File("sortedData1.txt"));
        while(scan.hasNext()){
            unsorted.add(scan.nextInt());
        }
        return unsorted;

    }
    public static boolean isSorted(ArrayList<Integer> arr){
        boolean anwser = false;
        int x = arr.size() -2;
        int c = 0;
        for(int i = arr.size() -1 ; i>0; i --){
            if (arr.get(i) > arr.get(x)) {
                c ++;
            }
            x--;
        }
        if(c == 7){
            anwser = true;
        }
        return anwser;
    }
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<Integer> array = getUnsorted();
        System.out.println(isSorted(array));
    }
}
