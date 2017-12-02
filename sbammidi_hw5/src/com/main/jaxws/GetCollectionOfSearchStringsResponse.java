
package com.main.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getCollectionOfSearchStringsResponse", namespace = "http://main.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCollectionOfSearchStringsResponse", namespace = "http://main.com/")
public class GetCollectionOfSearchStringsResponse {

    @XmlElement(name = "return", namespace = "", nillable = true)
    private com.main.StudentData[] _return;

    /**
     * 
     * @return
     *     returns StudentData[]
     */
    public com.main.StudentData[] getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.main.StudentData[] _return) {
        this._return = _return;
    }

}
