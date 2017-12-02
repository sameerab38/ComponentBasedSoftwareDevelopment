/**
 * SearchSOAPClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public interface SearchSOAPClass extends java.rmi.Remote {
    public DefaultNamespace.StudentData[] getStudentList() throws java.rmi.RemoteException;
    public DefaultNamespace.StudentData[] getCollectionOfSearchStrings(java.lang.String firstName, java.lang.String lastName, java.lang.String city, java.lang.String state) throws java.rmi.RemoteException;
}
