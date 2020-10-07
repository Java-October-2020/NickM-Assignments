public class StringManipulatorTest {
public static void main(String[] args){
    StringManipulator manipulator = new StringManipulator();
    String str = manipulator.trimAndConcat("   Personal   ","   Space   ");
    System.out.println(str);

    StringManipulator indexornull = new StringManipulator();
    char letter = 'o';
    Integer a = indexornull.getIndexOrNull("Coding", letter);
    Integer b = indexornull.getIndexOrNull("Hello World", letter);
    Integer c = indexornull.getIndexOrNull("Hi", letter);
    System.out.println(a); // 1
    System.out.println(b); // 4
    System.out.println(c); // null

    StringManipulator indexofSubString = new StringManipulator();
    String word = "Hello";
    String subString = "llo";
    String notSubString = "world";
    Integer A = indexofSubString.GetIndexorNull(word, subString);
    Integer B = indexofSubString.GetIndexorNull(word, notSubString);
    System.out.println(A); // 2
    System.out.println(B); // null

    StringManipulator concatSubstring = new StringManipulator();
    String result = concatSubstring.concatSubstring("Hello", 1, 2, "world");
    System.out.println(result); // eworld 
    }
}
