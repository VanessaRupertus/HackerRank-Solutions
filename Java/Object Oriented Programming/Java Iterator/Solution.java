/*
In this problem you need to complete a method func. The method takes an ArrayList as input.
In that ArrayList there is one or more integer numbers, then there is a special string "###",
after that there are one or more other strings. A sample ArrayList may look like this:

element[0]=>42
element[1]=>10
element[2]=>"###"
element[3]=>"Hello"
element[4]=>"Java"

You have to modify the func method by editing at most 2 lines so that the code only prints the
elements after the special string "###". For the sample above the output will be:

Hello
Java
 */
import java.util.*;

class Main {
    static Iterator func(ArrayList mylist){
        Iterator it=mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
            if(element instanceof String)
                break;
        }
        return it;

    }
}
