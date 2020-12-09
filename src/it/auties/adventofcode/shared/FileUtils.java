package it.auties.adventofcode.shared;

import it.auties.adventofcode.first.Main;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FileUtils {
  public static Optional<Stream<String>> readFile(String name) {
    try {
      var url = Main.class.getClassLoader().getResource(name);
      if (url == null) {
        return Optional.empty();
      }

      return Optional.of(Files.lines(Paths.get(url.toURI())));
    } catch (IOException | URISyntaxException e) {
      return Optional.empty();
    }
  }

  public static Optional<List<String>> readLines(String name) {
    try {
      var url = Main.class.getClassLoader().getResource(name);
      if (url == null) {
        return Optional.empty();
      }

      return Optional.of(Files.readAllLines(Paths.get(url.toURI())));
    } catch (IOException | URISyntaxException e) {
      return Optional.empty();
    }
  }
}
