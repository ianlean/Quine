import java.io.*;
import java.util.*;

public class Worm4{

    static int count =4;
    static String s = """
  public static void main(String[] args) throws IOException {
      if (count == 0) {System.exit(0);}
      char[] put = s.toCharArray();
      File file = new File("./src/Worm" + (count-1) + ".java");
      FileWriter fw = new FileWriter(file);
      //Before s
      fw.write(
          "import java.io.*;\n" +
              "import java.util.*;\n" +
              "\n" +
              "public class Wormcount-1 {\n" +
              "\n" +
              "    static int count = count-1;\n" +
              "    static String s = \"\"\"SELF\"\"\";".replace("SELF", s)
      );
      fw.write(put);
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
""";
  public static void main(String[] args) throws IOException {
      if (count == 0) {System.exit(0);}
      char[] put = s.toCharArray();
      File file = new File("./src/Worm" + (count-1) + ".java");
      FileWriter fw = new FileWriter(file);
      //Before s
      fw.write(
          "import java.io.*;\n" +
              "import java.util.*;\n" +
              "\n" +
              "public class Wormcount-1 {\n" +
              "\n" +
              "    static int count = count-1;\n" +
              "    static String s = \"\"\"SELF\"\"\";".replace("SELF", s)
      );
      fw.write(put);
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
