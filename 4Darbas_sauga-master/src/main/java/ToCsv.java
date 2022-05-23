        import java.io.*;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.util.Scanner;

        public class ToCsv {

    public static void ToCsvE(String FileName, String Name, String Pass) {

        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(new File(FileName + ".txt"), true));
            StringBuilder sb = new StringBuilder();
            sb.append("\r\n");
            sb.append(Name);
            sb.append(" ");
            sb.append(Pass);
            pw.append(sb.toString());
            pw.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
            public static void ToTxtPersonal(String FileName, String Name, String Pass, String app, String Koment) {

                try {
                    PrintWriter pw = new PrintWriter(new FileOutputStream(new File(FileName + ".txt"), true));
                    StringBuilder sb = new StringBuilder();
                    sb.append("\r\n");
                    sb.append(Name);
                    sb.append(" ");
                    sb.append(Pass);
                    sb.append(" ");
                    sb.append(app);
                    sb.append(" ");
                    sb.append(Koment);
                    pw.append(sb.toString());
                    pw.close();
                } catch (Exception e) {
                }
            }
    public static void ToCsvN(String FileName, String Name, String Pass) {

        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(new File(FileName + ".txt")));
            StringBuilder sb = new StringBuilder();
            sb.append(Name);
            sb.append(" ");
            sb.append(Pass);
            pw.append(sb.toString());
            pw.close();
        } catch (Exception e) {
        }
    }

    public static boolean Exist(String Filename) {
        File f = new File(Filename + ".txt");
        if(f.exists()) return true;
        else return false;
    }

    public static String ReadCsv(String FileName)
    {
        String Line = "";
        String FileLine = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(FileName));

                 FileLine = Files.readString(Path.of(FileName));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return FileLine;
    }
    public static void EncryptCsv(String FileName)
    {
        String Text = ToCsv.ReadCsv(FileName + ".txt");
        String uzsifruotas = AES.encrypt(Text);
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(new File(FileName + ".txt")));
            pw.append(uzsifruotas);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void DecryptCsv(String FileName)
    {
        String Text = ToCsv.ReadCsv(FileName + ".txt");
        String uzsifruotas = AES.decrypt(Text);
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(new File(FileName + ".txt")));
            pw.append(uzsifruotas);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}


