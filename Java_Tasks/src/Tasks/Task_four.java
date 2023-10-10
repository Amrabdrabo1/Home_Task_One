package Tasks;

import java.util.ArrayList;

public class Task_four {

    public static void main(String[] args) {
        String S = "Barabola Actually    ghghfs? sdasd";

        ArrayList<String> My_Words = new ArrayList<>();
        String temp = "";
        boolean inWord = false;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (Character.isWhitespace(c)) {
                if (inWord) {
                    My_Words.add(temp);
                    temp = "";
                    inWord = false;
                }
            } else {
                temp += c;
                inWord = true;
            }
        }

        // Add the last word if it's not empty
        if (inWord) {
            My_Words.add(temp);
        }
        
        // convert ArrayList to Array
        String[] Words = new String[My_Words.size()];
        int i = 0;
        for (String str : My_Words) {
            Words[i] = str;
            i++;
        }
        bubbleSort(Words);
        for(int j = 0; j<Words.length; j++) {
        	System.out.println(Words[j]);
        }
    }
    
    private static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;
        
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    // Swap arr[i-1] and arr[i]
                    String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
    
}
