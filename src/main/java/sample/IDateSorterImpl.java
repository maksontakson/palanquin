package sample;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IDateSorterImpl implements IDateSorter {
  @Override
  public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
    unsortedDates.sort((date1, date2) -> {
      boolean date1HasR = date1.getMonth().toString().contains("R");
      boolean date2HasR = date2.getMonth().toString().contains("R");
      if (date1HasR && date2HasR) {
        return date1.compareTo(date2);
      }
      if (!date1HasR && !date2HasR) {
        return date1.compareTo(date2) * -1;
      }
      if (date1HasR) {
        return -1;
      } else {
        return 1;
      }
    });
    return unsortedDates;
  }
}
