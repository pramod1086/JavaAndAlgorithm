package com.pramod.java.comparatorandcomparable;


import lombok.Data;

@Data
public class Employee implements Comparable{

    int id;
    String name;

    @Override
    public int compareTo(Object object) {
        Employee employee = (Employee)object;

        return Integer.compareUnsigned(employee.id, id);
    }
}
