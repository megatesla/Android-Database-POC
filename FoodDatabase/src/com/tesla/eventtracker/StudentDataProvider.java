package com.tesla.eventtracker;

import android.content.*;
import android.database.*;
import android.net.*;
import android.database.sqlite.*;

public class StudentDataProvider extends ContentProvider
{
	private SQLiteDatabase database;
	private StudentDataOpenHelper openHelper;
	public StudentDataProvider() {
		super();
	}

	/**
	 * This instantiates the SQLiteOpenHelper for this provider.
	 * It is called automatically when Android creates the provider
	 * in response to a resolver request from a client.
	 * @return A {@code boolean} indicating whether or not setup was successful.
     */
	@Override
	public boolean onCreate() {
		openHelper = new StudentDataOpenHelper(getContext());
		//Assumes that any errors will result in thrown exceptions.
		return true;
	}

	/**
	 * This method is called when a client calls {@link android.content.ContentResolver#query(Uri, String[], String, String[], String)}.
	 * Queries the database and returns a cursor containing the results.
	 * 
	 * @return A cursor containing the results of the query. The cursor exists but is empty if the query returns no results or an exception occurs.
	 * @throws IllegalArgumentException if the incoming URI pattern is invalid.
	 */
	@Override
	public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
		SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
		qb.setTables();
	}
	
	/**
	 * This is called when a client calls
	 * {@link android.content.ContentResolver#insert(Uri, ContentValues)}.
	 * Inserts a new row into the database. If rows were inserted, then listeners are notified of the change.
	 * @return The row ID of the inserted row.
	 * @throws SQLException if the insertion fails.
	 */
	public Uri insert(Uri uri, ContentValues initialValues) {
		
	}
	
	/**
	 * This is called when the client calls
	 * {@link anroid.content.ContentResolver#delete(Uri, String, String[])}.
	 * Deletes records from the database.
	 * @return The number of rows deleted is returned.
	 * @throws IllegalArgumentException if the incoming URI pattern is invalid.
	 */
	public int delete(Uri uri, String where, String[] whereArgs) {
		
	}
	
	/**
	 * @param
	 * @param
	 * @param
	 * @param
	 * @return
	 */
	public void update(Uri uri, ContentValues values, String where, String[] whereArgs) {
		
	}
	
	/**
	 * @param
	 * @return
	 */
	public String getType(Uri uri) {
		
	}
	
	/**
	 * @param
	 * @param
	 * @return
	 */
	public String[] getStreamTypes(Uri uri, String mimeTypeFilter) {
		
	}
}
