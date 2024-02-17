package Question3;

public class ModifiedCourse {
    private String courseName;
    private Instructor[] instructors;
    private Textbook[] textbooks;

    public ModifiedCourse(String courseName, Instructor[] instructors, Textbook[] textbooks){
        this.courseName = courseName;
        this.instructors = instructors;
        this.textbooks = textbooks;
    }

    //Getters
    public String getCourseName() {
        return courseName;
    }

    public Instructor[] getInstructor() {
        return instructors;
    }

    public Textbook[] getTextbook() {
        return textbooks;
    }

    //Setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }

    public void setTextbooks(Textbook[] textbooks) {
        this.textbooks = textbooks;
    }

    //Print
    public void print(){
        System.out.println("************************************ MODIFIED COURSE ************************************");
        System.out.println("- Course Name: "+courseName);

        //Instructors
        System.out.println("Instructors:");
        for (Instructor instructor : instructors) {
            System.out.println("- " + instructor.getFirstName() + " " + instructor.getLastName());
            System.out.println("  Office Number: " + instructor.getOfficeNumber());
        }

        //Textbooks
        System.out.println("Textbooks:");
        for (Textbook textbook : textbooks) {
            System.out.println("- " + textbook.getTitle() + " by " + textbook.getAuthor());
            System.out.println("  Publisher: " + textbook.getPublisher());
        }
    }
}
