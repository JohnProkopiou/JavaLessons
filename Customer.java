/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.exercise5;

import java.util.Date;

/**
 *
 * @author johnp
 */
public class Customer {

    // variable that holds the number of objects being created
    private static int count = 0;
    //Mention AtomicInteger. An int value that may be updated atomically, ock-free threa-safe programming
    //private static final AtomicInteger count = newAtomicInteger(0); 
    private int code;
    private String name;
    private Date yearOfBirth;
    private String sex;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Date yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public String getSex() {
        return sex;
    } 
    public void setSex(String sex) {
        this.sex=sex;
    }
    @Override
    public String toString() {
        return "Customer{" + "code = " +code + ", name = "+ name+ ", yearOfBirth = "+yearOfBirth+ ", sex = "+sex+'}';
    }
    public Customer() {
        code = ++count;
    }
}
