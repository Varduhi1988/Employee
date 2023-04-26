public class Employee {
    public String name;
    public int yearOfJoining;
    private String salary;
    public int workingHours;
    private String address;


    public Employee(String name,int yearOfJoining,String salary, int workingHours,String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
        this.workingHours = workingHours;}
    public static void main (String[] args)
    {
        Employee Robert = new Employee ("Robert",2004,"2000$",8,"64C- WallsStreat ");
        Employee Sam = new Employee ("Sam", 2000, "1300$", 8, "68D- WallsStreat");
        Employee John = new Employee ("John", 2019, "1000k", 8, "26B- WallsStreat");
        System.out.println(Robert.name+"\t " + Robert.yearOfJoining+"\t"+Robert.salary+"\t"+Robert.workingHours+"\t"+Robert.address);


        System.out.println(Sam.name+"\t " + Sam.yearOfJoining+"\t"+Sam.salary+"\t"+Sam.workingHours+"\t"+Sam.address);


        System.out.println(John.name+"\t " + John.yearOfJoining+"\t"+John.salary+"\t"+John.workingHours+"\t"+John.address);
    }
    }


