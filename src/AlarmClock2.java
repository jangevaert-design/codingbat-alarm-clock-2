public class AlarmClock2 {
  public String alarmClock(int day, boolean vacation) {
    if (day > 0 && day <= 5 && !vacation) {
      return "7:00";
    } else if ((day == 6 || day == 0) && !vacation || day > 0 && day <= 5) {
      return "10:00";
    } else {
      return "off";
    }
  }
}
