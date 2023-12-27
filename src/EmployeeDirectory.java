import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmployeeDirectory {
    public List<Employee> employeeList = new LinkedList<>();

    /**
     * Метод получения списка сотрудников по стажу работы
     * @param experience стаж работы
     * @return список сотрудников
     */
    public List<Employee> getEmployeesOfExperience(int experience) {
        List<Employee> temp = new ArrayList<>();
        for (Employee e : employeeList) {
            if (e.getExperience() == experience) {
                temp.add(e);
            }
        }
        return temp;
    }

    /**
     * Метод получения номера телефона сотрудника по имени
     * @param name имя сотрудника
     * @return номер телефона сотрудника
     */
    public String getPhoneNumberOfName(String name) {
        for (Employee e : employeeList) {
            if (e.getName().equals(name)) {
                return  e.getPhoneNumber();
            }
        }
        return null;
    }

    /**
     * Метод получения сотрудника по табельному номеру
     * @param personnelNumber табельный номер
     * @return сотрудник
     */
    public Employee getEmployeeOfPersonnelNumber(int personnelNumber) {
        for (Employee e : employeeList) {
            if (e.getPersonnelNumber() == personnelNumber) {
                return e;
            }
        }
        return null;
    }

    /**
     * Метод добавление нового сотрудника в справочник
     * @param name имя
     * @param personnelNumber табельный номер
     * @param experience стаж
     * @param phoneNumber номер телефона
     */
    public void addNewEmployee(String name, int personnelNumber, int experience, String phoneNumber) {
        employeeList.add(new Employee(name, personnelNumber, experience, phoneNumber));
    }
}
