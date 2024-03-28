package online.courseal.courseal_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Configuration
public class CoursealBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursealBackendApplication.class, args);
	}

	@GetMapping("api/user/change-name")
	public String apiUserChangeName(){
		return "user/change-name";
	}

	@GetMapping("api/auth/refresh")
	public String apiAuthRefresh(){
		return "auth/refresh";
	}

	@GetMapping("api/auth/logout")
	public String apiAuthLogout(){
		return "auth/Logout";
	}

	@GetMapping("api/course-management/create-course")
	public String apiCourseManagementCreateCourse(){
		return "course-management/create-course";
	}
}
