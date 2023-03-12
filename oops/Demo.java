package oops;

public class Demo {
    public static void main(String[] arr){
        student firstObj;
        //Using first constructor here
//        firstObj = new student("Shivam Kumar Jha","SDE Intern",45000.00);
//        String ans = firstObj.get_details();
//        System.out.println(firstObj.get_details());

        // Using second Constructor of student class using constructor overloading
        firstObj = new student(70,90,49,90,90);
        System.out.println(firstObj.get_marks());
        Parent umeshSapna = new Parent("Jha",500000.00,"60 gajh plot in Shyam colony on main road","40g Gold chain");
        child firstchild = new child("Jha",500000.00,"60 gajh plot in Shyam colony on main road","40g Gold chain","Shivam",40000.00);
//        System.out.println(firstchild.owenership());
        System.out.println(firstchild.fullOwnership());

    }
}
