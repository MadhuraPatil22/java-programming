class Employee{
 private String firstName;
 private String lastName;
 private double monthlySalary;

public Employee(String firstName,String lastName,double monthlySalary){
 this.firstName=firstName;
 this.lastName=lastName;
 this.monthlySalary=(monthlySalary>0)?
 monthlySalary:0.0;
 }

 public String getFirstName(){
  return firstName;
 }

 public String getLastName(){
  return lastName;
 }

 public double getMonthlySalary(){
  return monthlySalary;
 }

 public void setFirstName(String firstName){
  this.firstName=firstName;
   }
 
 public void setLastName(String lastName){
  this.lastName=lastName;
  }

 public void setMonthlySalary(double monthlySalary){
  this.monthlySalary = (monthlySalary>0)?
 monthlySalary:0.0;
}


 public double getYearlySalary(){
  return monthlySalary*12;
}

 public void giveRaise(double percentage){
  monthlySalary += monthlySalary*(percentage / 100);
}
}

 class EmployeeTest{
 public static void main (String[] args){
Employee employee1 = new Employee("Sai","Kashid",40000);
Employee employee2 = new Employee("Ruchi","Patel",50000);

System.out.println("Initial year salaries: ");
System.out.println(employee1.getFirstName()+ ""+employee1.getLastName()+":$"+employee1.getYearlySalary());
System.out.println(employee2.getFirstName()+ ""+employee2.getLastName()+":$"+employee2.getYearlySalary());

employee1.giveRaise(10);
employee2.giveRaise(10);

System.out.println("\n Yearly Salaries after 10% Raise: ");
System.out.println(employee1.getFirstName()+ ""+employee1.getLastName()+":$"+employee1.getYearlySalary());
System.out.println(employee2.getFirstName()+ ""+employee2.getLastName()+":$"+employee2.getYearlySalary());
}
}



