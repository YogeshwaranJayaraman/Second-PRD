public class Main {
    public static void main(String[] args) {
        int student = 1;
        while (student <= 2) {

            String StudentName;
            float AcademicPercentage;
            float AttendancePercentage;
            int ActiveBacklogs;
            boolean ProjectCompleted;
            double CommunicationScore;
            double AptitudeScore;

            if (student == 1) 
            {
                StudentName = "Yogesh";
                AcademicPercentage = 78.5f;
                AttendancePercentage = 85f;
                ActiveBacklogs = 0;
                ProjectCompleted = true;
                CommunicationScore = 70d;
                AptitudeScore = 90d;
            } 
            else 
            {
                StudentName = "Arun";
                AcademicPercentage = 72.5f;
                AttendancePercentage = 72f;
                ActiveBacklogs = 2;
                ProjectCompleted = false;
                CommunicationScore = 68d;
                AptitudeScore = 55d;
            }

            boolean AcademicEligible = AcademicPercentage >= 60;
            boolean AttendanceEligible = AttendancePercentage >= 75;
            boolean BacklogEligible = ActiveBacklogs == 0;
            boolean ProjectEligible = ProjectCompleted;
            boolean CommunicationEligible = CommunicationScore >= 60;
            boolean AptitudeEligible = AptitudeScore >= 60;

            boolean ApplicationEligible = AcademicEligible && AttendanceEligible && BacklogEligible && ProjectEligible && CommunicationEligible && AptitudeEligible;

            System.out.println("\nPLACEMENT READINESS REPORT");
            System.out.println("");
            System.out.println("Student Name: " +StudentName);
            System.out.println("Academic Status: " +(AcademicEligible ? "Eligible" : "Not Eligible"));
            System.out.println("Attendance Status: " +(AttendanceEligible ? "Eligible" : "Not Eligible"));
            System.out.println("Backlog Status: " +(BacklogEligible ? "Eligible" : "Not Eligible"));
            System.out.println("Project Status: " +(ProjectEligible ? "Completed" : "Not Completed"));
            System.out.println("Communication Status: " +(CommunicationEligible ? "Eligible" : "Not Eligible"));
            System.out.println("Aptitude Status: " +(AptitudeEligible ? "Eligible" : "Needs Improvement"));
            System.out.println("");
            if (ApplicationEligible) 
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
                System.out.println("Clear Active Backlogs");
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
            student++;

        }

    }

}
