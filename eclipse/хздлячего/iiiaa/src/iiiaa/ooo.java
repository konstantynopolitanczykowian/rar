package iiiaa;

import java.util.*;


import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;

public class ooo {

 public static void main(String[] args) {

 String s = "Евсеев К. ИС-219";
 byte data[] = s.getBytes();
 Path p = Paths.get("./logfile.txt");

 try (OutputStream out = new BufferedOutputStream(
 Files.newOutputStream(p, CREATE, APPEND))) {
 out.write(data, 0, data.length);
 } catch (IOException x) {
 System.err.println(x);
 }
 }
}
