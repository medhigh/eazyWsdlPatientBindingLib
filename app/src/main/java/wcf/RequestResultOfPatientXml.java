package wcf;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 4.1.9.1
//
// Created by Quasar Development at 13-11-2015
//
//---------------------------------------------------


import java.util.Hashtable;
import org.ksoap2.serialization.*;

public class RequestResultOfPatientXml extends AttributeContainer implements KvmSerializable
{

    
    public String ErrorMessage;
    
    public PatientXml Result;
    
    public Integer ResultStatus;

    public RequestResultOfPatientXml()
    {
    }

    public RequestResultOfPatientXml(Object paramObj, ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("ErrorMessage"))
                {
        
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                    {
                        SoapPrimitive j =(SoapPrimitive) obj;
                        if(j.toString()!=null)
                        {
                            this.ErrorMessage = j.toString();
                        }
                    }
                    else if (obj!= null && obj instanceof String){
                        this.ErrorMessage = (String)obj;
                    }
                    continue;
                }
                if (info.name.equals("Result"))
                {
                    Object j = obj;
                    this.Result = (PatientXml)__envelope.get(j, PatientXml.class);
                    continue;
                }
                if (info.name.equals("ResultStatus"))
                {
        
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                    {
                        SoapPrimitive j =(SoapPrimitive) obj;
                        if(j.toString()!=null)
                        {
                            this.ResultStatus = Integer.parseInt(j.toString());
                        }
                    }
                    else if (obj!= null && obj instanceof Integer){
                        this.ResultStatus = (Integer)obj;
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
            return this.ErrorMessage!=null?this.ErrorMessage:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.Result!=null?this.Result:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.ResultStatus!=null?this.ResultStatus:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ErrorMessage";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==1)
        {
            info.type = PatientXml.class;
            info.name = "Result";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "ResultStatus";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1)
    {
    }

}
