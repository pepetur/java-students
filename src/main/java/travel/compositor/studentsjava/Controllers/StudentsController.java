package travel.compositor.studentsjava.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import travel.compositor.studentsjava.Models.Student;
import travel.compositor.studentsjava.Services.IStudentsService;

import java.util.List;

@RestController
public class StudentsController {

    @Autowired
    private IStudentsService _studentService;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> GetAllStudents() {
        List<Student> result = _studentService.GetAllStudents();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
