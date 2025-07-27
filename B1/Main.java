import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animals> animalList = new ArrayList<>();


        animalList.add(new Dog("Chó Mực", 3, "Husky"));
        animalList.add(new Cat("Mèo Mướp", 2, "Xám"));

        try {
            animalList.add(new Dog("", -1, "Beagle"));
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }


        for (Animals a : animalList) {
            System.out.println("----- Thông tin động vật -----");
            a.displayInfo();
            System.out.println("Âm thanh: " + a.makeSound());
            System.out.println();
        }
    }
}
