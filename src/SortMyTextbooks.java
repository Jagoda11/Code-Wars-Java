
import java.util.List;
import java.util.Collections;

/*Kata description: Sort My Textbooks : "HELP! Jason can't find his textbook!
It is two days before the test date, and Jason's textbooks are all out of order! 
Help him sort a list (ArrayList in java) full of textbooks by subject, so he can study before the test.
The sorting should NOT be case sensitive" */

public class SortMyTextbooks {

    public static List<String> sort(List<String> textbooks) {

        Collections.sort(textbooks, (o1, o2) -> o1.compareToIgnoreCase(o2));
        return textbooks;

        //Cramming right before a test can't be that bad?
    }
}
