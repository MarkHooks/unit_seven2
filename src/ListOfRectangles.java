import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOfRectangles {
    public static ArrayList<Rectangles> getRectangles() throws FileNotFoundException {
        ArrayList<Rectangles> nums = new ArrayList<>();
        Scanner scanner = new Scanner(new File("rectangles.txt"));
        while(scanner.hasNext()){
            String word = scanner.nextLine();
            String wordlength = word.substring(0, word.indexOf(" "));
            String wordwidth = word.substring(word.indexOf(" "));
            double length = Double.parseDouble(wordlength);
            double width = Double.parseDouble(wordwidth);
            nums.add(new Rectangles(length, width));

        }
        return nums;
    }
    public static void findAverage(ArrayList<Rectangles> rectangles){
        double nums = 0.0;
        for(int i=0; i<rectangles.size(); i ++){
            nums = rectangles.get(i).getArea();
            double avg = nums/rectangles.size();
            avg = avg *100;
            avg = (int)(avg) *.5;
            avg = avg/100;

        }
        //System.out.println("the average is " + findAverage(getRectangles()));
    }
}
