package it.auties.adventofcode.fifth;

public record Height(Short height, Unit unit) implements Validable{
  public static Height fromString(String input){
    return input == null ? new Height(null, Unit.CM) : input.contains("in") ? new Height(Short.parseShort(input.replace("in", "")), Unit.IN) : new Height(Short.parseShort(input.replace("cm", "")), Unit.CM);
  }

  @Override
  public boolean isValid(boolean strict) {
    return !strict ? height != null : height != null && (unit == Unit.CM ? height >= 150 && height <= 193 : height >= 59 && height <= 76);
  }

  enum Unit {
    CM,
    IN
  }
}
