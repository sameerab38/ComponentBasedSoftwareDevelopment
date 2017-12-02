package DefaultNamespace;

public class SearchSOAPClassProxy implements DefaultNamespace.SearchSOAPClass {
  private String _endpoint = null;
  private DefaultNamespace.SearchSOAPClass searchSOAPClass = null;
  
  public SearchSOAPClassProxy() {
    _initSearchSOAPClassProxy();
  }
  
  public SearchSOAPClassProxy(String endpoint) {
    _endpoint = endpoint;
    _initSearchSOAPClassProxy();
  }
  
  private void _initSearchSOAPClassProxy() {
    try {
      searchSOAPClass = (new DefaultNamespace.SearchSOAPClassServiceLocator()).getSearchSOAPClass();
      if (searchSOAPClass != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)searchSOAPClass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)searchSOAPClass)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (searchSOAPClass != null)
      ((javax.xml.rpc.Stub)searchSOAPClass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.SearchSOAPClass getSearchSOAPClass() {
    if (searchSOAPClass == null)
      _initSearchSOAPClassProxy();
    return searchSOAPClass;
  }
  
  public DefaultNamespace.StudentData[] getStudentList() throws java.rmi.RemoteException{
    if (searchSOAPClass == null)
      _initSearchSOAPClassProxy();
    return searchSOAPClass.getStudentList();
  }
  
  public DefaultNamespace.StudentData[] getCollectionOfSearchStrings(java.lang.String firstName, java.lang.String lastName, java.lang.String city, java.lang.String state) throws java.rmi.RemoteException{
    if (searchSOAPClass == null)
      _initSearchSOAPClassProxy();
    return searchSOAPClass.getCollectionOfSearchStrings(firstName, lastName, city, state);
  }
  
  
}