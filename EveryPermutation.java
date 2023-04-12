import java.util.ArrayList;
import java.util.Arrays;

public class EveryPermutation {
    

    public static void main(String[] args) {
        
        ArrayList<Character> arr = new ArrayList<>();
        arr.add('A'); //! each Character need to be unique!!!
        arr.add('B');
        arr.add('C');

        ArrayList<String> collection = new ArrayList<>();
        permutate(arr, 0, new ArrayList<Character>(), arr.size(), collection);

        for (String string : collection) {
            System.out.println(string);
        }

    }


    public static void permutate(ArrayList<Character> arr, int depth, ArrayList<Character> schonGemacht, int maxdepth, ArrayList<String> collection) {
        
        if(depth == maxdepth) {
            collection.add(Arrays.toString(schonGemacht.toArray()));
            return;
        }

        ArrayList<Character> neuSchonGemacht = new ArrayList<>(schonGemacht); //completly Clones schonGemacht
        
        ArrayList<Character> toAdd = new ArrayList<>(arr);
        toAdd.removeAll(schonGemacht);

        for (char chr : toAdd) {
            neuSchonGemacht.add(chr);
            permutate(arr, depth+1, neuSchonGemacht, maxdepth, collection);
            neuSchonGemacht.remove(chr);
        }

    }

}
