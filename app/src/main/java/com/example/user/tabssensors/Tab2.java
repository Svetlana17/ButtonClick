package com.example.user.tabssensors;

import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import static android.content.Context.SENSOR_SERVICE;
import static android.support.v4.content.ContextCompat.getSystemService;


public class Tab2 extends Fragment
//        implements SensorEventListener
{
//    Spinner spinner;
//    String [] acxios={"Ускорение по оси Х","Ускорение по оси Y", "Ускорение по оси Z "};
//    boolean xFlag=true;
//    boolean yFlag=false;
//    boolean zFlag=false;
//   @Override
//   public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        spinner =(Spinner) findViewById(R.id.spinner);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,acxios);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

//    @Override
//    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//        String item = (String) parent.getItemAtPosition(position);
//        switch ((int) id) {
//            case 0:
//                System.out.println("x");
//                Toast toast = Toast.makeText(getApplicationContext(),
//                        "Ускорение по оси ОХ!", Toast.LENGTH_SHORT);
//                toast.show();
//                xFlag = true;
//                yFlag = false;
//                zFlag = false;
//                break;
//            case 1:
//                System.out.println("y");
//                Toast toasts = Toast.makeText(getApplicationContext(),
//                        "Ускорение по оси ОY!", Toast.LENGTH_SHORT);
//                toasts.show();
//                xFlag = false;
//                yFlag = true;
//                zFlag = false;
//                break;
//            case 2:
//                System.out.println("z");
//                Toast toastss = Toast.makeText(getApplicationContext(),
//                        "Ускорение по оси ОZ!", Toast.LENGTH_SHORT);
//                toastss.show();
//                xFlag = false;
//                yFlag = false;
//                zFlag = true;
//                break;
//
//        }
//    }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//
//
//            @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_tab2, container, false);
//    }
//
//    @Override
//    public void onSensorChanged(SensorEvent event) {
//
//    }
//
//    @Override
//    public void onAccuracyChanged(Sensor sensor, int accuracy) {
//
//    }
}
