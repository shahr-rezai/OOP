import java.util.LinkedList;
import java.util.Iterator;

public class CourseCatalog {

    private LinkedList<Course> courseCatalog = new LinkedList<>();

    // add course at start
    public void addCourseAtBeginning(Course c) {
        if (c == null) throw new IllegalArgumentException("cannot add null course");
        courseCatalog.addFirst(c);
    }

    // add course at end
    public void addCourseAtEnd(Course c) {
        if (c == null) throw new IllegalArgumentException("cannot add null course");
        courseCatalog.addLast(c);
    }

    // remove by code
    public boolean removeCourse(String courseCode) {
        if (courseCode == null || courseCode.isEmpty()) return false;

        Iterator<Course> it = courseCatalog.iterator();
        while (it.hasNext()) {
            Course c = it.next();
            if (c.getCourseCode().equals(courseCode)) {
                it.remove();
                return true; // removed
            }
        }
        return false; // not found
    }

    // show all forward
    public void displayCoursesForward() {
        for (Course c : courseCatalog) {
            System.out.println(c);
        }
    }

    // show all backward
    public void displayCoursesBackward() {
        Iterator<Course> it = courseCatalog.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    // search by code
    public Course searchCourse(String courseCode) {
        if (courseCode == null || courseCode.isEmpty()) return null;

        for (Course c : courseCatalog) {
            if (c.getCourseCode().equals(courseCode)) return c;
        }
        return null;
    }
}
