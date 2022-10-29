package com.jxareas.solver.repository;

import com.jxareas.solver.model.Employee;
import java.util.List;

/**
 *
 * @author Jon Areas, @jxareas
 */
public interface EmployeeRepository {
    List<Employee> getAll();
    
    void insert(Employee employee);
    
    void increaseSalary();
}
