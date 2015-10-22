package wcf;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 4.1.9.0
//
// Created by Quasar Development at 22-10-2015
//
//---------------------------------------------------


import java.util.Hashtable;
import org.ksoap2.serialization.*;

public class AppointmentXml extends AttributeContainer implements KvmSerializable
{

    
    public AppointmentResultsXml AppointmentResults;
    
    public String CancelReason;
    
    public String Id;
    
    public String Info;
    
    public PatientXml Patient;
    
    public Integer State;
    
    public String Timeslot;

    public AppointmentXml()
    {
    }

    public AppointmentXml(Object paramObj, ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("AppointmentResults"))
                {
                    Object j = obj;
                    this.AppointmentResults = (AppointmentResultsXml)__envelope.get(j, AppointmentResultsXml.class);
                    continue;
                }
                if (info.name.equals("CancelReason"))
                {
        
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                    {
                        SoapPrimitive j =(SoapPrimitive) obj;
                        if(j.toString()!=null)
                        {
                            this.CancelReason = j.toString();
                        }
                    }
                    else if (obj!= null && obj instanceof String){
                        this.CancelReason = (String)obj;
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
                if (info.name.equals("Patient"))
                {
                    Object j = obj;
                    this.Patient = (PatientXml)__envelope.get(j, PatientXml.class);
                    continue;
                }
                if (info.name.equals("State"))
                {
        
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                    {
                        SoapPrimitive j =(SoapPrimitive) obj;
                        if(j.toString()!=null)
                        {
                            this.State = Integer.parseInt(j.toString());
                        }
                    }
                    else if (obj!= null && obj instanceof Integer){
                        this.State = (Integer)obj;
                    }
                    continue;
                }
                if (info.name.equals("Timeslot"))
                {
        
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                    {
                        SoapPrimitive j =(SoapPrimitive) obj;
                        if(j.toString()!=null)
                        {
                            this.Timeslot = j.toString();
                        }
                    }
                    else if (obj!= null && obj instanceof String){
                        this.Timeslot = (String)obj;
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
            return this.AppointmentResults!=null?this.AppointmentResults:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.CancelReason!=null?this.CancelReason:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.Id!=null?this.Id:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.Info!=null?this.Info:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.Patient!=null?this.Patient:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.State!=null?this.State:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.Timeslot!=null?this.Timeslot:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 7;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = AppointmentResultsXml.class;
            info.name = "AppointmentResults";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CancelReason";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Id";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Info";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==4)
        {
            info.type = PatientXml.class;
            info.name = "Patient";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "State";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Timeslot";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1)
    {
    }

}
