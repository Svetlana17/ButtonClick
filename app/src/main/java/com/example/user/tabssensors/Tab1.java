package com.example.user.tabssensors;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static android.content.Context.SENSOR_SERVICE;
import static android.support.v4.content.ContextCompat.getSystemService;


public class Tab1 extends Fragment
//        implements SensorEventListener
 {

//     SensorManager sensorManager;
//     Sensor sensorAccelerometr;
//     GraphView graphView;
//
//    private double graph2LastXValue = 5d;
//    private double graph2LastYValue = 5d;
//    private double graph2LastZValue = 5d;
//    private Double[] dataPoints;
//    LineGraphSeries<DataPoint> mSeriesY;
//    LineGraphSeries<DataPoint> mSeriesX;
//    LineGraphSeries<DataPoint> mSeriesZ;

  
//    private Thread thread;
//    private boolean plotData = true;
//    private boolean graficflag = false;
//    private int timer=0;
//
//
//     private float fx;
//     private double fy;
//     private double fz;
//     private float altha = 0.1f;
//     private float On_1 = 1;
//     boolean xFlag=true;
//     boolean yFlag=false;
//     boolean zFlag=false;
//     int lastX;
//     int lastY;
//     int lastZ;
//
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab1, container, false);
//
//
//
//
//
//        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
//
//        sensorAccelerometr = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
// final TableLayout table = (TableLayout) findViewById(R.id.graph);
//        graphView=findViewById(R.id.graph);
//        mSeriesX=new LineGraphSeries<>();
//        mSeriesX.setColor(Color.RED);
//        mSeriesY=new LineGraphSeries<>();
//        mSeriesY.setColor(Color.GREEN);
//        mSeriesZ=new LineGraphSeries<>();
//        mSeriesZ.setColor(Color.BLACK);
//
//        graphView.getViewport().setXAxisBoundsManual(true);
////        graphView.getViewport().setMinX(20);
//        graphView.getViewport().setMaxX(20);
//        graphView.getGridLabelRenderer().setHumanRounding(true);
//
//            graphView.addSeries(mSeriesX);
//            graphView.addSeries(mSeriesZ);
//            graphView.addSeries(mSeriesY);
//    }
//
//
//     @Override
//     public void onResume() {
//         super.onResume();
//         sensorManager.registerListener(this, sensorAccelerometr, SensorManager.SENSOR_DELAY_NORMAL);
////        new Thread(new Runnable() {
////            @Override
////            public void run() {
////                for(int i=0; i<100; i++){
////                    runOnUiThread(new Runnable() {
////                        @Override
////                        public void run() {
////                            addEntry();
////                        }
////                    });
////                    try {
////                        Thread.sleep(500);
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
////                }
////            }
////        }).start();
//     }
//
//     private void addEntry() {
//         System.out.println("addEntry test");
//         mSeriesX.appendData(new DataPoint(lastX++, Math.random()*10d), false, 10);
//
//
//
//     }
//
//     private void addEntry(SensorEvent event) {
////        System.out.println("addEntry test");
//         float[] values = event.values;
//         float xx = values[0];
//         System.out.println(xx);
//         float yy = values[1];
//         System.out.println(yy);
//         float zz = values[2];
//         System.out.println(zz);
//
//
//         fx= (float) (On_1 + altha *(xx - On_1));
//         fy=(float)  (On_1+altha*(yy-On_1));
//         fz=(float)  (On_1+altha*(zz-On_1));
//
//         mSeriesX.appendData(new DataPoint(lastX++, event.values[0]), true, 40);
//         mSeriesY.appendData(new DataPoint(lastY++, event.values[1]), true, 20);
//         mSeriesZ.appendData(new DataPoint(lastZ++, event.values[2]), true, 20);
//
//
//
//     }
//
//     @Override
//     public void onSensorChanged(final SensorEvent event) {
//         new Thread(new Runnable() {
//             @Override
//             public void run() {
//                 for(int i=0; i<100; i++){
//                     runOnUiThread(new Runnable() {
//                         @Override
//                         public void run() {
//                             addEntry(event);
//                         }
//                     });
//                     try {
//                         Thread.sleep(1000);
//                     } catch (InterruptedException e) {
//                         e.printStackTrace();
//                     }
//                 }
//             }
//
//             private void runOnUiThread(Runnable runnable) {
//             }
//         }).start();
//     }
//
//     @Override
//     public void onAccuracyChanged(Sensor sensor, int accuracy) {
//
//     }
//
//
//     @Override
//     public void onPause() {
//         super.onPause();
//         sensorManager.unregisterListener(this);
//
     }
//
     }
 