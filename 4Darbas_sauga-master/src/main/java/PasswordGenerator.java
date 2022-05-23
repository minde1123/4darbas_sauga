public class PasswordGenerator {


       public static String getPassword(int n)
        {

            String password = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

            StringBuilder sb = new StringBuilder(n);

            for (int i = 0; i < n; i++) {


                int vienetas = (int)(password.length() * Math.random());

                sb.append(password.charAt(vienetas));
            }

            return sb.toString();
        }


}
