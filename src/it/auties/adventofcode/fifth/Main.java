package it.auties.adventofcode.fifth;

import it.auties.adventofcode.shared.FileUtils;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    final var results = new HashSet<Passport>();
    final var buffer = new HashMap<String, String>();
    FileUtils
      .readLines("fifth.txt")
      .orElseThrow()
      .forEach(line -> {
        if(line.isBlank()){
          add(results, buffer);
          return;
        }

        Arrays
          .stream(line.split(" "))
          .forEach(entry -> {
            var split = entry.split(":");
            buffer.put(split[0], split[1]);
          });
      });

    add(results, buffer);

    var nonStrict = results
      .stream()
      .filter(e -> e.isValid(false))
      .count();

    var strict = results
      .stream()
      .filter(e -> e.isValid(true))
      .count();

    System.out.println(nonStrict);
    System.out.println(strict);
  }

  private static void add(Set<Passport> results, Map<String, String> buffer){
    if(buffer.isEmpty()){
      return;
    }

    var entry = Passport.fromMap(buffer);
    results.add(entry);
    buffer.clear();
  }
}
