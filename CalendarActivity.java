package com.example.plantparenthud;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class CalendarActivity extends AppCompatActivity {

    private mysqldb sqldb;
    private EditText editText;
    private CalendarView calendarView;
    private String selectedDate;
    private SQLiteDatabase sqlLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        editText = findViewById(R.id.editTextTextPersonName);
        calendarView = findViewById(R.id.calendarView);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                selectedDate = Integer.toString(year) + Integer.toString(month) + Integer.toString(dayOfMonth);
                ReadDatabase(view);
            }
        });

        try {
            sqldb = new mysqldb(this, "CalendarDatabase", null, 1);
            sqlLiteDatabase = sqldb.getWritableDatabase();
            sqlLiteDatabase.execSQL("CREATE TABLE EventCalendar (Date TEXT, Event TEXT)");

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

     public void InsertDatabase(View view){
         ContentValues contentValues = new ContentValues();
         contentValues.put("Date", selectedDate);
         contentValues.put("Event", editText.getText().toString());
         sqlLiteDatabase.insert("EventCalendar", null, contentValues);

     }

     public void ReadDatabase(View view){
        String query = "Select Event from EventCalendar where Date =" + selectedDate;
        try {
            Cursor cursor = sqlLiteDatabase.rawQuery(query, null);
            cursor.moveToFirst();
            editText.setText(cursor.getString(0));
        }
        catch (Exception e){
            e.printStackTrace();
            editText.setText("");
        }
     }
}