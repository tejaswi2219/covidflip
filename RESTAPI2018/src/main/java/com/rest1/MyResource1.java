package com.rest1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;


import com.rest1.dto.Contact;
import com.rest1.dto.Hospital;
import com.rest1.dto.Notification;
import com.ts1.dao.ContactDAO;
import com.ts1.dao.HospitalDAO;
import com.ts1.dao.NotificationDAO;
import com.ts1.db.HibernateTemplate;
@Path("myresource1")
public class MyResource1 {
	
	// customer methods
	@Path("contact")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String contact(Contact contact) {
		System.out.println("Data Recieved in Register : " + contact);
		ContactDAO contactDao = new ContactDAO();
		contactDao.store(contact);
    	return null;
    }
	
	@Path("notification")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String notification(Notification notification) {
		System.out.println("Data Recieved in Register : " + notification);
		NotificationDAO notificationDao = new NotificationDAO();
		notificationDao.store(notification);
    	return null;
    }
	
	@Path("hospital")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String hospital(Hospital hospital) {
		System.out.println("Data Recieved in Register : " + hospital);
		HospitalDAO hospitalDao = new HospitalDAO();
		hospitalDao.store(hospital);
    	return null;
    }
	
}