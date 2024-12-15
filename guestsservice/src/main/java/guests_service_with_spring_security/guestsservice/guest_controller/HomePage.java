package guests_service_with_spring_security.guestsservice.guest_controller;

import guests_service_with_spring_security.guestsservice.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

@RestController
/*
 @RequestMapping("/guest")
*/
public class HomePage {

    private Student student;
    @GetMapping("/")
    public String home(HttpServletRequest request){
        return "Well come to Guest-Center, Happy Day "+ request.getRequestedSessionId();
    }

    @PostMapping("/student")
    public Student register(@RequestBody Student student){
        this.student = student;
        return this.student;
    }

    @GetMapping("/csrf")
    public CsrfToken getCsrf(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}



