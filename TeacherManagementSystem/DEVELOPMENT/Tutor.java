public class Tutor extends Teacher{
    private int salary;
    private String specialization;
    private String AcademicQualification;
    private int PerformanceIndex;
    private boolean IsCertified;
    //constructor for Tutor class
    public Tutor(int teacher_Id, String teacher_Name,String department, String address, String working_Type,int working_Hours, String employment_Status,String specialization,
    String AcademicQualification,int PerformanceIndex){
        //calling the super class constructor Teacher
        super(teacher_Id,teacher_Name,address,working_Type,employment_Status);
        //setting workinghours for Tutor class
        setWorkingHours(working_Hours);
        //assigning the attributes with their parameter values
        this.salary = salary;
        this.specialization = specialization;
        this.AcademicQualification = AcademicQualification;
        this.PerformanceIndex = PerformanceIndex;
        //initializing attribute IsCertified to false
        this.IsCertified = false;
    }
    //accessor methods for each attribute
    public double getSalary(){
        return this.salary;
    }
    public String getSpecialization(){
        return this.specialization;
    }
    public String getAcademicQualification(){
        return this.AcademicQualification;
    }
    public int getPerformanceIndex(){
        return this.PerformanceIndex;
    }
    public boolean getIsCertified(){
        return this.IsCertified;
    }
    //mutator method to set the salary
    public void setSalary(int salary, int PerformanceIndex){
        if(!IsCertified && PerformanceIndex>5 && getWorkingHours()>20){
            double appraisal = 0;
            if(PerformanceIndex>=5 && PerformanceIndex<=7){
                appraisal = 0.05;
            }
            else if(PerformanceIndex>=8 && PerformanceIndex<=9){
                appraisal = 0.10;
            }
            else if(PerformanceIndex==10){
                appraisal = 0.20;
            }
            this.salary += this.salary * appraisal;
            this.IsCertified = true;
        }
        else{
            System.out.println("The tutor has either already been certified or not eligible so the salary cannot be approved");
        }
    }
    //method for removal of tutor
    public void removeTutor(){
        if(!IsCertified){
            //Reset selected values to 0
            this.salary = 0;
            this.specialization = "";
            this.AcademicQualification = "";
            this.PerformanceIndex = 0;
            this.IsCertified = false;
        }
        else{
            System.out.println("Certified tutor cannot be removed");
        }
    }
    //display method to display data of Tutor class
    public void display(){
        if(IsCertified = true){
            //display details of parent class along with Tutor class
            //making a call to display method of super class 
            super.display();
            System.out.println("The salary is : " + salary);
            System.out.println("The specialization is: "+specialization);
            System.out.println("The academic qualification is : "+AcademicQualification);
            System.out.println("The performance index is : "+PerformanceIndex);
        }
        else{
            //display details of parent class only
            super.display();
        }
    }
}