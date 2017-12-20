
/*Kata : 1SchoolPaperwork
Description : Your classmates asked you to copy some paperwork for them.
You know that there are 'n' classmates and the paperwork has 'm' pages.
Your task is to calculate how many blank pages do you need.

This kata is actually in C# so you might need : 
 using System; //at the beginning of your code
 static // before class SchoolPaperwork
 */
public class SchoolPaperwork {

    public static int Paperwork(int n, int m) {
        if (n < 0) {
            return 0;
        } else if (m < 0) {
            return 0;
        } else {
            return n * m;
        }

    }
}
