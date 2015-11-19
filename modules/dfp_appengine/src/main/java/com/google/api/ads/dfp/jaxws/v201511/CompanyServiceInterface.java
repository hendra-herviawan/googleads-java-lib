
package com.google.api.ads.dfp.jaxws.v201511;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides operations for creating, updating and retrieving {@link Company}
 *       objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CompanyServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CompanyServiceInterface {


    /**
     * 
     *         Creates new {@link Company} objects.
     *         
     *         @param companies the companies to create
     *         @return the created companies with their IDs filled in
     *       
     * 
     * @param companies
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201511.Company>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
    @RequestWrapper(localName = "createCompanies", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.CompanyServiceInterfacecreateCompanies")
    @ResponseWrapper(localName = "createCompaniesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.CompanyServiceInterfacecreateCompaniesResponse")
    public List<Company> createCompanies(
        @WebParam(name = "companies", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
        List<Company> companies)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link CompanyPage} of {@link Company} objects that satisfy the
     *         given {@link Statement#query}. The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Company#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Company#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code type}</td>
     *         <td>{@link Company#type}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Company#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of companies
     *         @return the companies that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201511.CompanyPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
    @RequestWrapper(localName = "getCompaniesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.CompanyServiceInterfacegetCompaniesByStatement")
    @ResponseWrapper(localName = "getCompaniesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.CompanyServiceInterfacegetCompaniesByStatementResponse")
    public CompanyPage getCompaniesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Company} objects.
     *         
     *         @param companies the companies to update
     *         @return the updated companies
     *       
     * 
     * @param companies
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201511.Company>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
    @RequestWrapper(localName = "updateCompanies", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.CompanyServiceInterfaceupdateCompanies")
    @ResponseWrapper(localName = "updateCompaniesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.CompanyServiceInterfaceupdateCompaniesResponse")
    public List<Company> updateCompanies(
        @WebParam(name = "companies", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
        List<Company> companies)
        throws ApiException_Exception
    ;

}
