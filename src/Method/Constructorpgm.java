package Method;

public class Constructorpgm {

    int empid;
    String empname;
    String designation;
    
    public Constructorpgm(int empid, String empname, String designation) {
        this.empid = empid;
        this.empname = empname;
        this.designation = designation;
    }

    public static void main(String[] args) {
        Constructorpgm obj = new Constructorpgm(1, "Naveena", "software tester");
        System.out.println(obj.empid);
        System.out.println(obj.empname);
        System.out.println(obj.designation);
    }

}
