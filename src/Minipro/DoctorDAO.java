package Minipro;

import java.sql.SQLException; //Abstraction

public interface DoctorDAO {
    void addDoctor(String name, String email, String specialization) throws SQLException;
    void viewDoctorsDetails() throws SQLException;
}
