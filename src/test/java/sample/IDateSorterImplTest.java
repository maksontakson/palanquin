package sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class IDateSorterImplTest {
  private final IDateSorterImpl iDateSorter = new IDateSorterImpl();

  @org.junit.jupiter.api.Test
  void sortDates() {
    List<LocalDate> localDateList = new ArrayList<>();
    localDateList.add(LocalDate.parse("2005-07-01"));
    localDateList.add(LocalDate.parse("2005-01-02"));
    localDateList.add(LocalDate.parse("2005-01-01"));
    localDateList.add(LocalDate.parse("2005-05-03"));
    iDateSorter.sortDates(localDateList);
    assertEquals(LocalDate.parse("2005-01-01"), localDateList.get(0));
    assertEquals(LocalDate.parse("2005-01-02"), localDateList.get(1));
    assertEquals(LocalDate.parse("2005-07-01"), localDateList.get(2));
    assertEquals(LocalDate.parse("2005-05-03"), localDateList.get(3));
  }
}