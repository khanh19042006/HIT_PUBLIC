package service;

import model.Developer;
import model.Device;
import model.Employee;
import model.Tester;

import java.util.ArrayList;

public class IEmployeeServiceImpl implements IEmployeeService{
    private ArrayList<Employee> employees;

    public IEmployeeServiceImpl() {}

    public IEmployeeServiceImpl(ArrayList<Employee> employees) {
        this.employees = employees;
        //add Employee
        Device device = new Device("123", "new");
        this.employees.add(new Developer("ABC", "Khanh", 9, 123, device, 2));
        this.employees.add(new Developer("ABC", "Khanh", 9, 123, device, 2));
        this.employees.add(new Developer("ABC", "Khanh", 9, 123, device, 2));
        this.employees.add(new Tester("BCD", "Nguyen", 10, 121, device, 100));
        this.employees.add(new Tester("BCD", "Nguyen", 10, 121, device, 100));
    }

    Employee employee = new Employee() {
        @Override
        public double calculateSalary() {
            return 0;
        }
    };

    @Override
    public ArrayList<Employee> getAllEmployee(){
        return employees;
    }

    @Override
    public Employee getEmployeeById(String id){
        for (Employee i : employees){
            if (i.getId().equalsIgnoreCase(id)) return i;
        }

        return employee;
    }

    @Override
    public ArrayList<Employee> getEmployeeByName(String name){
        ArrayList<Employee> newEmployee = new ArrayList<>();
        for (Employee i : employees){
            if (i.getName().equalsIgnoreCase(name)) newEmployee.add(i);
        }
        return newEmployee;
    }
}
