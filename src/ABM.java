import java.util.*;

public class ABM {
    private HashMap<Integer, Person> people;
    private List<Person> persons = new ArrayList<>();

    public ABM() {
        this.people = new HashMap<>();
    }

       public void Alta(Person p) {
        people.put(p.getDni(), p);
    }

    public void Baja(Integer dni) {
        people.remove(dni);
    }

    public void Modifica(Integer dni, String newName, Integer newAge) {
        Person p = people.get(dni);
        if (p != null) {
            p.setName(newName);
            p.setAge(newAge);
        }

    }

    public void AddPerson(Person p) {
        people.put(p.getDni(), p);
    }

    public void AddPersonList(List<Person> personList) {
        for (Person p : personList) {
            people.put(p.getDni(), p);
        }
    }

    public List <Person> OrderByAge (){
        List<Person> personList = new ArrayList<>(people.values());
        personList.sort(Comparator.comparingInt(Person::getAge));

        return personList;
    }

    public void ShowPeople(){
        for (Person p : people.values()){
            System.out.println(p);
        }
    }
}
