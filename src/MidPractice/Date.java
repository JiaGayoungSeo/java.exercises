package MidPractice;

public class Date {
    private int year;
    private int month;
    private int day;

    public  Date(){}

    public Date(int month, int day, int year){
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //set leap year
        if(day==29){
            if(year%4==0&&year%100!=0||year%400==0){
                this.day = day;
            }
            else this.day =1;
        }
        //set day according to each month
        if(day<=days[month]){
            this.day =day;
        } else {
            this.day =1;
        }
        //set month between 1 and 12
        if(month>0 && month<13){
            this.month = month;
        } else this.month = 1;
        this.year = year;

    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        if(month>0 && month<13){
            this.month = month;
        } else this.month = 1;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //set leap year
        if(day==29){
            if(year%4==0&&year%100!=0||year%400==0){
                this.day = day;
            }
            else this.day =1;
        }
        //set day according to each month
        if(day<=days[month]){
            this.day =day;
        } else {
            this.day =1;
        }
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return this.month+"/"+this.day+"/"+this.year;
    }
}
