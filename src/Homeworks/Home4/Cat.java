package Homeworks.Home4;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Cat {
    private String name;
    private int age;





    public void setName() {
        this.name = new Scanner(System.in).next();
    }

    public String getName() {
        return name;
    }

    public void setAge() {
        this.age = new Scanner(System.in).nextInt();
    }

    public int getAge() {
        return age;
    }
    public Cat(){
        this.name = randomText();
        this.age = randomAge();

    }
    public Cat(String s, int i) {
        this.name = s;
        this.age = i;
    }
private int randomAge(){
        int a = (int) (Math.random()*(28-1+1)+1);
return a;
}

    private String randomText() {
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 6;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(generatedString);
        return generatedString;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "cat name is'" + name + '\'' +
                ", its age is " + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
