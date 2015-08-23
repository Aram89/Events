package org.proffart.events.dao;

import org.proffart.events.domain.Client;

public interface ClientDao {
    Integer create(Client client);
    Client getByLogin(String login);
    void updateData(Client client);
}
