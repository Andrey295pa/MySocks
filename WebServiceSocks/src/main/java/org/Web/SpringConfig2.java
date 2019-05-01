package org.Web;


import DAO.*;
import DAO.hbm.*;
import hbm.Type;
import org.Web.soap.SocksServiseImpl2;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import javax.xml.ws.Endpoint;

@Configuration
@Import(SpringConfig.class)
@ImportResource("classpath:META-INF/cxf/cxf.xml")
public class SpringConfig2 {

    @Autowired
    DAO<Type, Integer> typeDao;

    @Bean
    public SpringBus cxf() {
        return new SpringBus();
    }

    @Bean
    public org.Web.soap.ServiceSocks2 soapTestService() {
        return new SocksServiseImpl2(typeDao);
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(cxf(), soapTestService());
        endpoint.publish("/testservice");
        return endpoint;
    }


}


