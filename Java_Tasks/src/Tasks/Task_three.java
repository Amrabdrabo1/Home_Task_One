package Tasks;

public class Task_three {
    public static void main(String[] args) {
        // The input text
        String text = "To be or not to be, that is the question;" + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune," + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        // Initialize counters for vowels, consonants, and spaces
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;

        // Loop through each character in the text
        for (int i = 0; i < text.length(); i++) {
            char current_char = text.charAt(i);

            // Check if the current character is a vowel (A, E, I, O, U)
            if (Character.toUpperCase(current_char) == 'A' || Character.toUpperCase(current_char) == 'E'
                    || Character.toUpperCase(current_char) == 'I' || Character.toUpperCase(current_char) == 'O'
                    || Character.toUpperCase(current_char) == 'U')
                vowels++;
            // Check if the current character is a space
            else if (current_char == ' ')
                spaces++;
            // Check if the current character is a consonant (a letter, not a vowel)
            else if (Character.isLetter(current_char))
                consonants++;
        }

        // Display the results
        System.out.println("The text contained vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
		System.out.println("Spaces: " + spaces);
	}
}
