package com.example.pinpassword;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	private Button down;
	private Button enter;
	private Button left;
	private Button right;
	private Button up;
	
	private Button num0;
	private Button num1;
	private Button num2;
	private Button num3;
	private Button num4;
	private Button num5;
	private Button num6;
	private Button num7;
	private Button num8;
	private Button num9;	
	
	private TextView t11;
	private TextView t12;
	private TextView t13;
	private TextView t21;
	private TextView t22;
	private TextView t23;
	private TextView t31;
	private TextView t32;
	private TextView t33;
	private TextView t41;
	private TextView t42;
	private TextView t43;
	
	private String updataData2 = null;
	private String updataData3 = null;
	private String updataData4 = null;
	private String password = null;
	private int input_num = 0;
	
	Handler myHandler = new Handler()
	  {
	    private void changeColorDown()
	    {
	      t11.setTextColor(Color.parseColor("#777777"));
	      t12.setTextColor(Color.parseColor("#FFFFFF"));
	      t21.setTextColor(Color.parseColor("#777777"));
	      t22.setTextColor(Color.parseColor("#FFFFFF"));
	      t31.setTextColor(Color.parseColor("#777777"));
	      t32.setTextColor(Color.parseColor("#FFFFFF"));
	      t41.setTextColor(Color.parseColor("#777777"));
	      t42.setTextColor(Color.parseColor("#FFFFFF"));
	    }

	    private void changeColorUp()
	    {
	      t12.setTextColor(Color.parseColor("#FFFFFF"));
	      t13.setTextColor(Color.parseColor("#777777"));
	      t22.setTextColor(Color.parseColor("#FFFFFF"));
	      t23.setTextColor(Color.parseColor("#777777"));
	      t32.setTextColor(Color.parseColor("#FFFFFF"));
	      t33.setTextColor(Color.parseColor("#777777"));
	      t42.setTextColor(Color.parseColor("#FFFFFF"));
	      t43.setTextColor(Color.parseColor("#777777"));
	    }

	    public void handleMessage(Message msg)
	    {
	      if (msg.what == 0)
	        changeColorDown();
	      if (msg.what == 1)
	        changeColorUp();
	      super.handleMessage(msg);
	    }
	  };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
	}
	private void init() {
		// TODO Auto-generated method stub
		t11 = (TextView)findViewById(R.id.t11);
	    t12 = (TextView)findViewById(R.id.t12);
	    t13 = (TextView)findViewById(R.id.t13);
	    t21 = (TextView)findViewById(R.id.t21);
	    t22 = (TextView)findViewById(R.id.t22);
	    t23 = (TextView)findViewById(R.id.t23);
	    t31 = (TextView)findViewById(R.id.t31);
	    t32 = (TextView)findViewById(R.id.t32);
	    t33 = (TextView)findViewById(R.id.t33);
	    t41 = (TextView)findViewById(R.id.t41);
	    t42 = (TextView)findViewById(R.id.t42);
	    t43 = (TextView)findViewById(R.id.t43);
	    t11.setText("9");
	    t12.setText("0");
	    t13.setText("1");
	    
	    up = (Button)findViewById(R.id.up);
	    down = (Button)findViewById(R.id.down);
	    left = (Button)findViewById(R.id.left);
	    right = (Button)findViewById(R.id.right);
	    enter = (Button)findViewById(R.id.enter);
	    num1 = (Button)findViewById(R.id.num1);
	    num2 = (Button)findViewById(R.id.num2);
	    num3 = (Button)findViewById(R.id.num3);
	    num4 = (Button)findViewById(R.id.num4);
	    num5 = (Button)findViewById(R.id.num5);
	    num6 = (Button)findViewById(R.id.num6);
	    num7 = (Button)findViewById(R.id.num7);
	    num8 = (Button)findViewById(R.id.num8);
	    num9 = (Button)findViewById(R.id.num9);
	    num0 = (Button)findViewById(R.id.num0);
	    
	    num0.setOnClickListener(this);
	    num1.setOnClickListener(this);
	    num2.setOnClickListener(this);
	    num3.setOnClickListener(this);
	    num4.setOnClickListener(this);
	    num5.setOnClickListener(this);
	    num6.setOnClickListener(this);
	    num7.setOnClickListener(this);
	    num8.setOnClickListener(this);
	    num9.setOnClickListener(this);
	    up.setOnClickListener(this);
	    down.setOnClickListener(this);
	    left.setOnClickListener(this);
	    right.setOnClickListener(this);
	    enter.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.num0:
			input_num = 0;
			inputNum(input_num);
			break;
		case R.id.num1:
			input_num = 1;
			inputNum(input_num);
			break;
		case R.id.num2:
			input_num = 2;
			inputNum(input_num);
			break;
		case R.id.num3:
			input_num = 3;
			inputNum(input_num);
			break;
		case R.id.num4:
			input_num = 4;
			inputNum(input_num);
			break;
		case R.id.num5:
			input_num = 5;
			inputNum(input_num);
			break;
		case R.id.num6:
			input_num = 6;
			inputNum(input_num);
			break;
		case R.id.num7:
			input_num = 7;
			inputNum(input_num);
			break;
		case R.id.num8:
			input_num = 8;
			inputNum(input_num);
			break;
		case R.id.num9:
			input_num = 9;
			inputNum(input_num);
			break;
		case R.id.up:
			if (t12.isFocused())
	        {
	          Log.d("yuhao", "Focused12_KEYCODE_DPAD_UP...");
	          updateUp(t11, t12, t13);
	        }
	        if (t22.isFocused())
	        {
	          Log.d("yuhao", "Focused22_KEYCODE_DPAD_UP...");
	          updateUp(t21, t22, t23);
	        }
	        if (t32.isFocused())
	        {
	          Log.d("yuhao", "Focused32_KEYCODE_DPAD_UP...");
	          updateUp(t31, t32, t33);
	        }
	        if (t42.isFocused())
	        {
	          Log.d("yuhao", "Focused42_KEYCODE_DPAD_UP...");
	          updateUp(t41, t42, t43);
	        }
			break;
		case R.id.down:
			if (t12.isFocused())
	        {
			  Log.d("yuhao", "Focused12_KEYCODE_DPAD_DOWN...");
	          updateDown(t11, t12, t13);
	        }
	        if (t22.isFocused())
	        {
	          Log.d("yuhao", "Focused22_KEYCODE_DPAD_DOWN...");
	          updateDown(t21, t22, t23);
	        }
	        if (t32.isFocused())
	        {
	          Log.d("yuhao", "Focused32_KEYCODE_DPAD_DOWN...");
	          updateDown(t31, t32, t33);
	        }
	        if (t42.isFocused())
	        {
	          Log.d("yuhao", "Focused42_KEYCODE_DPAD_DOWN...");
	          updateDown(t41, t42, t43);
	        }
			break;
		case R.id.left:
			if (t12.isFocused())
	        {
	          Log.d("yuhao", "Focused12_KEYCODE_DPAD_LEFT...");
	          updateLeft();
	        }
	        if (t22.isFocused())
	        {
	          Log.d("yuhao", "Focused22_KEYCODE_DPAD_LEFT...");
	          saveCurrentData2(t22);
	          updateLeft();
	          t12.setFocusable(true);
	          t12.requestFocus();
	        }
	        if (MainActivity.this.t32.isFocused())
	        {
	          Log.d("yuhao", "Focused32_KEYCODE_DPAD_LEFT...");
	          saveCurrentData3(t32);
	          updateLeft();
	          t22.setFocusable(true);
	          t22.requestFocus();
	        }
	        if (t42.isFocused())
	        {
	          Log.d("yuhao", "Focused42_KEYCODE_DPAD_LEFT...");
	          saveCurrentData3(t42);
	          updateLeft();
	          t32.setFocusable(true);
	          t32.requestFocus();
	        }
			break;
		case R.id.right:
			if (t42.isFocused())
	        {
	          Log.d("yuhao", "Focused42_KEYCODE_DPAD_RIGHT...");
	          updateRight();
	        }
	        if (t32.isFocused())
	        {
	          Log.d("yuhao", "Focused32_KEYCODE_DPAD_RIGHT...");
	          saveCurrentData3(t32);
	          saveCurrentData4(t42);
	          updateRight();
	          t42.setFocusable(true);
	          t42.requestFocus();
	        }
	        if (t22.isFocused())
	        {
	          Log.d("yuhao", "Focused22_KEYCODE_DPAD_RIGHT...");
	          saveCurrentData2(t22);
	          saveCurrentData3(t32);
	          updateRight();
	          t32.setFocusable(true);
	          t32.requestFocus();
	        }
	        if (t12.isFocused())
	        {
	          Log.d("yuhao", "Focused12_KEYCODE_DPAD_RIGHT...");
	          saveCurrentData2(t22);
	          updateRight();
	          t22.setFocusable(true);
	          t22.requestFocus();
	        }
			break;
		case R.id.enter:
			if (t42.isFocused())
	        {
	          Log.d("yuhao", "Focused42_KEYCODE_DPAD_ENTER...");
	          password = (t12.getText().toString() + t22.getText().toString() + t32.getText().toString() + t42.getText().toString());
	          Log.d("yuhao", "password...is " + password);
	          Toast localToast = Toast.makeText(MainActivity.this, "Password is " + password, 1);
	          localToast.setGravity(80, 0, 0);
	          localToast.show();
	        }
	        if (t32.isFocused())
	        {
	          Log.d("yuhao", "Focused32_KEYCODE_DPAD_ENTER...");
	          saveCurrentData3(t32);
	          saveCurrentData4(t42);
	          updateRight();
	          t42.setFocusable(true);
	          t42.requestFocus();
	        }
	        if (t22.isFocused())
	        {
	          Log.d("yuhao", "Focused22_KEYCODE_DPAD_ENTER...");
	          saveCurrentData2(t22);
	          saveCurrentData3(t32);
	          updateRight();
	          t32.setFocusable(true);
	          t32.requestFocus();
	        }
	        if (t12.isFocused())
	        {
	          Log.d("yuhao", "Focused12_KEYCODE_DPAD_ENTER...");
	          saveCurrentData2(t22);
	          updateRight();
	          t22.setFocusable(true);
	          t22.requestFocus();
	        }
			break;

		default:
			break;
		}
	}
	private void updateLeft() {
		// TODO Auto-generated method stub
		updateColor();
	    if (t22.isFocused())
	    {
	      t11.setVisibility(View.VISIBLE);
	      t13.setVisibility(View.VISIBLE);
	      t21.setVisibility(View.INVISIBLE);
	      t23.setVisibility(View.INVISIBLE);
	    }
	    if (t32.isFocused())
	    {
	      t21.setVisibility(View.VISIBLE);
	      t23.setVisibility(View.VISIBLE);
	      t31.setVisibility(View.INVISIBLE);
	      t33.setVisibility(View.INVISIBLE);
	    }
	    if (t42.isFocused())
	    {
	      t31.setVisibility(View.VISIBLE);
	      t33.setVisibility(View.VISIBLE);
	      t41.setVisibility(View.INVISIBLE);
	      t43.setVisibility(View.INVISIBLE);
	    }
	}
	private void updateDown(TextView t1, TextView t2, TextView t3) {
		// TODO Auto-generated method stub
		String str1 = t1.getText().toString();
	    String str2 = t2.getText().toString();
	    String str3 = t3.getText().toString();
	    int i = Integer.parseInt(str1);
	    int j = Integer.parseInt(str2);
	    int k = Integer.parseInt(str3);
	    if (j == 0)
	    {
	      t1.setText("0");
	      t2.setTextColor(Color.parseColor("#FFFFFF"));
	      t2.setText("1");
	      t2.setTextColor(Color.parseColor("#777777"));
	      t3.setText("2");
	      myHandler.sendEmptyMessageDelayed(0, 1);
	    }
	    if (j == 9)
	    {
	      k = 1;
	      j = 0;
	      i++;
	      t1.setText(i+"");
	      t1.setTextColor(Color.parseColor("#FFFFFF"));
	      t2.setText(0+"");
	      t2.setTextColor(Color.parseColor("#777777"));
	      t3.setText(k+"");
	      myHandler.sendEmptyMessageDelayed(0, 1);
	    }
	    if (j == 8)
	    {
	      k = 0;
	      j++;
	      i++;
	      t1.setText(i+"");
	      t1.setTextColor(Color.parseColor("#FFFFFF"));
	      t2.setText(j+"");
	      t2.setTextColor(Color.parseColor("#777777"));
	      t3.setText(0+"");
	      myHandler.sendEmptyMessageDelayed(0, 1);
	    }
	    if ((j != 0) && (j != 9))
	    {
	      int m = i + 1;
	      int n = j + 1;
	      int i1 = k + 1;
	      t1.setText(m+"");
	      t1.setTextColor(Color.parseColor("#FFFFFF"));
	      t2.setText(n+"");
	      t2.setTextColor(Color.parseColor("#777777"));
	      t3.setText(i1+"");
	      myHandler.sendEmptyMessageDelayed(0, 1);
	    }
	}
	private void updateUp(TextView t1, TextView t2, TextView t3) {
		// TODO Auto-generated method stub
		String str1 = t1.getText().toString();
	    String str2 = t2.getText().toString();
	    String str3 = t3.getText().toString();
	    int i = Integer.parseInt(str1);
	    int j = Integer.parseInt(str2);
	    int k = Integer.parseInt(str3);
	    if (j == 9)
	    {
	      t1.setText("7");
	      t2.setText("8");
	      t2.setTextColor(Color.parseColor("#777777"));
	      t3.setText("9");
	      t3.setTextColor(Color.parseColor("#FFFFFF"));
	      myHandler.sendEmptyMessageDelayed(1, 1);
	    }
	    if (j == 0)
	    {
	      i--;
	      j = 9;
	      k--;
	      t1.setText(i+"");
	      t2.setText(j+"");
	      t2.setTextColor(Color.parseColor("#777777"));
	      t3.setText(k+"");
	      t3.setTextColor(Color.parseColor("#FFFFFF"));
	      myHandler.sendEmptyMessageDelayed(1, 1);
	    }
	    if (j == 1)
	    {
	      j--;
	      k--;
	      i = 9;
	      t1.setText(i+"");
	      t2.setText(j+"");
	      t2.setTextColor(Color.parseColor("#777777"));
	      t3.setText(k+"");
	      t3.setTextColor(Color.parseColor("#FFFFFF"));
	      myHandler.sendEmptyMessageDelayed(1, 1);
	    }
	    if ((j != 0) && (j != 9))
	    {
	      int m = i - 1;
	      int n = j - 1;
	      int i1 = k - 1;
	      t1.setText(m+"");
	      t2.setText(n+"");
	      t2.setTextColor(Color.parseColor("#777777"));
	      t3.setText(i1+"");
	      t3.setTextColor(Color.parseColor("#FFFFFF"));
	      myHandler.sendEmptyMessageDelayed(1, 1);
	    }
	}
	private void inputNum(int input_num) {
		// TODO Auto-generated method stub
		if (t42.isFocused())
	    {
	      updateNum(t41, t42, t43, input_num);
	      password = (t12.getText().toString() + t22.getText().toString() + t32.getText().toString() + t42.getText().toString());
	      Log.d("yuhao", "password...is " + password);
	      Toast localToast = Toast.makeText(MainActivity.this, "Password is " + password, 1);
	      localToast.setGravity(80, 0, 0);
	      localToast.show();
	    }
	    if (t32.isFocused())
	    {
	      updateNum(t31, t32, t33, input_num);
	      saveCurrentData3(t32);
	      saveCurrentData4(t42);
	      updateRight();
	      t42.setFocusable(true);
	      t42.requestFocus();
	    }
	    if (t22.isFocused())
	    {
	      updateNum(t21, t22, t23, input_num);
	      saveCurrentData2(t22);
	      saveCurrentData3(t32);
	      updateRight();
	      t32.setFocusable(true);
	      t32.requestFocus();
	    }
	    if (t12.isFocused())
	    {
	      updateNum(t11, t12, t13, input_num);
	      saveCurrentData2(t22);
	      updateRight();
	      t22.setFocusable(true);
	      t22.requestFocus();
	    }
	}
	private void updateRight() {
		// TODO Auto-generated method stub
		updateColor();
	    if (t12.isFocused())
	    {
	      saveCurrentData2(t22);
	      t11.setVisibility(View.INVISIBLE);
	      t13.setVisibility(View.INVISIBLE);
	      t21.setVisibility(View.VISIBLE);
	      t23.setVisibility(View.VISIBLE);
	      t21.setVisibility(View.VISIBLE);
	      t22.setText(updataData2);
	      Log.d("yuhao", "Data2=" + updataData2);
	      t23.setVisibility(View.VISIBLE);
	    }
	    if (t22.isFocused())
	    {
	      saveCurrentData2(t22);
	      t21.setVisibility(View.INVISIBLE);
	      t23.setVisibility(View.INVISIBLE);
	      t31.setVisibility(View.VISIBLE);
	      t33.setVisibility(View.VISIBLE);
	      t31.setVisibility(View.VISIBLE);
	      t32.setText(updataData3);
	      Log.d("yuhao", "Data3=" + updataData3);
	      t33.setVisibility(View.VISIBLE);
	    }
	    if (t32.isFocused())
	    {
	      t31.setVisibility(View.INVISIBLE);
	      t33.setVisibility(View.INVISIBLE);
	      t41.setVisibility(View.VISIBLE);
	      t43.setVisibility(View.VISIBLE);
	      t41.setVisibility(View.VISIBLE);
	      t42.setText(updataData4);
	      Log.d("yuhao", "Data4=" + updataData4);
	      t43.setVisibility(View.VISIBLE);
	    }
	}
	private void updateColor() {
		// TODO Auto-generated method stub
		t11.setTextColor(Color.parseColor("#777777"));
	    t12.setTextColor(Color.parseColor("#FFFFFF"));
	    t13.setTextColor(Color.parseColor("#777777"));
	    t21.setTextColor(Color.parseColor("#777777"));
	    t22.setTextColor(Color.parseColor("#FFFFFF"));
	    t23.setTextColor(Color.parseColor("#777777"));
	    t31.setTextColor(Color.parseColor("#777777"));
	    t32.setTextColor(Color.parseColor("#FFFFFF"));
	    t33.setTextColor(Color.parseColor("#777777"));
	    t41.setTextColor(Color.parseColor("#777777"));
	    t42.setTextColor(Color.parseColor("#FFFFFF"));
	    t43.setTextColor(Color.parseColor("#777777"));
	}
	private void saveCurrentData2(TextView t2) {
		// TODO Auto-generated method stub
		if (t2.getText().toString().equals("一"))
	    {
	      Log.d("yuhao", "----");
	      updataData2 = "0";
	      return;
	    }
	    updataData2 = t2.getText().toString();
	    Log.d("yuhao", "updataData2=" + t2.getText().toString());
	}
	private void saveCurrentData4(TextView t4) {
		// TODO Auto-generated method stub
		if (t4.getText().toString().equals("一"))
	    {
	      Log.d("yuhao", "----");
	      updataData4 = "0";
	      return;
	    }
	    updataData4 = t4.getText().toString();
	    Log.d("yuhao", "updataData4=" + t4.getText().toString());
	}
	private void saveCurrentData3(TextView t3) {
		// TODO Auto-generated method stub
		if (t3.getText().toString().equals("一"))
	    {
	      Log.d("yuhao", "----");
	      updataData3 = "0";
	      return;
	    }
	    updataData3 = t3.getText().toString();
	    Log.d("yuhao", "updataData3=" + t3.getText().toString());
	}
	private void updateNum(TextView t1, TextView t2, TextView t3, int input_num) {
		// TODO Auto-generated method stub
		if ((input_num != 0) && (input_num != 9))
	    {
			t1.setText((input_num - 1)+"");
			t2.setText(input_num+"");
			t3.setText((input_num + 1)+"");
	    }
	    if (input_num == 0)
	    {
	        t1.setText((input_num + 9)+"");
	        t2.setText(input_num+"");
	        t3.setText((input_num + 1)+"");
	    }
	    if (input_num == 9)
	    {
	        t1.setText((input_num - 1)+"");
	        t2.setText(input_num+"");
	        t3.setText((input_num - 8)+"");
	    }
	}
}
