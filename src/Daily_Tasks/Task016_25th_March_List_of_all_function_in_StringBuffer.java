package Daily_Tasks;

public class Task016_25th_March_List_of_all_function_in_StringBuffer {
    public static void main(String[] args) {
        //Creating StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Creating StringBuffer-> " + sb);


        //append(String s): Adds text at the end
        StringBuffer sb2 = new StringBuffer("Hello");
        sb2.append(" World");
        System.out.println("Adds text at the end-> " + sb2);


        //insert(int index, String s): Insert text at a given position
        StringBuffer sb3 = new StringBuffer("Hello");
        sb3.insert(5," Java");
        System.out.println("Insert text at a given position-> " + sb3);


        //replace(int start, int end, String s): Replace a substring
        StringBuffer sb4= new StringBuffer("Hello World");
        sb4.replace(6, 11, "Java" );
        System.out.println("Replace a substring-> " + sb4);


        //delete(int start, int end): Deletes a substring
        StringBuffer sb5  = new StringBuffer("Hello Java");
        sb5.delete(6,10);
        System.out.println("Deletes a substring-> " + sb5);


          //reverse(): Reverse the String
          StringBuffer sb6 = new StringBuffer("Java");
          sb6.reverse();
          System.out.println("Reverse the String-> " + sb6);


            //capacity(): Return the capacity of the buffer
            StringBuffer sb7 = new StringBuffer();
            System.out.println(sb7.capacity());
            sb7.append("Hello World");
            System.out.println("Return the capacity of the buffer-> "  + sb7.capacity());


             //ensureCapacity(int minCapacity): Ensure a minimum capacity
             StringBuffer sb8 = new StringBuffer();
             sb8.ensureCapacity(30);
             System.out.println("Ensure a minimum capacity-> " + sb8.capacity());


               //charAt(int index): Return a character at a specified index
               StringBuffer sb9 = new StringBuffer("Hello ");
               System.out.println("Return a character at a specified index-> " + sb9.charAt(1));


               //setChatAt(int index, char ch): Changes a character at a position
                StringBuffer sb10 = new StringBuffer("Hello");
                sb10.setCharAt(1,'a');
                System.out.println("Changes a character at a position-> " + sb10);


                  //length(): Return the length of the buffer
                  StringBuffer sb11 = new StringBuffer("Hello");
                  System.out.println("Return the length of the buffer-> " + sb11.length());


                  //substring(int start): Extracts a substring
                  StringBuffer sb12 = new StringBuffer("Hello World");
                  System.out.println(sb12.substring(6));


                  //substring(int start, int end): Extracts a substring within range
                  StringBuffer sb13 = new StringBuffer("Hello World");
                  System.out.println(sb13.substring(0,5));

                  //toString(): Convert StringBuffer to String
                  StringBuffer sb14 = new StringBuffer("Hello ");
                  String str = sb14.toString();
                  System.out.println("Convert StringBuffer to String-> " + str);

                  //trimToSize(): Reduces capacity to fit the current content
                  StringBuffer sb15 = new StringBuffer(50);
                  sb15.append("Hello");
                  sb15.trimToSize();
                  System.out.println("Reduces capacity to fit the current content-> " + sb15.capacity());
    }
}
