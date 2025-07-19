package app.model;

import java.util.Objects;

public class Course {
    private String title;
    private String teacher;

    public Course(String title, String teacher) {
        this.title = title;
        this.teacher = teacher;
    }

    public String getTitle() {
        return title;
    }

    public String getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        Course course = (Course) object;
        return Objects.equals(title, course.title) && Objects.equals(teacher, course.teacher);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(title);
        result = 31 * result + Objects.hashCode(teacher);
        return result;
    }
}
