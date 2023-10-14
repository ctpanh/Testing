public class Fee {
    private boolean gender = false;
    private int age = 0;

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (checkInvalid(age)) {
            this.age = age;
        }
        System.out.println("Không hợp lệ");
    }

    private boolean checkInvalid(int age) {
        return age > 0 && age < 160;
    }

    public String result(int age, boolean gender) {
        if (age > 0 && age < 160) {
            if (age >= 65) {
                return "1500$";
            }
            if (gender) {
                return "500$";
            } else {
                if (age >= 25) {
                    return "1000$";
                } else {
                    return "3000$";
                }
            }
        }
        return "Không hợp lệ";
    }
}
