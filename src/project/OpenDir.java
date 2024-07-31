package project;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OpenDir {
     public static void open() {

          Path folder = Paths.get("src\\TwitterLanguages");
          ListAllLanguages listAllLanguages = new ListAllLanguages();
          ListUser users = new ListUser();

          try (DirectoryStream<Path> stream = Files.newDirectoryStream(folder)) {
               for (Path archive : stream) {
                    if (Files.isRegularFile(archive)) {
                         System.out.println("=================================================");
                         System.out.println("                                              ");
                         String archiveName = archive.getFileName().toString();
                         LanguageTweet lang = ReaderFile.read("src\\\\TwitterLanguages\\" + archive.getFileName(), users, archiveName);
                         System.out.println(archive.getFileName());
                         listAllLanguages.insertInBeginning(lang);
                         System.out.println("=================================================");
                    }
               }
               users.print();
          } catch (IOException | DirectoryIteratorException e) {
               System.err.println("Erro ao ler os arquivos: " + e.getMessage());
          }
     }
}
