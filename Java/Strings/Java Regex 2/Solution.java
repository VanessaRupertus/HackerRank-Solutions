/*
To solve this challenge, complete the following three lines:

--Write a RegEx that will match any repeated word.

--Complete the second compile argument so that the compiled RegEx is case-insensitive.

--Write the two necessary arguments for replaceAll such that each repeated word is replaced
with the very first instance the word found in the sentence. It must be the exact first
occurrence of the word, as the expected output is case-sensitive.
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DuplicateWords {

    public static void main(String[] args) {

        String regex = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            while (m.find()) {
                input = input.replaceAll(input,
                        input.replaceFirst("(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+","$1"));
            }

            System.out.println(input);
        }

        in.close();
    }
}
