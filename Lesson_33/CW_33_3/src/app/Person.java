package app;

public class Person {
    private String name;
    private int id;
    private boolean flag = true;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public class LoginPassword{
        private String login;
        private int password;
        private boolean flag = false;

        public LoginPassword(){
            login = name;
            password = id;
        }

        public LoginPassword(String login, int password) {
            this.login = login;
            this.password = password;
        }

        public String getLogin() {
            return login;
        }

        public int getPassword() {
            return password;
        }

        public void display(){
            System.out.println(flag); // inner class field
            System.out.println(Person.this.flag); // Outer class fiel
        }
    }
}
