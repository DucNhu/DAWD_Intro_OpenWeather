package hieu_iceTea.weather_V2;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import hieu_iceTea.weather_V2.repository.DataRepository;

public class MainActivity extends AppCompatActivity {

    EditText txtCityName;
    TextView lblResult;
    ImageView imageWeatherIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCityName = findViewById(R.id.txtCityName);
        lblResult = findViewById(R.id.lblResult);
        imageWeatherIcon = findViewById(R.id.imageWeatherIcon);
    }

    public void onBtnGetWeatherClick(View view) {

        hideKeyboard();

        lblResult.setVisibility(View.VISIBLE);
        lblResult.setText("Loading...");

        if (txtCityName.getText().toString().isEmpty()) {
            notificationPleaseEnterCityName();
            return;
        }

        new DataRepository().getData((weathers, main) -> {
            //Todo: đang làm đến đây, chờ xíu
            lblResult.setText(weathers.toString() + "\r\n" + main.toString());
        });

    }

    private void hideKeyboard() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(txtCityName.getWindowToken(), 0);
    }

    private void notificationCouldNotFindWeather() {
        lblResult.setText("");
        Toast.makeText(getApplicationContext(), "Could not find weather. 😯", Toast.LENGTH_SHORT).show();

        imageWeatherIcon.setVisibility(View.INVISIBLE);
    }

    private void notificationPleaseEnterCityName() {
        lblResult.setText("");
        Toast.makeText(getApplicationContext(), "Please enter the city name. 🤔", Toast.LENGTH_SHORT).show();

        imageWeatherIcon.setVisibility(View.INVISIBLE);
    }

}