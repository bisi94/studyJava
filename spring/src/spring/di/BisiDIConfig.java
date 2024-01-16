package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.BisiExam;
import spring.di.entity.Exam;

@ComponentScan("spring.di.ui")
@Configuration
public class BisiDIConfig {
	
	@Bean
	public Exam exam() {
		return new BisiExam();
	}
}
