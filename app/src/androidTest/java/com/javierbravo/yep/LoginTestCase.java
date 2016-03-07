package com.javierbravo.yep;


import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;

public class LoginTestCase extends ActivityInstrumentationTestCase2<Login> {

    private Login actividad;
    private Button loginBtn;


    public LoginTestCase() {
        super(Login.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        actividad = getActivity();

        loginBtn = (Button) actividad.findViewById(R.id.btn_Login);
    }


    public void testAddValues() {

        TouchUtils.clickView(this, loginBtn);

    }
}
