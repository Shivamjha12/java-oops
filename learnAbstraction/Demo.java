package learnAbstraction;

public class Demo {
    public static void main(String[] arr){
        // creating child class object because can't create parebt class because it it abstract class
        MyclassChild obj = new MyclassChild();
        obj.cal();
        obj.fastCal();
        // Using parent class but making object of child class
        // Here we taking refernce of parent class but making object of child class so that's why when we implent fastCal()
        // function it first go to parent then find it is abstract so that's why then it go to object and find fastCal() and implement it
        // this is also a type of polymorphism
        System.out.println("Second object");
        Myclass obj1 = new MyclassChild();
        obj1.cal();
        obj1.fastCal();
    }
}
