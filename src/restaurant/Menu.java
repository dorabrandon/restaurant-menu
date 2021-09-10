package restaurant;

import java.time.LocalDate;
import java.util.Date;

public class Menu {
    private LocalDate lastUpdate;

    public Menu(LocalDate day){
        this.lastUpdate = day;
    }

    public void setDate(LocalDate update){
        this.lastUpdate = update;
    }

    public LocalDate getDate(){
        return this.lastUpdate;
    }

}
