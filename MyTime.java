public class MyTime {
    int hour;
    int minute;
    int second;
    public void setHour(int hour){
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("Invalid hour!");
        }
    }
    public void setMinute(int minute){
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            System.out.println("Invalid minute!");
        }
    }
    public void setSecond(int second){
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            System.out.println("Invalid second!");
        }
    }

    public int getHour() {
        return this.hour;
    }
    public int getMinute() {
        return this.minute;
    }
    public int getSecond() {
        return this.second;
    }
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
    public MyTime nextSecond() {
        if (this.second == 59 && this.hour == 23 && this.minute== 59) {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        } else if (this.second == 59 && this.minute == 59) {
            this.second = 0;
            this.minute = 0;
            this.hour++;
        } else if (this.second == 59) {
            this.second = 0;
            this.minute++;
        } else {
            this.second++;
        }
        return this;
    }
    public MyTime nextMinute() {
        if (this.hour == 23 && this.minute== 59) {
            this.hour = 0;
            this.minute = 0;
        } else if (this.minute == 59) {
            this.minute = 0;}
        else {
            this.minute++;
        }
        return this;
    }
    public MyTime nextHour() {
        if (this.hour == 23) {
            this.hour = 0;
        } else {
            this.hour++;
        }
        return this;
    }
    public MyTime previousSecond() {
        if (this.second == 0 && this.hour == 0 && this.minute== 0) {
            this.hour = 23;
            this.minute = 59;
            this.second = 59;
        } else if (this.second == 0 && this.minute == 0) {
            this.second = 59;
            this.minute = 59;
            this.hour--;
        } else if (this.second == 0) {
            this.second = 59;
            this.minute--;
        } else {
            this.second--;
        }
        return this;
    }
    public MyTime previousMinute() {
        if (this.hour == 0 && this.minute== 0) {
            this.hour = 23;
            this.minute = 59;
        } else if (this.minute == 0) {
            this.minute = 59;
            this.hour--;
        }
        else {
            this.minute--;
        }
        return this;
    }
    public MyTime previousHour() {
        if (this.hour == 0) {
            this.hour = 23;
        } else {
            this.hour--;
        }
        return this;
    }

    public static void main(String[] args) {
        MyTime myTime = new MyTime();
        myTime.setHour(12);
        myTime.setMinute(59);
        myTime.setSecond(59);
        System.out.println("Current time: " + myTime.toString());
        System.out.println("Next second: " + myTime.nextSecond());
        System.out.println("Next minute: " + myTime.nextMinute());
        System.out.println("Next hour: " + myTime.nextHour());
        System.out.println("Previous second: " + myTime.previousSecond());
        System.out.println("Previous minute: " + myTime.previousMinute());
        System.out.println("Previous hour: " + myTime.previousHour());

    }



}
