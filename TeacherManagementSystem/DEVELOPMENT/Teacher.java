public class Teacher{
    private int teacher_Id;
    private String teacher_Name;
    private String address;
    private String working_Type;
    private String employment_Status;
    private int working_Hours;
    //Constructor for teacher class
    public Teacher(int teacher_Id, String teacher_Name, String address, String working_Type, String employment_Status){
        this.teacher_Name = teacher_Name;
        this.teacher_Id = teacher_Id;  
        this.address = address;
        this.working_Type = working_Type;
        this.employment_Status = employment_Status;
    }
    //accessor methods for all the attributes
    public int getTeacherId(){
        return this.teacher_Id;
    }
    public String getTeacherName(){
        return this.teacher_Name;
    }
    public String getAddress(){ 
        return this.address;
    }
    public String getWorkingType(){
        return this.working_Type;
    }
    public String getEmploymentStatus(){
        return this.employment_Status;
    }
    public int getWorkingHours(){
        return this.working_Hours;
    }
    //mutator method for the attribute working_Hours
    public void setWorkingHours(int working_Hours){
        this.working_Hours = working_Hours;
    }
    //display method to display data of Teacher class
    public void display(){
        System.out.println("The teacher id is: "+ teacher_Id);
        System.out.println("The teacher name is: " + teacher_Name);
        System.out.println("The address is: "+ address);
        System.out.println("The working type is"+ working_Type);
        System.out.println("The employment status is: "+ employment_Status);
        if(working_Hours==0){
            System.out.println("The working hours has not been assigned yet");
        }
        else{
            System.out.println("The working hours is: "+ working_Hours);
        }
    }
}