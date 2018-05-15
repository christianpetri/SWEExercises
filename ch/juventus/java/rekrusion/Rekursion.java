package ch.juventus.java.rekrusion;

/**
 * @author : ${user}
 * @since: ${date}
 */
public class Rekursion {
    public static void main(String[] args) {
         String[] namen = new String[]{"anna","korb","mein computer", "level","fuss","anna bob ana"};

        isPalindrome(namen);
    }

    public static void isPalindrome( String[] words ){

        System.out.print(words[0].charAt(0));
        System.out.print(words[0].length());
        System.out.print(words.length);

        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
            boolean statement = true;
            int iterator = 0;
            while(statement){
                iterator++;

                //if(iterator)

            }

        }
    }
}

/**
 * public int fib(int n) {
 if(n <= 1) {
 return n;
 } else {
 return fib(n - 1) + fib(n - 2);
 }
 }
 * */