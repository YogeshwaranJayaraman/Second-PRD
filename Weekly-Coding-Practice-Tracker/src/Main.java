public class Main {
public static void main(String[] args){
String StudentName = "Ananya";
float AcademicPercentage = 72.5f;
float AttendancePercentage = 81f;
int ActiveBacklogs = 0;
boolean ProjectCompleted = true;
double CommunicationScore = 68d;
double AptitudeScore = 74d;

boolean AcademicEligible = AcademicPercentage >= 60;
boolean AttendanceEligible = AttendancePercentage >= 75;
boolean BacklogEligible = ActiveBacklogs == 0;
boolean ProjectEligible = ProjectCompleted;
boolean CommunicationEligible = CommunicationScore >= 60;
boolean AptitudeEligible = AptitudeScore >= 60;

boolean   ApplicationEligible = AcademicEligible && AttendanceEligible && BacklogEligible  && ProjectEligible && CommunicationEligible && AptitudeEligible;

System.out.println("PLACEMENT READINESS REPORT");
System.out.println("Student Name: "+StudentName);
System.out.println("Academic Status: " + (AcademicEligible ? "Eligible" : "Not Eligible"));
System.out.println("Attendance Status: " + (AttendanceEligible ? "Eligible" : "Not Eligible"));
System.out.println("Backlog Status: " + (BacklogEligible ? "Eligible" : "Not Eligible"));
System.out.println("Project Status: " + (ProjectEligible ? "Completed" : "Not Completed"));
System.out.println("Communication Status: " + (CommunicationEligible ? "Eligible" : "Not Eligible"));
System.out.println("Aptitude Status: " + (AptitudeEligible ? "Eligible" : "Not Eligible"));
System.out.println("");
if(ApplicationEligible) 
    {
    System.out.println("Final Result: PLACEMENT READY");
    System.out.println("Message: All placement requirements are satisfied.");
    }

if (!ApplicationEligible) 
    {
    System.out.println("Final Result: NOT PLACEMENT READY");
    System.out.println("");
    System.out.println("Areas to Improve:");
    }

if (!AcademicEligible) 
    {
    System.out.println("Academic Percentage");
    }

if (!AttendanceEligible) 
    {
    System.out.println("Attendance");
    }

if (!BacklogEligible) 
    {
    System.out.println("Backlogs");
    }

if (!ProjectEligible) 
    {
    System.out.println("Project Completion");
    }

if (!CommunicationEligible) 
    {
    System.out.println("Communication Score");
    }

if (!AptitudeEligible) 
    {
    System.out.println("Aptitude Score");
    }
}

}

    

