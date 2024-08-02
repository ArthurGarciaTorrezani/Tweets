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
          ListAllLanguages allLanguages = new ListAllLanguages();
          ListUser users = new ListUser();

          try (DirectoryStream<Path> stream = Files.newDirectoryStream(folder)) {
               for (Path archive : stream) {
                    if (Files.isRegularFile(archive)) {
                         String archiveArr[] = archive.getFileName().toString().split("_");
                         String archiveName = archiveArr[0];
                         LanguageTweet lang = ReaderFile.read("src\\TwitterLanguages\\" + archive.getFileName(), users, archiveName);
                         allLanguages.insertInBeginning(lang);
                    }
               }
               // allLanguages.print();
               System.out.println(users.amount);
               users.print();
          } catch (IOException | DirectoryIteratorException e) {
               System.err.println("Erro ao ler os arquivos: " + e.getMessage());
          }
     }
}
