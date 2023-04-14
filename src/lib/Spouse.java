package lib;

import java.time.LocalDate;

public class Spouse {
    private String idNumber;
    private String name;
    private LocalDate dateOfBirth;
    
    public Spouse(String idNumber, String name, LocalDate dateOfBirth) {
        this.idNumber = idNumber;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    
    // getters and setters
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

