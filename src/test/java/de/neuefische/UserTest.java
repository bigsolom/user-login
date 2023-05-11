package de.neuefische;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    User app;

    @BeforeEach
    public void setUp(){
        app = new User();
    }

    @Test
    public void login_whenGivenAdminUser_shouldReturnTrue() throws Exception {
        assertTrue(app.login("admin"));
    }

    @Test
    public void login_whenGivenStalker_shouldThrowBlockedUserException() throws Exception {
        assertThrows(BlockedUserException.class, () -> {
            app.login("stalker");
        });
    }

    @Test
    public void login_whenGivenWrongUser_shouldThrowWrongUsernameException() throws Exception {
        assertThrows(WrongUsernameException.class, () -> {
            app.login("foo");
        });
    }

}
