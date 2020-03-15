import java.util.ArrayList;

/**
 * @author Mark Hooks
 * @since 3/14/2020
 * this program makes an Array list of numbers between 2 through 20 searches the lists moves dupes and numbers that are not in the list to the front.
 */
public class SelfAdjustingList {
    private ArrayList<Integer> list;
    public SelfAdjustingList(ArrayList<Integer> list){
        this.list = list;
    }

    /**
     * accessor method
     * @return returns the list
     */
    public ArrayList<Integer> getList(){
        return list;
    }

    /** adjustList creates the list and then sorts it by moving all the odds and dupes into the front
     * sets the first lists to the second
     */
    public void adjustList(){
        ArrayList<Integer> list2 = new ArrayList<>();
        list.remove(list.size()-1);
        for(int i = 2; i<=20; i += 2){
            list2.add(i);
        }
        boolean x = false;
        for(int i = 0; i< list.size(); i++){
            int check = list.get(i);
            for(int z =0; z<list2.size(); z++){
                if(check == list2.get(z)){
                    list2.remove(z);
                    list2.add(0,check);
                    x = true;
                }

            }
            if(!x){
                list2.add(0,check);
            }
            x=false;
        }
        list = list2;
    }


}
