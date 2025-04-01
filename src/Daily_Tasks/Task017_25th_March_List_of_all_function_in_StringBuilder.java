package Daily_Tasks;

public class Task017_25th_March_List_of_all_function_in_StringBuilder {
    public static void main(String[] args) {
        //Creating StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Creating StringBuilder-> " + sb);


        //append(String s): Adds text at the end
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World");
        System.out.println("Adds text at the end-> " + sb2);


        //insert(int index, String s): Insert text at a given position
        StringBuilder sb3 = new StringBuilder("Hello");
        sb3.insert(5," Java");
        System.out.println("Insert text at a given position-> " + sb3);


        //replace(int start, int end, String s): Replace a substring
        StringBuilder sb4= new StringBuilder("Hello World");
        sb4.replace(6, 11, "Java" );
        System.out.println("Replace a substring-> " + sb4);


        //delete(int start, int end): Deletes a substring
        StringBuilder sb5  = new StringBuilder("Hello Java");
        sb5.delete(6,10);
        System.out.println("Deletes a substring-> " + sb5);


        //reverse(): Reverse the String
        StringBuilder sb6 = new StringBuilder("Java");
        sb6.reverse();
        System.out.println("Reverse the String-> " + sb6);


        //capacity(): Return the capacity of the Builder
        StringBuilder sb7 = new StringBuilder();
        System.out.println(sb7.capacity());
        sb7.append("Hello World");
        System.out.println("Return the capacity of the builder-> "  + sb7.capacity());


        //ensureCapacity(int minCapacity): Ensure a minimum capacity
        StringBuilder sb8 = new StringBuilder();
        sb8.ensureCapacity(50);
        System.out.println("Ensure a minimum capacity-> " + sb8.capacity());


        //charAt(int index): Return a character at a specified index
        StringBuilder sb9 = new StringBuilder("Hello ");
        System.out.println("Return a character at a specified index-> " + sb9.charAt(1));


        //setChatAt(int index, char ch): Changes a character at a position
        StringBuilder sb10 = new StringBuilder("Hello");
        sb10.setCharAt(1,'a');
        System.out.println("Changes a character at a position-> " + sb10);


        //length(): Return the length of the builder
        StringBuilder sb11 = new StringBuilder("Hello");
        System.out.println("Return the length of the builder-> " + sb11.length());


        //substring(int start): Extracts a substring
        StringBuilder sb12 = new StringBuilder("Hello World");
        System.out.println(sb12.substring(6));


        //substring(int start, int end): Extracts a substring within range
        StringBuilder sb13 = new StringBuilder("Hello World");
        System.out.println(sb13.substring(0,5));

        //toString(): Convert StringBuilder to String
        StringBuilder sb14 = new StringBuilder("Hello ");
        String str = sb14.toString();
        System.out.println("Convert StringBuilder to String-> " + str);

        //trimToSize(): Reduces capacity to fit the current content
        StringBuilder sb15 = new StringBuilder(50);
        sb15.append("Hello");
        sb15.trimToSize();
        System.out.println("Reduces capacity to fit the current content-> " + sb15.capacity());
    }
}
