package wcf;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 4.1.9.1
//
// Created by Quasar Development at 10-12-2015
//
//---------------------------------------------------


import org.ksoap2.serialization.AttributeContainer;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

import java.util.Hashtable;

public class PatientPaymentXml extends AttributeContainer implements KvmSerializable
{

    
    public Double Amount;
    
    public java.util.Date Date;
    
    public java.util.Date DueDate;
    
    public String Id;
    
    public String Info;
    
    public java.util.Date PaidDate;
    
    public PatientXml Patient;
    
    public Integer Status;

    public PatientPaymentXml()
    {
    }

    public PatientPaymentXml(Object paramObj, ExtendedSoapSerializationEnvelope __envelope)
    {
	    
	    if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;


        if(inObj instanceof SoapObject)
        {
            SoapObject soapObject=(SoapObject)inObj;
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0< size;i0++)
            {
                //if you have compilation error here, please use a ksoap2.jar and ExKsoap2.jar from libs folder (in the generated zip file)
                PropertyInfo info=soapObject.getPropertyInfo(i0);
                Object obj = info.getValue();
                if (info.name.equals("Amount"))
                {
        
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                    {
                        SoapPrimitive j =(SoapPrimitive) obj;
                        if(j.toString()!=null)
                        {
                            this.Amount = new Double(j.toString());
                        }
                    }
                    else if (obj!= null && obj instanceof Double){
                        this.Amount = (Double)obj;
                    }
                    continue;
                }
                if (info.name.equals("Date"))
                {
        
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                    {
                        SoapPrimitive j =(SoapPrimitive) obj;
                        if(j.toString()!=null)
                        {
                            this.Date = Helper.ConvertFromWebService(j.toString());
                        }
                    }
                    else if (obj!= null && obj instanceof java.util.Date){
                        this.Date = (java.util.Date)obj;
                    }
                    continue;
                }
                if (info.name.equals("DueDate"))
                {
        
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                    {
                        SoapPrimitive j =(SoapPrimitive) obj;
                        if(j.toString()!=null)
                        {
                            this.DueDate = Helper.ConvertFromWebService(j.toString());
                        }
                    }
                    else if (obj!= null && obj instanceof java.util.Date){
                        this.DueDate = (java.util.Date)obj;
                    }
                    continue;
                }
                if (info.name.equals("Id"))
                {
        
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                    {
                        SoapPrimitive j =(SoapPrimitive) obj;
                        if(j.toString()!=null)
                        {
                            this.Id = j.toString();
                        }
                    }
                    else if (obj!= null && obj instanceof String){
                        this.Id = (String)obj;
                    }
                    continue;
                }
                if (info.name.equals("Info"))
                {
        
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                    {
                        SoapPrimitive j =(SoapPrimitive) obj;
                        if(j.toString()!=null)
                        {
                            this.Info = j.toString();
                        }
                    }
                    else if (obj!= null && obj instanceof String){
                        this.Info = (String)obj;
                    }
                    continue;
                }
                if (info.name.equals("PaidDate"))
                {
        
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                    {
                        SoapPrimitive j =(SoapPrimitive) obj;
                        if(j.toString()!=null)
                        {
                            this.PaidDate = Helper.ConvertFromWebService(j.toString());
                        }
                    }
                    else if (obj!= null && obj instanceof java.util.Date){
                        this.PaidDate = (java.util.Date)obj;
                    }
                    continue;
                }
                if (info.name.equals("Patient"))
                {
                    Object j = obj;
                    this.Patient = (PatientXml)__envelope.get(j, PatientXml.class);
                    continue;
                }
                if (info.name.equals("Status"))
                {
        
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                    {
                        SoapPrimitive j =(SoapPrimitive) obj;
                        if(j.toString()!=null)
                        {
                            this.Status = Integer.parseInt(j.toString());
                        }
                    }
                    else if (obj!= null && obj instanceof Integer){
                        this.Status = (Integer)obj;
                    }
                    continue;
                }

            }

        }



    }

    @Override
    public Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.Amount!=null?this.Amount:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.Date!=null? Helper.getDateTimeFormat().format(this.Date):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.DueDate!=null? Helper.getDateTimeFormat().format(this.DueDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.Id!=null?this.Id:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.Info!=null?this.Info:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.PaidDate!=null? Helper.getDateTimeFormat().format(this.PaidDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.Patient!=null?this.Patient:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.Status!=null?this.Status:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 8;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = Double.class;
            info.name = "Amount";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Date";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "DueDate";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Id";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Info";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "PaidDate";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==6)
        {
            info.type = PatientXml.class;
            info.name = "Patient";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==7)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "Status";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1)
    {
    }

}
