package service;

import model.Employee;

import java.util.ArrayList;

public interface IEmployeeService {
    public ArrayList<Employee> getAllEmployee();
    public Employee getEmployeeById(String id);
    public ArrayList<Employee> getEmployeeByName(String name);
}
