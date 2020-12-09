package it.auties.adventofcode.second;

import it.auties.adventofcode.shared.FileUtils;

import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    final var match = 2020;
    final var data = FileUtils
      .readFile("second.txt")
      .orElseThrow()
      .mapToInt(Integer::parseInt)
      .boxed()
      .collect(Collectors.toSet());

    // This could be also fully functional by using Collection#forEach instead of a classic for each block
    // and by replacing the if statement with Optional#ifPresent. This though reduces performance as the
    // problem clearly states that there is only a solution and there is currently no way to break out of a
    // forEach stream.
    for (var x : data) {
      var found = data
        .stream()
        .filter(y -> data.contains(match - x - y))
        .findFirst()
        .map(y -> x * y * (match - x - y));

      if (found.isPresent()) {
        System.out.println(found.get());
        break;
      }
    }
  }
}
