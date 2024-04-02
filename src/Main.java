
class Main {
    public static void main(String[] args) {
        Person person = new Person("Denis", 30, 240);
        person.printPersonInfo();
    }
}

class Person {
    String name;
    public int age;
    public int height;

    public void printPersonInfo() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getHeight());
    }

    public void setName(String name) {
        if (name.length() > 5 && name.length() < 15) {
            this.name = name;
        } else {
            System.err.println("Большое имя!Исправьте");
        }
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.err.println("Возраст должен быть больше 0 и меньше 100.");
        }
    }

    public void setHeight(int height) {
        if (height >= 120 && height <= 220) {
            this.height = height;
        } else {
            System.err.println("Рост не коректный,исправьте");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public Person(String name, int age, int height) {
        setName(name);
        setAge(age);
        setHeight(height);
    }

}
