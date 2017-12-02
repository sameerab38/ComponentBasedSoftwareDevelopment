
package org.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "listStudent", namespace = "http://webservice.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listStudent", namespace = "http://webservice.org/", propOrder = {
    "firstName",
    "lastName",
    "city",
    "state"
})
public class ListStudent {

    @XmlElement(name = "firstName", namespace = "")
    private String firstName;
    @XmlElement(name = "lastName", namespace = "")
    private String lastName;
    @XmlElement(name = "city", namespace = "")
    private String city;
    @XmlElement(name = "state", namespace = "")
    private String state;

    /**
     * 
     * @return
     *     returns String
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * 
     * @param firstName
     *     the value for the firstName property
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * 
     * @param lastName
     *     the value for the lastName property
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getCity() {
        return this.city;
    }

    /**
     * 
     * @param city
     *     the value for the city property
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getState() {
        return this.state;
    }

    /**
     * 
     * @param state
     *     the value for the state property
     */
    public void setState(String state) {
        this.state = state;
    }

}
