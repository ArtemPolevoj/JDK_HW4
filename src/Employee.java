public class Employee {
    private int personnelNumber, experience;
    private String name, phoneNumber;

    public Employee(String name, int personnelNumber, int experience, String phoneNumber) {
        setPersonnelNumber(personnelNumber);
        setName(name);
        setExperience(experience);
        this.phoneNumber = phoneNumber;
    }

    private void setPersonnelNumber(int personnelNumber) {
        if (personnelNumber >= 0) {
            this.personnelNumber = personnelNumber;
        } else {
            throw new RuntimeException("Табельный номер не может быть отрицательным.");
        }
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            throw new RuntimeException("Имя не может быть пустым.");
        }
    }

    public void setExperience(int experience) {
        if (experience >= 0){
            this.experience = experience;
        } else {
            throw new RuntimeException("Стаж не может быть отрицательным.");
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "PersonnelNumber=" + personnelNumber +
                ", Experience=" + experience +
                ", Name='" + name + '\'' +
                ", PhoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
