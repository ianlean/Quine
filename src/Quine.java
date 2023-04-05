import java.io.*;
import java.util.*;

public class Quine {

    static int count = 5;
    static String s =
"""
           
          public static void main(String[] args) throws IOException {
              if (count == 0) {System.exit(0);}
              char[] put = s.toCharArray();
              File file = new File("./src/Worm" + (count-1) + ".java");
              FileWriter fw = new FileWriter(file);
              //Before s
              fw.write(
                  "import java.io.*;\\n" +
                      "import java.util.*;\\n" +
                      "\\n" +
                      "public class Wormcount-1 {\\n" +
                      "\\n" +
                      "    static int count = count-1;\\n" +
                      "    static String s = \\"\\"\\"SELF\\"\\"\\";".replace("SELF", s)
              );
              fw.write(put);
              fw.close();
               String path = file.getAbsolutePath();
              try {
                 Runtime.getRuntime().exec("java \\"" + path + "\\""); //javac is automatically called
              } catch (IOException e) {
                   System.out.println(e.getMessage());
                   System.exit(1);
               }
             System.out.println("made it");
            }
        }
          """;

    public static void main(String[] args) throws IOException{
        if (count == 0) {System.exit(0);}
        //s = s.replace(("count-1"), Integer.toString(count-1));
        char[] put = s.toCharArray();
        File file = new File("./src/Worm" + (count-1) + ".java");
        FileWriter fw = new FileWriter(file);

        //Before put
        fw.write(
                "import java.io.*;\n" +
                "import java.util.*;\n" +
                "\n" +
                "public class Worm" + (count-1) + "{\n" +
                "\n" +
                "    static int count =" + (count-1) + ";\n" +
                "    static String s = \"\"\"SELF\"\"\";".replace("SELF", s)
        );
        //Write put
        fw.write(put);

        //After s
//        fw.write(s.replace("'", "\"").replace("[COUNT]", count + "").replace()); //TODO

        //fw.fw(s);
        fw.close();
        String path = file.getAbsolutePath();
        try {
            Runtime.getRuntime().exec("java \"" + path + "\""); //javac is automatically called
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        System.out.println("made it");
    }
}

//        for (int i = 0; i < s.length(); i++) {
//        char curr = s.charAt(i);
//        switch (curr) {
//        case '\"':
//        write.write("\\\"");
//        break;
//        case '\\':
//        write.write("\\\\");
//        break;
//default:
//        write.write(curr);
//        }
//        }