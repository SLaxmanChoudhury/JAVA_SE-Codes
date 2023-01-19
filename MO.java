//This code all about Has-A Relationship.

class Emp
{ 
    String eName;
    String eReg;


    public Emp(String eName, String eReg)
    {
        this.eName = eName;
        this.eReg = eReg;
      
    }


}

class Dept
{
    private String dName;
    private String dId;
    private Emp emp[];

    public Dept(String dName, String dId ,Emp emp[])
    {
        this.dName = dName;
        this.dId = dId;
        this.emp = emp;
    }

    
    void result()
    {
        System.out.println("dName = " + dName);
        System.out.println("dId = " + dId);
        System.out.println("---------------------------");
        for(Emp em:emp)
        {
            System.out.println("eName = "+ em.eName);
            System.out.println("eReg = "+ em.eReg);
            System.out.println();
        }

    }
}
public class MO 
{
    public static void main(String[] args)
    {

        System.out.println("This code all about Has-A Relationship.");
        Emp emp1 = new Emp("Subham" , "456DB01");
        Emp emp2 = new Emp("Kalia" , "456DB02");
        Emp emp3 = new Emp("KC", "456DB03");

        Emp emp[] = new Emp[3];
        emp[0] = emp1;
        emp[1] = emp2;
        emp[2] = emp3;


        Dept dept = new Dept("CSE", "45625OOB01" ,emp);
        dept.result();

    }
}