package Question3;


public class Main {


    public static void main(String[] args) {
        Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");

        Course course = new Course("Software Engineering", instructor, textbook);

        course.print();

        //Modified
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("Manso", "Frimpong", "5-4234");

        // Create textbook objects
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Design Patterns", "Erich Gamma", "Addison-Wesley");

        // Create course object with two instructors and two textbooks
        ModifiedCourse modifiedCourse = new ModifiedCourse("Software Engineering",
                new Instructor[]{instructor1, instructor2},
                new Textbook[]{textbook1, textbook2});

        // Print course information
        modifiedCourse.print();

    }

}
