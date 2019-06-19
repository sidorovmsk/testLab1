import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Calculation {

    private static void percentile(ArrayList<Integer> arrayList) {
        int i = arrayList.size();
        int f = (int) Math.round((double) i / 10);
        System.out.println("90 percentile " + arrayList.get(i - f));
    }

    private static void median(ArrayList<Integer> arrayList) {
        int med;
        if (arrayList.size() % 2 == 0) {
            med = (arrayList.get(arrayList.size() / 2) - 1 + arrayList.get(arrayList.size() / 2)) / 2;
        } else {
            med = arrayList.get(((arrayList.size() - 1) / 2));
        }
        System.out.println("med " + med);
    }

    private static void average(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (Integer integer : arrayList) {
            sum += integer;
        }
        System.out.println("average " + sum / arrayList.size());
    }

    private static void max(ArrayList<Integer> arrayList) {
        System.out.println("max " + Collections.max(arrayList));
    }

    private static void min(ArrayList<Integer> arrayList) {
        System.out.println("min " + Collections.min(arrayList));
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("new1.txt");
            Scanner sc = new Scanner(fileReader);
            while (sc.hasNextLine()) {
                arrayList.add(sc.nextInt());
            }
            sc.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Collections.sort(arrayList);
        percentile(arrayList);
        median(arrayList);
        average(arrayList);
        max(arrayList);
        min(arrayList);
    }
}