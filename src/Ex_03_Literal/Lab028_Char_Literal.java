package Ex_03_Literal;

public class Lab028_Char_Literal {
    public static void main(String[] args) {
        char c = 'A';// character can be A to Z, a to z , !@#$%^&*()_
        //char c1 = "A"; // double quotes are consider in string.

        char c2= 'A';
        char c3= 'B';
        char c4= '_';
        char c5= '9';
        char c6= '1';
        char c7= '(';
        char c8= ' ';//black space

        //Escape Char
        char new_line= '\n';
        char tab_line= '\t';
        char back_space= '\b';
        char carriage_return= '\r';

        System.out.println("Jennie"+new_line+"gia");
        System.out.println("Jennie"+tab_line+"gia");
        System.out.println("Jennie"+back_space+"gia");
        System.out.println("Jennie"+carriage_return+"gia");

        System.out.println("thi is a first line"+new_line+"this is a second line\nthis is a third line");

        char c10='A';
        //ASCII, (limited numbers) - A -> 65 to z -> 122

        char rupees='₹';
        System.out.println(rupees);

        char my_laugh_smily='\u1f60';// :) in unicode emojis are also characters.
        System.out.println(my_laugh_smily);
    }
}
