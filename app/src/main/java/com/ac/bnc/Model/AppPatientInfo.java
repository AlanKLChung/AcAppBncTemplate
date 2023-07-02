package com.ac.bnc.Model;

import java.util.Date;

public class AppPatientInfo implements Cloneable{

    public String PatientUDID = "";
    public String PatientUDID(){
        return this.PatientUDID;
    }

    public String PatientID = "";
    public String PatientID(){
        return this.PatientID;
    }

    public String UserUDID = "";
    public String UserUDID(){
        return this.UserUDID;
    }
    public int Gender =-1;
    public int Gender(){
        return this.Gender;
    }
    public String FirstName = "";
    public String FirstName(){
        return this.FirstName;
    }

    public String LastName = "";

    public String LastName(){
        return this.LastName;
    }

    public double Weight = -1;
    public double Weight(){
        return this.Weight;
    }

    public double Height = -1;
    public double Height(){
        return this.Height;
    }

    public double BMI = -1;
    public double BMI(){
        return this.BMI;
    }

    public Date Birthday = new Date();
    public Date Birthday(){
        return this.Birthday;
    }

    public Date CreateDate = new Date();
    public Date CreateDate(){
        return this.CreateDate;
    }
    public int DataVersion = 0;
    public int DataVersion(){
        return this.DataVersion;
    }

    public String Remarks = "";
    public String Remarks(){
        return this.Remarks;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }




}
