package com.jxareas.solver.repository;

import com.jxareas.solver.model.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jon Areas, @jxareas
 */
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static final List<Employee> employeeList = new ArrayList<>();
    
    @Override
    public List<Employee> getAll() {
        return employeeList;
    }

    @Override
    public void insert(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void increaseSalary() {
        employeeList.stream().forEach(
                employee -> employee.increaseSalary()
        );
    }
    
    
}
