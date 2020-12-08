package it.auties.adventofcode.fourth;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    var input = """
      ...............#.#.............
      ##..#....................#...##
      ......#..#.#.....#..#.#.##.....
      .........#...#..............#.#
      ............#.......##.........
      ...#.....#.....#...#.....#..#..
      ..............#..##.#..#......#
      .##.....#.....#......##.#......
      .#..........###....#...##....#.
      .....#....#.#.......#......##..
      .#....#......#.......#........#
      ..#.#.......#..##.....##.......
      ...#.#....#.......#.......#...#
      ##.##...##..#......#.#.....#..#
      .#.#.......#..#.#......#...#.#.
      #.......##.......#...#.........
      .....#......#.#.#.....#....##..
      .#.#........#....#..#..#.......
      ...#....#..###.........#.....#.
      ........#........#........#....
      ..##..............#.....#.#..#.
      .#...##.............#.#........
      ....#..#...........#.......#...
      ..#....#.....................#.
      #.#..................##......##
      .#.##....#......#........#.....
      .........##.....#....#...##..#.
      #..........#..#.#.............#
      .........#...#.#.#.#..##..##...
      #...#.....#..#..#....#...#.....
      ..##.....#..................#..
      #..###.....#....#.......#..#...
      ...##.##..#............#......#
      ........###.........###......#.
      #..##....#.........#.........#.
      ....#.....................#....
      #..#..##..#..####.##..#.....##.
      ..#...#.#....#....##.....#.....
      ...#.#.........#.....#.#.......
      ....#................#..#...##.
      ....#..#..........#...#.#.##...
      ........#..##............#....#
      ...#......##..........#.##...#.
      .......##......................
      .......##..........#....#.#...#
      ......###.##..##..#....#...#..#
      #.#...........##.....#........#
      ..#...........#..###....#.#.#..
      ........#...........#......##..
      .........#...##.###...###..#...
      .....#.....#..##.........##....
      ...##..............#.....#...##
      .##....#.......###.....#.......
      .#...........##.............##.
      ......#..#..##.##......#......#
      ........###........#......#.#..
      #.#....#.....#........#......#.
      .##..#.........##...##....#....
      .....#.........#...##.....#....
      .............#........###....#.
      ......#.......#.#........#.#...
      ..#....#.#...#....#...#.#...##.
      #...#......##..##......#.##.###
      ...##.#....#...#....#.........#
      ...#..####.....##.#..#.#...##..
      ##.#..#....##......#......##...
      ###.........#.#..#.#.....#.....
      ...#........#..##...#.#.#..#.#.
      ...###..#.###.#...#............
      ....................###........
      ...........#...........#.......
      #..............#.#.........###.
      ....................##.....#..#
      #.#.....#.......#...#..........
      .#...#......#....##...#...#....
      .....#.##..................###.
      .........#.#..#.#......#.......
      .......#.....##..#.##.#........
      ..#..........#.###.....#....#..
      ......#.............#.#........
      ........##....#........#.......
      ...#.............#....#.#......
      #........#..####.....#.....#.#.
      .##......##...#........#..#.#..
      ....##....#...#...#..##...#.#..
      #.##...###..#....##.#..........
      ....#.#...#.#...#..##.###...#..
      #.....##..#..#....#.#.....##...
      .#..#..........##.#.....##.....
      .#..#........#.#.#.#...........
      .#..#.....#...........#...#....
      ...#......##..........##..#....
      ...#..#....#.##...#..#.....###.
      #.#....#.....##................
      #..#......#.#.#.......#........
      ......#....#.#....#..##....#..#
      .#.....#.#....###.##.........#.
      .###..#.....#........#.#.......
      .#...#......#..#.#......#.....#
      #...............####...#.....#.
      .......#..........##.#........#
      #........##....##.....###..##..
      #..#.....#..##.....#....#..#...
      #.....#.......##......#.#.....#
      #.##..#......##..#.............
      ##...#.....#........##.........
      ....#..##....#...#.......#.#...
      ....#...#...##..#....#..#...#..
      ..............#.#...#....###...
      ...#....#..##...##..#....##....
      #.##.#..#..#......#.#.#.#...#..
      .......#..#..##........#......#
      ##.#....#....##.#......##.#....
      .#...#..............#........#.
      .#.#....#.........#............
      .#..#..###.............#....#..
      #......#...#.#..##..#...#....#.
      .......................#...#.#.
      .............#..#...##.........
      ..#.#..#....#....#........#....
      #......#.##..#...#.#...........
      .....#....#...........##.#..#..
      ..#.#.....#..............#.#...
      #.......#.....#................
      #..............#...#....#...#..
      ...#...##..#..#............#...
      ......###.....................#
      .........#.......##..#....#....
      ........#...#.##..#.##......#..
      ....###..#.#...#...#..#.#...###
      ##...#...##.#...#.#...#.#....#.
      .........#...#.....###.........
      ...#........##..#.......##.....
      .#.......##.........#.....##..#
      .#..................#...#......
      .##..#..#.#.....#.###..........
      ...#.....##..#.........#...#...
      .#......#.#.......#.#..........
      .........#.#...#..........#.#..
      #..........#.##..#.##....#.....
      .#.#....#.....#..##.....#...#..
      ..#........##...##..#..#....#..
      #...........##....#..###....#..
      ...........##.........####...#.
      ..#........###...#.#.........#.
      .#...............#.##.#.#...#..
      .#.##..#.....#.#.....##..#.....
      ...#...#..#.##.##...#.......##.
      ..#...#...#......##.##.##...#..
      ##....#...#...#...............#
      ...##...........#......#..#.#..
      #.........#......#.#.##.....#..
      ........#..#.........##........
      ..#.#....###.....##..#...#.....
      .........#...#.......#.....##..
      ##.....................#...##..
      .#.#..#......#.................
      .....###..#......#..###..#.....
      ...#.....##.........#......#..#
      ......##.....#...#........#.#..
      ..#.#...#......#...#.##.##.....
      ...#..........#...#.......#..##
      .###........#........##........
      ..#.#.#..........#.#...##......
      .........#........#......###..#
      ....##..#.........#...........#
      ..####..#............##.......#
      .....##.#..##.........#...#.#..
      ...#.........#.....#.....#.....
      .......#...#..#...##.........#.
      ...#...#..#...#....#..#........
      #............##.##...#.........
      .#.#.....#.......####.....#....
      ..............#......#.#.......
      ..............#...........#...#
      #...#........###....#.#....#.#.
      ##.#..#..#......#......#.#.#...
      .#..#.....#..#.#..#.#.......##.
      ......##.#...#...#......#...#..
      #...........##....#.#..........
      ....#.......###.#...#..........
      .......................#.....#.
      ........#...#..#...#.#.#.#.#...
      .#.#...........#......##...#...
      .........................#.....
      .................#.##.#...##...
      ...#...##.....#.....##....#.#..
      ...#...#...................#...
      ...#..#..#...#...#....#........
      #....#...#.....#...............
      .......#...........#...#.......
      ....#....#.....##.......#......
      .......#..........##...........
      .#.#........#..##....#......#..
      .....#.......#.#.........#...#.
      .#..####.#.#...............#..#
      .....###..#..#..........#.#..##
      ..#.......#...#.....##..#..#.#.
      #....#......#..................
      ........#.##.#....#...........#
      ....#.#....##..#.#.....##......
      ...#..#.......#....#.....#.#.#.
      #...#......#.....#.#..........#
      ....#....#...............#.....
      ..###......................###.
      .##....#..#.......###.....#..#.
      ..###............#........#.##.
      .#........#......#.....#..#....
      ....#..##...#...#.###.......#.#
      .......#.##...........#.#..#...
      .....#...##....................
      ....#....#...##......#.........
      ..#............##....###.#...#.
      .#........#...............#....
      #..#.#.##.........#..##....##..
      #.#....#..#.##....##...#.#.....
      .....#.....##....#.#........#..
      #..#...#...#....#....#.........
      ...#........#..#.#.....##......
      ..#...#...#................##..
      #........#.#.##.......#.#...#..
      #......#..####.##.....#.#..#.#.
      ............#..#.#....#......##
      ..#.....##....#...#.#..........
      ...#...#.........#...#.#.......
      .###..#.......##.##.....#.#.#..
      ...#....#...............##.#...
      ....##..#..#..#.#......##.....#
      #.#..............##...##...####
      .....#.##...#.#...............#
      .##.....#.........#.......#.#.#
      #.#..#.....#.......#.......#..#
      ...#.#.....#.....#......#......
      .......#....#..#.#..........#..
      ......#......#.##...#..........
      .....#.......###...#...#.#.....
      #..#.#.........#.....#.##....#.
      ..#.#.........#..#..#..#.....#.
      .#..##..#..#....#......#.##..#.
      ...##......###.....#.##.##.....
      .#.....#...#..#...#............
      ##..##..#.##....#..#...........
      ...#..##..#..#.............#.##
      ...............##............#.
      ..#.....##........##.#...#....#
      .#.#...#.#.#..#.#.....#....#...
      .#....#...............#..#.....
      ....#.##..#....#......#...###..
      #................###...#.#.....
      ...#...#......##..#.#....#.....
      .#....#....#.#...##............
      ....#...##..#..#........#.##...
      ..##.....#..#..##..............
      ..#..##..#.#..##....#....#....#
      ...##.............#............
      #....#....#.#........#.....##.#
      .....#..#.#.....####...###.....
      ................#......#.......
      .....#.#.#.#.#....#..#........#
      .##.#...#.#.......##....#....#.
      .....#........#................
      ..#.....#..#...#..#...........#
      .#.....#...##.....##..#.#....##
      ......#.......#..#......##.#...
      #.#..........#.##.#........#...
      ...#..#.............#..........
      #..#..#..........#..##.#.......
      .#..#...............####..#....
      .......#.....#......#.....#.#..
      .#...............#...#.........
      .#..#..........#..#.#..##..#..#
      ......##..#.....#..#......###..
      ..........#...#..#.......#.....
      .#.#.#..#.....#.##.#...#..#....
      ........#.......#.....#.#......
      ......#.....##.....#....##.#...
      ...............#......#.......#
      ..#.#...#.....#.#...##......#..
      #.#.........#.#...#........####
      #..........##..#..#........##..
      .............#..#.......##.#..#
      ..#........#.#....#........#.#.
      .#......####..#..#.............
      ............###.......#.#..#...
      #.##......##...#...#.........#.
      ....##.#.#.#......#....#..#...#
      .#..#.#....#...#.........#.....
      #...#.....##............#...#..
      #.#...#..#.................#...
      ............#.#..#.....#.#.#..#
      ...................#....#.##...
      .....#...#.#....#....#.#......#
      .......##.#.#......##..........
      .#..#...##.#...#..#......#.....
      ......#.#..#..###..##..##......
      .#.#.#.#.....#...###.....#..#..
      .#....#.....#.......#.......#..
      ..........##.........####......
      .#.#.............#..#.#...#....
      ........#........##...#.#....#.
      ........#......................
      ..#.#....#...............#...##
      .......#.#...#..#.....##......#
      .#...#....#..........##........
      .#.........#.#............##...
      .....#......##...#.......#..#..
      #.#..#.............#...#...#...
      ......#.......#............#...
      ...........##....#......##.....
      .#.#..#.....................#..
      ##..##.....###..##.#...........
      ...##......##....#...##.....#..
      #...#.##.............#.........
      ......#..#.........###.#......#
      #.#.....#.....................#
      ....#####.....##........#.#..#.
      ...........##..##.###..........
      ..........##.....#........#...#
      .......#..#......#.....##..##.#
      .....##.#........#.........#...
      ......##......................#
      .#.......#.#.#............#..#.
      .....##.#.......#.#........#...
            """.split("\n");
    final var data = Arrays.stream(input).map(s -> s.chars().mapToObj(e -> (char) e).mapToInt(e -> e == '#' ? 1 : 0).toArray()).toArray(int[][]::new);


    System.out.println(getNumOfTrees(data, 1, 1));
    System.out.println(getNumOfTrees(data, 3, 1));
    System.out.println(getNumOfTrees(data, 5, 1));
    System.out.println(getNumOfTrees(data, 7, 1));
    System.out.println(getNumOfTrees(data, 1, 2));
  }

  private static long getNumOfTrees(int[][] data, int right, int down){
    var trees = 0;
    for(var x = down; x < data.length; x += down){
      trees += data[x][x / down * right % data[0].length];
    }

    return trees;
  }
}
