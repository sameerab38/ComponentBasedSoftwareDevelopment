//Author: Sameera Bammidi
//This is a generated class
package org.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListStudent_QNAME = new QName("http://webservice.org/", "listStudent");
    private final static QName _ListStudentResponse_QNAME = new QName("http://webservice.org/", "listStudentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListStudent }
     * 
     */
    public ListStudent createListStudent() {
        return new ListStudent();
    }

    /**
     * Create an instance of {@link ListStudentResponse }
     * 
     */
    public ListStudentResponse createListStudentResponse() {
        return new ListStudentResponse();
    }

    /**
     * Create an instance of {@link StudentData }
     * 
     */
    public StudentData createStudentData() {
        return new StudentData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.org/", name = "listStudent")
    public JAXBElement<ListStudent> createListStudent(ListStudent value) {
        return new JAXBElement<ListStudent>(_ListStudent_QNAME, ListStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.org/", name = "listStudentResponse")
    public JAXBElement<ListStudentResponse> createListStudentResponse(ListStudentResponse value) {
        return new JAXBElement<ListStudentResponse>(_ListStudentResponse_QNAME, ListStudentResponse.class, null, value);
    }

}
