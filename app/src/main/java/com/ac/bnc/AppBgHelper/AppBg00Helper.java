package com.ac.bnc.AppBgHelper;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import com.ac.bnc.AppBgOperator.AppBgRunOperator;

abstract class AppBg00Helper {

    public static AppBgRunOperator AppBgOperatorObj = null;
    protected static AppBgHelperOperator instance = new AppBgHelperOperator();
    protected static Context ContextObj = null;
    //-------------------------------------------------------------------------------------------------------

    public static AppBgHelperOperator getInstance() {
        if (AppBgOperatorObj == null) {
            AppBgOperatorObj = new AppBgRunOperator();
        }
        return instance;
    }
    //-----------------------------------------------------------------------------------------------------


    protected void AppProcessRunCommandFun(Object DataObj){
        new AppProcessRunCommandOperator().execute(DataObj);
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    protected class AppProcessRunCommandOperator extends AsyncTask<Object, Void, Boolean> {
        @Override
        protected Boolean doInBackground(Object... arg0) {
            int count = arg0.length;
            if (count <= 0) {
                return false;
            }
            Object DataObj= arg0[0];
            return AppProcessRunCommandCallFun(DataObj);
        }
    }

    private boolean AppProcessRunCommandCallFun(Object DataObj) {
        try {
            boolean Status = true;
            if (AppBgOperatorObj == null) {
                return false;
            }
            if (AppBgOperatorObj.ApiCommandProcessFun(DataObj) == false) {
                Status = false;
            }
            return Status;
        } catch (Exception ex) {

        }
        return false;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void ToastShowMsgFun(String Msg){

        Toast.makeText(ContextObj, Msg, Toast.LENGTH_LONG).show();

    }

}
