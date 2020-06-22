package ru.geekbrains;

public enum Weekend {
    MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), THURSDAY("Четверг"),
    FRIDAY("Пятница"), SATURDAY("Суббота"), SUNDAY("Воскресение");

    private String rus;
    public String getRus() {
        return rus;
    }

    Weekend(String rus){
        this.rus = rus;
    }
}

class MainEnum{

    public static void main(String[] args) {
    }

    public static void getWorkingHours(Weekend dayOfWeek){
        int dayNumber=dayOfWeek.ordinal()+1;
        String msg = dayOfWeek.getRus() + ", " + dayNumber + " день недели";
        switch (dayOfWeek) {
            case MONDAY:
                msg += ". Осталось 40 рабочих часов";
                break;
            case TUESDAY:
                msg += ". Осталось 32 рабочих часов";
                break;
            case WEDNESDAY:
                msg += ". Осталось 24 рабочих часов";
                break;
            case THURSDAY:
                msg += ". Осталось 16 рабочих часов";
                break;
            case FRIDAY:
                msg += ". Осталось 8 рабочих часов";
                break;
            case SATURDAY:
            case SUNDAY:
                msg += ". Выходной";
                break;
        }
        System.out.println(msg);
    }
}


