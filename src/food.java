import java.util.ArrayList;
import java.util.Scanner;

public class food {
    public static void main (String[] Angs) {
        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<Integer> portionList = new ArrayList<Integer>();
        ArrayList<String> typeList = new ArrayList<String>();
        ArrayList<Double> timeList = new ArrayList<Double>();
        ArrayList<String> difficultyList = new ArrayList<String>();
        String x= "";
        int y=0,z;

        while (!x.equals("q")){
            System.out.println("add the name of the food: ");
            nameList.add(keyboard.next());

            System.out.println("what size portion is it?");
            portionList.add(keyboard.nextInt());

            System.out.println("what type of food is it?");
            typeList.add(keyboard.next());

            System.out.println("how long will it take? Write in minutes.");
            timeList.add(keyboard.nextDouble());

            System.out.println("how hard is it? (Easy, Medium, Hard)");
            difficultyList.add(keyboard.next());

            System.out.println("ok so all this for one recipie. Add: yes, No: q");
            x=keyboard.next();

            y++;

        }

        for (z=0; z < y ; z++){
            System.out.println(nameList.get(z) + "\t" + portionList.get(z) + "\t" + typeList.get(z) + "\t" + timeList.get(z) + "\t" +
                    difficultyList.get(z));

        }


    }


}
