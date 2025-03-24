package Ex_14_Strings;

public class Lab_135_String_Funtions {
    public static void main(String[] args) {
        String name = "Sonal";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(10)); //StringIndexOutOfBoundsException

        //2. Concat
        System.out.println(name.concat("Patel"));

       // 3. contains()
        System.out.println(name.contains("om"));

        //4. Equals
        System.out.println(name.equals("Sonal"));

        //5.equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("sonal"));

        //6.indexOf // sonal -> o -> 1
        System.out.println(name.indexOf('o'));

        String s1 = "madam";
        //return the index within this string of the first occurance of the specified substring.
        System.out.println(s1.indexOf("m"));

        //7. length()
        System.out.println(name.length());

        //8. replace(,)
        System.out.println(name.replace('n', 'N'));

        //9. Split
        String name2 ="jenniegia@gmail.com";
        String[] split = name2.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);


        //10. subString(,)
        System.out.println(name.substring(1,3));

        //11. toLowerCase()
        System.out.println("SONAL".toLowerCase());

        //12. toUpperCase()
        System.out.println("sonal".toUpperCase());

        //13.startWith()
        System.out.println(name.startsWith("S"));

        //14. endsWith()
        System.out.println(name.endsWith("a"));

        //15. trim()
        String name3 ="   Sonal Harish   ";
        System.out.println(name3.trim());

        //compareTO()
        System.out.println(name.compareTo("Sonal"));

        //String Builder has a reverse functions.
        StringBuilder stringBuilder = new StringBuilder("Sonal");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Sonal");
        System.out.println(sb.toString());

        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11,15);
        System.out.println(roar);

        String s11 = "Promod";
        String s21 = s11.concat("Dutta");
        System.out.println(s21);

        // Concatenation (By + )

        String s111 ="Hello";
        String s222 = "world";

        String s333 = "JI";
        String result = s111 + s333 + s222;
        System.out.println(result);

        String n = "PRomoddUTTA";
        System.out.println(n.indexOf("d"));
        System.out.println(n.lastIndexOf("d"));
        System.out.println(n.lastIndexOf("s"));
//
//
    }
}
