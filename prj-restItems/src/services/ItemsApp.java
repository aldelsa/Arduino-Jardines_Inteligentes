package services;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.filter.LoggingFilter;

public class ItemsApp extends Application{

     @Override
        public Set<Class<?>> getClasses() {
            return new HashSet<Class<?>>() {
				private static final long serialVersionUID = 1L;
			{
                System.out.println("From the ItemsApp...");
                //EJERCICIO: A–adir a la aplicaci—n el recurso ItemsResource
                add(DimeSensor.class);
                add(LoggingFilter.class);
            }};
        }
}