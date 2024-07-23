package dhiraj.design.iterator;

public class Main {
    public static void main(String[] args) {

        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("Dhiraj", "1234"));
        userManagement.addUser(new User("ohiraj", "1236"));
        userManagement.addUser(new User("phiraj", "1234"));
        userManagement.addUser(new User("chiraj", "1237"));

        MyIterator myIterator = userManagement.getIterator();

        while(myIterator.hasNext()) {
            User user = (User) myIterator.next();
            System.out.println(user.getName());
        }
    }
}
