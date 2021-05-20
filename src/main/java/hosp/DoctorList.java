package hosp;

import java.util.Arrays;

public enum DoctorList {
    Pediatrician("Врач педиатр", 11),
    Dentist("Врач стоматолог", 15),
    Surgeon("Хирург", 18);

    private final String name;
    private final int cabinet;

    DoctorList(String name, int cabinet) {
        this.name = name;
        this.cabinet = cabinet;
    }

    public String getName() {
        return name;
    }

    public int getCabinet() {
        return cabinet;
    }

    public static DoctorList getByName(String name) {
        return Arrays.stream(values())
                .filter(t -> t.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
//////////////////////////////////////////////