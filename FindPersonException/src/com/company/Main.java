package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Main();
    }
    public Main(){
        Person p1 = new Person("Vladan","Cupric","1103973721018");
        PersonList personList = new PersonList();
        try {
            personList.addPerson(p1);
        }
        catch (JMBGNotTrueException ex){
            System.out.println(ex.getMessage());
        }
        Person p2 = new Person("Vladimir","Jurovic","1203979722018");
        try{
            personList.addPerson(p2);
            Person find = personList.findPersonName("Marko");
        }
        catch (JMBGNotTrueException ex){
            System.out.println(ex.getMessage());
        }
        catch (PersonNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}
