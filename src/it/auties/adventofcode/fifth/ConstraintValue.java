package it.auties.adventofcode.fifth;

import java.util.function.BiFunction;

public record ConstraintValue<T>(T entry, BiFunction<T, Boolean, Boolean> constraint) implements Validable{
  public static <T> ConstraintValue<T> build(Builder<T> entryBuilder, BiFunction<T, Boolean, Boolean> constraint){
    return new ConstraintValue<>(entryBuilder.call(), constraint);
  }

  @Override
  public boolean isValid(boolean strict){
    return constraint.apply(entry, strict);
  }

  interface Builder<T> {
    T build() throws Exception;

    default T call(){
      try {
        return build();
      }catch (Exception e){
        return null;
      }
    }
  }
}
