import java.util.ArrayList;

public class SelfAdjustingListDriver {
    public static void main(String[] args){
        ArrayList<Integer> in = new ArrayList<>();
        in.add(12);
        in.add(14);
        in.add(8);
        in.add(0);
        SelfAdjustingList one = new SelfAdjustingList(in);
        System.out.println("Input: " + one.getList());
        one.adjustList();
        System.out.println("Output: " + one.getList());
        System.out.println("");

        ArrayList<Integer> in2 = new ArrayList<>();
        in2.add(11);
        in2.add(14);
        in2.add(11);
        in2.add(8);
        in2.add(13);
        in2.add(0);
        SelfAdjustingList two = new SelfAdjustingList((in2));
        System.out.println("Input 2: " + two.getList());
        two.adjustList();
        System.out.println("Output 2: " + two.getList());




    }

}
