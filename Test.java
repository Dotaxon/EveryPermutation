import java.util.ArrayList;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        
        ArrayList<String> str = new ArrayList<String>();

        str.add("A");


        ArrayList<String> strr = new ArrayList<>(str);


        strr.add("E");
        char chr = 'c';

        System.out.println(strr.get(0) + strr.get(1) +"\n"+ str.get(0) );

        System.out.println(String.valueOf(chr));


    }
}