public class Initials {
    public static void main(String[] args) {
        String fullName = "Yuriy Orestovych Ivaniuk";
        StringBuffer myInitials = new StringBuffer();
        int length = fullName.length();
        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(fullName.charAt(i))) {
                myInitials.append(fullName.charAt(i));
                myInitials.append('.');
            }
        }
        System.out.println(myInitials);
    }
}