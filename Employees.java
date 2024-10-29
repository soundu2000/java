public class Employees {
    
        String empName;
        int    empId;
        double salary;
        
   public Employees() {
        System.out.println("No parameter constructor");
     }
   public Employees(String empName) {
   this();
   System.out.println("Parameterised Constructor");
   this.empName = empName;
   }
  
   public Employees(String empName, int empId) {
   this(empName);
   
   this.empId = empId;
   }

   public Employees(String empName, int empId, double salary) {
   this(empName,empId);
   
   this.salary = salary;
   }
  public void EmployeeInfo(){
System.out.println("Employee Name:" + empName);
System.out.println("Employee ID:" + empId);
System.out.println("salary:" + salary);
 
 }
}



   