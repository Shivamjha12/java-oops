import java.util.ArrayList;
import java.util.List;

public class employe {
    String name;
    String position;
    Double salary;
    public void set_Name(String name){
        this.name = name;
    }
    public String get_Name(){
        return name;
    }
    public void set_Position(String posi){
        this.position = posi;
    }
    public String get_Position(){
        return position;
    }
    public void set_Salary(Double salary){
        this.salary = salary;
    }
    public Double get_Salary(){
        return salary;
    }
    public String get_details(){
        String detail = "The name of Employee is " + get_Name()+ " on position of "+ get_Position()+ " with salary of "+ get_Salary();
        return detail;
    }
    public static void main(String[] args) {
        List<employe> emp = new ArrayList<>();
        employe obj = new employe();
        obj.set_Name("Shivam Jha");
        obj.set_Position("SDE Intern");
        obj.set_Salary(45000.00);
//        System.out.println("The name of Employee is " + obj.get_Name()+ " on position of "+obj.get_Position()+ " with salary of "+ obj.get_Salary() );
        System.out.println(obj.get_details());
    }
}




