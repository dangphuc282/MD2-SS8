public class Animals { // Thuộc tính được bao đóng
    private String name;
    private int age;

    public Animals(String name, int age) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên không được để trống.");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Tuổi không được âm.");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Tên không hợp lệ.");
            return;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Tuổi không hợp lệ.");
            return;
        }
        this.age = age;
    }


    public void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
    }

    public String makeSound() {
        return "Some generic sound";
    }
}
