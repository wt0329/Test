package z.test;

import java.lang.reflect.Constructor;

class Person {
    public String name; // public 필드
    private int age; // private 필드

    public static int height = 180; // static 필드

    // 이름, 나이를 입력받는 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 기본 생성자
    public Person() {
    }

    public void getField() {
        System.out.printf("이름 : %s, 나이 : %d\n", name, age);
    }

    // public 메소드
    public int sum(int left, int right) {
        return left + right;
    }

    // static 메소드
    public static int staticSum(int left, int right) {
        return left + right;
    }

    // private 메소드
    private int privateSum(int left, int right) {
        return left + right;
    }
    
    public static void main(String[] args) throws Exception {
        // 클래스 객체 가져오기 (forName 메소드 방식)
        Class<Person> personClass = (Class<Person>) Class.forName("z.test.Person"); //클래스 생성

        // 생성자 가져오기 - Person(String name, int age)
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class); // getConstructor 인자로 생성자의 매개변수 타입을 바인딩 해주어야 한다.

        // 가져온 생성자로 인스턴스 만들기
        Person person1 = constructor.newInstance("홍길동동", 55);
        person1.getField(); // 이름 : 홍길동, 나이 : 55
    }
}
