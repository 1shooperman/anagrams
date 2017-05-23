import java.util.TreeSet;

public class Anagram {
    
    private TreeSet<String> acc;
    
    public Anagram() {
        this.acc = new TreeSet<String>();
    }
    
    public TreeSet<String> answer(String input) {
        this.answer("", input); 
        return this.acc;
    }

    private void answer(String permute, String input) {
        int n = input.length();
        if (n == 0) {
            this.acc.add(permute);
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println(input.substring(0, i));
                this.answer(permute + input.charAt(i), input.substring(0, i) + input.substring(i+1, n));
            }
        }
    }
}

