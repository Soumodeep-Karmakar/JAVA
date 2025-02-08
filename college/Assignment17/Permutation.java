package college.Assignment17;

public class Permutation {
    
    public void display(String input) {
        char[] characters = input.toCharArray();
        int length = characters.length;

        generatePermutations(characters, length, 0, new StringBuilder());
    }

    public void generatePermutations(char[] characters, int length, int level, StringBuilder current) {

        if (level == length) {
            System.out.print(current + ", ");
            return;
        }

        
        for (int i = 0; i < characters.length; i++) {
            
            current.append(characters[i]);           
            generatePermutations(characters, length, level + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
    
}
