import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

//public class PasswordHashing
//{
//    public static String encryptPassword(String unencryptedPassword)
//    {
//        String encryptedpassword = null;
//        try
//        {
//            MessageDigest m = MessageDigest.getInstance("MD5");
//            m.update(unencryptedPassword.getBytes());
//            byte[] bytes = m.digest();
//            StringBuilder s = new StringBuilder();
//            for(int i=0; i< bytes.length ;i++)
//            {
//                s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
//            }
//            encryptedpassword = s.toString();
//        }
//        catch (NoSuchAlgorithmException e)
//        {
//            e.printStackTrace();
//        }
//        System.out.println("Plain-text password: " + unencryptedPassword);
//        System.out.println("Encrypted password using MD5: " + encryptedpassword);
//        return encryptedpassword;
//    }
//}