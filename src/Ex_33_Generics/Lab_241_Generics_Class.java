package Ex_33_Generics;

public class Lab_241_Generics_Class {
    public static void main(String[] args) {
        GenericClass<Integer> integerGenericClass = new GenericClass(5);
        GenericClass<String> stringGenericClass = new GenericClass("promod");
    }
}
    class GenericClass<T>{
        private T data;

        public GenericClass(T data){
            this.data = data;
        }
        public T getData(){
            return this.data;
        }

}
