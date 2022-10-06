package sepb_river;

import java.time.Period;

public class Person {
    Person mother;
    Person father;
    Person[] siblings;
    Person spouse;



    public Person (Person mother, Person father) {
        this.mother=mother;
        this.father=father;
        siblings = new Person[] {};
    }

    /**
     * Adjusts the length of the caller's sibling array and
     * adds the given Person
     */
    public void addSibling(Person toAdd) {
        if(toAdd.isSibling(this)) {
            Person[] updateSiblings = new Person [siblings.length+1];
            int i=0;

            for(;i<siblings.length+1;i++) {
                updateSiblings[i]=siblings[i];
            }

            updateSiblings[i]=toAdd;
            siblings=updateSiblings;
        }
        else {
            return;
        }
    }

    /**
     * Checks whether the given Person shares a parent with the caller.
     */
    private boolean isSibling(Person stranger) {
        if(this.mother==stranger.mother||this.father==stranger.father) {
            return true;
        }
        return false;
    }

    /**
     * Checks whether a given Person is the caller's sibling
     * before adding them as a spouse.
     */
    public void addSpouse(Person toMarry) {
        if(isSibling(toMarry)) {
            System.out.print("Don't");
        }
        else {
            spouse = toMarry;
        }
    }
    public static void main(String[] args) {
        Person irada = null;
        Person papa = null;
        Person fira = new Person(irada, papa);
    }
}

//There are no problems in this code