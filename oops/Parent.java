package oops;

public class Parent {
    private String surname;
    private Double money;
    private String house;
    private String other;
    public Parent(String surname,Double money,String houseDetails,String otherThings){
        this.surname=surname;
        this.money=money;
        this.house=houseDetails;
        this.other=otherThings;
    }
    public String owenership(){
        return this.house + ", Money in ruppes "+ this.money +" and " + this.other;
    }
    public String getSurname(){
        return this.surname;
    }
}
