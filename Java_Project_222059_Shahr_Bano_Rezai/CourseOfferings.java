import java.util.TreeSet;

public class CourseOfferings {

    private TreeSet<Course> sortedCourses = new TreeSet<>();

    // add a course
    public void addCourse(Course c) {
        if (c == null) throw new IllegalArgumentException("cannot add null course");
        sortedCourses.add(c);
    }

    // first course in TreeSet
    public Course getFirstCourse() {
        if (sortedCourses.isEmpty()) return null;
        return sortedCourses.first();
    }

    // last course in TreeSet
    public Course getLastCourse() {
        if (sortedCourses.isEmpty()) return null;
        return sortedCourses.last();
    }

    // get courses between two codes
    public TreeSet<Course> getCoursesInRange(String fromCode, String toCode) {
        if (fromCode == null || toCode == null) return new TreeSet<>();

        Course start = new Course(fromCode, "", 0, 0);
        Course end   = new Course(toCode, "", 0, 0);

        return new TreeSet<>(sortedCourses.subSet(start, true, end, true));
    }

    // remove course by code
    public boolean removeCourse(String courseCode) {
        if (courseCode == null || courseCode.isEmpty()) return false;

        for (Course c : sortedCourses) {
            if (c.getCourseCode().equals(courseCode)) {
                sortedCourses.remove(c);
                return true;
            }
        }
        return false;
    }

    // show all courses
    public void displayAllCourses() {
        for (Course c : sortedCourses) {
            System.out.println(c);
        }
    }
}
