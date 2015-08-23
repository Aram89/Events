package org.proffart.events.dao;

import javafx.application.Preloader;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.proffart.events.domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ClientDaoImpl implements ClientDao {

    @Autowired
    private SessionFactory sessionFactory;


    public Integer create(Client client) {
        Integer clientID = 0;
        if(client != null){
            sessionFactory.getCurrentSession().save(client);
            clientID = client.getClintId();
        }
        return clientID;
    }

    public Client getByLogin(String login) {
        Session sesseion = sessionFactory.getCurrentSession();
        Query query = sesseion.createQuery("from org.proffart.events.domain.Client c where c.login = :login");
        query.setParameter("login", login);
        //noinspection unchecked
        ArrayList<Client> list = (ArrayList<Client>)query.list();
        Client client = null;
        if(!list.isEmpty()) {
            client = list.get(0);
        }
        return client;
    }

    public void updateData(Client client) {
        if(client != null && client.getClintId() > 0){
            sessionFactory.getCurrentSession().save(client);
        }
    }
}
