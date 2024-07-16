package human;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Human {

    private String name;
    private String birthday; //yyyy-MM-dd
    private String gender;  // 男性,女性
    
    public LocalDate getLocalDateBirthday() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(birthday, dtf);
    }

    public int getAge() {
        // 現在の年から生まれた年を引く
        LocalDate now = LocalDate.now();
        int age = now.getYear() - getLocalDateBirthday().getYear();
        // 誕生日前なら-1
        int birthMonth = getLocalDateBirthday().getMonthValue();
        int birthDate = getLocalDateBirthday().getDayOfMonth();
        LocalDate thisYearBirthday = LocalDate.of(now.getYear(), birthMonth, birthDate);
        if (now.isBefore(thisYearBirthday)) {
            age--;
        }
        return age;
    }

    public Human(String name, String birthday, String gender) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    

}
