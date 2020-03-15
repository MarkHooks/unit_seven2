import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DonorRunner {
    public static ArrayList<Donor> readFile() throws FileNotFoundException{
        ArrayList<Donor> list = new ArrayList<>();
        Scanner scan = new Scanner(new File("donors.txt"));
        while(scan.hasNext()){
            String line = scan.nextLine();
            String name = line.substring(0, line.indexOf(" "));
            String ln = line.substring(line.indexOf(" "));
            double amount = Double.parseDouble(ln);
            list.add(new Donor(name, amount));
        }
        for(Donor b:list){
            System.out.println(b);
        }
        System.out.println("\n");
        return list;
    }
    public static ArrayList<Donor> sort(ArrayList<Donor> list){
        ArrayList<Donor> arrangedDonors = new ArrayList<>();
        for(int i = 0; i<list.size(); i ++){
            arrangedDonors.add(i, new Donor("Micah", 1.0));

        }
        for (int x = 0; x<list.size(); x++){
            int cnt = 0;
            for(int z = 0; z <list.size(); z++){
                if(list.get(x).getAmount()> list.get(z).getAmount()) {
                    cnt++;
                }
            }
            arrangedDonors.set((arrangedDonors.size() -1) -cnt, list.get(x));
        }
        for(Donor y: arrangedDonors){
            System.out.println(y);
        }
        return arrangedDonors;
    }
    public static void main(String[] arr) throws FileNotFoundException {
        ArrayList<Donor> d = readFile();
        sort(d);
    }

}
