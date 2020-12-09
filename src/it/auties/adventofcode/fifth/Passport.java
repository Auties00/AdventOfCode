package it.auties.adventofcode.fifth;

import java.util.Map;
import java.util.Set;

public record Passport(ConstraintValue<String> ecl,
                       ConstraintValue<String> pid,
                       ConstraintValue<Short> eyr,
                       ConstraintValue<String> hcl,
                       ConstraintValue<Short> byr,
                       ConstraintValue<Short> iyr,
                       String cid,
                       ConstraintValue<Height> hgt) implements Validable{

  private static final Set<Character> DICTIONARY = Set.of('a', 'b', 'c', 'd', 'e', 'f', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
  public static Passport fromMap(Map<String, String> map){
    return new Passport(
      new ConstraintValue<>(map.get("ecl"), (a, b) -> !b ? a != null : a != null && (a.equals("amb") || a.equals("blu") || a.equals("brn") || a.equals("gry") || a.equals("grn") || a.equals("hzl") || a.equals("oth"))),
      new ConstraintValue<>(map.get("pid"), (a, b) -> !b ? a != null : a != null && a.length() == 9),
      ConstraintValue.build(() -> Short.valueOf(map.get("eyr")), (a, b) -> !b ? a != null : a != null && a >= 2020 && a <= 2030),
      new ConstraintValue<>(map.get("hcl"), (a, b) -> !b ? a != null : a != null && a.length() == 7 && a.charAt(0) == '#' && (a.substring(1).chars().mapToObj(e -> (char) e).allMatch(DICTIONARY::contains))),
      ConstraintValue.build(() -> Short.valueOf(map.get("byr")), (a, b) -> !b ? a != null : a != null && a >= 1920 && a <= 2002),
      ConstraintValue.build(() -> Short.valueOf(map.get("iyr")), (a, b) -> !b ? a != null : a != null && a >= 2010 && a <= 2020),
      map.get("cid"),
      ConstraintValue.build(() -> Height.fromString(map.get("hgt")), Height::isValid)
    );
  }

  @Override
  public boolean isValid(boolean strict){
    return ecl.isValid(strict) && pid.isValid(strict) && eyr.isValid(strict) && hcl.isValid(strict) && byr.isValid(strict) && iyr.isValid(strict) && hgt.isValid(strict);
  }
}
