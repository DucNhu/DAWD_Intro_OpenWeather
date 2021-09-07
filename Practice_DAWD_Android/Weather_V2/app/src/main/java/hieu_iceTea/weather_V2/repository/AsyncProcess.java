package duchu.weather_V2.repository;

import java.util.List;

import duchu.weather_V2.model.Main;
import duchu.weather_V2.model.Weather;


public interface AsyncProcess {
    void onFinished(List<Weather> weathers, Main main);
}
