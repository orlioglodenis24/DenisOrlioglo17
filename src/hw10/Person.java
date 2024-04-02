package hw10;

/*
Создайте класс Person с переменными: name, age, height. Для данного класса используйте инкапсуляцию.
 Длина имени должна быть больше 3 и меньше 15.
  Возраст должен быть больше 0 и меньше 100 и рост должен быть не меньше 120 и не больше 220.
  Создайте  метод printPersonInfo, который будет выводить информацию о человеке, при этом не используя переменные класса напрямую.
  В классе Main создайте объект класса Person и вызовите метод printPersonInfo со всеми заполненными значениями.
 */


class Person {
    String name;
    public int age;
    public int height;

    public Person(String name, int age, int height) {
        setName(name);
        setAge(age);
        setHeight(height);
    }

    public void setName(String name) {
        if (name.length() > 3 && name.length() < 15) {
            this.name = name;
        } else {
            System.out.println("большое имя!исправьте");
        }
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("Возраст должен быть больше 0 и меньше 100.");
        }
    }

    public void setHeight(int height) {
        if (height >= 120 && height <= 220) {
            this.height = height;
        } else {
            System.out.println("рост не коректный,исправьте");
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

    public void printPersonInfo() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getHeight());
    }
}

