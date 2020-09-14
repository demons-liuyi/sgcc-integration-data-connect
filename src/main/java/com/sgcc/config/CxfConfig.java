package com.sgcc.config;


import com.sgcc.service.IWebService;
import com.sgcc.util.XmlToJsonUtil;
import com.sgcc.service.impl.IWebServiceImpl;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.xml.ws.Endpoint;
 
@Configuration
public class CxfConfig {
	
	@Autowired
	IWebService iWebService;
	
	@Autowired
	Bus bus;
 
    @Bean
    public ServletRegistrationBean webServiceDispatcherServlet() {
        return new ServletRegistrationBean(new CXFServlet(),"/sgcc/*");
    }
 
    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }
 
    @Bean
    public IWebService IWebServiceImpl() {
        return new IWebServiceImpl();
    }
    
    @Bean
    public XmlToJsonUtil XmlToJsonUtil() {
    	return new XmlToJsonUtil();
    }
 
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), IWebServiceImpl());
        endpoint.publish("/api");
        return endpoint;
    }
 
}
