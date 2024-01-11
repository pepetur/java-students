package travel.compositor.studentsjava.Repositories;

import travel.compositor.studentsjava.Models.Student;

import java.util.List;

public interface IStudentRepository {
    public List<Student> GetAllStudents();
}
