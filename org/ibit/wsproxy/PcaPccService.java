package org.ibit.wsproxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.7
 * 2021-02-03T16:43:52.609+01:00
 * Generated source version: 3.3.7
 *
 */
@WebServiceClient(name = "pcaPccService",
                  wsdlLocation = "file:pcaPccService.xml",
                  targetNamespace = "http://wsproxy.ibit.org")
public class PcaPccService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://wsproxy.ibit.org", "pcaPccService");
    public final static QName PcaPcc = new QName("http://wsproxy.ibit.org", "pcaPcc");
    static {
        URL url = null;
        try {
            url = new URL("file:pcaPccService.xml");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PcaPccService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:pcaPccService.xml");
        }
        WSDL_LOCATION = url;
    }

    public PcaPccService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PcaPccService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PcaPccService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public PcaPccService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PcaPccService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PcaPccService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns PcaPcc
     */
    @WebEndpoint(name = "pcaPcc")
    public PcaPcc getPcaPcc() {
        return super.getPort(PcaPcc, PcaPcc.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PcaPcc
     */
    @WebEndpoint(name = "pcaPcc")
    public PcaPcc getPcaPcc(WebServiceFeature... features) {
        return super.getPort(PcaPcc, PcaPcc.class, features);
    }

}