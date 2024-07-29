package project;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class LerArquivos {
     public static void ler() {
          Path pasta = Paths.get("src\\TwitterLanguages");
          ListAllLanguages listAllLanguages =  new ListAllLanguages();
          ListUser users = new ListUser();
          try (DirectoryStream<Path> stream = Files.newDirectoryStream(pasta)) {
               for (Path arquivo : stream) {
                    if (Files.isRegularFile(arquivo)) {
                         System.out.println("=================================================");
                         System.out.println("                                              ");
                         LanguageTweet lang = ReaderFile.ler("src\\\\TwitterLanguages\\"+arquivo.getFileName(), users);
                         System.out.println("                                              ");
                         System.out.println("=================================================");
                         listAllLanguages.insertInBeginning(lang);
                    }
               }
          users.print();
          } catch (IOException | DirectoryIteratorException e) {
               System.err.println("Erro ao ler os arquivos: " + e.getMessage());
          }
     }
}
