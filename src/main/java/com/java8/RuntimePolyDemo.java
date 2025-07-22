package com.module1;


/*
 * Runtime polymorphism can't be achieved by data members.
 * Since methods can be overridden bu data members or instance variables can't be overridden
 *
 *So even if you try to access variables from parent reference object, the variable of parent
 * will only be called and not of child.
 *
 * If child does not override the methods then also parent's method is invoked
 * */
public class RuntimePolyDemo {
    public static void main(String[] args) {

//        Dog dog = new Dog();
//        dog.specialCapabilities();
        System.out.println("-----------------------------------------------------");
        Dog dogRef = new Labrador();
        System.out.println(dogRef.color);
        dogRef.specialCapabilities();

        System.out.println("-----------------------------------------------------");
        Dog labrador = new Labrador();
        System.out.println(labrador.color);
        labrador.specialCapabilities();


    }
}
