public  class Person {

    private String name;
    private Integer age;
    private Integer dni;

    public Person(String name, Integer age, Integer dni) {
        this.name = name;
        this.age = age;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Person{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", dni=" + dni +
                 '}';
    }
}
