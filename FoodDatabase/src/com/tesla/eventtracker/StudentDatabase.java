package com.tesla.eventtracker;

import android.content.Context;
import android.database.sqlite.*;
import android.util.Log;

/**
 * 
 * @author Paul
 * This class holds the necessary methods for loading the database into memory and interacting with it.
 */
public class StudentDatabase {
	public static final String TABLE_STUDENT_DATA = "studentdata";
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_NAME = "name";
	public static final String COLUMN_GPA = "gpa";
	
	private static final String DATABASE_NAME = "studentdata.db";
	private static final int DATABASE_VERSION = 1;
	private StudentDataOpenHelper openHelper;

	protected class StudentDataOpenHelper extends SQLiteOpenHelper
	{
		private SQLiteDatabase database;

		private static final String DATABASE_CREATE =	"CREATE TABLE " + TABLE_STUDENT_DATA + "(" + 
														COLUMN_ID + " " + "integer primary key autoincrement, " + 
														COLUMN_NAME + " " + "text, " + 
														COLUMN_GPA + " real);";
		
		public StudentDataOpenHelper(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
		}
		
		public void onCreate(SQLiteDatabase database) {
			database.execSQL(DATABASE_CREATE);
		}
		
		public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
			Log.w(StudentDataOpenHelper.class.getName(), "Upgrading database from version " + oldVersion + " to " + newVersion + ", which will destroy all old data");
			database.execSQL("DROP TABLE IF EXISTS " + TABLE_STUDENT_DATA);
			onCreate(database);
		}
	}
	
	public StudentDatabase(Context context) {
		openHelper = new StudentDataOpenHelper(context);
	}
}
