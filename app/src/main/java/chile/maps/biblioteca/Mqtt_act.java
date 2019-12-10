package chile.maps.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;

public class Mqtt_act extends AppCompatActivity {

    static String MQTTHOST = "tcp://tailor.cloudmqtt.com:13939";
    static String USERNAME = "gvqbbjaj";
    static String PASSWORD = "ZlHn9pvlpj0_";
    String topicStr = "LIBROS";
    MqttAndroidClient client;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mqtt_act);
        String clientId = MqttClient.generateClientId();
        client = new MqttAndroidClient(this.getApplicationContext(), MQTTHOST, clientId);
        MqttConnectOptions options = new MqttConnectOptions();
        options.setUserName(USERNAME);
        options.setPassword(PASSWORD.toCharArray());


        try {
            IMqttToken token = client.connect(options);
            token.setActionCallback(new IMqttActionListener() {
                @Override
                public void onSuccess(IMqttToken asyncActionToken) {
                    // We are connected
                    Toast.makeText(getBaseContext(), " se ha conectado", Toast.LENGTH_LONG).show();

                }

                @Override
                public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
                    // Something went wrong e.g. connection timeout or firewall problems
                    Toast.makeText(getBaseContext(), "No se ha conectado", Toast.LENGTH_LONG).show();


                }
            });
        } catch (MqttException e) {
            e.printStackTrace();
        }

    }

    public  void Farenheith(View view){
        String topic = topicStr;
        String message = "Farenheith";
        try {
            client.publish(topic, message.getBytes(), 0,false);

        }
        catch (Exception e){
            e.printStackTrace();

        }


    }
    public  void Revival(View view){
        String topic = topicStr;
        String message = "Revival";
        try {
            client.publish(topic, message.getBytes(), 0,false);

        }
        catch (Exception e){
            e.printStackTrace();

        }



    }
    public  void ElAlquimista(View view){
        String topic = topicStr;
        String message = "ElAlquimista";
        try {
            client.publish(topic, message.getBytes(), 0,false);

        }
        catch (Exception e){
            e.printStackTrace();

        }



    }
    public  void ElPoder(View view){
        String topic = topicStr;
        String message = "ElPoder";
        try {
            client.publish(topic, message.getBytes(), 0,false);

        }
        catch (Exception e){
            e.printStackTrace();

        }



    }

    public  void Despertar(View view){
        String topic = topicStr;
        String message = "Despertar";
        try {
            client.publish(topic, message.getBytes(), 0,false);

        }
        catch (Exception e){
            e.printStackTrace();

        }



    }
}
