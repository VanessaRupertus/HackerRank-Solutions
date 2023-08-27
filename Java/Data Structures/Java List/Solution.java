/*
For this problem, we have 2 types of queries you can perform on a List:

Insert y at index x:

Insert
x y

Delete the element at index x:

Delete
x

Given a list, L, of N integers, perform Q queries on the list. Once all queries
are completed, print the modified list as a single line of space-separated integers.
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> L = new ArrayList<>();

        for(int i = 0; i < n; i++){
            L.add(sc.nextInt());
        }

        int q = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < q; i++){
            String qType = sc.nextLine();
            if(qType.equals("Insert")){
                String[] qArr = sc.nextLine().split(" ");
                L.add(Integer.parseInt(qArr[0]),
                        Integer.parseInt(qArr[1]));
            }
            else{
                int removeIndex = Integer.parseInt(sc.nextLine());
                L.remove(removeIndex);
            }
        }

        for(Integer num : L){
            System.out.print(num+" ");
        }
    }
}