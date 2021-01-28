package com.company;

import java.util.ArrayList;

public class PersonList {

    ArrayList<Person> persons = new ArrayList<Person>();

    public void addPerson(Person p) throws JMBGNotTrueException {
        if (p.getJmbg().length() != 13) {
            throw new JMBGNotTrueException("JMBG not true");
        } else {
            persons.add(p);
        }
    }
    public Person findPersonName(String name) throws PersonNotFoundException {
        int idPerson = -1;
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getFirstName().equals(name)) {
                idPerson = 1;
            }
            if (idPerson == -1) {
                throw new PersonNotFoundException();
            } else {
                return persons.get(idPerson);

            }
        }


        return persons.get(idPerson);
    }
}
