package com.javafinal;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeCRUD
{
    static final String url ="jdbc:mysql://database-1.cidce3f747we.us-east-2.rds.amazonaws.com:3306/cis144final?user=amsozzer&password=Bluebash1.";
    static final String user = "amsozzer";
    static final String password = "Bluebash1.";


    static final String localURL = "jdbc:mysql://localhost:3306/cis144final";
    static final String localuser = "root";
    static final String localpass = "";
   
   
    private static String DELETE_EMPLOYEE_SQL = "DELETE FROM employee WHERE EmpID = ";
    private static String INSERT_EMPLOYEE_SQL = "insert into employee(EmpLname, EmpFname, EmpAddress1, "
            + "EmpAddress2, EmpCity, EMpState, EmpDOB, EmpBaseSalary) "
            + "values(?, ?, ?, ?, ?, ?, ?, ?)";
    private static String UPDATE_EMPLOYEE_SQL = "update employee set EmpLname = ?, EmpFname = ?, EmpAddress1 = ?, "
            + "EmpAddress2 = ?, EmpCity = ?, EmpState = ?, EmpDOB = ?, EmpBaseSalary = ? where EmpID = ?";

    public EmployeeCRUD()
    {
       
    }
       
    protected Connection getConnection()
    {
        Connection conn = null;
        try 
        {
            conn = DriverManager.getConnection(url, user, password);
            //conn = DriverManager.getConnection(localURL, localuser, localpass);
           
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
        boolean rowDeleted = false;
        try (Connection conn2 = this.getConnection();
                PreparedStatement ps = conn2.prepareStatement(DELETE_EMPLOYEE_SQL + empID)
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
    public ArrayList<String> EmpData(String empID)
    {
        ArrayList<String> EmpDataList = new ArrayList<String>();
        try (Connection conn3 = this.getConnection();
        PreparedStatement ps2 = conn3.prepareStatement("select * from employee where EmpID =" + empID))
    {
        ResultSet rs = ps2.executeQuery();
        while(rs.next())
        {
            EmpDataList.add(rs.getString("EmpLname"));
            EmpDataList.add(rs.getString("EmpFname"));
            EmpDataList.add(rs.getString("EmpAddress1"));
            EmpDataList.add(rs.getString("EmpAddress2"));
            EmpDataList.add(rs.getString("EmpCity"));
            EmpDataList.add(rs.getString("EmpState"));
            EmpDataList.add(rs.getString("EmpDOB"));
            EmpDataList.add(rs.getString("EmpBaseSalary"));


        }
    }
    catch(SQLException ex)
    {
        ex.printStackTrace();
    }
        return EmpDataList;
    }
    public void UpdatEmp(Employee emp)
    {

        try(Connection conn3 = this.getConnection();
        PreparedStatement ps = conn3.prepareStatement(UPDATE_EMPLOYEE_SQL))
        {
            
            
            ps.setString(1, emp.getLname());
            ps.setString(2, emp.getFname());
            ps.setString(3, emp.getAddress1());
            ps.setString(4, emp.getAddress2());
            ps.setString(5, emp.getCity());
            ps.setString(6, emp.getState());
            ps.setString(7, emp.getDOB());
            ps.setDouble(8, emp.getSalary());
            ps.setInt(9, emp.getId());
            

            ps.executeUpdate();

        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }
}