package de.neuefische;

public class Main {
    public static void main(String[] args) throws UserLoginException {
        User u = new User();

        System.out.println(u.login("admin"));
    }


}