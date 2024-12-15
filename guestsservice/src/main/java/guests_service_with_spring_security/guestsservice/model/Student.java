package guests_service_with_spring_security.guestsservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int student_id;
    private String student_Name;
    private String student_Class;
}
