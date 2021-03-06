/**
 * © 2013, Upyourbizz - All right reserved
 */
package fr.upyourbizz.web.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import fr.upyourbizz.utils.exception.TechnicalException;
import fr.upyourbizz.web.dto.ClientDto;
import fr.upyourbizz.web.persistence.ClientDao;

/**
 * GestionClientService
 */
public class GestionClientService {

    // ===== Attributs statiques ==============================================

    @SuppressWarnings("unused")
    private final Logger logger = LoggerFactory.getLogger(GestionClientService.class);

    // ===== Méthodes statiques ===============================================

    // ===== Attributs ========================================================

    private ClientDao clientDao;

    // ===== Constructeurs ====================================================

    // ===== Méthodes =========================================================

    /**
     * Ajout un client
     * 
     * @param nouveauClient Le client a ajouter
     * @throws TechnicalException Exception technique
     */
    @Transactional(rollbackFor = { TechnicalException.class })
    public void ajouterClient(ClientDto nouveauClient) throws TechnicalException {
        clientDao.ajouterClient(nouveauClient);
    }

    /**
     * Modifie un client existant
     * 
     * @param nouveauClient
     * @throws TechnicalException Exception technique
     */
    @Transactional(rollbackFor = { TechnicalException.class })
    public void modifierClient(ClientDto nouveauClient) throws TechnicalException {
        clientDao.modifierClient(nouveauClient);
    }

    /**
     * Liste tous les clients de l'application
     * 
     * @return La liste des clients
     * @throws TechnicalException Exception technique
     */
    public List<ClientDto> listerClients() throws TechnicalException {
        return clientDao.listerClients();
    }

    // ===== Accesseurs =======================================================

    /**
     * Affecte clientDao
     * 
     * @param clientDao clientDao à affecter
     */
    public void setClientDao(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    // ===== Classes imbriquées ===============================================
}
