package ndk.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

import ndk.utils.Methods;

public class MainActv extends Activity  implements OnClickListener {
	
	public static Vibrator vib;

	TextView text1, text2;
    Button btn1, btn2;
    final String[] msgList = 
        { "日本", "アメリカ", "イギリス", "フランス", "ロシア", "中国" };
    int count = 0;

    static {
        System.loadLibrary("NDKSample");
//        System.loadLibrary("ndksample");
    }

    public native String msgFromNDK(int count);
	
    public native int get_Number();
    
    public native int[] add_Array(int[] source);
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actv_main);
        text1 = (TextView) findViewById(R.id.actv_main_tv_1);
        text1.setText(msgList[0]);

        text2 = (TextView) findViewById(R.id.actv_main_tv_2);
        text2.setText("");

        btn1 = (Button) findViewById(R.id.actv_main_bt_1);
        btn1.setText("Java");
        btn1.setOnClickListener(this);

        btn2 = (Button) findViewById(R.id.actv_main_bt_2);
        btn2.setText("Navite");
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.actv_main_bt_1) {
            text1.setText(msgFromJava());
        } else {
            text2.setText(msgFromNDK(count));
        }
    }

    String msgFromJava() {
        String msg = new String();
        if (++count >= msgList.length) {
            count = 0;
        }
        msg = msgList[count];
        return msg;
    }
//    /** Called when the activity is first created. */
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//    	/*----------------------------
//		 * 1. super
//		 * 2. Set content
//		 * 2-2. Set title
//		 * 3. Initialize => vib
//		 * 
//		 *  4. Set list
//		 *  5. Set listener => Image buttons
//		 *  6. Set path label
//		 *  
//		 *  7. Initialize preferences
//		 *  
//		 *  8. Refresh DB
//			----------------------------*/
//		
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.actv_main);
////        setContentView(R.layout.actv_main);
//        
//        /*----------------------------
//		 * 2-2. Set title
//			----------------------------*/
//		this.setTitle(this.getClass().getName());
//        
//        vib = (Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);
//
//        
//    }//public void onCreate(Bundle savedInstanceState)

    @Override
	protected void onDestroy() {
		/*----------------------------
		 * 1. Reconfirm if the user means to quit
		 * 2. super
		 * 3. Clear => prefs_main
		 * 4. Clear => list_root_dir
			----------------------------*/
		// Log
		Log.d("MainActv.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", "onDestroy()");
		
		super.onDestroy();
		
	}//protected void onDestroy()

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		
//		// Log
//		String msg_Log = "onKeyDown()";
//		Log.d("MainActv.java" + "["
//				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
//				+ "]", msg_Log);
//		
//		
//		Methods.confirm_quit(this, keyCode);
		
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// 
//		MenuInflater mi = getMenuInflater();
//		mi.inflate(R.menu.menu_main, menu);
//		
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {

//		case R.id.opt_menu_main_db://----------------------------------
//			
//			Methods_dlg.dlg_Db_Activity(this);
//			
//			break;// case R.id.main_opt_menu_create_folder
			
		}//switch (item.getItemId())
		
		return super.onOptionsItemSelected(item);
		
	}//public boolean onOptionsItemSelected(MenuItem item)

	@Override
	protected void onPause() {
		
		super.onPause();

		Log.d("MainActv.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", "onPause()");

//		// Log
//		Log.d("MainActv.java" + "["
//				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
//				+ "]", "prefs_main: " + Methods.get_currentPath_from_prefs(this));
		
		
	}

	@Override
	protected void onResume() {
		/*********************************
		 * 1. super
		 * 2. Set enables
		 *********************************/
		super.onResume();

		Log.d("MainActv.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", "onResume()");

		
		/*********************************
		 * 2. Set enables
		 *********************************/
//		ImageButton ib_up = (ImageButton) findViewById(R.id.v1_bt_up);
//		
//		String curDirPath = Methods.get_currentPath_from_prefs(this);
//		
//		if (curDirPath.equals(dname_base)) {
//			
//			ib_up.setEnabled(false);
//			
//			ib_up.setImageResource(R.drawable.ifm8_up_disenabled);
//			
//		} else {//if (this.currentDirPath == this.dpath_base)
//		
//			ib_up.setEnabled(true);
//
//			
//			ib_up.setImageResource(R.drawable.ifm8_up);
//		
//		}//if (this.currentDirPath == this.dpath_base)
		
	}//protected void onResume()

	@Override
	protected void onStart() {
		
		super.onStart();
		
//		_test_DrawLine();
		
		this._Setup();
		
		////////////////////////////////

		// listener

		////////////////////////////////
		
		_Setup__SetListener();
		
		////////////////////////////////

		// test

		////////////////////////////////
		_test();
		
	}//protected void onStart()

	private void 
	_test() {
		// TODO Auto-generated method stub
	
		String msg_Log;
		
		int iterate = 1000000;

		////////////////////////////////

		// native

		////////////////////////////////
		// Log
		msg_Log = "*********** native => starts: " + iterate;
		
		Log.d("MainActv.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", msg_Log);
		////////////////////////////////

		// setup

		////////////////////////////////
		// Log
		msg_Log = "start => " 
					+ Methods.conv_MillSec_to_TimeLabel(Methods.getMillSeconds_now());
		
		Log.d("MainActv.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", msg_Log);
		
		int[] i_ary = {2,3,4,5};
		int[] i_ary_done = null;
		
		for (int i = 0; i < iterate; i++) {
			
			i_ary_done = add_Array(i_ary);
			
		}
		
		msg_Log = "end => " 
				+ Methods.conv_MillSec_to_TimeLabel(Methods.getMillSeconds_now());
	
		Log.d("MainActv.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", msg_Log);
		
		// Log
		msg_Log = "i_ary_done[0] => " + i_ary_done[0];
		Log.d("MainActv.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", msg_Log);
		
		////////////////////////////////
		
		// java
		
		////////////////////////////////
		// Log
		msg_Log = "*********** java => starts: " + iterate;
		
		Log.d("MainActv.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", msg_Log);
		////////////////////////////////
		
		// setup
		
		////////////////////////////////
		// Log
		msg_Log = "start => " 
				+ Methods.conv_MillSec_to_TimeLabel(Methods.getMillSeconds_now());
		
		Log.d("MainActv.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", msg_Log);
		
//		i_ary = {2,3,4,5};
		i_ary_done = null;
		
		for (int i = 0; i < iterate; i++) {
			
			i_ary_done = add_Array_java(i_ary);
			
		}
		
		msg_Log = "end => " 
				+ Methods.conv_MillSec_to_TimeLabel(Methods.getMillSeconds_now());
		
		Log.d("MainActv.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", msg_Log);
		
		// Log
		msg_Log = "i_ary_done[0] => " + i_ary_done[0];
		Log.d("MainActv.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", msg_Log);
		
	}

	private void 
	_Setup__SetListener() {
		// TODO Auto-generated method stub
		
		////////////////////////////////

		// listener

		////////////////////////////////
		
	}//_Setup__SetListener

	private void 
	_Setup() {
		// TODO Auto-generated method stub

		// Log
		String msg_Log = "number => " + get_Number();
		Log.d("MainActv.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", msg_Log);
		
		
	}//_Setup
	
	public int[] add_Array_java(int[] source) {
		
		int size = source.length;
		
		int[] ret = new int[1];
		
		ret[0] = size;
		
		return ret;
		
	}
	

}//public class MainActv extends Activity
