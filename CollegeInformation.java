public class CollegeInformation {

    public String clgName;
    protected String Address;
    String department;
    private int collegeId;

    public CollegeInformation() {
        this.clgName = "JNNCE";
        this.department = "MCA";
        System.out.println("College information created with default values.");
    }

    public void setCollege() {
       System.out.println("College Name: " + clgName);
    }

    protected void setAddress() {
       System.out.println("Address has been updated.");
    }

    void identifyDepartment() {
       System.out.println("Identifying department: " + department);
    }

    public int getCollegeId() {
       return collegeId;
    }
}