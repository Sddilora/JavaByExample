import java.time.LocalDate;

class AccessClasses {
    public static void main (String[] args) {
        User youngerUser = new User();

        youngerUser.name = "Sdd";
        youngerUser.birthday = LocalDate.parse("2002-06-08");

        System.out.printf("%s was born back in %s ", youngerUser.name, youngerUser.birthday.toString());
    }
}
