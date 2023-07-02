package com.ac.bnc.Model;

import java.util.Date;

public class AppUserInfo implements Cloneable{

    public String UserUDID = "";
    public String UserUDID(){
        return this.UserUDID;
    }

    public String UserLoginName = "";
    public String UserLoginName(){
        return this.UserLoginName;
    }

    public String UserLoginPassword = "";
    public String UserLoginPassword (){
        return this.UserLoginPassword;
    }

    public Date CreateDate = new Date();
    public Date CreateDate (){
        return this.CreateDate;
    }

    public int UserLevelID = 1;
    public int UserLevelID (){
        return this.UserLevelID;
    }

    public String UserGroupID = "";
    public String UserGroupID (){
        return this.UserGroupID;
    }

    public int CurrentLangID = 1;
    public int CurrentLangID (){
        return this.CurrentLangID;
    }

    public int UserInfoIsKeep = 0;
    public int UserInfoIsKeep (){
        return this.UserInfoIsKeep;
    }

    public String Remarks = "";
    public String Remarks (){
        return this.Remarks;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
