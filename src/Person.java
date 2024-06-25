public class Person  <T>{
    private T id;
    private Integer age;

    public Person(T id, Integer age) {
        this.id = id;
        this.age = age;
    }

    public T getId() {
        return id;
    }
    public Integer getAge() {
        return age;
    }


}
