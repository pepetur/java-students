package travel.compositor.studentsjava.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import travel.compositor.studentsjava.Models.Student;
import travel.compositor.studentsjava.Repositories.IStudentRepository;

import java.util.List;

@Service
public class StudentService implements IStudentsService{

    @Autowired
    private IStudentRepository _repository;

    @Override
    public List<Student> GetAllStudents() {
        return _repository.GetAllStudents();
    }
}
