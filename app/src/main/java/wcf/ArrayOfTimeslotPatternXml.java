package wcf;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 4.1.9.1
//
// Created by Quasar Development at 10-12-2015
//
//---------------------------------------------------



import org.ksoap2.serialization.*;
import java.util.Vector;
import java.util.Hashtable;


public class ArrayOfTimeslotPatternXml extends Vector<TimeslotPatternXml> implements KvmSerializable
{
    
    public ArrayOfTimeslotPatternXml(){}
    
    public ArrayOfTimeslotPatternXml(Object inObj, ExtendedSoapSerializationEnvelope __envelope)
    {
        if (inObj == null)
            return;
        SoapObject soapObject=(SoapObject)inObj;
        int size = soapObject.getPropertyCount();
        for (int i0=0;i0< size;i0++)
        {
            Object obj = soapObject.getProperty(i0);
            if (obj!=null && obj instanceof AttributeContainer)
            {
                AttributeContainer j =(AttributeContainer) soapObject.getProperty(i0);
                TimeslotPatternXml j1= (TimeslotPatternXml)__envelope.get(j, TimeslotPatternXml.class);
                add(j1);
            }
        }
}
    
    @Override
    public Object getProperty(int arg0) {
        return this.get(arg0)!=null?this.get(arg0):SoapPrimitive.NullNilElement;
    }
    
    @Override
    public int getPropertyCount() {
        return this.size();
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        info.name = "TimeslotPatternXml";
        info.type = TimeslotPatternXml.class;
    	info.namespace= "http://schemas.datacontract.org/2004/07/MeetMD.Models.DomainModel";
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }

}