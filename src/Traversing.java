import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Traversing {
    static Scanner scan = new Scanner(System.in);
    public static ArrayList<String> getStates() {
        ArrayList<String> states = new ArrayList<String>();
            boolean done = false;
            System.out.println("enter name of state or ''Stop'' to end: ");
            String state = scan.nextLine();
            if(state.equals("Stop")){
                done = true;
            }else{
                states.add(state);
            }
            while(!done) {
                System.out.println("add another state or ''Stop'': ");
                String newstate = scan.nextLine();
                if (newstate.equals("Stop"))
                    done = true;
                else
                    states.add(newstate);
            }
            return states;
    }
    public static String createList(ArrayList<String> states) throws FileNotFoundException {
        String list = "";
        int x = 0;
        int y = 0;
        for (int i = 0; i < states.size(); i++) {
            list += (states.get(i));
            x++;
            if (i < states.size() - 1) {
                list += "-->";
                y++;
            }

        }
        return list;
    }
        public static ArrayList<Integer> largestAndSmallest() throws IOException {
            ArrayList<Integer> nums = new ArrayList<Integer>();
            Scanner scanner = new Scanner(new File("numbers.txt"));
            while(scanner.hasNext()){
                nums.add(scanner.nextInt());
            }
            int temperature = 0;
            int min = 0;
            int max = 0;
            for(int i = 0; i <nums.size(); i++){

                if(nums.get(i)> nums.get(i +1)){
                    max = nums.get(i);
                }else{
                    min = nums.get(i);
                }
            }
            nums.remove(nums.indexOf(min));
            nums.remove(nums.indexOf(max));


            return nums;
    }

}
