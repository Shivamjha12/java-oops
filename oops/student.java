package oops;

public class student {
    // Creating fields of class or can say data variables
    private String name;
    private String position;
    private Double salary;
    int[] marks = new int[5];
    // Creating class constructor
    public student(String name,String position,Double salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    // Doing constructor overloading
    public student(int Eng,int Hin,int Math,int Sci,int ssc){
        marks[0]=Eng;
        marks[1]=Hin;
        marks[2]=Math;
        marks[3]=Sci;
        marks[4]=ssc;
    }
    // Creating class methods or functions
    private void set_Name(String name){
        this.name = name;
    }
    private String get_Name(){
        return name;
    }
    private void set_Position(String posi){
        this.position = posi;
    }
    private String get_Position(){
        return position;
    }
    private void set_Salary(Double salary){
        this.salary = salary;
    }
    private Double get_Salary(){
        return salary;
    }

    public String get_marks(){
        String ans = "English = "+marks[0]+" Hindi = "+marks[1]+" Maths = "+marks[2]+" Science = "+marks[3]+" Social Science = "+marks[4];
        return ans;
    }
    public String get_details(){
        String detail = "The name of Employee is " + get_Name()+ " on position of "+ get_Position()+ " with salary of "+ get_Salary();
        return detail;
    }
}
