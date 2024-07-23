package dhiraj.design.builder;

public class Runner {

    public static void main(String[] args) {
        User user = new User.UserBuilder().setUserId("ABC23").setUserName("Dhiru").setEmailId("Dhiraj@gmail.com").build();
        System.out.println(user);
    }
}
