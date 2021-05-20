package hosp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import hosp.config.AppConfig;

public class Clinic {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IPatient patient = context.getBean("patient", IPatient.class);
        patient.goToTheDoctor("врач стоматолог");
    }
}
