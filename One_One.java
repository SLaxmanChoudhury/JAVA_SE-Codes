class Account {

	String accNo;
	String accName;
	String accType;

	public Account(String accNo, String accName, String accType) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accType = accType;
	}

}
class Employee {

	private String eid;
	private String ename;
	private String eaddr;

	// HAS-A relationship
	Account account;

	// Constructor injection
	public Employee(String eid, String ename, String eaddr, Account account) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddr = eaddr;
		this.account = account;
	}

	public void getEmployeeDetails() {
		System.out.println("Employee Details are :: ");
		System.out.println("EMPID   ::  " + eid);
		System.out.println("EMPNAME ::  " + ename);
		System.out.println("EMPADDR ::  " + eaddr);
		System.out.println("==========================================");
		System.out.println("ACCOUNT Details are :: ");
		System.out.println("ACCNO   ::  " + account.accNo);
		System.out.println("ACCNAME ::  " + account.accName);
		System.out.println("ACCTYPE ::  " + account.accType);
	}

}

class One_One
{
    public static void main(String[] args)
    {
        
		Account account = new Account("ABC123", "sachin", "Savings");

		// Constructor Injection
		Employee employee = new Employee("IND10", "sachin", "MI", account);
		employee.getEmployeeDetails();


    }
}