package JavaCommonQA.problem2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Company {
    List<Employee> employeeList;
    public int getTotalSalary(){
        return employeeList.stream().mapToInt(s->s.getSalary()).sum();
    }
    public Map<String,List<Employee>>getEmployeeRole(){
       Map<String,List<Employee>>getRoles= employeeList.stream().collect(Collectors.groupingBy(Employee::getRole));
        return getRoles;
    }
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }


}
