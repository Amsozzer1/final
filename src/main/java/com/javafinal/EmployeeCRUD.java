package com.javafinal;
import java.sql.*;
import java.sql.SQLException;

public class EmployeeCRUD
{
    static final String url ="jdbc:mysql://database-1.cidce3f747we.us-east-2.rds.amazonaws.com:3306/cis144final?user=amsozzer&password=Bluebash1.";
    static final String user = "amsozzer";
    static final String password = "Bluebash1.";
    
    private static String DELETE_EMPLOYEE_SQL = "DELETE FROM employee WHERE EmpID = ";
    private static String EMPLOYEE_DATA_SQL = "select * from employee where EmpLname =  and EmpFname = ";
    private static String INSERT_EMPLOYEE_SQL = "insert into employee(EmpLname, EmpFname, EmpAddress1, "
            + "EmpAddress2, EmpCity, EMpState, EmpDOB, EmpBaseSalary) "
            + "values(?, ?, ?, ?, ?, ?, ?, ?)";

    public EmployeeCRUD()
    {
        
    }
        
    protected Connection getConnection()
    {
        Connection conn = null;
        try 
        {
            conn = DriverManager.getConnection(url, user, password);
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return conn;
    }
    
    public void insertEmployee(Employee employee)
    {
        try (Connection conn2 = this.getConnection();
             PreparedStatement ps = conn2.prepareStatement(INSERT_EMPLOYEE_SQL))
        {
            ps.setString(1, employee.getLname());
            ps.setString(2, employee.getFname());
            ps.setString(3, employee.getAddress1());
            ps.setString(4, employee.getAddress2());
            ps.setString(5, employee.getCity());
            ps.setString(6, employee.getState());
            ps.setString(7, employee.getDOB());
            ps.setDouble(8, employee.getSalary());
            ps.executeUpdate();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }
    
    
    public boolean deleteEmployee(String empID)
    {
        DELETE_EMPLOYEE_SQL += empID;
        boolean rowDeleted = false;
        try (Connection conn2 = this.getConnection();
                PreparedStatement ps = conn2.prepareStatement("DELETE FROM employee WHERE EmpID = "+ empID)
            )
        {
            
            rowDeleted = ps.executeUpdate() > 0;
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return rowDeleted;
    }
}