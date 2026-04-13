package J04022;

import java.util.Scanner;
import java.util.TreeSet;

class WordSet {
    public TreeSet<String> set = new TreeSet<>();

    public WordSet() {
        this.set = set;
    }

    public WordSet(String a) {
        String[] format = a.trim().toLowerCase().split("\\s+");
        for (String s : format) {
            set.add(s);
        }
    }

    public WordSet union(WordSet other) {
        WordSet kq = new WordSet();
        kq.set.addAll(this.set);
        kq.set.addAll(other.set);
        return kq;
    }

    public WordSet intersection(WordSet other) {
        WordSet kq = new WordSet();
        kq.set.addAll(this.set);
        kq.set.retainAll(other.set);
       // for (String i : set) {
        //    if (other.set.contains(i)) {
          //      kq.set.add(i);
        //    }
        return kq;
        }
       // return kq;




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String i : this.set) {
            sb.append(i).append(" ");
        }
        return sb.toString();

    }
}

public class J04022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
      System.out.println(s1.intersection(s2));
    }
}
