package it.auties.adventofcode.first;

import it.auties.adventofcode.shared.FileUtils;

import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    final var match = 2020;
    final var data = FileUtils
      .readFile("first.txt")
      .orElseThrow()
      .mapToInt(Integer::parseInt)
      .boxed()
      .collect(Collectors.toSet());

    data.stream().filter(entry -> data.contains(match - entry)).findFirst().ifPresent(entry -> System.out.println(entry * (match - entry)));
  }
}
