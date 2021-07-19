package com.sda.conccurancy.exercise2.repository;

import com.sda.conccurancy.exercise2.model.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PersonRepository {

    private Map<Integer, Object> locks = new ConcurrentHashMap<>();
    private Map<Integer, Person> personsById = new HashMap<>();
    private Map<String, Integer> personIdsByName = new HashMap<>();
    private Map<String, Integer> personsIdsByAddress = new HashMap<>();
    private Map<String, Integer> personsIdsByPhoneNumber = new HashMap<>();

    public void addPerson(Person person) {

        locks.putIfAbsent(person.getId(), new Object());
        synchronized (locks.get(person.getId())) {
            personsById.put(person.getId(), person);
            personsIdsByAddress.put(person.getAddress(), person.getId());
            personsIdsByPhoneNumber.put(person.getPhoneNumber(), person.getId());
            personIdsByName.put(person.getName(), person.getId());
        }

    }

    public void deletePersonById(Integer id) {
        locks.putIfAbsent(id, new Object());
        synchronized (locks.get(id)) {
            Person person = personsById.get(id);
            if (person != null) {
                personIdsByName.remove(person.getName());
                personsIdsByAddress.remove(person.getAddress());
                personsIdsByPhoneNumber.remove(person.getPhoneNumber());
                personsById.remove(id);
            }
        }

    }

    public Person searchPersonByName(String name) {

        Integer id = personIdsByName.get(name);

        if (id != null) {
            locks.putIfAbsent(id, new Object());
            synchronized (locks.get(id)) {
                id = personIdsByName.get(name);
                if (id != null) {
                    Person person = personsById.get(id);
                    return person;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }
    public int getSize() {
        return personsById.size();

    }

}

