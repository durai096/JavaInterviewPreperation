package JavaCommonQA.problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Drive {
    public static void main(String[] args) {
        Employee e1=new Employee("Raja",21087,"JavaDeveloper");
        Employee e2=new Employee("Rani",21088,"AngularDeveloper");
        Employee e3=new Employee("Kumar",21089,"PythonDeveloper");
        Employee e4=new Employee("Vijay",21080,"JavaDeveloper");
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        Company company=new Company();
        company.setEmployeeList(employeeList);
       int getEmpTotalSalary= company.getTotalSalary();
        System.out.println("Employee Total Salary Is: "+getEmpTotalSalary);
        Map<String,List<Employee>> EmpRole=company.getEmployeeRole();
        System.out.println("Employee roles:"+EmpRole);

    }
}
