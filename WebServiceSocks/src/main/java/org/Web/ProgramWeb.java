package org.Web;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ProgramWeb implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(SpringConfig2.class);

        servletContext.addListener(new ContextLoaderListener(context));

        ServletRegistration.Dynamic cxfRegistration = servletContext.addServlet("dispatcher", new CXFServlet());
        cxfRegistration.setLoadOnStartup(1);
        cxfRegistration.addMapping("/soap/*");
    }
}