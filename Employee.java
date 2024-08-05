public class Employee{
    private String name;
    private int age;
    private double salary;

    public Employee (String name,int age,double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public double getsalary(){
        return salary;
    }

    public void setname(String name){
        this.name = name;
    }
    public void setage(int age){
        this.age = age;
    }
    public void setname(double salary){
        this.salary = salary;
    }

    public void raiseSalary(){
        this.salary *= 1.10;
    }

    public static void main(String[] args){
        Employee emp = new Employee("Arkaj",20,50000);
        
        System.out.println("Name : " +emp.getname());
        System.out.println("Age : " +emp.getage());
        System.out.println("Name : " +emp.getsalary());

        emp.raiseSalary();

        System.out.println("Salary after raise : "+emp.getsalary());
    }

}