package com.javafinal;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import java.util.ArrayList;

public class EmployeeGUI extends JFrame
{
    public static final int width = 410;
    public static final int height = 510;
   
    private Employee emp1;
    private EmployeeCRUD crud = new EmployeeCRUD();
   
    private JTabbedPane tp;
    private JPanel panel1;
    private JPanel panel2;
   
    //components of panel 1 (INSERT)
   
    private JLabel lblTitle;
    private JLabel lblLname;
    private JLabel lblFname;
    private JLabel lblAddress1;
    private JLabel lblAddress2;
    private JLabel lblCity;
    private JLabel lblState;
    private JLabel lblDOB;
    private JLabel lblSalary;
   
    private JTextField txtLname;
    private JTextField txtFname;
    private JTextField txtAddress1;
    private JTextField txtAddress2;
    private JTextField txtCity;
    private JTextField txtState;
    private JTextField txtDOB;
    private JTextField txtSalary;

    private JButton btnSave;
    private JButton btnClear;
   
   
   
    private JLabel complete;

    //components of panel 2 (DELETE)
    private JLabel lblTitle2;
    private JLabel EmpIdp2;
    private JTextField txtEmpIdp2;
    private JButton delEmButton;
    private JButton getEmpDataButton;

    //components for Dispaying Employee Data in p2
    
    private JLabel lblLname3;
    private JLabel lblFname3;
    private JLabel lblAddress13;
    private JLabel lblAddress23;
    private JLabel lblCity3;
    private JLabel lblState3;
    private JLabel lblDOB3;
    private JLabel lblSalary3;

    private JTextField txtLname3;
    private JTextField txtFname3;
    private JTextField txtAddress13;
    private JTextField txtAddress23;
    private JTextField txtCity3;
    private JTextField txtState3;
    private JTextField txtDOB3;
    private JTextField txtSalary3;
   
   

   
   
    public EmployeeGUI()
    {
        super();
        createPanel();
        setFrame();
    }
   
    private void createPanel()
    {
        super.setLayout(null);
        tp = new JTabbedPane();
        panel1 = new JPanel(null);
       
        //Setup Panel 1
        panel1.setSize(400,480);
        lblTitle = new JLabel("EMPLOYEE INPUT DATA");
        lblTitle.setFont(new Font("Verdana", Font.BOLD, 16));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setForeground(Color.BLUE);
        lblTitle.setBounds(80, 20, 220, 30);
        panel1.add(lblTitle);
       
       
                complete = new JLabel("");
                complete.setHorizontalAlignment(JLabel.CENTER);
                complete.setBounds(130, 45, 150, 25);
                complete.setForeground(Color.red);
               
                panel1.add(complete);

        //

       



        lblLname = new JLabel("Last Name: ");
        txtLname = new JTextField(20);
        lblLname.setHorizontalAlignment(JLabel.RIGHT);
        lblLname.setBounds(100, 70, 100, 25);
        txtLname.setBounds(200, 70, 100, 25);
        panel1.add(lblLname);
        panel1.add(txtLname);
       
        lblFname = new JLabel("First Name: ");
        txtFname = new JTextField(20);
        lblFname.setHorizontalAlignment(JLabel.RIGHT);
        lblFname.setBounds(100, 105, 100, 25);
        txtFname.setBounds(200, 105, 100, 25);
        panel1.add(lblFname);
        panel1.add(txtFname);
       
        lblAddress1 = new JLabel("Address 1: ");
        txtAddress1 = new JTextField(20);
        lblAddress1.setHorizontalAlignment(JLabel.RIGHT);
        lblAddress1.setBounds(100, 140, 100, 25);
        txtAddress1.setBounds(200, 140, 100, 25);
        panel1.add(lblAddress1);
        panel1.add(txtAddress1);
       
        lblAddress2 = new JLabel("Address 2: ");
        txtAddress2 = new JTextField(20);
        lblAddress2.setHorizontalAlignment(JLabel.RIGHT);
        lblAddress2.setBounds(100, 175, 100, 25);
        txtAddress2.setBounds(200, 175, 100, 25);
        panel1.add(lblAddress2);
        panel1.add(txtAddress2);
       
        lblCity = new JLabel("City: ");
        txtCity = new JTextField(20);
        lblCity.setHorizontalAlignment(JLabel.RIGHT);
        lblCity.setBounds(100, 210, 100, 25);
        txtCity.setBounds(200, 210, 100, 25);
        panel1.add(lblCity);
        panel1.add(txtCity);
       
        lblState = new JLabel("State: ");
        txtState = new JTextField(20);
        lblState.setHorizontalAlignment(JLabel.RIGHT);
        lblState.setBounds(100, 245, 100, 25);
        txtState.setBounds(200, 245, 100, 25);
        panel1.add(lblState);
        panel1.add(txtState);
       
        lblDOB = new JLabel("DOB: ");
        txtDOB = new JTextField(20);
        lblDOB.setHorizontalAlignment(JLabel.RIGHT);
        lblDOB.setBounds(100, 280, 100, 25);
        txtDOB.setBounds(200, 280, 100, 25);
        panel1.add(lblDOB);
        panel1.add(txtDOB);
       
        lblSalary = new JLabel("Salary: ");
        txtSalary = new JTextField(20);
        lblSalary.setHorizontalAlignment(JLabel.RIGHT);
        lblSalary.setBounds(100, 315, 100, 25);
        txtSalary.setBounds(200, 315, 100, 25);
        panel1.add(lblSalary);
        panel1.add(txtSalary);
       
        btnSave = new JButton("Save Employee");
        btnSave.addActionListener(new Save());
        btnSave.setBounds(80, 360, 130, 25);
        panel1.add(btnSave);


        btnClear = new JButton("Clear Employee");
        btnClear.addActionListener(new Clear());
        btnClear.setBounds(230, 360, 130, 25);
        panel1.add(btnClear);
       
       



        //setup panel2
        panel2 = new JPanel(null);
       
        panel2.setSize(400,480);
        lblTitle2 = new JLabel("EMPLOYEE DATA");
        lblTitle2.setFont(new Font("Verdana", Font.BOLD, 16));
        lblTitle2.setHorizontalAlignment(JLabel.CENTER);
        lblTitle2.setForeground(Color.BLUE);
        lblTitle2.setBounds(80, 20, 220, 30);
        panel2.add(lblTitle2);


        EmpIdp2 = new JLabel("Employee ID: ");
        txtEmpIdp2 = new JTextField(20);
        EmpIdp2.setHorizontalAlignment(JLabel.RIGHT);
        EmpIdp2.setBounds(100, 70, 100, 25);
        txtEmpIdp2.setBounds(200, 70, 100, 25);
        //EmpIdp2.setVisible(false);
        //txtEmpIdp2.setVisible(false);

        panel2.add(EmpIdp2);
        panel2.add(txtEmpIdp2);
       

       


        delEmButton = new JButton("Delete Employee");
        delEmButton.addActionListener(new Delete());
        delEmButton.setBounds(150, 400, 200, 25);
        delEmButton.setVisible(false);
        panel2.add(delEmButton);

        //Display Employee Data
       
       
       
        lblLname3 = new JLabel("");
        txtLname3 = new JTextField(20);
        lblLname3.setHorizontalAlignment(JLabel.RIGHT);
        lblLname3.setBounds(100, 70, 100, 25);
        txtLname3.setBounds(200, 70, 100, 25);
        txtLname3.setVisible(false);
        txtLname3.setEditable(false);
        panel2.add(lblLname3);
        panel2.add(txtLname3);

        lblFname3 = new JLabel("");
        txtFname3 = new JTextField(20);
        txtLname3.setEditable(false);
        lblFname3.setHorizontalAlignment(JLabel.RIGHT);
        lblFname3.setBounds(100, 105, 100, 25);
        txtFname3.setBounds(200, 105, 100, 25);
        txtFname3.setVisible(false);
        txtFname3.setEditable(false);
        panel2.add(lblFname3);
        panel2.add(txtFname3);
       

        lblAddress13 = new JLabel("");
        txtAddress13 = new JTextField(20);
        lblAddress13.setHorizontalAlignment(JLabel.RIGHT);
        lblAddress13.setBounds(100, 140, 100, 25);
        txtAddress13.setBounds(200, 140, 100, 25);
        txtAddress13.setVisible(false);
        txtAddress13.setEditable(false);
        panel2.add(lblAddress13);
        panel2.add(txtAddress13);

        lblAddress23 = new JLabel("");
        txtAddress23 = new JTextField(20);
        lblAddress23.setHorizontalAlignment(JLabel.RIGHT);
        lblAddress23.setBounds(100, 175, 100, 25);
        txtAddress23.setBounds(200, 175, 100, 25);
        txtAddress23.setVisible(false);
        txtAddress23.setEditable(false);
        panel2.add(lblAddress23);
        panel2.add(txtAddress23);

        lblCity3 = new JLabel("");
        txtCity3 = new JTextField(20);
        lblCity3.setHorizontalAlignment(JLabel.RIGHT);
        lblCity3.setBounds(100, 210, 100, 25);
        txtCity3.setBounds(200, 210, 100, 25);
        txtCity3.setVisible(false);
        txtCity3.setEditable(false);
        panel2.add(lblCity3);
        panel2.add(txtCity3);

        lblState3 = new JLabel("");
        txtState3 = new JTextField(20);
        lblState3.setHorizontalAlignment(JLabel.RIGHT);
        lblState3.setBounds(100, 245, 100, 25);
        txtState3.setBounds(200, 245, 100, 25);
        txtState3.setVisible(false);
        txtState3.setEditable(false);
        panel2.add(lblState3);
        panel2.add(txtState3);

       
        lblDOB3 = new JLabel("");
        txtDOB3 = new JTextField(20);
        lblDOB3.setHorizontalAlignment(JLabel.RIGHT);
        lblDOB3.setBounds(100, 280, 100, 25);
        txtDOB3.setBounds(200, 280, 100, 25);
        txtDOB3.setVisible(false);
        txtDOB3.setEditable(false);
        panel2.add(lblDOB3);
        panel2.add(txtDOB3);
        lblSalary3 = new JLabel("");
        txtSalary3 = new JTextField(20);
        lblSalary3.setHorizontalAlignment(JLabel.RIGHT);
        lblSalary3.setBounds(100, 315, 100, 25);
        txtSalary3.setBounds(200, 315, 100, 25);
        txtSalary3.setVisible(false);
        txtSalary3.setEditable(false);
        panel2.add(lblSalary3);
        panel2.add(txtSalary3);







        getEmpDataButton = new JButton("Search Employee");
        getEmpDataButton.addActionListener(new GetEmpData());
        getEmpDataButton.setBounds(150, 400, 200, 25);
        panel2.add(getEmpDataButton);


       
        tp.setBounds(0, 0, 400, 480);
        tp.addTab("Insert", panel1);
        tp.addTab("Get Employee", panel2);
        this.add(tp);
        this.pack();
    }
   
    private void setFrame()
    {
        super.setTitle("Employee Data Entry App ver 1.0");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocation(200, 100);
        super.setSize(width, height);
        super.setVisible(true);
    }
   
    private class Save implements ActionListener
    {
        @Override
       
        public void actionPerformed(ActionEvent e)
        {
            String lname = txtLname.getText();
            String fname = txtFname.getText();
            String address1 = txtAddress1.getText();
            String address2 = txtAddress2.getText();
            String city = txtCity.getText();
            String state = txtState.getText();
            String DOB = txtDOB.getText();
            double salary = Double.parseDouble(txtSalary.getText());
            emp1 = new Employee(lname, fname, address1, address2, city, state, DOB, salary);
           
            try
            {
               
                crud.insertEmployee(emp1);
                txtLname.setText("");
                txtFname.setText("");
                txtAddress1.setText("");
                txtAddress2.setText("");
                txtCity.setText("");
                txtState.setText("");
                txtDOB.setText("");
                txtSalary.setText("");

                complete.setText( "Employee " + fname + " Added");
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(2000);
                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    complete.setVisible(false);
                                }
                            });
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                }).start();
               
               
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }
    private class Clear implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            txtLname.setText("");
            txtFname.setText("");
            txtAddress1.setText("");
            txtAddress2.setText("");
            txtCity.setText("");
            txtState.setText("");
            txtDOB.setText("");
            txtSalary.setText("");
        }
    }
    private class Delete implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {

            try
            {
                crud.deleteEmployee(txtEmpIdp2.getText());
                JOptionPane.showMessageDialog(null, "Employee Deleted");
                txtLname3.setText("");
                txtFname3.setText("");
                txtAddress13.setText("");
                txtAddress23.setText("");
                txtCity3.setText("");
                txtState3.setText("");
                txtDOB3.setText("");
                txtSalary3.setText("");


            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }

    }
    private class GetEmpData implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String empID = txtEmpIdp2.getText();
            
            try
            {
                ArrayList<String> empData = crud.EmpData(empID);
                if(empData.size() > 0)
                {
                    EmpIdp2.setVisible(false);
                    txtEmpIdp2.setVisible(false);
                    lblLname3.setText("Last Name: ");
                    txtLname3.setText(empData.get(0));
    
                    lblFname3.setText("First Name: ");
                    txtFname3.setText(empData.get(1));
    
                    lblAddress13.setText("Address 1: ");
                    txtAddress13.setText(empData.get(2));
    
                    lblAddress23.setText("Address 2: ");
                    txtAddress23.setText(empData.get(3));
    
                    lblCity3.setText("City: ");
                    txtCity3.setText(empData.get(4));
    
                    lblState3.setText("State: ");
                    txtState3.setText(empData.get(5));
    
                    lblDOB3.setText("DOB: ");
                    txtDOB3.setText(empData.get(6));
    
                    lblSalary3.setText("Salary: ");
                    txtSalary3.setText(empData.get(7));
    
                    getEmpDataButton.setVisible(false);
                    delEmButton.setVisible(true);
    
    
                    
                    txtLname3.setVisible(true);
                    txtFname3.setVisible(true);
                    txtAddress23.setVisible(true);
                    txtAddress13.setVisible(true);
                    txtCity3.setVisible(true);
                    txtDOB3.setVisible(true);
                    txtState3.setVisible(true);
                    txtSalary3.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Employee Not Found");
                }
            }
            

            
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
           
        }
   
    }
}
