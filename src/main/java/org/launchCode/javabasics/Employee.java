package org.launchCode.javabasics;

public class Employee {
    String name;
    int id;
    String Department;
    Long Salary;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return Department;
    }

    public Long getSalary() {
        return Salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public void setSalary(Long salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", Department='" + Department + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
