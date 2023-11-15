package homework16;

public class Email {
    public static void findEmails(String s) {
        String[] mails = s.split(";");
        for (String mail: mails) {
            int atIdx = mail.indexOf("@");
            int dotIdx = mail.indexOf(".");
            System.out.println(mail.substring(atIdx + 1, dotIdx));
        }
    }
    public static void main(String[] args) {
        findEmails("ya@yahoo.com; on@mail.ru; ona@gmail.com");
    }
}
