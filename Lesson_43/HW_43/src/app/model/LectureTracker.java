package app.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LectureTracker {
    public static Map<Student, Integer> countAttendance(List<Student> studentList) {
        Map<Student, Integer> attendanceMap = new HashMap<>();
        for (Student student : studentList) {
            attendanceMap.put(student, attendanceMap.getOrDefault(student, 0) + 1);

        }
        return attendanceMap;
    }
}
