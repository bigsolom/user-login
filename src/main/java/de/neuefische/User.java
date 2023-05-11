package de.neuefische;

public class User {
    public boolean login(String username) throws UserLoginException {
        switch (username) {
            case "admin":
                return true;
            case "stalker":
                throw new BlockedUserException();
            default:
                throw new WrongUsernameException();
        }
    }
}
