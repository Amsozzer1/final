package com.javafinal;
public class Employee
{
    protected int id;
    protected String lname;
    protected String fname;
    protected String address1;
    protected String address2;
    protected String city;
    protected String state;
    protected String DOB;
    protected double salary;

    public Employee()
    {
       
    }
   
    public Employee(int id, String lname, String fname, String address1, String address2, String city, String state, String DOB, double salary)
    {
        this.id = id;
        this.lname = lname;
        this.fname = fname;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.DOB = DOB;
        this.salary = salary;
    }
   
    public Employee(String lname, String fname, String address1, String address2, String city, String state, String DOB, double salary)
    {
        this.lname = lname;
        this.fname = fname;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.DOB = DOB;
        this.salary = salary;
    }    

    public int getId()
    {
        return id;
    }

    public String getLname()
    {
        return lname;
    }

    public String getFname()
    {
        return fname;
    }

    public String getAddress1()
    {
        return address1;
    }

    public String getAddress2()
    {
        return address2;
    }

    public String getCity()
    {
        return city;
    }

    public String getState()
    {
        return state;
    }

    public String getDOB()
    {
        return DOB;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public void setAddress1(String address1)
    {
        this.address1 = address1;
    }

    public void setAddress2(String address2)
    {
        this.address2 = address2;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public void setDOB(String DOB)
    {
        this.DOB = DOB;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
   
}