package hosp.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import hosp.DoctorList;
import hosp.IPatient;

@Component("patient")
@Scope("prototype")
public class Patient implements IPatient {

    @Override
    public void goToTheDoctor(String doctorName) {
        DoctorList list = DoctorList.getByName(doctorName);
        System.out.println("Мне нужен " + doctorName);
        if (list.getName().equalsIgnoreCase(doctorName)){
            System.out.println("кабинет номер " + list.getCabinet());
        }else {
            System.out.println("Такого врача у нас нет");
        }
    }
}
