package com.ac.bnc.ui.patient;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import com.ac.bnc.AppObj.BroadcastConstantID;
import com.ac.bnc.AppObj.BroadcastEventArg;

abstract class PatientFragment01Broadcast extends PatientFragment00Operator{

    protected LocalBroadcastManager mBroadcastManager;
    //=====================================================================================================================================
    protected boolean LocalBroadcastRegisterReceiver(Context ContextObj) {
        try {
            mBroadcastManager = LocalBroadcastManager.getInstance(ContextObj);
            IntentFilter filter = new IntentFilter(BroadcastConstantID.BROADCAST_MAIN_ACTION_HEADER);
            mBroadcastManager.registerReceiver(receiver, filter);
            return true;
        } catch (Exception ex) {

        }
        return false;
    }
    //=====================================================================================================================================
    protected void unRegisterReceiver() {
        try {
            if (receiver != null)
                mBroadcastManager.unregisterReceiver(receiver);
        } catch (Exception ex) {

        }
    }
    //=====================================================================================================================================
    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            try {
                Bundle bundle = intent.getBundleExtra(BroadcastConstantID.BROADCAST_SUB_HEADER);
                if (bundle != null) {


                    BroadcastEventArg EventObj = (BroadcastEventArg) bundle.getSerializable(BroadcastConstantID.BROADCAST_EVENT_Obj_ID);

                    int EventTypeID = EventObj.EventTypeID;

                    switch (EventTypeID) {
                        case BroadcastConstantID.EventType_SystemSetting_ID:

                            break;
                    }
                }
            } catch (Exception ex) {

            }
        }
    };
    //===========================================================================================================================================
    private void sendBroadcastToService(int eventType, Object obj) {
        sendBroadcast(BroadcastConstantID.BROADCAST_MAIN_ACTION_HEADER, eventType, obj);
    }
    //===========================================================================================================================================
    private void sendBroadcast(String action, int eventType, Object obj) {
        try {
            BroadcastEventArg BroadcastEventoBJ = new BroadcastEventArg();
            BroadcastEventoBJ.EventTypeID = eventType;
            BroadcastEventoBJ.EventObj = obj;
            Intent intent = new Intent(action);
            Bundle bundle = new Bundle();
            bundle.putSerializable(BroadcastConstantID.BROADCAST_EVENT_Obj_ID, BroadcastEventoBJ);
            intent.putExtra(BroadcastConstantID.BROADCAST_SUB_HEADER, bundle);
            mBroadcastManager.sendBroadcast(intent);
        } catch (Exception ex) {

        }
    }
    //===========================================================================================================================================

}
