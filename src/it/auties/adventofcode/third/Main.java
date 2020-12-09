package it.auties.adventofcode.third;

import it.auties.adventofcode.shared.FileUtils;

import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    final var data = FileUtils
      .readFile("third.txt")
      .orElseThrow()
      .map(entry -> {
        var split = entry.replace(":", "").split(" ");
        var first = split[0].split("-");
        return new Policy(split[2], split[1].charAt(0), Short.parseShort(first[0]), Short.parseShort(first[1]));
      })
      .collect(Collectors.toSet());


    var correctFirst = data
      .stream()
      .filter(entry -> {
        var count = 0;
        for(var c : entry.input().toCharArray()){
          if(c == entry.letter()){
            if(++count > entry.max()){
              return false;
            }
          }
        }

        return count >= entry.min();
      })
      .count();

    var correctSecond = data
      .stream()
      .filter(entry -> entry.input().charAt(entry.min() - 1) == entry.letter() ^ entry.input().charAt(entry.max() - 1) == entry.letter())
      .count();

    System.out.println(correctFirst);
    System.out.println(correctSecond);
  }
}
