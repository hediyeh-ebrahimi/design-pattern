package com.tutorial.flyweight.secondSample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DepartmentRepository {

    private List<Department> departments = Arrays.asList(
            new Department(1, "A"),
            new Department(2, "B"),
            new Department(3, "C"),
            new Department(4, "D")
    );
    private Map<Integer, Department> departmentMap = new ConcurrentHashMap<>();

    public Department getDepartment(Integer depId) {
        if (departmentMap.containsKey(depId)) {
            return departmentMap.get(depId);
        } else {
            Department department = departments.stream()
                    .filter(department1 -> department1.getDepartmentId().equals(depId))
                    .findFirst().get();
            if (department.getDepartmentId() != null ) {
                departmentMap.put(depId, department);
                return department;
            }
            return null;
        }
    }
}
