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
	 * @param
	 * @param
	 * @param
	 * @param
	 * @param
	 * @return
	 */
	@Override
	public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
		
	}
	
	/**
	 * @param
	 * @param
	 * @param
	 * @return
	 */
	public Uri insert(Uri uri, ContentValues initialValues) {
		
	}
	
	/**
	 * @param
	 * @param
	 * @param
	 * @return
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
