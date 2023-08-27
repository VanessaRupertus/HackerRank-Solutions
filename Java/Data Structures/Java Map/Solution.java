/*
You are given a phone book that consists of people's names and their phone number.
After that you will be given some person's name as query. For each query, print the
phone number of that person.

The first line will have an integer  denoting the number of entries in the phone book.
Each entry consists of two lines: a name and the corresponding phone number.

After these, there will be some queries. Each query will contain a person's name.
Read the queries until end-of-file.
 */
import java.util.*;

public class Solution {
    public static void main(String []args) {
        Map<String, Integer> book = new HashMap<String, Integer>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        for(int i=0;i<n;i++) {
            String name=in.nextLine();
            int phone=in.nextInt();
            book.put(name, phone);
            in.nextLine();
        }

        while(in.hasNext()) {
            String s=in.nextLine();

            if (book.containsKey(s)) {
                System.out.println(s + "=" + book.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}



