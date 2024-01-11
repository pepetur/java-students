package travel.compositor.studentsjava.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import travel.compositor.studentsjava.Models.Student;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository implements IStudentRepository{

//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> GetAllStudents() {
        String sqlQuery = "SELECT * FROM Students";

//        return jdbcTemplate.query(sqlQuery, BeanPropertyRowMapper.newInstance(Student.class));
        return new ArrayList<>();
    }
}
