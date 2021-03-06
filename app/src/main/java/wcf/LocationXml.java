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

public class LocationXml extends AttributeContainer implements KvmSerializable
{

    
    public String Address;
    
    public String Id;
    
    public Double Latitude;
    
    public Double Longitude;
    
    public String Name;
    
    public String Region;

    public LocationXml()
    {
    }

    public LocationXml(Object paramObj, ExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("Address"))
                {
        
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                    {
                        SoapPrimitive j =(SoapPrimitive) obj;
                        if(j.toString()!=null)
                        {
                            this.Address = j.toString();
                        }
                    }
                    else if (obj!= null && obj instanceof String){
                        this.Address = (String)obj;
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
                if (info.name.equals("Latitude"))
                {
        
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                    {
                        SoapPrimitive j =(SoapPrimitive) obj;
                        if(j.toString()!=null)
                        {
                            this.Latitude = new Double(j.toString());
                        }
                    }
                    else if (obj!= null && obj instanceof Double){
                        this.Latitude = (Double)obj;
                    }
                    continue;
                }
                if (info.name.equals("Longitude"))
                {
        
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                    {
                        SoapPrimitive j =(SoapPrimitive) obj;
                        if(j.toString()!=null)
                        {
                            this.Longitude = new Double(j.toString());
                        }
                    }
                    else if (obj!= null && obj instanceof Double){
                        this.Longitude = (Double)obj;
                    }
                    continue;
                }
                if (info.name.equals("Name"))
                {
        
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                    {
                        SoapPrimitive j =(SoapPrimitive) obj;
                        if(j.toString()!=null)
                        {
                            this.Name = j.toString();
                        }
                    }
                    else if (obj!= null && obj instanceof String){
                        this.Name = (String)obj;
                    }
                    continue;
                }
                if (info.name.equals("Region"))
                {
        
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                    {
                        SoapPrimitive j =(SoapPrimitive) obj;
                        if(j.toString()!=null)
                        {
                            this.Region = j.toString();
                        }
                    }
                    else if (obj!= null && obj instanceof String){
                        this.Region = (String)obj;
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
            return this.Address!=null?this.Address:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.Id!=null?this.Id:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.Latitude!=null?this.Latitude:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.Longitude!=null?this.Longitude:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.Name!=null?this.Name:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.Region!=null?this.Region:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 6;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Address";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Id";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==2)
        {
            info.type = Double.class;
            info.name = "Latitude";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==3)
        {
            info.type = Double.class;
            info.name = "Longitude";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Name";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Region";
            info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1)
    {
    }

}
