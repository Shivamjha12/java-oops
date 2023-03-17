package learnAbstraction;

public interface Shape {
    int i=34; // It automatic add public static final in the starting of any data type in backend
    void calculateArea(Double r);// It automatically make public abstarct method
}
class Circle implements Shape{
    public void calculateArea(Double r){
        System.out.println("The area of this circle is"+ Math.PI*r*r );
    }
}