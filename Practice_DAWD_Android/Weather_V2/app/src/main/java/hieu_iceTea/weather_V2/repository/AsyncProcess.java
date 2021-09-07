package hieu_iceTea.weather_V2.repository;

import java.util.List;

import hieu_iceTea.weather_V2.model.Main;
import hieu_iceTea.weather_V2.model.Weather;


public interface AsyncProcess {
    void onFinished(List<Weather> weathers, Main main);
}
