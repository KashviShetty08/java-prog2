package employee.deskstop;

public class Empmain 
{
	    public static void main(String[] args) {
	        Employee emp1 = new Employee("Eli", 101, 50000);
	        Employee emp2 = new Employee("Lily", 102, 45000);

	        System.out.println("Initial Employee details");
	        emp1.displayDetails();
	        emp2.displayDetails();

	        emp1.increaseSalary(10);
	        emp2.increaseSalary(5);

	        System.out.println("Updated Employee details:");
	        emp1.displayDetails();
	        emp2.displayDetails();
	    }
	}


