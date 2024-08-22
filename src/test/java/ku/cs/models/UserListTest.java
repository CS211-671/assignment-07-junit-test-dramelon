package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("9nathapat9", "nine9nine");
        userList.addUser("dramelon", "dgmelon");
        userList.addUser("silverroach", "mobilza");

        // TODO: find one of them
        userList.findUserByUsername("dramelon");

        // TODO: assert that UserList found User
        assertEquals("dramelon", userList.findUserByUsername("dramelon").getUsername());
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("9nathapat9", "nine9nine");
        userList.addUser("dramelon", "dgmelon");
        userList.addUser("silverroach", "mobilza");

        // TODO: change password of one user
        boolean actual = userList.changePassword("dramelon", "dgmelon", "d6melon");

        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("9nathapat9", "nine9nine");
        userList.addUser("dramelon", "dgmelon");
        userList.addUser("silverroach", "mobilza");

        // TODO: call login() with correct username and password
        User expected = userList.findUserByUsername("dramelon");
        User actual = userList.login("dramelon", "dgmelon");

        // TODO: assert that User object is found
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("9nathapat9", "nine9nine");
        userList.addUser("dramelon", "dgmelon");
        userList.addUser("silverroach", "mobilza");

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("dramelon", "totallyNotD6");

        // TODO: assert that the method return null
        assertNull(actual);
    }

}