package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("lombok");
        helloLombok.setAge(11);

        System.out.println("helloLombok.name = " + helloLombok.name);
        System.out.println("helloLombok.age = " + helloLombok.age);

        System.out.println("helloLombok = " + helloLombok);
    }
}
