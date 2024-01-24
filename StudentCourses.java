public class StudentCourses {

    private String[] courseCodes = { "C#", "ST", "ML", "DEVOPS", "MP" };
    private int[] marks = { 85, 92, 75, 88, 95 };

    public void displayStudentMarks(String course) {
        System.out.println("Course Codes \t Marks Obtained");
        System.out.println("-------------- \t --------------");

        for (int i = 0; i < courseCodes.length; i++) {
            if (course.equalsIgnoreCase(courseCodes[i]))
                System.out.println(courseCodes[i] + "\t\t\t" + marks[i]);
        }
    }

}
