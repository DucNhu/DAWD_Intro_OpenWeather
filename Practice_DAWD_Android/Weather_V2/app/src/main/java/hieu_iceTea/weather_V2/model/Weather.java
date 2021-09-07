package hieu_iceTea.weather_V2.model;

import androidx.annotation.NonNull;

public class Weather {

    //region - Define Fields -
    private int id;
    private String main;
    private String description;
    private String icon;
    //endregion


    //region - Constructor -
    public Weather() {
    }

    public Weather(int id, String main, String description, String icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }
    //endregion


    //region - Getter & Setter -
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    //endregion


    //region - To String -
    @NonNull
    @Override
    public String toString() {
        return "Weather{" +
                "id=" + id +
                ", main='" + main + '\'' +
                ", description='" + description + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
    //endregion -

}
