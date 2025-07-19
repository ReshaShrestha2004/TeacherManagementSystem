 public class Lecturer extends Teacher{
    private String Department;
    private int YearsOfExperience;
    private int GradedScore;
    private boolean HasGraded;
    private String grades;
    //constructor for class Lecturer
    public Lecturer(int teacher_Id, String teacher_Name, String address, String working_Type, String employment_Status, String Department,
    int YearsOfExperience){
        //calling super class constructor Teacher 
        super(teacher_Id,teacher_Name,address,working_Type,employment_Status);
        //initializing gradedscore as 0 and has graded as false
        this.GradedScore = 0;
        this.HasGraded = false;
        //assigning other attributes with their parameter values
        this.YearsOfExperience = YearsOfExperience;
        this.Department = Department;
    }
    //accessor methods for all attributes
    public String getDepartment(){
        return this.Department;
    }
    public int getYearsOfExperience(){
        return this.YearsOfExperience;
    }
    public int getGradedScore(){
        return this.GradedScore;
    }
    public boolean getHasGraded(){
        return this.HasGraded;
    }
    //mutator method for the attribrute GradedScore
    public void setGradedScore(int GradedScore){
        this.GradedScore = GradedScore;
    }
    //method to grade assignment
    public void gradeAssignment(int GradedScore,String Department,int YearsOfExperience){ 
        if(!HasGraded && YearsOfExperience>=5 && Department.equals(Department)){
            if(GradedScore>=70){   
                this.GradedScore = GradedScore;
                grades = "A";
                //return grade;
                System.out.println("Graded score is : grade");
            }
            else if(GradedScore>=60){
                this.GradedScore = GradedScore;
                grades = "B";
                System.out.println("Graded score is : grade");
            }
            else if(GradedScore>=50){
                this.GradedScore = GradedScore;
                grades = "C";
                System.out.println("Graded score is : grade");
            }
            else if(GradedScore>=40){
                this.GradedScore = GradedScore;
                grades = "D";
                System.out.println("Graded score is : grade");
            }
            else{
                //If score less than 40 then reset it to 0 
                this.GradedScore = 0;
                grades = "E";
                System.out.println("Graded score is : grade");
            }
            this.HasGraded = true;
        }
        else{
            System.out.println("Assignment is already graded");
        }
    }
    public String getGrade(){
        return this.grades;
    }
    //display method to display lecturer class details
    //method overriding as both the superclass Teacher and subclass Lecturer has a method named display()
    public void display(){
        //making a call to display method of super class Teacher
        super.display();
        //display details of Lecturer class
        System.out.println("The department is: " + Department);
        System.out.println("The Years of experience is: " + YearsOfExperience);
        if(HasGraded = true){ 
            System.out.println("The graded score is: "+ GradedScore);
        }
        else{ 
            System.out.println("The score has not  been graded yet");
        }
    }
}
