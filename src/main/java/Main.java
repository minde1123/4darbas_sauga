import java.io.File;

public class Main {
    public static void main(String[] args) throws CryptoException {
        String Filename = "testas";
        String Name = "jaja";
        String Pass = "slapt";
        //String key = "Labadiena";
        //File file1 = new File(Filename + ".csv");

        //if(ToCsv.Exist(Filename))ToCsv.ToCsvE(Filename, Name, Pass);
        //else ToCsv.ToCsvN(Filename, Name, Pass);

        //System.out.println(Line);
        //ToCsv.EncryptCsv(Filename);
        //ToCsv.DecryptCsv(Filename);
        new Login().setVisible(true);
    }
}
