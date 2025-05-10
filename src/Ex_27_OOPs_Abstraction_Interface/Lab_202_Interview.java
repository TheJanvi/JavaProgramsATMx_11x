package Ex_27_OOPs_Abstraction_Interface;

public class Lab_202_Interview {
}
interface I11{

}
interface I12 {
}
class A1{}
class B1{}
abstract class promod{
    abstract void pp();
}
class test1 extends A1{

}
//class test2 extends A1,B1{}// multiple inheritance in class is not allowed
class test3 implements I11{}
class test4 implements I12,I11{}
class test5 extends A1 implements I11,I12{}
//class test implements I11 extends A1{}
//interface I3 implements A1{}