package oops;
//import oops.Parent;
public class child extends Parent{
    private String name;
    private Double salary;

    public child(String surname,Double money,String houseDetails,String otherThings,String name,Double salaryPerMonth){
        super(surname,money,houseDetails,otherThings);
        this.name=name;
        this.salary=salaryPerMonth;
    }
    public String earning(){
        return "The child "+ this.name + " " + this.getSurname() + " Earning " + this.salary +" Per month";
    }
    public String fullOwnership(){
        return this.earning() + " and having thing from parent is "+this.owenership();
    }
}
