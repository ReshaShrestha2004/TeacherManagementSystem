import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class Teacher_GUI{
    private static ArrayList<Teacher> teacherArrayList = new ArrayList<>();
    
    public static boolean AddLecturerButtonRangeCheck(int num1,int num2,int num3){
         return num1 > 0 && num1 < 100 && num2 > 0 && num2 < 100 && num3 > 0 && num3 < 50;
        }
    public static boolean AddTutorButtonRangeCheck(int num1, int num2 , int num3, int num4){
        return num1 > 0 && num1 < 100 && num2 > 0 && num2 < 100000 && num3 > 0 && num3 < 24 && num4 > 0 && num4 < 11;
        }
    public static boolean SetSalaryRangeCheck(int num1, int num2, int num3){
        return num1 > 0 && num1 < 100 && num2 > 0 && num2 < 100000 && num3 > 0 && num3 < 11;
        }
    public static boolean TeacherIdRangeCheck(int num){
        return num>0 && num<100;
    }
    
     public static void main (String[]args){
        //LOGIN FRAME
        JFrame frame1 = new JFrame();
        frame1.setVisible(true);//sets frame as visible
        frame1.setTitle("Home Page");//sets title of frame
        frame1.setSize(1500,1500);//sets title of frame
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exits out from application on closing
        frame1.setLayout(null);
        
        //BACKGROUND LABEL
        JLabel label = new JLabel();
        ImageIcon img = new ImageIcon("background.png");
        Image tempImage = img.getImage();
        Image bgImage = tempImage.getScaledInstance(1500,1500,Image.SCALE_SMOOTH);
        img = new ImageIcon(bgImage);
        label.setIcon(img);
        label.setBounds(0,0,1500,1500);
        frame1.add(label);
        
        //HEADER PANEL
        JPanel headingPanel = new JPanel();
        headingPanel.setBackground(new Color(0,0,0,80));// rbg value = 000(black),with (100-18=20)transparency
        headingPanel.setBounds(-110,0,1500,100);
        label.add(headingPanel);
        
        //Header LABEL
        JLabel heading = new JLabel("Welcome to the Home Page");
        heading.setFont(new Font("Serif Bold",Font.PLAIN,40));//sets font style,effect,size
        heading.setForeground(Color.WHITE);//sets font color
        headingPanel.add(heading);
        
        //Body Panel
        JPanel bodyPanel = new JPanel();
        bodyPanel.setLayout(null);
        bodyPanel.setBackground(new Color(0,0,0,80));
        bodyPanel.setSize(750,550);
        bodyPanel.setBounds(400,175,400,350);
        label.add(bodyPanel);
        JLabel text1 = new JLabel("Please choose an option");
        text1.setForeground(Color.WHITE);
        text1.setFont(new Font("Serif Bold",Font.PLAIN,30));
        text1.setBounds(40,20,750,100);
        bodyPanel.add(text1);
        
        //Add a lecturer button
        JButton LecturerButton = new JButton("Lecturer");
        LecturerButton.setBounds(100,140,200,50);
        LecturerButton.setBackground(new Color(0xB7AFA3));
        bodyPanel.add(LecturerButton);
         LecturerButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JFrame frame2 = new JFrame();
                    frame2.setVisible(true);//sets frame as visible
                    frame2.setTitle("Add a Lecturer");//sets title of frame
                    frame2.setSize(1500,1500);//sets sizee of frame
                    frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//exits out from application on closing
                    frame2.setLayout(null);
                    frame2.getContentPane().setBackground(new Color(0xBCD2E8));
                    
                    //adding form components
                    JPanel panel1 = new JPanel();
                    panel1.setBackground(new Color(0x91BAD6));
                    panel1.setBounds(0,0,300,50);
                    frame2.add(panel1);
                    JLabel label1 = new JLabel("Lecturer Form");
                    label1.setBounds(0,0,200,50);
                    label1.setFont(new Font("Serif Bold",Font.PLAIN,30));
                    panel1.add(label1);
                    
                    JButton homeButton = new JButton("Go To Home");
                    homeButton.setBounds(900,0,200,30);
                    homeButton.setBackground(new Color(0x91BAD6));
                    frame2.add(homeButton);
                    homeButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            frame1.setVisible(true);
                        }
                    });
                    
                    JButton TutorButton = new JButton("Go To Tutor");
                    TutorButton.setBounds(1100,0,200,30);
                    TutorButton.setBackground(new Color(0x91BAD6));
                    frame2.add(TutorButton);
                    TutorButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            frame1.setVisible(false);
                            frame2.setVisible(false);
                        }
                    });
                    
                    JLabel label2 = new JLabel("Teacher Id:");
                    label2.setBounds(150,55,190,100);
                    label2.setFont(new Font("Serif Bold",Font.PLAIN,20));
                    frame2.add(label2);
                    JTextField tf2 = new JTextField();
                    tf2.setBounds(50,152,350,25);
                    frame2.add(tf2);
                    
                    JLabel label3 = new JLabel("Teacher Name:");
                    label3.setBounds(150,160,190,100);
                    label3.setFont(new Font("Serif Bold",Font.PLAIN,20));
                    frame2.add(label3);
                    JTextField tf3 = new JTextField();
                    tf3.setBounds(50,260,350,25);
                    frame2.add(tf3);
                    
                    JLabel label4 = new JLabel("Address:");
                    label4.setBounds(170,268,190,100);
                    label4.setFont(new Font("Serif Bold",Font.PLAIN,20));
                    frame2.add(label4);
                    JTextField tf4 = new JTextField();
                    tf4.setBounds(50,368,350,25);
                    frame2.add(tf4);
                    
                    JLabel label5 = new JLabel("Department:");
                    label5.setBounds(580,55,210,100);
                    label5.setFont(new Font("Serif Bold",Font.PLAIN,20));
                    frame2.add(label5);
                    JTextField tf5 = new JTextField();
                    tf5.setBounds(460,152,350,25);
                    frame2.add(tf5);
                    
                    JLabel label6  = new JLabel("Working Type:");
                    label6.setBounds(560,160,210,100);
                    label6.setFont(new Font("Serif Bold",Font.PLAIN,20));
                    frame2.add(label6);
                    JTextField tf6 = new JTextField();
                    tf6.setBounds(460,260,350,25);
                    frame2.add(tf6);
                    
                    JLabel label7  = new JLabel("Employment Status:");
                    label7.setBounds(550,268,210,100);
                    label7.setFont(new Font("Serif Bold",Font.PLAIN,20));
                    frame2.add(label7);
                    JTextField tf7 = new JTextField();
                    tf7.setBounds(460,368,350,25);
                    frame2.add(tf7);
                    
                    JLabel label8 = new JLabel("Performance Index:");
                    label8.setBounds(990,55,210,100);
                    label8.setFont(new Font("Serif Bold",Font.PLAIN,20));
                    frame2.add(label8);
                    JTextField tf8 = new JTextField();
                    tf8.setBounds(900,152,350,25);
                    frame2.add(tf8);
                    
                    JLabel label9  = new JLabel("GradedScore:");
                    label9.setBounds(1020,160,210,100);
                    label9.setFont(new Font("Serif Bold",Font.PLAIN,20));
                    frame2.add(label9);
                    JTextField tf9 = new JTextField();
                    tf9.setBounds(900,260,350,25);
                    frame2.add(tf9);
                    
                    JLabel label10 = new JLabel("Years of experience:");
                    label10.setBounds(990,268,210,100);
                    label10.setFont(new Font("Serif Bold",Font.PLAIN,20));
                    frame2.add(label10);
                    JTextField tf10 = new JTextField();
                    tf10.setBounds(900,368,350,25);
                    frame2.add(tf10);
                    
                    JButton addLecturerButton = new JButton("Add Lecturer");
                    addLecturerButton.setBounds(75,500,200,50);
                    addLecturerButton.setBackground(new Color(0x91BAD6));
                    frame2.add(addLecturerButton);
                    addLecturerButton.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        try{
                              //getting input values
                              int teacherId = Integer.parseInt(tf2.getText());
                              String teacherName = tf3.getText();
                              String address = tf4.getText();
                              String department = tf5.getText();
                              String workingType = tf6.getText();
                              String employmentStatus = tf7.getText();
                              int gradedScore = Integer.parseInt(tf9.getText());
                              int yearsOfExperience = Integer.parseInt(tf10.getText());
                              if (AddLecturerButtonRangeCheck(teacherId , gradedScore , yearsOfExperience )){
                              //mKING OBJECT OF LECTURER CLASS
                              Lecturer newLecturer = new Lecturer(teacherId, teacherName, address,department,workingType,employmentStatus,yearsOfExperience);
                              
                              //ADDING OBJECT TO ARRAYLIST OF TEACHER CLASS
                              teacherArrayList.add(newLecturer);
                              frame2.dispose();
                              JOptionPane.showMessageDialog(null, "Lecturer added successfully."); 
                              }
                              else{
                              JOptionPane.showMessageDialog(frame2,"Invalid Input.Please enter input of correct range.\n Range for teacherId : 1 to 99 \n Range for Graded Score : 1 to 99 \n Range for Years Of Experience : 1 to 50",
                              "Error",JOptionPane.ERROR_MESSAGE);
                              }
                            }
                        catch(NumberFormatException nfe1){
                            JOptionPane.showMessageDialog(frame2,"Invalid Input. Please enter all the textfields accurately .","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    });
                    JButton DisplayButton = new JButton("Display");
                    DisplayButton.setBounds(400,500,200,50);
                    DisplayButton.setBackground(new Color(0x91BAD6));
                    frame2.add(DisplayButton);
                    DisplayButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                          int teacherId = Integer.parseInt(tf2.getText());
                          String teacherName = tf3.getText();
                          String address = tf4.getText();
                          String department = tf5.getText();
                          String workingType = tf6.getText();
                          String employmentStatus = tf7.getText();
                          int gradedScore = Integer.parseInt(tf9.getText());
                          int yearsOfExperience = Integer.parseInt(tf10.getText());
                          if(AddLecturerButtonRangeCheck(teacherId, gradedScore , yearsOfExperience)){
                              JTextArea screen = new JTextArea();
                              screen.setBounds(300,50,300,300);
                              screen.setText("Teacher ID: "+teacherId+"\n"+"Teacher Name: "+teacherName+"\n"+"Address: "+address+"\n"+"Department: "+
                              department+"\n"+"WorkingType: "+workingType+"\n"+"Employment Status: "+employmentStatus+"\n"+"Graded Score: "+gradedScore+
                              "\n"+"Years Of Experience: "+yearsOfExperience+"\n");
                              JOptionPane.showMessageDialog(null,screen);
                          }
                          else{
                              JOptionPane.showMessageDialog(frame2,"Invalid Input.Please enter input of correct range.\n Range for teacherId : 1 to 99 \n Range for Graded Score : 1 to 99 \n Range for Years Of Experience : 1 to 50",
                              "Error",JOptionPane.ERROR_MESSAGE);
                          }
                        }
                    });
                    
                    JButton gradeAssignmentButton = new JButton("Grade Assignment");
                    gradeAssignmentButton.setBounds(700,500,200,50);
                    gradeAssignmentButton.setBackground(new Color(0x91BAD6));
                    frame2.add(gradeAssignmentButton);
                    gradeAssignmentButton.addActionListener(new ActionListener(){
                     public void actionPerformed(ActionEvent e){
                        JFrame frame3 = new JFrame();
                        frame3.setVisible(true);//sets frame as visible
                        frame3.setTitle("Grade Assignment");//sets title of frame
                        frame3.setSize(1500,1500);//sets title of frame
                        frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//exits out from application on closing
                        frame3.setLayout(null);
                        frame3.getContentPane().setBackground(new Color(0xBCD2E8)); 
                        
                        JPanel panel1 = new JPanel();
                        panel1.setBackground(new Color(0x91BAD6));
                        panel1.setBounds(-110,0,1500,50);
                        frame3.add(panel1);
                        JLabel label = new JLabel("Assignment Grading Form");
                        label.setBounds(100,50,200,50);
                        label.setFont(new Font("Serif Bold",Font.PLAIN,30));
                        panel1.add(label);
                    
                        JLabel label1 = new JLabel("Teacher Id:");
                        label1.setBounds(275,55,200,100);
                        label1.setFont(new Font("Serif Bold",Font.PLAIN,20));
                        frame3.add(label1);
                        JTextField tf1 = new JTextField();
                        tf1.setBounds(175,152,350,25);
                        frame3.add(tf1);
                        
                        JLabel label2 = new JLabel("Graded Score:");
                        label2.setBounds(275,260,200,100);
                        label2.setFont(new Font("Serif Bold",Font.PLAIN,20));
                        frame3.add(label2);
                        JTextField tf2 = new JTextField();
                        tf2.setBounds(175,360,350,25);
                        frame3.add(tf2);
                        
                        JLabel label3 = new JLabel("Department:");
                        label3.setBounds(800,55,200,100);
                        label3.setFont(new Font("Serif Bold",Font.PLAIN,20));
                        frame3.add(label3);
                        JTextField tf3 = new JTextField();
                        tf3.setBounds(700,152,350,25);
                        frame3.add(tf3);
                        
                        JLabel label4 = new JLabel("Years Of Experience:");
                        label4.setBounds(775,260,200,100);
                        label4.setFont(new Font("Serif Bold",Font.PLAIN,20));
                        frame3.add(label4);
                        JTextField tf4 = new JTextField();
                        tf4.setBounds(700,360,350,25);
                        frame3.add(tf4);
                        
                        JButton submit = new JButton("Submit");
                        submit.setBounds(513,500,200,50);
                        submit.setBackground(new Color(0x91BAD6));
                        frame3.add(submit);
                        submit.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent e){
                                try{
                                    //get input values
                                    int teacherId = Integer.parseInt(tf1.getText());
                                    int GradedScore = Integer.parseInt(tf2.getText());
                                    String department = tf3.getText();
                                    int yearsOfExperience = Integer.parseInt(tf4.getText());
                                    if(AddLecturerButtonRangeCheck(teacherId, GradedScore, yearsOfExperience)){
                                        // Search for the lecturer with the provided teacher ID
                                        Lecturer lecturer = null;
                                        for(Teacher teacher : teacherArrayList){
                                            if (teacher instanceof Lecturer && teacher.getTeacherId() == teacherId){
                                                lecturer = (Lecturer) teacher;
                                                break;
                                            }
                                        }
                                        
                                        // If lecturer with the provided ID is found, grade the assignment
                                        if (lecturer != null){
                                            lecturer.gradeAssignment(GradedScore, department, yearsOfExperience);
                                            // Show a message dialog indicating successful grading and the grade
                                            JOptionPane.showMessageDialog(null, "Assignment graded successfully.\nGrade: " + lecturer.getGrade());
                                        }
                                        else{
                                            // If lecturer with the provided ID is not found, show an error message
                                            JOptionPane.showMessageDialog(null, "Invalid Teacher ID.");
                                        }
                                        
                                        // Close the frame after grading
                                        frame3.dispose();
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "Invalid Input.Please enter input of correct range.\n Range for teacherId : 1 to 99 \n Range for Graded Score : 1 to 99 \n Range for Years Of Experience : 1 to 50");
                                    }
                                }
                                catch (NumberFormatException ex){
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter correct values in all textfields.");
                                }
                            }
                        });
                     }
                    });
                    
                    JButton ClearButton = new JButton("Clear");
                    ClearButton.setBounds(1000,500,200,50);
                    ClearButton.setBackground(new Color(0x91BAD6));
                    frame2.add(ClearButton);
                    ClearButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                           tf2.setText("");
                           tf3.setText("");
                           tf4.setText(""); 
                           tf5.setText("");
                           tf6.setText("");
                           tf7.setText("");
                           tf8.setText("");
                           tf9.setText("");
                           tf10.setText("");
                        }
                    });
            }
        });
        //Add a tutorr button
        JButton TutorButton = new JButton("Tutor");
        TutorButton.setBounds(100,210,200,50);
        TutorButton.setBackground(new Color(0xB7AFA3));
        bodyPanel.add(TutorButton);
         TutorButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JFrame frame4 = new JFrame();
                    frame4.setVisible(true);//sets frame as visible
                    frame4.setTitle("Add a  Tutor");//sets title of frame
                    frame4.setSize(1500,1500);//sets sizee of frame
                    frame4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//exits out from application on closing
                    frame4.setLayout(null);
                    frame4.getContentPane().setBackground(new Color(0xBCD2E8));
                    
                    //adding form components
                    JPanel panel1 = new JPanel();
                    panel1.setBackground(new Color(0x91BAD6));
                    panel1.setBounds(0,0,300,50);
                    frame4.add(panel1);
                    JLabel label1 = new JLabel("Tutor Form");
                    label1.setBounds(0,0,200,50);
                    label1.setFont(new Font("Serif Bold",Font.PLAIN,30));
                    panel1.add(label1);
                    
                    JButton homeButton = new JButton("Go To Home");
                    homeButton.setBounds(900,0,200,30);
                    homeButton.setBackground(new Color(0x91BAD6));
                    frame4.add(homeButton);
                    homeButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            frame1.setVisible(true);
                        }
                    });
                    
                    JButton LecturerButton = new JButton("Go To Lecturer");
                    LecturerButton.setBounds(1100,0,200,30);
                    LecturerButton.setBackground(new Color(0x91BAD6));
                    frame4.add(LecturerButton);
                    LecturerButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            frame1.setVisible(false);
                            frame4.setVisible(false);
                        }
                    });
                    
                    
                    JLabel label2 = new JLabel("Teacher Id:");
                    label2.setBounds(150,55,190,100);
                    label2.setFont(new Font("Serif Bold",Font.PLAIN,20));
                    frame4.add(label2);
                    JTextField tf2 = new JTextField();
                    tf2.setBounds(50,152,350,25);
                    frame4.add(tf2);
                    
                    JLabel label3 = new JLabel("Teacher Name:");
                    label3.setBounds(150,160,190,100);
                    label3.setFont(new Font("Serif Bold",Font.PLAIN,20));
                    frame4.add(label3);
                    JTextField tf3 = new JTextField();
                    tf3.setBounds(50,260,350,25);
                    frame4.add(tf3);
                    
                    JLabel label4 = new JLabel("Address:");
                    label4.setBounds(170,268,190,100);
                    label4.setFont(new Font("Serif Bold",Font.PLAIN,20));
                    frame4.add(label4);
                    JTextField tf4 = new JTextField();
                    tf4.setBounds(50,368,350,25);
                    frame4.add(tf4);
                    
                    JLabel label5 = new JLabel("Performance Index:");
                    label5.setBounds(580,55,210,100);
                    label5.setFont(new Font("Serif Bold",Font.PLAIN,20));
                    frame4.add(label5);
                    JTextField tf5 = new JTextField();
                    tf5.setBounds(460,152,350,25);
                    frame4.add(tf5);
                    
                    JLabel label6  = new JLabel("Academic Qualification:");
                    label6.setBounds(535,160,210,100);
                    label6.setFont(new Font("Serif Bold",Font.PLAIN,20));
                    frame4.add(label6);
                    JTextField tf6 = new JTextField();
                    tf6.setBounds(460,260,350,25);
                    frame4.add(tf6);
                    
                    JLabel label7  = new JLabel("Employment Status:");
                    label7.setBounds(550,268,210,100);
                    label7.setFont(new Font("Serif Bold",Font.PLAIN,20));
                    frame4.add(label7);
                    JTextField tf7 = new JTextField();
                    tf7.setBounds(460,368,350,25);
                    frame4.add(tf7);
                    
                    JLabel label8 = new JLabel("Specialization:");
                    label8.setBounds(990,55,210,100);
                    label8.setFont(new Font("Serif Bold",Font.PLAIN,20));
                    frame4.add(label8);
                    JTextField tf8 = new JTextField();
                    tf8.setBounds(900,152,350,25);
                    frame4.add(tf8);
                    
                    JLabel label9  = new JLabel("Working Hours:");
                    label9.setBounds(990,160,210,100);
                    label9.setFont(new Font("Serif Bold",Font.PLAIN,20));
                    frame4.add(label9);
                    JTextField tf9 = new JTextField();
                    tf9.setBounds(900,260,350,25);
                    frame4.add(tf9);
                    
                    JLabel label10 = new JLabel("Working Type:");
                    label10.setBounds(990,268,210,100);
                    label10.setFont(new Font("Serif Bold",Font.PLAIN,20));
                    frame4.add(label10);
                    JTextField tf10 = new JTextField();
                    tf10.setBounds(900,368,350,25);
                    frame4.add(tf10);

                    
                    JLabel label11 = new JLabel("Salary:");
                    label11.setBounds(590,376,210,100);
                    label11.setFont(new Font("Serif Bold",Font.PLAIN,20));
                    frame4.add(label11);
                    JTextField tf11 = new JTextField();
                    tf11.setBounds(460,476,350,30);
                    frame4.add(tf11);
                    
                    JLabel label12 = new JLabel("Department :");
                    label12.setBounds(170,376,190,100);
                    label12.setFont(new Font("Serif Bold",Font.PLAIN,20));
                    frame4.add(label12);
                    JTextField tf12 = new JTextField();
                    tf12.setBounds(50,476,350,25);
                    frame4.add(tf12);
                    
                    JButton addTutorButton = new JButton("Add Tutor");
                    addTutorButton.setBounds(113,576,200,50);
                    addTutorButton.setBackground(new Color(0x91BAD6));
                    frame4.add(addTutorButton);
                    addTutorButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                             try {
                            // Get input values
                            int teacherId = Integer.parseInt(tf2.getText());
                            String teacherName = tf3.getText();
                            String address = tf4.getText();
                            int PerformanceIndex= Integer.parseInt(tf5.getText());
                            String AcademicQualification=tf6.getText();
                            String EmploymentStatus=tf7.getText();
                            String Specialization=tf8.getText();
                            int WorkingHours = Integer.parseInt(tf9.getText());
                            String WorkingType =tf10.getText();
                            int Salary = Integer.parseInt(tf11.getText());
                            String department = tf12.getText();
                            if(AddTutorButtonRangeCheck(teacherId , Salary , WorkingHours , PerformanceIndex)){
                                Tutor newTutor = new Tutor (teacherId, teacherName,department, address,WorkingType,WorkingHours,EmploymentStatus,Specialization,
                                AcademicQualification,PerformanceIndex);
    
                                teacherArrayList.add(newTutor);
                                frame4.dispose();
                                JOptionPane.showMessageDialog(null, "Tutor added successfully.");
                            }
                            else{
                                JOptionPane.showMessageDialog(frame4,"Invalid Input.Please enter input of correct range.\n Range for teacherId : 1 to 99 \n Range for Salary : 1 to 100000 \n Range for PerformanceIndex : 1 to 10 \n Range for working hours : 1 to 24",
                                "Error",JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(frame4, "Invalid input. Please make sure all textfields are accurately filled.");
                        }
                        }
                    });
                    
                    JButton DisplayButton = new JButton("Display");
                    DisplayButton.setBounds(400,576,200,50);
                    DisplayButton.setBackground(new Color(0x91BAD6));
                    frame4.add(DisplayButton);
                    DisplayButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            int teacherId = Integer.parseInt(tf2.getText());
                            String teacherName = tf3.getText();
                            String address = tf4.getText();
                            int PerformanceIndex= Integer.parseInt(tf5.getText());
                            String AcademicQualification=tf6.getText();
                            String EmploymentStatus=tf7.getText();
                            String Specialization=tf8.getText();
                            int WorkingHours = Integer.parseInt(tf9.getText());
                            String WorkingType =tf10.getText();
                            int Salary = Integer.parseInt(tf11.getText());
                            String department = tf12.getText();
                            if(AddTutorButtonRangeCheck(teacherId , Salary , WorkingHours , PerformanceIndex)){
                              JTextArea screen2 = new JTextArea();
                              screen2.setBounds(300,50,300,300);
                              screen2.setText("Teacher ID: "+teacherId+"\n"
                              +"Teacher Name: "+teacherName+"\n"
                              +"Address: "+address+"\n"
                              +"Performance Index: "+ PerformanceIndex+"\n"
                              +"Academic Qualification: "+AcademicQualification+"\n"
                              +"Employment Status: "+EmploymentStatus+"\n"
                              +"Specialization: "+Specialization +"\n"
                              +"Working Hours: "+WorkingHours +"\n"
                              +"Working Type: "+WorkingType +"\n"
                              +"Salary: "+ Salary +"\n"
                              +"Department: "+ department +"\n");
                              JOptionPane.showMessageDialog(null,screen2);
                              }
                              else{
                              JOptionPane.showMessageDialog(frame4,"Invalid Input.Please enter input of correct range.\n Range for teacherId : 1 to 99 \n Range for Salary : 1 to 100000 \n Range for PerformanceIndex : 1 to 10 \n Range for working hours : 1 to 24",
                              "Error",JOptionPane.ERROR_MESSAGE);
                              }
                        }
                    });
                    
                    JButton SetSalaryButton = new JButton("Set Salary");
                    SetSalaryButton.setBounds(965,476,200,50);
                    SetSalaryButton.setBackground(new Color(0x91BAD6));
                    frame4.add(SetSalaryButton);
                    SetSalaryButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            JFrame frame5 = new JFrame();
                            frame5.setVisible(true);//sets frame as visible
                            frame5.setTitle("Set Salary");//sets title of frame
                            frame5.setSize(1500,1500);//sets title of frame
                            frame5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//exits out from application on closing
                            frame5.setLayout(null);
                            frame5.getContentPane().setBackground(new Color(0xBCD2E8)); 
                            
                            JPanel panel1 = new JPanel();
                            panel1.setBackground(new Color(0x91BAD6));
                            panel1.setBounds(-110,0,1500,50);
                            frame5.add(panel1);
                            JLabel label = new JLabel("Set Salary Form");
                            label.setBounds(100,50,200,50);
                            label.setFont(new Font("Serif Bold",Font.PLAIN,30));
                            panel1.add(label);
                        
                            JLabel label1 = new JLabel("    Salary");
                            label1.setBounds(275,252,200,100);
                            label1.setFont(new Font("Serif Bold",Font.PLAIN,20));
                            frame5.add(label1);
                            JTextField tf1 = new JTextField();
                            tf1.setBounds(175,352,350,25);
                            frame5.add(tf1);
                            
                            JLabel label2 = new JLabel("  Performance Index");
                            label2.setBounds(770,252,300,100);
                            label2.setFont(new Font("Serif Bold",Font.PLAIN,20));
                            frame5.add(label2);
                            JTextField tf2 = new JTextField();
                            tf2.setBounds(700,352,350,25);
                            frame5.add(tf2);
                            
                            JLabel label3 = new JLabel("Teacher Id");
                            label3.setBounds(555,55,200,100);
                            label3.setFont(new Font("Serif Bold",Font.PLAIN,20));
                            frame5.add(label3);
                            JTextField tf3 = new JTextField();
                            tf3.setBounds(460,152,350,25);
                            frame5.add(tf3);
                            
                            JButton submit = new JButton("Submit");
                            submit.setBounds(540,500,200,50);
                            submit.setBackground(new Color(0x91BAD6));
                            frame5.add(submit);
                            submit.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent e){
                                    try{
                                        //get input values
                                        int teacherId = Integer.parseInt(tf3.getText());
                                        int salary = Integer.parseInt(tf1.getText());
                                        int PerformanceIndex = Integer.parseInt(tf2.getText());
                                        if(SetSalaryRangeCheck(teacherId , salary , PerformanceIndex)){
                                            //searching for valid teacherId
                                            Tutor tutorForSalary = null;
                                            for(Teacher teacher : teacherArrayList){
                                                if(teacher instanceof Tutor && teacher.getTeacherId() == teacherId){
                                                    tutorForSalary = (Tutor) teacher;
                                                }
                                                else{
                                                   JOptionPane.showMessageDialog(frame4,"Invalid Teacher Id. Please enter it correctly","Error",
                                                   JOptionPane.ERROR_MESSAGE); 
                                                }
                                            }
                                            //after the teacherId is validated set the salary
                                            if (tutorForSalary != null){
                                                tutorForSalary.setSalary(salary, PerformanceIndex);
                                                //msg of sucessfil setting of salary
                                                JOptionPane.showMessageDialog(null,"Salary set sucessfully");
                                            }
                                            else{
                                                JOptionPane.showMessageDialog(frame4,"Invalid Teacher Id. Please enter it correctly","Error",
                                                JOptionPane.ERROR_MESSAGE); 
                                            }
                                            frame5.dispose();
                                        }
                                        else{
                                            JOptionPane.showMessageDialog(null, "Invalid Input.Please enter input of correct range.\n Range for teacherId : 1 to 99.");
                                        }
                                    }
                                    catch(NumberFormatException ex){
                                        JOptionPane.showMessageDialog(null,"Invalid input.Please enter all textfields accurately");
                                    }
                                }
                            });
                        }
                    });
                    
                    JButton RemoveTheTutorButton = new JButton("Remove Tutor");
                    RemoveTheTutorButton.setBounds(675,576,200,50);
                    RemoveTheTutorButton.setBackground(new Color(0x91BAD6));
                    frame4.add(RemoveTheTutorButton);
                    RemoveTheTutorButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                           JFrame frame6 = new JFrame();
                           frame6.setVisible(true);//sets frame as visible
                           frame6.setTitle("Remove Tutor");//sets title of frame
                           frame6.setSize(1500,1500);//sets title of frame
                           frame6.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//exits out from application on closing
                           frame6.setLayout(null);
                           frame6.getContentPane().setBackground(new Color(0xBCD2E8)); 
                           
                           JPanel panel1 = new JPanel();
                           panel1.setBackground(new Color(0x91BAD6));
                           panel1.setBounds(-110,0,1500,50);
                           frame6.add(panel1);
                           JLabel label = new JLabel("Remove Tutor Form");
                           label.setBounds(100,50,200,50);
                           label.setFont(new Font("Serif Bold",Font.PLAIN,30));
                           panel1.add(label);
                           
                           JLabel label2 = new JLabel("Enter the id of tutor to be removed: ");
                           label2.setBounds(470,202,500,100);
                           label2.setFont(new Font("Serif Bold",Font.PLAIN,20));
                           frame6.add(label2);
                           JTextField tf2 = new JTextField();
                           tf2.setBounds(450,302,350,25);
                           frame6.add(tf2);
                           
                           
                           JButton submit = new JButton("Submit");
                           submit.setBounds(525,450,200,50);
                           submit.setBackground(new Color(0x91BAD6));
                           frame6.add(submit);
                           submit.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent e){
                                    try{
                                        //get input values
                                        int teacherId =  Integer.parseInt(tf2.getText());
                                        boolean tutorMatched = false;
                                        if(TeacherIdRangeCheck(teacherId)){
                                            //searching for valid teacherId
                                            Tutor tutorForRemoval = null;
                                            for(Teacher teacher : teacherArrayList){
                                                if(teacher instanceof Tutor && teacher.getTeacherId() == teacherId){
                                                    tutorForRemoval  = (Tutor) teacher;
                                                }
                                                else{
                                                   JOptionPane.showMessageDialog(frame4,"Invalid Teacher Id. Please enter it correctly","Error",
                                                   JOptionPane.ERROR_MESSAGE); 
                                                }
                                            }
                                            //after the teacherId is validated set the salary
                                            if (tutorForRemoval  != null){
                                                tutorForRemoval .removeTutor();
                                                teacherArrayList.remove(tutorForRemoval);
                                                //msg of sucessfil setting of salary
                                                JOptionPane.showMessageDialog(null,"Tutor removed sucessfully.");
                                            }
                                            else{
                                                JOptionPane.showMessageDialog(frame4,"Invalid Teacher Id. Please enter it correctly","Error",
                                                JOptionPane.ERROR_MESSAGE); 
                                            }
                                            frame6.dispose();
                                        }
                                        else{
                                            JOptionPane.showMessageDialog(null, "Invalid Input.Please enter correct values");
                                        }
                                    }
                                    catch(NumberFormatException ex){
                                        JOptionPane.showMessageDialog(null,"Invalid input.Please enter all textfields accurately");
                                    }
                                }
                           });
                        }
                    });
                    
                    JButton ClearButton = new JButton("Clear");
                    ClearButton.setBounds(965,576,200,50);
                    ClearButton.setBackground(new Color(0x91BAD6));
                    frame4.add(ClearButton);
                    ClearButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                           tf2.setText("");
                           tf3.setText("");
                           tf4.setText(""); 
                           tf5.setText("");
                           tf6.setText("");
                           tf7.setText("");
                           tf8.setText("");
                           tf9.setText("");
                           tf10.setText("");
                           tf11.setText("");
                           tf12.setText("");
                        }
                    });
            }
        });
    }
    }